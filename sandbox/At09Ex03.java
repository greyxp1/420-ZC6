package sandbox;

import java.util.Scanner;

public class At09Ex03 {
	public static void main(String[] args) {
		Scanner cl = new Scanner(System.in);
		int nb, iter;
		
		System.out.print("Entrez un entier positif : ");
		nb = cl.nextInt();
		System.out.print("La séquence 3N+1 est : " + nb);
		iter = 0;
		while (nb != 1) {
			iter++;
			if (nb % 2 == 0) {
				nb /= 2;
			} else {
				nb = 3 * nb + 1;
			}
			System.out.print(" - " + nb);
		}
		System.out.print("\nLa séquence s'est terminée après " + iter + " itérations.");
	}
}