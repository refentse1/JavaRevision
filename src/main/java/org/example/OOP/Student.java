package org.example.OOP;

public class Student extends Person{
    int studentNumber;

    @Override
    public void setEmail(String value) {
        super.setEmail(this.studentNumber+"@school.ac.za");
    }

    public void setStudentNumber(int value){
        this.studentNumber = value;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
}
