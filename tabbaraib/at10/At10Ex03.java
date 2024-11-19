package tabbaraib.at10;

import java.util.Scanner;

public class At10Ex03 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        int min, mid, max;
        System.out.print("Entrez trois valeurs en ordre croissant : ");
        min = cl.nextInt();
        mid = cl.nextInt();
        max = cl.nextInt();
        while (min > mid || mid > max) {
            System.out.print("Vos valeurs ne sont pas en ordre croissant, recommencez : ");
            min = cl.nextInt();
            mid = cl.nextInt();
            max = cl.nextInt();
        }
        System.out.println("Bravo, vous avez réussi!");
    }
}