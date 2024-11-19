package tabbaraib.at04;

import java.util.Scanner;

public class At04Ex08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coût total de l'achat : ");
        int costTotal = scanner.nextInt();

        System.out.print("Montant payé par le client : ");
        int amountPaid = scanner.nextInt();

        int changeDue = amountPaid - costTotal;

        int count100 = changeDue / 100;
        int count20 = (changeDue % 100) / 20;
        int count5 = (changeDue % 20) / 5;
        int count1 = changeDue % 5;

        System.out.println("Remettre au client: " + count100 + " x $100, " + count20 + " x $20, " + count5 + " x $5, " + count1 + " x $1.");
        
        scanner.close();
    }
}