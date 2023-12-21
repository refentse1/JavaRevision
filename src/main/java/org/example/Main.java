package org.example;


import org.example.Files.Files;

public class Main {
    public static void main(String[] args) {
        Files file = new Files();
        file.createFile("files");
        file.writeFile("Hello World");
        file.readFile();
    }

}