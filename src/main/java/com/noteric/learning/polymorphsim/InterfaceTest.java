package com.noteric.learning.polymorphsim;

public class InterfaceTest {

    public  static void main(String[] args) {
        UPIPayments payments =new PhonePay();
       Payment pay= payments.transfer("7893894383","234567789",4567.0);

        System.out.println(pay.getTransactionid()+"status"+pay.getStatus()+"uter"+pay.getUter() );
        System.out.println("Balance of from account"+PhonePay.accountBalanceMap.get("7893894383"));
        System.out.println("To account Balance"+PhonePay.accountBalanceMap.get("234567789"));
    }
}
