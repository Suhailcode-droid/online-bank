package com.excelr.bank.exception;

public class InsufficientBalanceException extends RuntimeException{

    public InsufficientBalanceException() {
        super("InSufficient Balance in Account");
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
