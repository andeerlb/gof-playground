package com.andeerlb.gof.observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private final Map<String, List<EventListener>> listeners;

    public EventManager() {
        this.listeners = new HashMap<>();
    }

    public void subscribe(String eventType, EventListener ... listener) {
        if(!listeners.containsKey(eventType)) {
            listeners.put(eventType, new ArrayList<>());
        }

        List<EventListener> users = listeners.get(eventType);
        users.addAll(List.of(listener));
    }

    public void unsubscribe(String eventType, EventListener listener) {
        if(!listeners.containsKey(eventType)) {
            System.out.println("Listener for type " + eventType + " not exists");
        }

        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file) {
        if(!listeners.containsKey(eventType)) {
            return;
        }

        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
