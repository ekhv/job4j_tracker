package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Go!");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Number of passengers:  " + passengers);
    }

    @Override
    public double refuel(double liters) {
        return 46.18 * liters;
    }
}
