package ru.job4j.oop;

public class Plain implements Vehicle {
    @Override
    public void move() {
        System.out.println("We're on the plane.");
    }

    @Override
    public void passengers() {
        System.out.println("We're the passengers of the plane.");
    }
}
