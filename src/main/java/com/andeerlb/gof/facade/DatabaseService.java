package com.andeerlb.gof.facade;

public class DatabaseService {
    public void saveClockIn(String employeeId, String time) {
        System.out.println("Clock-in saved for " + employeeId + " at " + time);
    }
}
