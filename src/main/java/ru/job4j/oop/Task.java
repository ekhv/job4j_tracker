package ru.job4j.oop;

public class Task {
    private final String clarification;
    private final String problem;

    public Task(String clarification, String problem) {
        this.clarification = clarification;
        this.problem = problem;
    }

    public String getClarification() {
        return clarification;
    }

    public String getProblem() {
        return problem;
    }

    public String getDescription() {
        return getProblem() + " - " + getClarification();
    }
}
