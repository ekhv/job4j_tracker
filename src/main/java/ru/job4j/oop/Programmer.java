package ru.job4j.oop;

public class Programmer extends Engineer {
    private final boolean javaExperience;
    private final boolean linuxProficiency;

    public Programmer(String name, String surname, String education, String birthday, boolean javaExperience, boolean linuxProficiency) {
        super(name, surname, education, birthday);
        this.javaExperience = javaExperience;
        this.linuxProficiency = linuxProficiency;
    }

    public void writeProgram() {
    }

    public void fixBug() {
    }
}
