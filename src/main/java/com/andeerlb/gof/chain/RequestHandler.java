package com.andeerlb.gof.chain;

interface RequestHandler {
    void handle(RequestContext request) throws RequestTimeoutException;
}
