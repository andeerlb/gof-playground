package com.andeerlb.gof.chain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ChainTest {
    @Test
    void shouldNormalRequestProcessedSuccessfully() {
        RequestContext context = new RequestContext("normal");

        List<RequestHandler> handlers = List.of(
                new AuthHandler(),
                new TimeoutHandler(),
                new LogHandler()
        );

        assertDoesNotThrow(() -> {
            for (RequestHandler handler : handlers) {
                handler.handle(context);
            }
        });
    }

    @Test
    void shouldRequestTimeoutExceptionIsThrown() {
        RequestContext context = new RequestContext("timeout");

        List<RequestHandler> handlers = List.of(
                new AuthHandler(),
                new TimeoutHandler(),
                new LogHandler()
        );

        RequestTimeoutException ex = assertThrows(RequestTimeoutException.class, () -> {
            for (RequestHandler handler : handlers) {
                handler.handle(context);
            }
        });

        assertEquals("Request timed out.", ex.getMessage());
    }

    @Test
    void testProcessRequestHandlesTimeoutGracefully() {
        RequestProcess requestProcess = new RequestProcess();
        List<RequestHandler> handlers = List.of(
                new AuthHandler(),
                new TimeoutHandler(),
                new LogHandler()
        );
        requestProcess.setHandlers(handlers);

        assertDoesNotThrow(() -> {
            requestProcess.process(new RequestContext("timeout"));
        });
    }
}
