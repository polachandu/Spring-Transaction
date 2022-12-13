package com.example.flightservice.exception;

public class InSufficientAmountException extends RuntimeException{
    public InSufficientAmountException(String Message){
        super(Message);
    }
}
