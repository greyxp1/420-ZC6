package tabbaraib.at06;

import java.util.Scanner;

public class At06Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coût total de l'achat : ");
        int coutTotal = scanner.nextInt();

        System.out.print("Montant payé par le client : ");
        int montantPaye = scanner.nextInt();

        if (montantPaye < coutTotal) {
            System.out.println("Votre paiement n'est pas suffisant.");
        } else {
            int change = montantPaye - coutTotal;
            afficheChange(change);
        }

        scanner.close();
    }

    /**
     * Affiche le change à remettre au client en minimisant la quantité de monnaie.
     * N'affiche que les dénominations pour lesquelles il y a des billets à remettre.
     *
     * @param montant Le montant total à remettre au client
     */
    public static void afficheChange(int montant) {
        int[] denominations = {100, 20, 5, 1};
        int[] quantites = new int[4];
        boolean premierAffichage = true;

        System.out.print("Remettre au client ");

        for (int i = 0; i < denominations.length; i++) {
            quantites[i] = montant / denominations[i];
            montant %= denominations[i];

            if (quantites[i] > 0) {
                if (!premierAffichage) {
                    System.out.print(" - ");
                } else {
                    premierAffichage = false;
                }
                System.out.print(quantites[i] + "x" + denominations[i] + "$");
            }
        }

        System.out.println(".");
    }
}
