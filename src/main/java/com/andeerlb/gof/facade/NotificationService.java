package com.andeerlb.gof.facade;

public class NotificationService {
    public void notifyHR(String employeeId, String reason) {
        System.out.println("Notifying HR: " + employeeId + " - " + reason);
    }
}
