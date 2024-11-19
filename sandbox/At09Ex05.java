package sandbox;

import java.util.Scanner;

public class At09Ex05 {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		int nb1, nb2, som1, som2;
		
		System.out.print("Inscrivez deux nombres séparés par une espace : ");
		nb1 = clavier.nextInt();
		nb2 = clavier.nextInt();
		som1 = nb1;
		som2 = nb2;
		while (som1 != som2) {
			while (som1 < som2) {
				som1 += nb1;
			}
			while (som2 < som1) {
				som2 += nb2;
			}
		}
		System.out.println("Le PPCM de " + nb1 + " et " + nb2 + " est " + som1);
	}
}