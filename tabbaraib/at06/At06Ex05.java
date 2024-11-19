package tabbaraib.at06;

import java.util.Scanner;

public class At06Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double heures, taux, salaire;

        System.out.print("Nombre d'heures : ");
        heures = scanner.nextDouble();

        System.out.print("Taux horaire : ");
        taux = scanner.nextDouble();

        if (heures <= 40) {
            salaire = heures * taux;
        } else {
            salaire = 40 * taux + (heures - 40) * 2 * taux;
        }

        System.out.printf("Le salaire est de : %.1f%n", salaire);

        scanner.close();
    }
}
