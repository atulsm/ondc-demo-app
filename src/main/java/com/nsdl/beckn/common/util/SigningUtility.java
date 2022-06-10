// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.common.util;

import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.digests.Blake2bDigest;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.signers.Ed25519Signer;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.nsdl.beckn.GeneratePayloadClTest;
import com.nsdl.beckn.common.dto.KeyIdDto;
import com.nsdl.beckn.common.exception.ApplicationException;
import com.nsdl.beckn.common.exception.ErrorCode;
import com.nsdl.beckn.common.model.HeaderParams;
import com.nsdl.beckn.common.model.SigningModel;

@Component
public class SigningUtility
{
    private static final Logger log;
    
	public static void setup() {
		if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
			Security.addProvider(new BouncyCastleProvider());
			System.out.println(Security.addProvider(new BouncyCastleProvider()));
		}
	}
    
    public static void main(String[] args) throws Exception{
    	setup();
    	
		String req = "{\"context\":{\"domain\":\"nic2004:60232\",\"country\":\"IND\",\"city\":\"std:080\",\"action\":\"on_search\",\"core_version\":\"0.9.2\",\"bap_id\":\"sandbox.hitbyseo.com/delivery/bap\",\"bap_uri\":\"https://sandbox.hitbyseo.com/delivery/bap/\",\"bpp_id\":\"flipkart.logistics.test\",\"bpp_uri\":\"https://3.111.199.126/\",\"transaction_id\":\"12387917398173\",\"message_id\":\"string\",\"timestamp\":\"2021-03-22T05:48:04.938Z\",\"key\":\"string\",\"ttl\":\"string\"},\"message\":{\"catalog\":{\"bpp/descriptor\":{\"name\":\"Flipkart Ekart\"},\"bpp/providers\":[{\"id\":\"flipkart.logistics.test\",\"descriptor\":{\"name\":\"Flipkart Ekart\"},\"categories\":[{\"id\":\"standard-delivery\",\"descriptor\":{\"name\":\"Standard Delivery\"}}],\"items\":[{\"id\":\"standard-document-delivery\",\"descriptor\":{\"name\":\"Standard Document Delivery\",\"images\":[\"https://ekartlogistics.com/assets/images/ekWhiteLogo.png\"]},\"price\":{\"currency\":\"INR\",\"value\":100.0,\"estimated_value\":0.0,\"computed_value\":0.0,\"listed_value\":0.0,\"offered_value\":0.0,\"minimum_value\":0.0,\"maximum_value\":0.0},\"category_id\":\"standard-delivery\",\"matched\":true,\"related\":false,\"recommended\":false}]}]}}}";
		
		SigningUtility test = new SigningUtility();
		String blakeValue = test.generateBlakeHash(req);
		System.out.println(blakeValue);
		
		blakeValue = GeneratePayloadClTest.generateBlakeHash(req);
		System.out.println(blakeValue);
		
		//String signingString = "(created): " + testTimestamp + "\n(expires): " + (testTimestamp + 60000)
		//		+ "\ndigest: BLAKE-512=" + blakeValue + "";
		//String signedReq = generateSignature(signingString, privateKey);
		
		long currentTime = 1654872905;
		System.out.println(currentTime);

		
        final String signingString = "(created): " + currentTime + "\n(expires): " + (currentTime + 60000) + "\ndigest: BLAKE-512=" + blakeValue + "";
		System.out.println(signingString);

		SigningModel model = new SigningModel();
		model.setPrivateKey("iW0nGZ2mbeeiz/Khd+X2RDtrXdf7k1XYv0j0rbEsoMwZOGnCFrW6XeCY6mzgWZmDNOzuvNC5/ekCENWPB84gnw==");
		
        String signedReq = test.generateSignature(signingString, model);
		System.out.println(signedReq);




	}
    
    public String generateSignature(final String req, final SigningModel model) {
        String sign = null;
        try {
            if (model.isCertificateUsed()) {
                final PrivateKey privateKey = this.getPrivateKeyFromP12(model);
                final Signature rsa = Signature.getInstance("SHA1withRSA");
                rsa.initSign(privateKey);
                rsa.update(req.getBytes());
                final byte[] str = rsa.sign();
                sign = Base64.getEncoder().encodeToString(str);
            }
            else {
                if (!StringUtils.isNoneBlank(new CharSequence[] { model.getPrivateKey() })) {
                    SigningUtility.log.error("neither certificate nor private key has been set for signature");
                    throw new ApplicationException(ErrorCode.SIGNATURE_ERROR, ErrorCode.SIGNATURE_ERROR.getMessage());
                }
                final Ed25519PrivateKeyParameters privateKey2 = new Ed25519PrivateKeyParameters(Base64.getDecoder().decode(model.getPrivateKey().getBytes()), 0);
                final Ed25519Signer sig = new Ed25519Signer();
                sig.init(true, privateKey2);
                sig.update(req.getBytes(), 0, req.length());
                final byte[] s1 = sig.generateSignature();
                sign = Base64.getEncoder().encodeToString(s1);
            }
        }
        catch (Exception e) {
            SigningUtility.log.error("error while generating the signature", (Throwable)e);
            throw new ApplicationException(ErrorCode.SIGNATURE_ERROR, ErrorCode.SIGNATURE_ERROR.getMessage());
        }
        SigningUtility.log.info("Signature Generated From Data : " + sign);
        return sign;
    }
    
    public boolean verifySignature(final String signature, final String requestData, final String publicKey) throws ApplicationException {
        boolean isVerified = false;
        try {
            final Ed25519PublicKeyParameters publicKeyParams = new Ed25519PublicKeyParameters(Base64.getDecoder().decode(publicKey), 0);
            final Ed25519Signer sv = new Ed25519Signer();
            sv.init(false, (CipherParameters)publicKeyParams);
            sv.update(requestData.getBytes(), 0, requestData.length());
            final byte[] decodedSign = Base64.getDecoder().decode(signature);
            isVerified = sv.verifySignature(decodedSign);
            SigningUtility.log.info("Is signature verified ? {}", (Object)isVerified);
        }
        catch (Exception e) {
            SigningUtility.log.error(e.getMessage());
            e.printStackTrace();
            throw new ApplicationException(e);
        }
        return isVerified;
    }
    
    public boolean verifyWithP12PublicKey(final String signature, final String requestData, final String publicKey) throws ApplicationException {
        boolean isVerified = false;
        try {
            SigningUtility.log.info("Verifying with public key from p12 certificate");
            final byte[] decryptPubKey = Base64.getDecoder().decode(publicKey);
            final X509EncodedKeySpec keySpec = new X509EncodedKeySpec(decryptPubKey);
            final KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            final PublicKey pubKey = keyFactory.generatePublic(keySpec);
            final Signature sig = Signature.getInstance("SHA1withRSA");
            sig.initVerify(pubKey);
            sig.update(requestData.getBytes());
            final byte[] decodedSign = Base64.getDecoder().decode(signature);
            isVerified = sig.verify(decodedSign);
        }
        catch (Exception e) {
            SigningUtility.log.info("exception while verifing p12 certificate signature:", (Throwable)e);
            throw new ApplicationException(e);
        }
        return isVerified;
    }
    
    public Map<String, String> parseAuthorizationHeader(String authHeader) {
        final Map<String, String> holder = new HashMap<String, String>();
        if (authHeader.contains("Signature ")) {
            authHeader = authHeader.replace("Signature ", "");
            final String[] split;
            final String[] keyVals = split = authHeader.split(",");
            for (final String keyVal : split) {
                final String[] parts = keyVal.split("=", 2);
                if (parts[0] != null && parts[1] != null) {
                    holder.put(parts[0].trim(), parts[1].trim());
                }
            }
            return holder;
        }
        return null;
    }
    
    public KeyIdDto splitKeyId(String kid) throws ApplicationException {
        KeyIdDto keyIdDto = null;
        try {
            if (kid != null && !kid.isEmpty()) {
                kid = kid.replace("\"", "");
                keyIdDto = new KeyIdDto();
                final String[] a = kid.split("[|]");
                keyIdDto.setKeyId(a[0]);
                keyIdDto.setUniqueKeyId(a[1]);
                keyIdDto.setAlgo(a[2]);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new ApplicationException(ErrorCode.INVALID_AUTH_HEADER, ErrorCode.INVALID_AUTH_HEADER.getMessage());
        }
        return keyIdDto;
    }
    
    public HeaderParams splitHeadersParam(String headers) throws ApplicationException {
        HeaderParams headerParams = null;
        try {
            if (headers != null && !headers.isEmpty()) {
                headers = headers.replace("\"", "");
                headerParams = new HeaderParams();
                final String[] a = headers.split(" ");
                if (a == null || a.length <= 2) {
                    SigningUtility.log.error("Invalid Header");
                    throw new ApplicationException(ErrorCode.INVALID_AUTH_HEADER, ErrorCode.INVALID_AUTH_HEADER.getMessage());
                }
                headerParams.setCreated(a[0].replace("(", "").replace(")", ""));
                headerParams.setExpires(a[1].replace("(", "").replace(")", ""));
                headerParams.setDiagest(a[2].trim());
                if (headerParams.getCreated() == null || !"created".equalsIgnoreCase(headerParams.getCreated()) || headerParams.getExpires() == null || !"expires".equalsIgnoreCase(headerParams.getExpires()) || headerParams.getDiagest() == null || !"digest".equalsIgnoreCase(headerParams.getDiagest())) {
                    SigningUtility.log.error("Header sequense mismatch");
                    throw new ApplicationException(ErrorCode.HEADER_SEQ_MISMATCH, ErrorCode.HEADER_SEQ_MISMATCH.getMessage());
                }
            }
        }
        catch (Exception e) {
            SigningUtility.log.error("Header parsing Failed");
            throw new ApplicationException(ErrorCode.HEADER_PARSING_FAILED, ErrorCode.HEADER_PARSING_FAILED.getMessage());
        }
        return headerParams;
    }
    
    public String generateBlakeHash(final String req) {
        final Blake2bDigest digest = new Blake2bDigest(512);
        final byte[] test = req.getBytes();
        digest.update(test, 0, test.length);
        final byte[] hash = new byte[digest.getDigestSize()];
        digest.doFinal(hash, 0);
        return Base64.getEncoder().encodeToString(hash);
    }
    
    public boolean validateTime(String crt, String exp) {
        boolean isValid = false;
        try {
            if (crt != null && exp != null) {
                crt = crt.replace("\"", "");
                exp = exp.replace("\"", "");
                final long created = Long.parseLong(crt);
                final long expiry = Long.parseLong(exp);
                final long now = System.currentTimeMillis() / 1000L;
                final long diffInSec = expiry - created;
                if (diffInSec > 0L && created <= now && expiry > now && expiry >= created) {
                    isValid = true;
                }
            }
            else {
                SigningUtility.log.error("created or expires timestamp value is null.");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        SigningUtility.log.debug("Is request valid with respect to sign header timestamp? {}", (Object)isValid);
        return isValid;
    }
    
    public PrivateKey getPrivateKeyFromP12(final SigningModel model) {
        SigningUtility.log.info("The SigningModel is: {}", (Object)model);
        final String decodedPwd = new String(Base64.getDecoder().decode(model.getCertificatePwd()));
        SigningUtility.log.info("decoded certificate pwd is: {}", (Object)decodedPwd);
        final char[] pwd = decodedPwd.toCharArray();
        PrivateKey userCertPrivateKey = null;
        try {
            final KeyStore ks = KeyStore.getInstance(model.getCertificateType());
            final String certificateAlias = model.getCertificateAlias();
            final String path = model.getCertificatePath();
            SigningUtility.log.info("certificate complete path is: {}", (Object)path);
            final FileInputStream fileInputStream = new FileInputStream(path);
            ks.load(fileInputStream, pwd);
            final Enumeration<String> e = ks.aliases();
            while (e.hasMoreElements()) {
                final String alias = e.nextElement();
                if (StringUtils.isNoneBlank(new CharSequence[] { certificateAlias }) && alias.equals(certificateAlias.trim())) {
                    userCertPrivateKey = (PrivateKey)ks.getKey(alias, pwd);
                    SigningUtility.log.info("matching certificate alias {} found in the certificate", (Object)certificateAlias);
                    break;
                }
            }
            if (userCertPrivateKey == null) {
                throw new ApplicationException(ErrorCode.CERTIFICATE_ALIAS_ERROR, ErrorCode.CERTIFICATE_ALIAS_ERROR.getMessage());
            }
        }
        catch (Exception e2) {
            SigningUtility.log.error("error while reading the signature from certificate", (Throwable)e2);
            throw new ApplicationException(ErrorCode.CERTIFICATE_ERROR, ErrorCode.CERTIFICATE_ERROR.getMessage());
        }
        return userCertPrivateKey;
    }
    
    static {
        log = LoggerFactory.getLogger((Class)SigningUtility.class);
    }
}
