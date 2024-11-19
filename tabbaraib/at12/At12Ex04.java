package tabbaraib.at12;

import java.util.Scanner;

public class At12Ex04 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        String[] nomVille = {"Gaspé", "Gatineau", "Mont-Tremblant", "Québec", "Rimouski", "Rouyn-Noranda","Saguenay", "Sept-Iles", "Tadoussac"};
        int [] trajets = new int[9];
        int[] distance = {930, 207, 135, 253, 540, 638, 465, 900, 475};
        int [] distanceTrajets = new int[9];
        System.out.println("Inscrivez le nombre de trajets que vous effectuez entre Montréal et chacune des villes. Un aller-retour compte pour deux trajets.");
        for (int i = 0; i < nomVille.length; i++) {
            System.out.print("Montréal <--> " + nomVille[i] + " ? ");
            trajets[i] = cl.nextInt();
            distanceTrajets[i] = trajets[i] * distance[i];
        }
        
        System.out.println();
        System.out.println(String.format("%15s %4s %4s", "Ville", "T", "DT"));
        System.out.println("-------------------------");
        for (int i = 0; i < nomVille.length; i++) {
            System.out.println(String.format("%15s %4d %4d", nomVille[i], trajets[i], distanceTrajets[i]));
        }
    }
}