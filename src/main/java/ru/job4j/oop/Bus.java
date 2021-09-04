package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("We're on the bus.");

    }

    @Override
    public void passengers() {
        System.out.println("We're the passengers of the bus.");
    }
}
