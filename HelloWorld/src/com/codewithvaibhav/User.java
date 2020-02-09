package com.codewithvaibhav;

import java.util.List;

public class User {
    public String firstName;
    public String lastName;
    private String gender;
    public boolean verified = false;
    //void means method will return Null(Nothing)
    public void output(int times){
        for(int i=0; i<times; i++) {
            System.out.println(firstName + " " + lastName);
        }
    }
    public void output(){
        System.out.println("name is :" + firstName + " " + lastName);
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

    public static void PrintSingleUser(User u){
        System.out.println(u.getGender());
    }

    public static void PrintMultiUsers(List<User> users){
        for(User user: users){
            System.out.println(user.getGender());
        }
    }

    public void PrintFullName(){
        System.out.println(firstName + " " +lastName);
    }

    public void PrintInterfaceFullName(){
        System.out.println("User:  " + firstName + " " +lastName);
    }

    public final void getLastName(){
        System.out.println(lastName);
    }
}
