package tabbaraib.at10;

import java.util.Scanner;

import commun.Outils;

public class At10Ex09 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        boolean terminer = false;
        int valeurMax, valeurMin, nb1, nb2, reponseUtilisateur, reponseCorrecte, operation;
        int bonnesReponses = 0, mauvaisesReponses = 0;
        
        Outils.Aleatoire.setSeed(13579);

        System.out.print("Inscrivez la valeur maximale voulue : ");
        valeurMax = cl.nextInt();
        System.out.print("Quel est le nombre minimum de questions ? ");
        valeurMin = cl.nextInt();
        
        while (!terminer) {
            nb1 = Outils.Aleatoire.nextInt(valeurMax) + 1;
            nb2 = Outils.Aleatoire.nextInt(valeurMax) + 1;
            operation = Outils.Aleatoire.nextInt(4);
            
            String opSymbole;
            switch (operation) {
                case 0: opSymbole = "+"; break;
                case 1: opSymbole = "-"; break;
                case 2: opSymbole = "*"; break;
                case 3: opSymbole = "/"; break;
                default: opSymbole = "?";
            }
            System.out.print("Combien font " + nb1 + " " + opSymbole + " " + nb2 + " ? ");
            reponseUtilisateur = cl.nextInt();
            reponseCorrecte = convertion(nb1, operation, nb2);
            if (reponseUtilisateur == reponseCorrecte) {
                System.out.println("BRAVO! Vous avez la bonne réponse");
                bonnesReponses++;
            } else {
                System.out.println("Erreur, le résultat de " + nb1 + " " + opSymbole + " " + nb2 + " est " + reponseCorrecte);
                mauvaisesReponses++;
            }
            if (bonnesReponses + mauvaisesReponses >= valeurMin) {
                terminer = reponseUtilisateur != reponseCorrecte;
            }
        }
        
        System.out.println("Vous avez obtenu " + bonnesReponses + " bonnes réponses.");
        System.out.println("Vous avez obtenu " + mauvaisesReponses + " mauvaises réponses.");
        double pourcentage = (bonnesReponses * 100.0) / (bonnesReponses + mauvaisesReponses);
        System.out.println("Vous avez " + (int)pourcentage + "% de bonnes réponses");
    }
    public static int convertion(int nb1, int operation, int nb2) {
        switch (operation) {
            case 0: return nb1 + nb2;
            case 1: return nb1 - nb2;
            case 2: return nb1 * nb2;
            case 3: return nb1 / nb2;
            default: return 0;
        }
    }
}