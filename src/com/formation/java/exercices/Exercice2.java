package com.formation.java.exercices;

import java.util.Scanner;

public class Exercice2 {

    /**
     * @Exercice Ecrire un programme qui demande successivement 20 nombres à l'utilisateur
     * et qui lui dise ensuite quel étais le plus grand parmi ces 20 nombres
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n, pg = 0, index = 0;
        for (int i = 0; i < 20; i++) {

            System.out.println("Entrez un nombre: ");
            n = scanner.nextInt();

            if (n > pg) {
                pg = n;
                index = i+1;
            }
        }
        System.out.println("Le nombre le plus grand était: " + pg +
                " , d'indice: " + index);
    }
}
