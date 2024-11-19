package tabbaraib.tp01;

import java.util.Scanner;

public class Tp01Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez les coordonnées du premier point (A) :");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Entrez les coordonnées du deuxième point (B) :");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Entrez les coordonnées du troisième point (C) :");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        System.out.println("-------------------------");

        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x1, y1);

        System.out.printf("Mesure du segment AB : %.1f%n", a);
        System.out.printf("Mesure du segment BC : %.6f%n", b);
        System.out.printf("Mesure du segment AC : %.6f%n", c);

        double perimeter = a + b + c;
        System.out.printf("Périmètre du triangle ABC : %.6f%n", perimeter);

        double s = (perimeter / 2);
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("Aire du triangle ABC : %.7f%n", area);

        scanner.close();
    }

    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}