package main.java.com.nsdl.beckn.common.service;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderStateService {

    private Map<String, Long> orderIdToOrderState = new HashMap<>();

    public synchronized String getOrderState(String orderId) {
        return getOrderState(orderIdToOrderState.get(orderId));
    }

    public synchronized void addOrderState(String orderId) {
       orderIdToOrderState.put(orderId, System.currentTimeMillis()/1000L);
    }

    public static String getOrderState(long orderTime){
        long currentTime = System.currentTimeMillis()/1000L;
        long diff = currentTime -orderTime;
        if(diff <= 10) return "SEARCHING-FOR-FMD-AGENT";
        if(diff <= 20) return "ASSIGNED-AGENT";
        if(diff <= 30) return "AT-PICKUP-LOCATION";
        if(diff <= 40) return "EN-ROUTE-TO-DROP";
        if(diff <= 50) return "AT-DROP-LOCATION";
        if(diff <= 60) return "DROPPED-PACKAGE";
        return "COMPLETE";

    }


}
