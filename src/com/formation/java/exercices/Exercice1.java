package com.formation.java.exercices;

import java.util.Scanner;

public class Exercice1 {

    /**
     * @Exercice 1
     * <p>
     * Ecrire un programme qui demande un nombre compris entre 10 et 20,
     * jusqqu'a que la réponse convienne.
     * En cas de réponse supérieure a 20, on fera apparaitre un message: "Plus petit!",
     * et inversement "Plus grand!" si le nombre est inférieur a 10.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        System.out.println("Entrez un nombre entre 10 et 20: ");

        while (n < 10 || n > 20) {
            n = scanner.nextInt();

            if (n < 10) {
                System.out.println("plus grand!");
            } else if (n > 20) {
                System.out.println("plus petit!");
            }
        }

    }

}
