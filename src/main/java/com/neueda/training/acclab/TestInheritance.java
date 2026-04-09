package com.neueda.training.acclab;

public class TestInheritance {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        accounts[0] = new SavingsAccount("Savings Account", 200);
        accounts[1] = new CurrentAccount("Current Account", 400);
        accounts[2] = new SavingsAccount("Savings Account", 600);

        for (int i = 0; i < accounts.length; i++) {
            // for (Account account : accounts) // alternative way to loop through the accounts array
            // remove accounts[i] and replace with account
            System.out.println("Account Name: " + accounts[i].getName() + "\nBalance: " + accounts[i].getBalance());
            accounts[i].addInterest();
                System.out.println("Account Balance After Interest: " + accounts[i].getBalance() + "\n");
        }
        System.out.println("Using getDetails method from Detailable interface: \n");
        for (Account account : accounts) {
            System.out.println(account.getDetails());
        }
    }


}

