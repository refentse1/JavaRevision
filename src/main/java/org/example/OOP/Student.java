package org.example.OOP;

import java.util.Date;

public class Student extends Person{
    int studentNumber;

    public Student(String firstname,String lastname){
        super(firstname,lastname);
        this.studentNumber = new Date().hashCode() < 0 ? (new Date().hashCode() * - 1) : new Date().hashCode() ;

    }
    @Override
    public void setEmail() {
        this.email = this.studentNumber+"@school.ac.za";
    }
    public int getStudentNumber(){
        return studentNumber;
    }
}
