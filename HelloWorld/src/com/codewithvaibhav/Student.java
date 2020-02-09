package com.codewithvaibhav;

import com.codewithvaibhav.User;

public class Student extends User implements Teacher{
    public Student(){
        System.out.println(super.verified);
        System.out.println("This is constructor !!");
    }
    public enum statusChoice {studying, passed};
    public boolean verified = true;
    public String major;
    public statusChoice status;
    public void getFirstNameAndGender() {
        System.out.println(getFirstName() + getGender());
    }

    public void PrintFullName(){
        System.out.println("student name is " + firstName + " " +lastName);
    }
    public void PrintInterfaceFullName(){
        System.out.println("Student:  " + firstName + " " +lastName);
    }


}
