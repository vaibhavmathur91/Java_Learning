package com.codewithvaibhav;

public class User {
    public String firstName;
    public String lastName;
    private String gender;
    //void means method will return Null(Nothing)
    public void output(int times){
        for(int i=0; i<times; i++) {
            System.out.println(firstName + " " + lastName);
        }
    }

    public String getFirstName(){
        return firstName;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String sex){
        gender = sex;
    }
}
