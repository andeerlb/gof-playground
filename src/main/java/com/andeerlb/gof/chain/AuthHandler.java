package com.andeerlb.gof.chain;

class AuthHandler implements RequestHandler {
    public void handle(RequestContext request) {
        System.out.println("AuthHandler: checking auth...");
    }
}