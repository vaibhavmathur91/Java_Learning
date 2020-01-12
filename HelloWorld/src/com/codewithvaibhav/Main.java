package com.codewithvaibhav;

import java.sql.Array;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // write your code here
        System.out.println("hello world");

        /*

        ---- Data Types in Java ----

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

        // Primitive Data types
        byte age = 30;
        long viewsCount = 23_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;
        System.out.println(age);
        System.out.println(viewsCount);
        System.out.println(price);
        System.out.println(letter);



        // Reference Type
        Date now = new Date();
        System.out.println(now);




        // String Types
        String message = "hello world";
        String new_message = "Hello World" + "!!";
        String trim_message = "   Hello    ";
        System.out.println(message);
        System.out.println(trim_message);
        System.out.println(trim_message.trim());
        System.out.println(new_message);
        System.out.println(message.endsWith("!!"));
        System.out.println(new_message.endsWith("!!"));
        System.out.println(new_message.startsWith("!!"));
        System.out.println(new_message.length());
        System.out.println(new_message.toLowerCase());
        System.out.println(new_message.toUpperCase());
        System.out.println(new_message.indexOf("W"));
        System.out.println(new_message.indexOf("X"));
        /*
            Parameter = def method(param1),    arguments =  method("value_called_with")
            Below  parameter = target, replacement     argument = "!", '*'
            string.Replace()  method do not change original string
        */
        System.out.println(new_message.replace("!", "*"));
        System.out.println(new_message);



        // Array data types
        int[] numbers = new int[5];
        /*
            Arrays are fixed size/length and elements cant be added after size is full
        */

        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        int[] new_numbers = {1, 4, 5, 3, 2};
        System.out.println(Arrays.toString(new_numbers));
        System.out.println(new_numbers.length);
        Arrays.sort(new_numbers);
        System.out.println(Arrays.toString(new_numbers));



        // Multi-Dimensional Array
        int[][] matrix_nums = new int[2][3];
        matrix_nums[0][0] = 1;
        System.out.println(Arrays.deepToString(matrix_nums));
        int[][] new_matrix_nums = {{1 ,2 ,3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(new_matrix_nums));

    }
}
