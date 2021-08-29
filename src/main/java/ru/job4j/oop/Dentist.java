package ru.job4j.oop;

public class Dentist extends Doctor {
    boolean pediatricDentist;
    boolean refresherCourses;

    public Dentist(String name, String surname, String education, String birthday, boolean pediatricDentist, boolean refresherCourses) {
        super(name, surname, education, birthday);
        this.pediatricDentist = pediatricDentist;
        this.refresherCourses = refresherCourses;
    }


    public void takePhoto() {
    }

    public void treatCaries() {
    }

}
