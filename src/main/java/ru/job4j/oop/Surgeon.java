package ru.job4j.oop;

public class Surgeon extends Doctor {
    boolean pediatricSurgeon;
    private final String specializationSurgeon;

    public Surgeon(String name, String surname, String education, String birthday, String specializationSurgeon, boolean pediatricSurgeon) {
        super(name, surname, education, birthday);
        this.specializationSurgeon = specializationSurgeon;
        this.pediatricSurgeon = pediatricSurgeon;
    }


    public void makeDressing() {
    }

    public void setPlasterCast() {
    }
}
