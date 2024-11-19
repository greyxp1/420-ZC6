package tabbaraib.at07;

import java.util.Scanner;

public class At07Ex04 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        int jour, mois;
        String saison;

        System.out.print("Entrez le jour et le mois en chiffres : ");
        jour = cl.nextInt();
        mois = cl.nextInt();

        if (mois == 12 && jour >= 21 || mois == 1 || mois == 2 || mois == 3 && jour < 21) {
            saison = "hiver";
        } else if (mois == 3 && jour >= 21 || mois == 4 || mois == 5 || mois == 6 && jour < 21) {
            saison = "printemps";
        } else if (mois == 6 && jour >= 21 || mois == 7 || mois == 8 || mois == 9 && jour < 21) {
            saison = "été";
        } else {
            saison = "automne";
        }

        System.out.println("La saison est : " + saison);
        cl.close();
    }
}
