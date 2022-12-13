package com.example.flightservice.utils;

import com.example.flightservice.exception.InSufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();
    static{
        paymentMap.put("account1", 12000.0);
        paymentMap.put("account2", 15000.0);
        paymentMap.put("account3", 14000.0);
        paymentMap.put("account4", 18000.0);
//        paymentMap.put("null",0.00);

    }

    public static boolean validateCreditLimit(String accNo, double paidAmount){
        if(paidAmount > paymentMap.get(accNo)){

//        if(paidAmount > paymentMap.get(accNo)){
            throw new InSufficientAmountException("In-sufficient Funds");
        }else{
            return true;
        }

    }
}
