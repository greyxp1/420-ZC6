package tabbaraib.at06;

import java.util.Scanner;

public class At06Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inscrivez le rayon de la première pizza : ");
        double rayon1 = scanner.nextDouble();
        System.out.print("Inscrivez le prix de la première pizza : ");
        double prix1 = scanner.nextDouble();

        System.out.print("Inscrivez le rayon de la seconde pizza : ");
        double rayon2 = scanner.nextDouble();
        System.out.print("Inscrivez le prix de la seconde pizza : ");
        double prix2 = scanner.nextDouble();

        double surface1 = Math.PI * rayon1 * rayon1;
        double surface2 = Math.PI * rayon2 * rayon2;

        double prixParSurface1 = prix1 / surface1;
        double prixParSurface2 = prix2 / surface2;

        if (prixParSurface1 < prixParSurface2) {
            System.out.println("Il est préférable d'acheter la première pizza.");
        } else if (prixParSurface2 < prixParSurface1) {
            System.out.println("Il est préférable d'acheter la seconde pizza.");
        } else {
            System.out.println("Les deux pizzas ont le même rapport qualité-prix.");
        }

        scanner.close();
    }
}
