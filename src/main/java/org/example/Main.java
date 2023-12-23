package org.example;

import org.example.OOP.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John","Doe");
        student1.setEmail();
        System.out.print(student1.getEmail());

    }

}