package tabbaraib.at04;

import java.util.Scanner;

public class At04Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le rayon: ");
        double r = scanner.nextDouble();
        scanner.close();

        double p = 2 * Math.PI * r;
        double a = Math.PI * Math.pow(r, 2);

        System.out.printf("Le périmètre est de %.5f%n", p);
        System.out.printf("L'aire est de %.5f%n", a);
    }
}
