package tabbaraib.at04;

import java.util.Scanner;

public class At04Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inscrire un premier mot : ");
        String mot1 = scanner.nextLine();

        System.out.print("Inscrire un deuxieme mot : ");
        String mot2 = scanner.nextLine();

        System.out.println("mot1 = " + mot1 + ", mot2 = " + mot2);

        String temp = mot1;
        mot1 = mot2;
        mot2 = temp;

        System.out.println("mot1 = " + mot1 + ", mot2 = " + mot2);
    }
}