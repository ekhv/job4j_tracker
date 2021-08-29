package ru.job4j.oop;

public class Builder extends Engineer {
    boolean presenceBrigade;
    boolean availabilitySpecialEquipment;

    public Builder(String name, String surname, String education, String birthday, boolean presenceBrigade, boolean availabilitySpecialEquipment) {
        super(name, surname, education, birthday);
        this.presenceBrigade = presenceBrigade;
        this.availabilitySpecialEquipment = availabilitySpecialEquipment;
    }


    public void calculateEstimate() {
    }

    public void buildHouse() {
    }
}
