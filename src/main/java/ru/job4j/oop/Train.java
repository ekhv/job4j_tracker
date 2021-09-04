package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("We're on the train.");
    }

    @Override
    public void passengers() {
        System.out.println("We're the passengers of the train.");
    }
}
