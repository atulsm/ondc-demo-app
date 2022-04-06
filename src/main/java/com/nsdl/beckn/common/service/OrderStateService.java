package com.nsdl.beckn.common.service;


import com.nsdl.beckn.api.model.common.Order;
import com.nsdl.beckn.init.service.InitServiceSeller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class OrderStateService {

    private static final Logger log;

    private Map<String, Long> orderIdToOrderState = new HashMap<>();
    private Map<String, Order> orderMap = new HashMap<>();

    private synchronized String getOrderState(String orderId) {
        return getOrderState(orderIdToOrderState.get(orderId));
    }

    public synchronized Order getOrder(String orderId){
        OrderStateService.log.info(String.valueOf(orderIdToOrderState));
        Order order = orderMap.get(orderId);
        order.setState(getOrderState(orderId));
        return order;
    }

    private synchronized void addOrderState(String orderId) {
       orderIdToOrderState.put(orderId, System.currentTimeMillis()/1000L);
    }

    public synchronized void addOrder(Order order){
        String orderId = order.getId();
        addOrderState(orderId);
        orderMap.put(orderId, order);
        OrderStateService.log.info(String.valueOf(orderIdToOrderState));
    }

    private static String getOrderState(long orderTime){
        long currentTime = System.currentTimeMillis()/1000L;
        long diff = currentTime - orderTime;
        if(diff <= 10) return "SEARCHING-FOR-FMD-AGENT";
        if(diff <= 20) return "ASSIGNED-AGENT";
        if(diff <= 30) return "AT-PICKUP-LOCATION";
        if(diff <= 40) return "EN-ROUTE-TO-DROP";
        if(diff <= 50) return "AT-DROP-LOCATION";
        if(diff <= 60) return "DROPPED-PACKAGE";
        return "COMPLETE";

    }
    static {
        log = LoggerFactory.getLogger((Class) InitServiceSeller.class);
    }


}
