package com.andeerlb.gof.state;

public class VendingMachine implements State {
    private State waitingState;
    private State moneyInsertedState;
    private State dispensingState;

    private State currentState;

    public VendingMachine() {
        waitingState = new WaitingForMoneyState(this);
        moneyInsertedState = new MoneyInsertedState(this);
        dispensingState = new DispensingState(this);

        currentState = waitingState;
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getWaitingState() {
        return waitingState;
    }

    public State getMoneyInsertedState() {
        return moneyInsertedState;
    }

    public State getDispensingState() {
        return dispensingState;
    }

    public String getStateName() {
        return currentState.getClass().getSimpleName();
    }

    public void insertMoney() {
        currentState.insertMoney();
    }

    public void selectProduct() {
        currentState.selectProduct();
    }

    public void dispense() {
        currentState.dispense();
    }
}
