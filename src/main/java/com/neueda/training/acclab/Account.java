package com.neueda.training.acclab;

//public abstract class Account {
//
//    private String name;
//    private double balance;
//    private static double interestRate = 0.1;
//
//    public Account (String name, double balance){
//        this.name = name;
//        this.balance = balance;
//    }
//
//
//// Getter and Setter for name
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String n) {
//        this.name = name;
//    }
//
//// Getter and Setter balance
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//    // Interest
//
//    public static double getInterestRate() {
//        return interestRate;
//    }
//
//    public static void setInterestRate(double interestRate) {
//        Account.interestRate = interestRate;
//    }
//
//
//    // Setting method
//
//    public void addInterest() {
//        balance = balance + (interestRate * balance);
//    }
//}

public abstract class Account implements Detailable {

    private String name;
    private double balance;
    private static double interestRate = 0.1;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
// Getter and Setter for name

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = name;
    }

// Getter and Setter balance

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Interest

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    // Setting method

    public abstract void addInterest();

    // Detailable interface method implementation

    @Override
    public String getDetails() {
        return "Account Name: " + name + "\nBalance: " + balance;
    }
}

