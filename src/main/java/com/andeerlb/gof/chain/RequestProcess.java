package com.andeerlb.gof.chain;

import java.util.List;

class RequestProcess {
    private List<RequestHandler> handlers;

    public void setHandlers(List<RequestHandler> handlers) {
        this.handlers = handlers;
    }

    public void process(RequestContext request) {
        if(handlers == null || handlers.isEmpty()) {
            return;
        }

        for (RequestHandler handler : handlers) {
            try {
                handler.handle(request);
            } catch (RequestTimeoutException e) {
                System.out.println("Exception caught: " + e.getMessage());
                break;
            }
        }
    }
}
