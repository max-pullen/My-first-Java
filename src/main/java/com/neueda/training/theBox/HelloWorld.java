package com.neueda.training.theBox;

public class HelloWorld {
    public static void main(String[] args) {
        /*System.out.println("Hello World :)");
        // insert comment
        int myAge = 23;
        double myHeight = 1.83;
        /*
        Here is a multi line
        comment

        System.out.println("My\nage\nis\n" + myAge);
        System.out.println("My height is " + myHeight + "m");

        String myName = "Max";
        System.out.println("My name is ..." + myName + ". I am\n" + myHeight + "m");
        */

        // Exercises ***************************************
        /*String carMake = "Audi";
        String carModel = "A3";
        double engineSize = 1.4;
        byte carGear = 5;

        System.out.println("My car make is a " + carMake + " " + carModel +
                ".\nThe gear is " + carGear + " with a " + engineSize + " engine.");

        // short speed = (short) (carGear*20);
        short speed = carGear*=20;
        System.out.println("Its top speed is " + speed);

        int revs = (int) speed*1000;
        System.out.println("Revs are probs like " + revs);

         */

        // If / Else **********************

/*
        double balance = 5000;
        double amountToWithdraw = 5000;

        if (balance > amountToWithdraw){
            balance -= amountToWithdraw;
            System.out.println("Withdrawal successful. Balance: " + balance);
        }
        else if (balance == amountToWithdraw) {
            balance -= amountToWithdraw;
            System.out.println("Withdrawal successful. You outta cash. \nBalance: " + balance);
        }
        else {
            System.out.println("Insufficient balance. Balance: " + balance);
        }
// turnery operator

        int a = 1, b =2, c =3;

        c = (b > a) ? b : a;
*/
// switch case block
        //    switch (integer)
// while loop
        /*
        int i=0;
        while (i<5) {
            System.out.println("i is " + i);
            i++;
            if (i == 5)
                System.out.println("Done");
            }

         */
// do while loop
        /*
        int i=0;
        do{
            System.out.println("i is " + i);
            i++;
        }
        while (i<5);

         */
// for loop

        for(int j=0; j<5; j++) {
            System.out.println("j is " + j);
            if (j==4) {
                System.out.println("done");
            }
        }
// Increment operator
        /*
        int a=0;
        System.out.println(a++);
        System.out.println(++a);
// Logical operators
        int myAge=23, yourAge=30;
        if ((myAge<40) && (yourAge<40)){
            System.out.println("We are young!");
        }

         */


        //Exercises
        /*
        String carMake = "Audi";
        String carModel = "A3";
        double engineSize = 1.4;
        byte carGear = 5;

        System.out.println("My car make is a " + carMake + " " + carModel +
                ".\nThe gear is " + carGear + " with a " + engineSize + " engine.");

        // short speed = (short) (carGear*20);
        short speed = carGear*=20;
        System.out.println("Its top speed is " + speed);

        int revs = (int) speed*1000;
        System.out.println("Revs are probs like " + revs);

        if (engineSize<=1) {
            System.out.println("I have seen hair dryers with more power");
        }
        else if ((1<engineSize) && (engineSize<2)) {
            System.out.println("I mean... \nthe engine size is alright.");
        }
        else {
            System.out.println("Fair enough");
        }

         */
        // next section


    }
}
