package tabbaraib.at10;

import java.util.Scanner;

public class At10Ex06 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        int base, valeurRecherchee, expo = 1;
        double resultat = 0;
        System.out.print("Entrez une base : ");
        base = cl.nextInt();
        System.out.print("Entrez la valeur recherchée : ");
        valeurRecherchee = cl.nextInt();
        while (Math.pow(base, expo) <= valeurRecherchee) {
            resultat = Math.pow(base, expo);
            expo++;
        }
        expo--;
        System.out.println("La valeur la plus près de la valeur recherchée est : " + resultat);
        System.out.println("en utilisant la base = " + base + " et l'exposant = " + expo);
        System.out.println("La valeur suivante vaut : " + Math.pow(base, expo + 1));
    }
}