package com.neueda.training.acclab;

public class SavingsAccount extends Account {
    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void addInterest() {
        setBalance (getBalance() * 1.4);
    }
}


