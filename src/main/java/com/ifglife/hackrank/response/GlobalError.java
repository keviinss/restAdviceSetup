package com.ifglife.hackrank.response;

public class GlobalError {

    private String message;

    public GlobalError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
