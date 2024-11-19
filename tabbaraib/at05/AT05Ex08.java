package tabbaraib.at05;

import java.util.Scanner;

public class AT05Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Entrez le rayon : ");
        double rayon = scanner.nextDouble();
        double perimetre = perimetreCercle(rayon);
        double aire = aireCercle(rayon);
        System.out.printf("Le périmètre est de %.6f%n", perimetre);
        System.out.printf("L'aire est de %.6f%n", aire);
        scanner.close();
    }
    /**
     * Calcule le périmètre d'un cercle.
     * @param rayon Le rayon du cercle (nombre à virgule flottante)
     * @return Le périmètre du cercle
     */
    public static double perimetreCercle(double rayon) {
        return 2 * Math.PI * rayon;
    }
    /**
     * Calcule l'aire d'un cercle.
     * @param rayon Le rayon du cercle (nombre à virgule flottante)
     * @return L'aire du cercle
     */
    public static double aireCercle(double rayon) {
        return Math.PI * rayon * rayon;
    }
}