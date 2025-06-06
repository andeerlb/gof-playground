package com.andeerlb.gof.state;

public class DispensingState implements State {
    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }

    public void insertMoney() {
        System.out.println("Please wait, dispensing product.");
    }

    public void selectProduct() {
        System.out.println("Already dispensing product.");
    }

    public void dispense() {
        System.out.println("Product dispensed. Returning to waiting state.");
        machine.setState(machine.getWaitingState());
    }
}
