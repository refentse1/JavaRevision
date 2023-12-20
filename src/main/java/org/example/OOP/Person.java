package org.example.OOP;

import java.util.Date;

public class Person {
    String firstname,lastname,contact,email,password;
    long id;
    byte age;
    public Person(){
        id = new Date().hashCode();
        if(id<0){
            id *= -1;
        }
    }

    //Property Getters and Setters
    public void setFirstName(String value){
        this.firstname = value;
    }
    public String getFirstName(){
        return this.firstname;
    }
    public void setLastName(String value){
        this.lastname = value;
    }
    public String getLastName(){
        return this.lastname;
    }
    public void setAge(byte value){
        this.age = value;
    }
    public byte getAge(){
        return this.age;
    }
    public void setContact(String value){
        this.contact = value;
    }
    public String getContact() {
        return contact;
    }

    public void setEmail(String value){
        this.email = value;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword(String value){
        this.password = value;
    }

    public long getId(){
        return this.id;
    }

}
