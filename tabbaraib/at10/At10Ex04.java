package tabbaraib.at10;

import java.util.Scanner;

public class At10Ex04 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        int numJoueur, joueur, reponse, numMeilleur, meilleure;
        int diffJoueur, diffMeilleure;

        reponse = 233;
        meilleure = 0;
        numMeilleur = 0;
        numJoueur = 1;
        diffMeilleure = reponse - meilleure;
        System.out.println("Quelle est la hauteur (m) du Mont Royal? ");
        do {
            System.out.print("Réponse du joueur " + numJoueur + " (0 pour terminer) : ");
            joueur = cl.nextInt();
            if (joueur <= reponse && reponse - joueur < diffMeilleure) {
                meilleure = joueur;
                numMeilleur = numJoueur;
                diffMeilleure = reponse - meilleure;
            }
            numJoueur = numJoueur + 1;
        } while (joueur != 0 && joueur != reponse);
        System.out.print("Le joueur " + numMeilleur + " a la meilleure réponse : " + meilleure);
    }
}