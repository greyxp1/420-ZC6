package sandbox;

import java.util.Scanner;

public class At09Ex04 {
	public static final float BONUS_MULT = 2;

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		float nbHeures, tauxHoraire, salaire;

		System.out.print("Nombre d'heures : ");
		nbHeures = clavier.nextFloat();
		System.out.print("Taux horaire : ");
		tauxHoraire = clavier.nextFloat();
		salaire = calculSalaire(nbHeures, tauxHoraire);
		System.out.println("Le salaire est de : " + salaire);
	}

	public static float calculSalaire(float heures, float taux) {
		float sal;

		if (heures > 40) {
			sal = 40 * taux;
			sal = sal + (heures - 40) * taux * BONUS_MULT;
		} else {
			sal = heures * taux;
		}
		return sal;
	}
}