package com.andeerlb.gof.mediator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class MediatorTest {
    private TestUser userA;
    private TestUser userB;
    private TestUser userC;

    @BeforeEach
    void setUp() {
        ChatRoom chatRoom = new ChatRoom();
        userA = new TestUser(chatRoom, "Anderson");
        userB = new TestUser(chatRoom, "Lucas");
        userC = new TestUser(chatRoom, "Diego");

        chatRoom.addUser(userA);
        chatRoom.addUser(userB);
        chatRoom.addUser(userC);
    }

    @Test
    void shouldDeliverMessageToOtherUsers() {
        userA.send("Hello everyone");

        assertTrue(userA.receivedMessages.isEmpty());

        assertEquals(1, userB.receivedMessages.size());
        assertEquals("Hello everyone", userB.receivedMessages.get(0));

        assertEquals(1, userC.receivedMessages.size());
        assertEquals("Hello everyone", userC.receivedMessages.get(0));
    }

    @Test
    void shouldMultipleMessagesFromDifferentUsers() {
        userB.send("Hi Anderson and Diego");

        assertTrue(userB.receivedMessages.isEmpty());
        assertEquals(List.of("Hi Anderson and Diego"), userA.receivedMessages);
        assertEquals(List.of("Hi Anderson and Diego"), userC.receivedMessages);

        userA.receivedMessages.clear();
        userC.receivedMessages.clear();

        userC.send("Hi Anderson and Lucas");

        assertEquals(List.of("Hi Anderson and Lucas"), userA.receivedMessages);
        assertEquals(List.of("Hi Anderson and Lucas"), userB.receivedMessages);
        assertTrue(userC.receivedMessages.isEmpty());
    }
}
