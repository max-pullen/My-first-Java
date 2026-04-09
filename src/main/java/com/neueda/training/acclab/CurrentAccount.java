package com.neueda.training.acclab;

public class CurrentAccount extends Account {
    public CurrentAccount(String name, double balance) {
        super(name, balance);
    }
    @Override
    public void addInterest() {
        double setBalance = getBalance() * 1.1;
    }
}
