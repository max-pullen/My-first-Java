package com.neueda.training.Animal;

public class Dog extends Animal implements Pet{
    private String name;
    private String breed;
    private int age;

    public Dog (String name, String breed, int age) {
        super(name, age);
        this.name = name;
        this.breed = breed;
        this.age = age;

    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public void eat() {
        System.out.println(name + " eats");
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing.");
    }

    @Override
    public void beFriendly() {
        System.out.println(name + " wants to play.");

    }
}
