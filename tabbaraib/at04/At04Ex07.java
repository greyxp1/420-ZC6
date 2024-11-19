package tabbaraib.at04;

import java.util.Scanner;

public class At04Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de km en ville : ");
        int kmVille = scanner.nextInt();

        System.out.print("Entrez le nombre de km sur l'autoroute : ");
        int kmAutoroute = scanner.nextInt();

        int tempsVille = calculerTemps(kmVille, 50);
        int tempsAutoroute = calculerTemps(kmAutoroute, 100);
        int tempsTotal = tempsVille + tempsAutoroute;
        double distanceTotale = kmVille + kmAutoroute;

        System.out.println("\nDistance totale : " + String.format("%.2f", distanceTotale) + "km.");
        System.out.println("Temps total de parcours : " + tempsTotal / 60 + "h" + tempsTotal % 60 + "min");

        scanner.close();
    }

    private static int calculerTemps(int km, int vitesse) {
        return (int) Math.round((double) km / vitesse * 60);
    }
}