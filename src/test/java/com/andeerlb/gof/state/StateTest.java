package com.andeerlb.gof.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateTest {
    @Test
    void shouldInitialStateIsWaiting() {
        VendingMachine machine = new VendingMachine();
        assertEquals("WaitingForMoneyState", machine.getStateName());
    }

    @Test
    void shouldInsertMoneyChangesToMoneyInserted() {
        VendingMachine machine = new VendingMachine();
        machine.insertMoney();
        assertEquals("MoneyInsertedState", machine.getStateName());
    }

    @Test
    void shouldSelectProductWithoutMoneyStaysInWaiting() {
        VendingMachine machine = new VendingMachine();
        machine.selectProduct();
        assertEquals("WaitingForMoneyState", machine.getStateName());
    }

    @Test
    void shouldFullFlowToDispensingAndBackToWaiting() {
        VendingMachine machine = new VendingMachine();
        machine.insertMoney();
        machine.selectProduct();
        assertEquals("DispensingState", machine.getStateName());
        machine.dispense();
        assertEquals("WaitingForMoneyState", machine.getStateName());
    }

    @Test
    void testDoubleInsertMoneyDoesNotBreakState() {
        VendingMachine machine = new VendingMachine();
        machine.insertMoney();
        machine.insertMoney();
        assertEquals("MoneyInsertedState", machine.getStateName());
    }
}
