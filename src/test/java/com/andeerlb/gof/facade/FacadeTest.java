package com.andeerlb.gof.facade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class FacadeTest {

    @DisplayName("should not send notification if the time is valid")
    @Test
    public void testValidClockIn() {
        String employeeId = "12345678900";

        ClockService clock = mock(ClockService.class);
        TimeValidatorService validator = mock(TimeValidatorService.class);
        NotificationService notification = mock(NotificationService.class);
        DatabaseService database = mock(DatabaseService.class);

        when(clock.clockIn(employeeId)).thenReturn("2025-04-09T08:00:00");
        when(validator.isValidTime("2025-04-09T08:00:00")).thenReturn(true);

        TimeTrackingFacade facade = new TimeTrackingFacade(clock, validator, notification, database);
        facade.registerClockIn(employeeId);

        verify(database).saveClockIn(employeeId, "2025-04-09T08:00:00");
        verify(notification, never()).notifyHR(anyString(), anyString());
    }

    @DisplayName("should send notification if the time is invalid")
    @Test
    public void testInvalidClockIn() {
        String employeeId = "98765432100";

        ClockService clock = mock(ClockService.class);
        TimeValidatorService validator = mock(TimeValidatorService.class);
        NotificationService notification = mock(NotificationService.class);
        DatabaseService database = mock(DatabaseService.class);

        when(clock.clockIn(employeeId)).thenReturn("2025-04-09T23:59:59");
        when(validator.isValidTime("2025-04-09T23:59:59")).thenReturn(false);

        TimeTrackingFacade facade = new TimeTrackingFacade(clock, validator, notification, database);
        facade.registerClockIn(employeeId);

        verify(notification).notifyHR(employeeId, "Invalid time: 2025-04-09T23:59:59");
        verify(database, never()).saveClockIn(anyString(), anyString());
    }
}
