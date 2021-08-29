package ru.job4j.oop;

public class Engineer extends Profession {
    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String writeDocumentation(Task task) {
        return task.getDescription();
    }
}
