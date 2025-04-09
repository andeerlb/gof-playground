package com.andeerlb.gof.facade;

public class TimeValidatorService {
    public boolean isValidTime(String time) {
        return !time.endsWith("23:59:59"); // simulates invalid time
    }
}
