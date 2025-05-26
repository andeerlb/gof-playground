package com.andeerlb.gof.chain;

class TimeoutHandler implements RequestHandler {
    public void handle(RequestContext request) throws RequestTimeoutException {
        System.out.println("TimeoutHandler: checking timeout...");
        if ("timeout".equalsIgnoreCase(request.payload)) {
            throw new RequestTimeoutException("Request timed out.");
        }
    }
}
