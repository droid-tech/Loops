package com.formation.java.exercices;

import java.util.Scanner;

public class Exercice3 {

    /**
     * @Exercice3 Lire la suite des prix (en dinars) des achats d'un client.
     * Calculer la somme qu'il doit payer.
     * Lire la somme qu'il paye.
     * et simuler la remise de la monnaie en affichant les textes:
     * 10 dinars
     * 5 dinars
     * et 1 dinars
     * autant de fois qu'il y a de coupures de chanue sorte è rendre
     * <p>
     * Exemple:
     * diff > ou <
     *
     * 64 000
     * 100 000
     * => 10 000+10 000+10 000, 5 000, 1 000
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sommeProduit = 0, prixProduit = 1;

        while (prixProduit != 0) {

            System.out.println("Entrez le montant du produit: (0 pour quiter)");
            prixProduit = scanner.nextInt();

            sommeProduit += prixProduit;
        }
        System.out.println("Montant a payé: " + sommeProduit);

    }

}
