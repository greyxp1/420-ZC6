package tabbaraib.at04;

import java.util.Scanner;

public class At04Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la position initiale en X de la balle (x0): ");
        double x0 = scanner.nextDouble();

        System.out.print("Entrez la position initiale en Y de la balle (y0): ");
        double y0 = scanner.nextDouble();

        System.out.print("Entrez la vitesse en X de la balle (vx): ");
        double vx = scanner.nextDouble();

        System.out.print("Entrez la vitesse en Y de la balle (vy): ");
        double vy = scanner.nextDouble();

        System.out.println("Position initiale: (" + Math.round(x0) + ", " + Math.round(y0) + ")");

        for (int t = 1; t <= 3; t++) {
            double xt = x0 + vx * t;
            double yt = y0 + vy * t;
            System.out.println("Position après " + t + " seconde(s): (" + Math.round(xt) + ", " + Math.round(yt) + ")");
        }

        scanner.close();
    }
}