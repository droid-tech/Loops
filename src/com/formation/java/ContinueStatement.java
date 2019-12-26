package com.formation.java;

public class ContinueStatement {

    public static void main(String[] args) {

        /**
         * @Syntax
         *
         * jump-statement;
         * continue;
         */

        /**
         * @Example 1
         */
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        /**
         * @EndExample 1
         */

        /**
         * @Example 2
         */
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
        /**
         * @EndExample 2
         */

    }
}
