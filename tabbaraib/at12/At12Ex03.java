package tabbaraib.at12;

import java.util.Scanner;

public class At12Ex03 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        String[] nomVille = {"Gaspé", "Gatineau", "Mont-Tremblant", "Québec", "Rimouski", "Rouyn-Noranda","Saguenay", "Sept-Iles", "Tadoussac"};
        int [] trajets = new int[9];
        System.out.println("Inscrivez le nombre de trajets que vous effectuez entre Montréal et chacune des villes. Un aller-retour compte pour deux trajets.");
        for (int i = 0; i < nomVille.length; i++) {
            System.out.print("Montréal <--> " + nomVille[i] + " ? ");
            trajets[i] = cl.nextInt();
        }

        System.out.println();
        System.out.println(String.format("%15s %9s", "Ville", "Trajets"));
        System.out.println("-------------------------");
        for (int i = 0; i < nomVille.length; i++) {
            System.out.println(String.format("%15s %9d", nomVille[i], trajets[i]));
        }
    }
}