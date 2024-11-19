package tabbaraib.at04;

import java.util.Scanner;

public class At04Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Nombre d'heures : ");
        int h = scanner.nextInt();
    
        System.out.print("Taux horaire : ");
        double t = scanner.nextDouble();
        scanner.close();

        double s = h * t;
        System.out.println("Le salaire est de : " + s);
    }
}