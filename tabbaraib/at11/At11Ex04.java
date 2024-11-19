package tabbaraib.at11;

import java.util.Scanner;

public class At11Ex04 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int hauteur;

        System.out.print("Entrez la hauteur du sapin : ");
        hauteur = clavier.nextInt();
        for (int i = 1; i <= hauteur; ++i) {
            for (int o = hauteur; o > i; --o) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}