package com.neueda.training.Animal;

import java.util.ArrayList;
import java.util.List;

public class Day3Test {
    public static void main(String[] args) {
        Dog a = new Dog("Rex", "Labrador", 5);
        Dog b = new Dog("Buddy", "Golden Retriever", 3);


        for (Dog Kennel : new Dog[]{a, b}) {
            System.out.println(a.getName() + " is a " + a.getBreed() + " and is " + a.getAge() + " years old.");
            Kennel.makeSound();
            Kennel.eat();
        }
    }
}
