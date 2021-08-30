package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setGroup("M-100");
        student.setReceiptDate(new Date());
        System.out.println("Full name: " + student.getFullName());
        System.out.println("Group: " + student.getGroup());
        System.out.println("Receipt date: " + student.getReceiptDate());
    }
}
