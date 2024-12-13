package tabbaraib.tp04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.Scanner;
import commun.Outils;

public class Tp04 {
	@BeforeEach void setup() {
		Outils.Aleatoire.resetSeedSet();
		Outils.Aleatoire.setSeed(123);
	}

	@Test void test11() { 
		int[] nb = {1,2,3,4,5};
		int[] pts = {0,1,4,9,16};
		assertArrayEquals(new int[] {0,0,0,0,16}, calculScore(nb,pts));
		assertArrayEquals(new int[] {1,2,3,4,5}, nb);
		assertArrayEquals(new int[] {0,1,4,9,16}, pts);
	}
	@Test void test12() { 
		int[] nb = {5,4,3,2,1};
		int[] pts = {0,1,4,9,16};
		assertArrayEquals(new int[] {0,0,0,0,0}, calculScore(nb,pts));
		assertArrayEquals(new int[] {5,4,3,2,1}, nb);
		assertArrayEquals(new int[] {0,1,4,9,16}, pts);
	}
	@Test void test13() { 
		int[] nb = {1,2,4,3,5};
		int[] pts = {0,1,4,9,16};
		assertArrayEquals(new int[] {0,0,4,0,1}, calculScore(nb,pts));
		assertArrayEquals(new int[] {1,2,4,3,5}, nb);
		assertArrayEquals(new int[] {0,1,4,9,16}, pts);
	}
	@Test void test14() { 
		int[] nb = {5,4,1,3,2};
		int[] pts = {0,1,4,9,16};
		assertArrayEquals(new int[] {0,0,0,1,0}, calculScore(nb,pts));
		assertArrayEquals(new int[] {5,4,1,3,2}, nb);
		assertArrayEquals(new int[] {0,1,4,9,16}, pts);
	}
	@Test void test15() { 
		int[] nb = {1,2,2,3,1};
		int[] pts = {0,1,4,9,16};
		assertArrayEquals(new int[] {0,0,0,9,0}, calculScore(nb,pts));
		assertArrayEquals(new int[] {1,2,2,3,1}, nb);
		assertArrayEquals(new int[] {0,1,4,9,16}, pts);
	}

	@Test void test21() { 
		int[] nb = {1,4,3,2,5};
		boolean[] dis = {true,true,true,true,true};
		assertEquals(3, pigeTuile(nb,dis));
		assertArrayEquals(new int[] {1,4,3,2,5}, nb);
		assertArrayEquals(new boolean[] {true,true,false,true,true}, dis);
	}
	@Test void test22() { 
		int[] nb = {1,4,3,2,5};
		boolean[] dis = {true,true,false,true,true};
		assertEquals(1, pigeTuile(nb,dis));
		assertArrayEquals(new int[] {1,4,3,2,5}, nb);
		assertArrayEquals(new boolean[] {false,true,false,true,true}, dis);
	}
	@Test void test23() { 
		int[] nb = {1,4,3,2,5};
		boolean[] dis = {false,true,false,true,true};
		assertEquals(4, pigeTuile(nb,dis));
		assertArrayEquals(new int[] {1,4,3,2,5}, nb);
		assertArrayEquals(new boolean[] {false,false,false,true,true}, dis);
	}
	@Test void test24() { 
		int[] nb = {1,4,3,2,5};
		boolean[] dis = {false,false,true,true,false};
		assertEquals(3, pigeTuile(nb,dis));
		assertArrayEquals(new int[] {1,4,3,2,5}, nb);
		assertArrayEquals(new boolean[] {false,false,false,true,false}, dis);
	}
	@Test void test25() { 
		int[] nb = {5,4,3,2,1};
		boolean[] dis = {true,false,false,false,true};
		assertEquals(5, pigeTuile(nb,dis));
		assertArrayEquals(new int[] {5,4,3,2,1}, nb);
		assertArrayEquals(new boolean[] {false,false,false,false,true}, dis);
	}

	@Test void test31() { assertEquals(25, somme(new int[] {1,3,5,7,9})); }
	@Test void test32() { assertEquals(6, somme(new int[] {1,0,0,5,0})); }
	@Test void test33() { assertEquals(0, somme(new int[] {0,0,0,0,0})); }
	@Test void test34() { assertEquals(8, somme(new int[] {8})); }
	@Test void test35() { assertEquals(0, somme(new int[] {})); }

