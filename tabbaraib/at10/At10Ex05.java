package tabbaraib.at10;

import java.util.Scanner;

public class At10Ex05 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        int nbHeures;
        float salaire, tauxHoraire;
        System.out.print("Nombre d'heures : ");
        nbHeures = cl.nextInt();
        while (nbHeures < 30 || nbHeures > 50) {
            System.out.println("Vous devez faire entre 30 et 50 heures");
            System.out.print("Nombre d'heures corrigé : ");
            nbHeures = cl.nextInt();
        }
        System.out.print("Taux horaire : ");
        tauxHoraire = cl.nextFloat();
        salaire = (nbHeures * tauxHoraire);
        System.out.println("Le salaire est de : " + salaire);
    }
}