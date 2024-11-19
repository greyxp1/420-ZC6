package sandbox;

import java.util.Scanner;

public class At09Ex01 {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		int cout, montantPaye, montantARemettre;
		int nb100S, nb20S, nb5S, nb1S;

		System.out.print("Coût total de l'achat : ");
		cout = clavier.nextInt();
		System.out.print("Montant payé par le client : ");
		montantPaye = clavier.nextInt();
		montantARemettre = montantPaye - cout;
		nb100S = montantARemettre / 100;
		montantARemettre = montantARemettre % 100;
		nb20S = montantARemettre / 20;
		montantARemettre = montantARemettre % 20;
		nb5S = montantARemettre / 5;
		nb1S = montantARemettre % 5;
		System.out.println("Remettre au client " + nb100S + "x100$, " + 
		                   nb20S + "x20$, " + nb5S + "x5$ et " + nb1S + "x1$.");
	}
}