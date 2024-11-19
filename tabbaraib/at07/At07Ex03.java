package tabbaraib.at07;

import java.util.Scanner;

public class At07Ex03 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        String carte;
        char valeur, sorte;

        System.out.print("Entrez la carte (2 caractères) : ");
        carte = cl.next().toUpperCase();
        valeur = carte.charAt(0);
        sorte = carte.charAt(1);

        System.out.print(getValeurTexte(valeur));
        System.out.print(" de ");
        System.out.println(getSorteTexte(sorte));

        cl.close();
    }

    private static String getValeurTexte(char valeur) {
        switch (valeur) {
            case 'A': return "As";
            case '2': return "Deux";
            case '3': return "Trois";
            case '4': return "Quatre";
            case '5': return "Cinq";
            case '6': return "Six";
            case '7': return "Sept";
            case '8': return "Huit";
            case '9': return "Neuf";
            case 'X': return "Dix";
            case 'V': return "Valet";
            case 'D': return "Dame";
            case 'R': return "Roi";
            default: return "INVALIDE";
        }
    }

    private static String getSorteTexte(char sorte) {
        switch (sorte) {
            case 'P': return "Pique";
            case 'C': return "Coeur";
            case 'K': return "Carreau";
            case 'T': return "Trèfle";
            default: return "INVALIDE";
        }
    }
}
