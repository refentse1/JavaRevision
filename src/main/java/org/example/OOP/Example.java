package org.example.OOP;

import java.util.Date;

public class Example {
    String exampleTitle;
    long exampleID;
    Example(){
        exampleTitle = "Example Title";
        exampleID = new Date().hashCode();
    }

    //Setters
    public void setExampleTitle(String title){
        this.exampleTitle = title;
    }
    //Getters
    public String getExampleTitle(){
        return this.exampleTitle;
    }
    public long getExampleID(){
        return this.exampleID;
    }
}
