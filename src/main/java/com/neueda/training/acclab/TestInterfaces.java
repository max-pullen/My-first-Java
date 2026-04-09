package com.neueda.training.acclab;

public class TestInterfaces {
    public static void main(String[] args) {
        Detailable[] dets = new Detailable[3];
        dets[0] = new CurrentAccount("John", 1000);
        dets[1] = new SavingsAccount("Jane", 2000);
        dets[2] = new HomeInsurance( 150, 1000, 300_000);

        for (Detailable det : dets) {
            System.out.println(det.getDetails());
        }
    }
}
