package com.neueda.training.theBox;

public class Day2 {
    public static void main(String[] args) {
        int a = 42;
        int count = 0;
        for(int y=1; y<100; y++){
            if (a%y==0){
                System.out.println("Divisible by " + y);
                count++;
            }
            if (a<y) {
                System.out.println("that is it");
                System.out.println(count + " common factors");
                break;
            }
        }
    }
}
