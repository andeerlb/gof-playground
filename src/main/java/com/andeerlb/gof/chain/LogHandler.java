package com.andeerlb.gof.chain;

class LogHandler implements RequestHandler {
    public void handle(RequestContext request) {
        System.out.println("LogHandler: logging request: " + request.payload);
    }
}