	@Test void test41() { assertEquals(4, maximum(new int[] {1,3,5,7,9})); }
	@Test void test42() { assertEquals(1, maximum(new int[] {1,8,4,6})); }
	@Test void test43() { assertEquals(0, maximum(new int[] {9,7,5,3,1})); }
	@Test void test44() { assertEquals(0, maximum(new int[] {5})); }
	@Test void test45() { assertEquals(2, maximum(new int[] {3,3,8,8,3})); }

	@Test void test51() { assertEquals(1, trouve(new int[] {1,3,5,7,9}, 3)); }
	@Test void test52() { assertEquals(0, trouve(new int[] {1,3,5,7,9}, 1)); }
	@Test void test53() { assertEquals(4, trouve(new int[] {1,3,5,7,9}, 9)); }
	@Test void test54() { assertEquals(-1, trouve(new int[] {1,3,5,7,9}, 4)); }
	@Test void test55() { assertEquals(-1, trouve(new int[] {}, 7)); }


	public static final int NB_CASES = 7;
	public static void main(String[] args) {
		Outils.Aleatoire.setSeed(9531);
		Scanner cl = new Scanner(System.in);
		char typePointage;
		char typeDistribution;
		int maxScore = 0;
		int[] points = {0, 1, 3, 5, 7, 9, 11, 15, 20, 25, 30, 35, 40, 50, 60, 70, 85, 100, 150, 300};
		int[] tuiles = new int[40];

		do {
			System.out.print("Sélectionnez le pointage de Base ou Expert ou Quitter : ");
			typePointage = cl.next().toUpperCase().charAt(0);
			if (typePointage != 'Q') {
				System.out.print("Distribution des chiffres, soit Classique ou Différents? ");
				typeDistribution = cl.next().toUpperCase().charAt(0);			
				
				if (typePointage == 'E') {
					points[5] = 3;
					points[11] = 20;
					points[16] = 50;
				}

				if (typeDistribution == 'D') {
					tuiles = new int[40];
					for (int i = 1; i < 40; i++) {
						tuiles[i] = i + 1;
					}
				} else {
					tuiles = new int[40];
					for (int i = 0; i < 40; i++) {
						if (i <= 30) {
							tuiles[i] = i;
						} else {
							tuiles[i] = i - 20;
						}
					}
				}
				int currentScore = jouerPartie(cl, tuiles, points);

				if (currentScore > maxScore) {
    				maxScore = currentScore;
				}
			}
		} while (typePointage != 'Q');

		System.out.println("Votre record est : " + String.format("%03d", maxScore));
		System.out.println("Bonne journée");
	}

	/**
	 * Gère une partie complète de Boutabou.
	 * @param cl Scanner les entrées de l'utilisateur.
	 * @param tuiles Tableau des tuiles disponibles.
	 * @param points Tableau des points associés aux scores.
	 * @return Retour le score total de la partie.
	 */
	public static int jouerPartie(Scanner cl, int[] tuiles, int[] points) {
		int[] cases = toursDeJeu(cl, tuiles);

		changeJoker(cl, cases);
		affiche(cases, '-', '/', -1, "__");
		int[] scores = calculScore(cases, points);
		affiche(scores, ' ', ' ', 0, "  ");

		int nbMax = maximum(scores);
		int scoreMax = scores[nbMax];
		int totalScore = somme(scores);

		System.out.println("Total de la partie = " + totalScore + " (" + scoreMax + ")");

		if (totalScore > scoreMax) {
			System.out.println("Bravo, vous avez battu votre record! Nouveau score à battre : " + String.format("%03d", totalScore));
		}
		cl.nextLine();
		return totalScore;
	}

	/**
	 * Gère les tours de jeu en demandant à l'utilisateur d'ajouter des nombres.
	 * 
	 * @param cl Scanner pour lire les entrées de l'utilisateur.
	 * @param tuiles Tableau des tuiles disponibles.
	 * @return Retour un tableau des cases remplies par l'utilisateur.
	 */
	public static int[] toursDeJeu(Scanner cl, int[] tuiles) {
		int[] cases = new int[NB_CASES];

		for (int i = 0; i < cases.length; i++) {
			cases[i] = -1;
		}

		int[] positions = new int[NB_CASES];

		for (int i = 0; i < positions.length; i++) {
			positions[i] = i + 1;
		}

		boolean[] tuilesDisponibles = new boolean[tuiles.length];

		for (int i = 0; i < tuilesDisponibles.length; i++) {
			tuilesDisponibles[i] = true;
		}

		for (int i = 0; i < NB_CASES; i++) {
			int tuile = pigeTuile(tuiles, tuilesDisponibles);			
			int position;
			affiche(cases, '-', '-', -1, "__");
			affiche(positions, ' ', ' ', -1, " ");
			System.out.print("Position d'ajout du nombre " + tuile + " > ");
			position = cl.nextInt();
			while (position < 1 || position > NB_CASES || cases[position - 1] != -1) {
				System.out.print("Cette position est invalide, choisissez-en une autre > ");
				position = cl.nextInt();
			}		
			cases[position - 1] = tuile;
		}
		
		return cases;
	}

