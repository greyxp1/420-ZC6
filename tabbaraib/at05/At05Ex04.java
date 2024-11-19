package tabbaraib.at05;

import java.util.Scanner;

public class At05Ex04 {
    public static final int M2_PAR_POT = 25;
    public static final int CM2_PAR_M2 = 10000;
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        int longueur, largeur, hauteur;
        int aireTotale, nbPots, reste;
        System.out.print("Indiquez la longueur, la largeur et la hauteur de la pièce (cm) : ");
        longueur = cl.nextInt();
        largeur = cl.nextInt();
        hauteur = cl.nextInt();
        aireTotale = superficie(hauteur, largeur, longueur);
        nbPots = aireTotale / M2_PAR_POT + 1;
        reste = (nbPots * M2_PAR_POT - aireTotale) * 100 / M2_PAR_POT;
        System.out.print("Pour couvrir " + aireTotale + "m2, il vous faut ");
        System.out.println(nbPots + " pots et il vous restera " + reste + "% d'un pot.");
    }
    public static int superficie(int ha, int la, int lo) {
        int airePetitMur = la * ha;
        int aireGrandMur = lo * ha;
        int airePlafond = lo * la;
        return (2 * airePetitMur + 2 * aireGrandMur + airePlafond) / CM2_PAR_M2;
    }
}
