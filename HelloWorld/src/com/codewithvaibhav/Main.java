package com.codewithvaibhav;

import javax.sound.midi.Soundbank;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.lang.Math;
import java.util.Scanner;


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
            int             4           [-2B, 2B]
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
        System.out.println(isEligible);
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
        int[][] new_matrix_nums = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(new_matrix_nums));


        // Constant Declaration

        float pi = 3.14F;
        pi = 3.66F;
        System.out.println(pi);
        /*
            normally we can change value of data types
            but we need constant whose value does not change
        */
        final float new_pi = 3.14F;
        /*this value is constant and can not be changed*/



        // Type Casting
        /*
            implicit casting:
            > (converted to)
            byte > short > int > long > float > double
        */
        short x = 1;
        int y = x + 2;
        System.out.println(y);



        //Explicit casting
        double a = 2.2;
        int b = (int)a + 5;
        System.out.println(b);

        int result = 10 / 3;    //result = 3  as int/int = int
        System.out.println(result);
        /* so we change int to double and get result as double*/
        double get_division = (double)10 / (double)3;
        System.out.println(get_division);

        String xx = "1";
        int yy = Integer.parseInt(xx) + 4;
        System.out.println(yy);



        // Math Module
        int result1 = Math.round(1.1F);
        System.out.println(result1);
        int result2 = (int)Math.ceil(1.1F);
        System.out.println(result2);
        int result3 = (int)Math.ceil(1.1F);
        System.out.println(result3);
        int result4 = Math.max(1, 2);
        System.out.println(result4);
        int result5 = Math.min(1, 2);
        System.out.println(result5);
        long result6 = Math.round(Math.random() * 100);
        System.out.println(result6);
        int result7 = (int)Math.round(Math.random() * 100);
        System.out.println(result7);
        int result8 = (int)(Math.random() * 100);
        System.out.println(result8);



        // Number Formatting

        NumberFormat curreny = NumberFormat.getCurrencyInstance();
        String cur_res1 = curreny.format(123456.90978);
        System.out.println(cur_res1);

        String cur_res2 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(cur_res2);



        // Input from terminal
        Scanner input = new Scanner(System.in);
        /*
        long age1 = input.nextLong();
        float age1 = input.nextFloat();
         */
        System.out.print("age1 is : ");
        byte age1 = input.nextByte();
        System.out.println("age1 "+ age1);

        System.out.print("age2 is : ");
        long age2 = input.nextLong();
        System.out.println("age2 " + age2);
        /*
        System.out.print("name1: ");
        String name_inp_1 = input.nextLine();
        System.out.println("Name1: " + name_inp_1);
         */
        System.out.print("xxxxxxxx");
        System.out.print("name2  is (Type: cat and mat): ");
        String name_inp_2 = input.next();
        System.out.println("Name2: " + name_inp_2);


        //Comparision operators
        int x1 = 1;
        int y1 = 2;
        System.out.println(x1 == y1);
        System.out.println(x1 != y1);
        System.out.println(x1 <= y1);
        System.out.println(x1 >= y1);
        System.out.println("-======-");



        //Logical operators
        int temp1 = 22;
        boolean isWarm = temp1 > 20 && temp1 < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligibleForLoan = (hasHighIncome || hasGoodCredit) && ! hasCriminalRecord;
        System.out.println(isEligibleForLoan);



        // If-Statements
        int temp = 32;
        if(temp >30){
            System.out.println("Its hot day");
            System.out.println("drink water");
        }
        else if(temp>20){
            System.out.println("Beautiful day");
        }
        else{
            System.out.println("Cold Day");
        }


        int income = 120_000;
        boolean hasHighIncome1;
        if (income>100_000){
            hasHighIncome1 = true;
        }
        else{
            hasHighIncome1 = false;
        }

        int income2 = 120_000;
        boolean hasHighIncome2 = income2 > 100_000;
        System.out.println(hasHighIncome2);


        // Ternary operator
        int income3 = 120_000;
        String className1;
        if(income3 > 100_000){
            className1 = "First";
        }
        else{
            className1 = "Economy";
        }


        int income4 = 120_000;
        String className4 = income4 > 100_000 ? "First": "Economy";
        System.out.println(className4);



        //Switch Statements
        String role1 = "admin";
        if(role1 == "admin"){
            System.out.println("you are admin");
        }
        else if(role1 == "moderator"){
            System.out.println("you are moderator");
        }
        else{
            System.out.println("you are a guest");
        }


        switch (role1){
            case "admin":
                System.out.println("you are admin");
                break;
            case "moderator":
                System.out.println("you are moderator");
                break;
            default:
                System.out.println("you are a guest");
        }
    }
}
