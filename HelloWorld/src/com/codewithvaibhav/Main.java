package com.codewithvaibhav;

public class Main {

    public static void main(String[] args) {
    	// write your code here
        System.out.println("hello world");

        /*
        // Primitive Data types

        Types       No of Bytes     Range
        ----------------------------------
        bytes           1           [-128, 127]
        short           2           [-32k, 32k]
        int             2           [-2B, 2B]
        long            8
        float           4
        double          8
        char            2           A, B, C, ...
        boolean         1           true / false
        */
        byte age = 30;
        long viewsCount = 23_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;
        System.out.println(age);
        System.out.println(viewsCount);
        System.out.println(price);
        System.out.println(letter);

    }
}
