package com.noteric.learning.polymorphsim;

public enum Status {
    SUCCESS("Transaction is success"),
    FAILED("Transaction is failed"),
    PENDING("Transaction is in-progress");


    private  String label;

    Status(String label){
        this.label=label;
    }
public String getLabel(){
        return label;
}
public void setLabel(String label){
        this.label=label;
}

}
