package tabbaraib.at11;

import java.util.Scanner;

public class At11Ex03 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);

        int min, max, somme;

        System.out.print("Indiquez la valeur minimum : ");
        min = cl.nextInt();
        System.out.print("Indiquez la valeur maximum : ");
        max = cl.nextInt();
        somme = 0;
        if (min % 2 == 1) {
            min++;
        }
        for (int i = min; i <= max; i += 2) {
            somme = somme + i;
            System.out.println("La racine carrée de " + i + " = " + Math.sqrt(i));
        }
        System.out.println("Somme des nombres pairs = " + somme);
    }
}
