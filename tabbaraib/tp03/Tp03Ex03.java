package tabbaraib.tp03;

import java.util.Scanner;

import commun.Outils;

public class Tp03Ex03 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        int jetonsJoueur;
        char typeMise;
        int mise;
        int resultat;
        int argentInitial;

        System.out.println("Bienvenue au jeu de Craps!");
        System.out.print("Combien d'argent voulez-vous convertir en jetons? ");
        jetonsJoueur = cl.nextInt();
        argentInitial = jetonsJoueur;

        do {
            System.out.print("  " + jetonsJoueur + " jetons restants. Entrez le type de mise (Pass - Don't pass - Quitter) > ");
            typeMise = cl.next().toUpperCase().charAt(0);
            if (typeMise != 'Q') {
                mise = 0;
                System.out.print("Combien de jetons voulez-vous miser? ");
                mise = cl.nextInt();
                if (mise > jetonsJoueur) {
                    while (mise > jetonsJoueur){
                        System.out.print("Mise trop haute. Maximum : " + jetonsJoueur + " jetons. Entrez une nouvelle mise > ");
                        mise = cl.nextInt();
                    }
                }
                resultat = jouerPartie();
                if (typeMise == resultat) {
                    System.out.println(" - Gagné!");
                    jetonsJoueur += mise;
                } else {
                    System.out.println(" - Perdu!");
                    jetonsJoueur -= mise;
                }
            }
        } while (typeMise != 'Q' && jetonsJoueur > 0);

        if (jetonsJoueur >= argentInitial) {
            System.out.print("Quelle chance! Vous avez gagné " + jetonsJoueur + "$.");
        } else {
            System.out.println("Malheureusement, vous avez perdu " + jetonsJoueur + "$.");
        }
    }

    /**
     * Détermine le type de gagnant.
     * 
     * Cette fonction lance deux dés et calcule leur somme. Ensuite, elle affiche la somme et détermine le type de gagnant.
     * Si la somme est de 7 ou 11, le type de gagnant est P. Si la somme est de 2, 3 ou 12, le type de gagnant est D.
     * Si la somme est de 4, 5, 6, 8, 9, 10, la fonction relance les dés.
     * 
     * Si la somme est à nouveau la somme obtenue lors du premier lancer du jeu, on gagne la mise si on avait choisi
     * Pass et on la perd si on avait choisi Don’t pass. 
     * Si la somme est de 7, on perd pour une mise sur Pass et on gagne sur Don’t pass.
     * Pour tous les autres résultats, la fonction relance les dés jusqu’à qu'on obtien la somme du premier lancer du jeu ou 7.
     * 
     * @return Le type de gagnant, 'P' pour Pass ou 'D' pour Don't pass.
     */
    public static char jouerPartie() {
        int de1;
        int de2;
        int sommeDes;
        char typeGagnant;
        int points;
        de1 = Outils.Aleatoire.nextInt(6) + 1;
        de2 = Outils.Aleatoire.nextInt(6) + 1;
        sommeDes = de1 + de2;
        System.out.print(de1 + "+" + de2 + "=" + sommeDes);
        if (sommeDes == 7 || sommeDes == 11) {
            typeGagnant = 'P';
        } else if (sommeDes == 2 || sommeDes == 3 || sommeDes == 12) {
            typeGagnant = 'D';   
        } else {
            typeGagnant = 'X';
            points = sommeDes;
            do {
                de1 = Outils.Aleatoire.nextInt(6) + 1;
                de2 = Outils.Aleatoire.nextInt(6) + 1;
                sommeDes = de1 + de2;
                System.out.print(" - " + de1 + "+" + de2 + "=" + sommeDes);
                if (sommeDes == points) {
                    typeGagnant = 'P';
                } else if (sommeDes == 7) {
                    typeGagnant = 'D';
                }
            } while (typeGagnant == 'X');
        }
        return typeGagnant;
    }
}