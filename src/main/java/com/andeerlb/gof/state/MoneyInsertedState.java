package com.andeerlb.gof.state;

class MoneyInsertedState implements State {
    private VendingMachine machine;

    public MoneyInsertedState(VendingMachine machine) {
        this.machine = machine;
    }

    public void insertMoney() {
        System.out.println("Money already inserted.");
    }

    public void selectProduct() {
        System.out.println("Product selected.");
        machine.setState(machine.getDispensingState());
    }

    public void dispense() {
        System.out.println("Select product first.");
    }
}
