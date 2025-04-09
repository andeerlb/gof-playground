package com.andeerlb.gof.facade;

public class TimeTrackingFacade {
    private final ClockService clock;
    private final TimeValidatorService validator;
    private final NotificationService notification;
    private final DatabaseService database;

    public TimeTrackingFacade(ClockService clock, TimeValidatorService validator,
                              NotificationService notification, DatabaseService database) {
        this.clock = clock;
        this.validator = validator;
        this.notification = notification;
        this.database = database;
    }

    public void registerClockIn(String employeeId) {
        String time = clock.clockIn(employeeId);
        if (validator.isValidTime(time)) {
            database.saveClockIn(employeeId, time);
        } else {
            notification.notifyHR(employeeId, "Invalid time: " + time);
        }
    }
}