	/**
	 * Change la valeur d'un joker dans les cases.
	 * 
	 * @param cl Scanner pour lire les entrées de l'utilisateur.
	 * @param cases Tableau des cases du jeu.
	 */
	public static void changeJoker(Scanner cl, int[] cases) {
		int position = trouve(cases, 0);

		if (position != -1){
			affiche(cases, '-', '-', 0, "**");
			System.out.print("En quelle valeur voulez-vous changer le JOKER? ");
			cases[position] = cl.nextInt();
		}	
	}

	/**
	 * Calcule les scores basés sur les cases et les points.
	 * 
	 * @param cases Tableau des cases du jeu.
	 * @param points Tableau des points associés aux scores.
	 * @return Retour un tableau des scores calculés.
	 */
	public static int[] calculScore(int[] cases, int[] points) {
		int[] scores = new int[cases.length];
		int longueurSuite = 1;
		
		for (int i = 0; i < cases.length - 1; i++) {
			if (cases[i] <= cases[i + 1]) {
				longueurSuite++;
			} else {
				if (longueurSuite > 1) {
					scores[i] = points[longueurSuite - 1]; 
				}
				longueurSuite = 1;
			}
		}

		if (longueurSuite > 1) {
			scores[cases.length - 1] = points[longueurSuite - 1];
		}
		return scores;
	}

	/**
	 * Tire une tuile au hasard parmi celles disponibles.
	 * 
	 * @param tuiles Tableau des tuiles.
	 * @param disponible Tableau indiquant si une tuile est disponible.
	 * @return Retour la tuile tirée.
	 */
	public static int pigeTuile(int[] tuiles, boolean[] disponible) {
		int tuilePigee;

		do {
			tuilePigee = Outils.Aleatoire.nextInt(0, tuiles.length);
		} while (disponible[tuilePigee] == false);
		disponible[tuilePigee] = false;
		return tuiles[tuilePigee];
	}

	/**
	 * Affiche un tableau avec des séparateurs.
	 * 
	 * @param tab Tableau à afficher.
	 * @param sepC Séparateur pour les valeurs croissantes.
	 * @param sepD Séparateur pour les valeurs décroissantes.
	 * @param val Valeur à remplacer par un symbole.
	 * @param rem Symbole de remplacement.
	 */
	public static void affiche(int[] tab, char sepC, char sepD, int val, String rem) {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == val) {
				System.out.print(rem);
			} else {
				System.out.print(String.format("%2d", tab[i]));
			}

			if (i < tab.length - 1) {
				if (tab[i] <= tab[i + 1]) {
					System.out.print(" " + sepC + " ");
				} else {
					System.out.print(" " + sepD + " ");
				}
			}
		}
		System.out.println();
	}

	/**
	 * Calcule la somme des éléments d'un tableau.
	 * 
	 * @param vecteur Tableau dont on veut la somme.
	 * @return Retour la somme des éléments du tableau.
	 */
	public static int somme(int[] vecteur) {
		int total = 0;

		for (int i = 0; i < vecteur.length; i++) {
			total += vecteur[i];
		}
		return total;
	}

	/**
	 * Trouve l'indice du maximum dans un tableau.
	 * 
	 * @param vecteur Tableau à analyser.
	 * @return Retour l'indice de la valeur maximale.
	 */
	public static int maximum(int[] vecteur) {
		int max = 0;

		for (int i = 1; i < vecteur.length; i++) {
			if (vecteur[i] > vecteur[max]) {
				max = i;
			}
		}
		return max;
	}

	/**
	 * Trouve la position d'une valeur dans un tableau.
	 * 
	 * @param vecteur Tableau à analyser.
	 * @param valeur Valeur à rechercher.
	 * @return Retour l'indice de la valeur trouvée, ou -1 si non trouvée.
	 */
	public static int trouve(int[] vecteur, int valeur) {
		int position = -1;

		for (int i = 0; i < vecteur.length; i++) {
			if (vecteur[i] == valeur) {
				position = i;
			}
		}
		return position;
	}
}