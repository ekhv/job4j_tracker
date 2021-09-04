package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Plain airplane = new Plain();
        Bus bus = new Bus();
        Train train = new Train();
        Vehicle[] array = {airplane, bus, train};
        for (Vehicle v : array) {
            v.move();
            v.passengers();
        }
    }
}
