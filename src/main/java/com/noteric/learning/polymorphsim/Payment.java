package com.noteric.learning.polymorphsim;

import javax.xml.crypto.Data;
import java.util.Date;

public class Payment {

    private String transactionId ;
    private String uter;
    private String status;
    private Date transactionDate;


    public String getTransactionid() {
        return transactionId;
    }

    public void setTransactionid(String transactionid) {
        this.transactionId = transactionid;
    }

    public String getUter() {
        return uter;
    }

    public void setUter(String uter) {
        this.uter = uter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
