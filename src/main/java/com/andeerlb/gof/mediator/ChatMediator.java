package com.andeerlb.gof.mediator;

interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
