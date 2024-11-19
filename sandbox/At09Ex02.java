package sandbox;

import java.util.Scanner;

public class At09Ex02 {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		int cout, montantPaye, montantARemettre;
		int nb100S, nb20S, nb5S, nb1S;

		System.out.print("Coût total de l'achat : ");
		cout = clavier.nextInt();
		System.out.print("Montant payé par le client : ");
		montantPaye = clavier.nextInt();
		if (montantPaye < cout) {
			System.out.println("Votre paiement n'est pas suffisant.");
		} else {
			montantARemettre = montantPaye - cout;
			nb100S = montantARemettre / 100;
			montantARemettre = montantARemettre % 100;
			nb20S = montantARemettre / 20;
			montantARemettre = montantARemettre % 20;
			nb5S = montantARemettre / 5;
			nb1S = montantARemettre % 5;
			System.out.print("Remettre au client");
			if (nb100S > 0) {
				System.out.print(" - " + nb100S + "x100$");
			}
			if (nb20S > 0) {
				System.out.print(" - " + nb20S + "x20$");
			}
			if (nb5S > 0) {
				System.out.print(" - " + nb5S + "x5$");
			}
			if (nb1S > 0) {
				System.out.print(" - " + nb1S + "x1$");
			}
			System.out.println(".");
		}
	}
}