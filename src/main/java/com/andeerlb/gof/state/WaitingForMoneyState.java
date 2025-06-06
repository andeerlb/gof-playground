package com.andeerlb.gof.state;

public class WaitingForMoneyState implements State {
    private VendingMachine machine;

    public WaitingForMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    public void insertMoney() {
        System.out.println("Money inserted.");
        machine.setState(machine.getMoneyInsertedState());
    }

    public void selectProduct() {
        System.out.println("Please insert money first.");
    }

    public void dispense() {
        System.out.println("Insert money first.");
    }
}
