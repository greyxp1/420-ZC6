package tabbaraib.at10;

import java.util.Scanner;
import commun.Outils;

public class At10Ex07 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        boolean terminer = false;
        int valeurMax, nb1, nb2, reponseUtilisateur, reponseCorrecte;
        
        Outils.Aleatoire.setSeed(65432);

        System.out.print("Inscrivez la valeur maximale voulue : ");
        valeurMax = cl.nextInt();
        
        while (!terminer) {
            nb1 = Outils.Aleatoire.nextInt(valeurMax) + 1;
            nb2 = Outils.Aleatoire.nextInt(valeurMax) + 1;

            System.out.print("Combien font " + nb1 + " * " + nb2 + " ? ");
            reponseUtilisateur = cl.nextInt();
            reponseCorrecte = nb1 * nb2;
            if (reponseUtilisateur == reponseCorrecte) {
                System.out.println("BRAVO! Vous avez la bonne réponse");
            } else {
                System.out.print("Erreur, le résultat de " + nb1 + " * " + nb2 + "est " + reponseCorrecte);
                terminer = true;
            }
        }
    }
}