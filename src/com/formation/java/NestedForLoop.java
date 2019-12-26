package com.formation.java;

public class NestedForLoop {

    public static void main(String[] args) {

        /**
         * @Example
         */
        /*for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }*/
        /**
         * @EndExample
         */

        /**
         * @Example 2
         */
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /**
         * @EndExample 2
         */
    }

}
