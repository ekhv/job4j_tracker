package ru.job4j.oop;

public class Pacient {
    private final String lastName;
    private final String firstName;
    private final String birthday;
    private final Diagnosis diagnosis;

    public Pacient(String lastName, String firstName, String birthday, Diagnosis diagnosis) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.diagnosis = diagnosis;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }
}
