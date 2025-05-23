package com.andeerlb.gof.mediator;

import java.util.ArrayList;
import java.util.List;

class TestUser extends User {
    List<String> receivedMessages = new ArrayList<>();

    public TestUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        receivedMessages.add(message);
    }
}
