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

    }
}
