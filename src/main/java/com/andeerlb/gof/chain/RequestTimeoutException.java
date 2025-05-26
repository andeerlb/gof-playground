package com.andeerlb.gof.chain;

class RequestTimeoutException extends Exception {
    public RequestTimeoutException(String message) {
        super(message);
    }
}
