package com.noteric.learning.polymorphsim;


import java.util.*;
import java.util.function.BiPredicate;

public class PhonePay  implements  UPIPayments {

    public   static  Map<String,Double> accountBalanceMap=new HashMap<>();

    public   static  Map<String, ArrayList<Payment>> accountHistoryMap=new HashMap<>();

     static {
        accountBalanceMap.put("7893894383",10000.0);
        accountBalanceMap.put("234567789",5000.0);
    }

    BiPredicate<String,Double> balanceCheck=(accountNumber,amt)->{
         Double accountBalance=accountBalanceMap.get(accountNumber);
         if (accountBalance> amt){
             return true;
         }else {
             return false;
         }
    };

    @Override
    public Payment transfer(String fromMobileNumber, String toNumber, Double amount) {
        return null;
    }

    @Override

    public Payment transfer(String fromMobileNumber, String toNumber, double amount){
        Payment p =new Payment();
      if (balanceCheck.test( fromMobileNumber,amount)){

          Double fromAccountBalance=accountBalanceMap.get(fromMobileNumber);
          Double toAccountBalance=accountBalanceMap.get(toNumber);

          Double fromTotalBalance=fromAccountBalance-amount;
          Double toTotalBalance=toAccountBalance-amount;
          accountBalanceMap.put(fromMobileNumber,fromTotalBalance);
          accountBalanceMap.put(toNumber,toTotalBalance);
          p.setStatus(Status.SUCCESS.getLabel());
          p.setTransactionid(UUID.randomUUID().toString());
          p.setUter(UUID.randomUUID().toString());
          p.setTransactionDate(new Date());


         ArrayList<Payment>paymentArrayList= accountHistoryMap.get(fromMobileNumber);
         if (paymentArrayList!=null){
             paymentArrayList.add(p);

         }else {
             paymentArrayList=new ArrayList<Payment>();
             paymentArrayList.add(p);
             accountHistoryMap.put(fromMobileNumber,paymentArrayList);


         }

      }else {

          p.setStatus(Status.FAILED.getLabel());
          p.setTransactionid(UUID.randomUUID().toString());
          p.setUter(UUID.randomUUID().toString());
         p.setTransactionDate(new Date());


      }
        return p;
    }

        }


