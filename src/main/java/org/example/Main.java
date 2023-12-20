package org.example;

import org.example.basics.DataTypes;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int now = new Date().hashCode();
        System.out.print(now);
    }

}