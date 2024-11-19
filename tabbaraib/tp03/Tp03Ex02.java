﻿package tabbaraib.tp03;

import java.awt.Color;
import java.util.Scanner;
import commun.FenetreDessin;
import commun.Outils;

public class Tp03Ex02 {
	public static final int LARGEUR = 800, HAUTEUR = 600;

	public static void main(String[] args) {
//		Outils.Aleatoire.setSeed(123);
		Scanner cl = new Scanner(System.in);
		FenetreDessin fd = new FenetreDessin("Balle sur cible", LARGEUR, HAUTEUR);
		int nbEssais;        // Nombre d'essais désirés par partie
		int nbEssaisEx;		 // Nombre d'essais executé
		int nbPoints;        // Nombre de points obtenus pour l'essai courant
		int totalPoints;     // Nombre total de points pour la partie courante
		int maxPoints;       // Nombre maximal de points obtenus à la fin d'une partie
		int dstCanonCible;   // Distance entre le canon et la cible
		int vitesseVent;     // Vitesse du vent (m/s)
		int vitesseBalle;    // Vitesse de la balle (m/s)
		int angleCanon;      // Angle du canon (degrés)
		float dstCanonBalle; // Distance entre le canon et la balle
		float dstBalleCible; // Distance entre la balle et la cible
		char reponse;        // Réponse de l'usager

		// Initialiser le nombre maximal de points à 0
		maxPoints = 0;
		// Afficher et lire le nombre d'essais désiré par partie
		System.out.print("Combien d'esais par partie voulez-vous? ");
		nbEssais = cl.nextInt();
		// Faire
		do {
			// Initialiser le total de points pour la partie courante à 0 
			totalPoints = 0;
			// Afficher une ligne d'étoiles
			System.out.println("*************************");
			dstCanonCible = Outils.Aleatoire.nextInt(51) + 25;
			vitesseVent = Outils.Aleatoire.nextInt(101) - 50;
			// Afficher la distance de la cible et la vitesse du vent
			System.out.println("La cible est à " + dstCanonCible + "m du canon.");
			System.out.println("Le vent souffle à " + vitesseVent + "m/s.");
			// Pour chaque essai
			for (nbEssaisEx = 0; nbEssaisEx < nbEssais; nbEssaisEx++){
				// Afficher le numéro de l'essai
				System.out.println(">>>>> ESSAI #" + nbEssaisEx + "/" + nbEssais + " <<<<<");
				// Afficher et lire la vitesse de la balle et l'angle du canon
				System.out.print("Entrez la vitesse (m/s) et l'angle séparés par une espace : ");
				vitesseBalle = cl.nextInt();
				angleCanon = cl.nextInt();
				// Appeler la procédure dessineTrajet() pour dessiner le trajet
				dessineTrajet(fd, vitesseBalle, angleCanon, dstCanonCible, vitesseVent);
				// Calculer la distance entre le canon et la balle : utiliser distanceBalle()
				dstCanonBalle = distanceBalle(vitesseBalle, angleCanon, vitesseVent);
				dstBalleCible = Math.abs(dstCanonCible - dstCanonBalle);
				// Afficher le résultat du calcul (dstBalleCible)
				System.out.println("Votre balle est tombée à " + dstBalleCible + "m de la cible.");
				// SI la balle est à moins de 10m de la cible ALORS utilisez la ligne suivante 
				// pour calculer le nombre de points pour l'essai, SINON on obtient 0 point
				if(dstBalleCible < 10){
				// CALCUL DU POINTAGE : nbPoints = (int) (10*(6-Math.ceil(dstBalleCible/2)));
				nbPoints = (int) (10*(6-Math.ceil(dstBalleCible/2)));
				} else {
					nbPoints = 0;
				}
				// Afficher le nombre de points obtenus pour l'essai
				System.out.println("Vous avez obtenu " + nbPoints + " points pour cet essai.");
				// Mettre à jour le total de points pour la partie
				totalPoints = totalPoints + nbPoints;
			// Fin pour
			}
			// Afficher une ligne d'étoiles et le total de points pour la partie
			System.out.println("*************************");
			System.out.println("Votre pointage final est de " + totalPoints + " points.");
			// Mettre à jour le nombre maximal de points obtenus
			maxPoints = maxPoints + totalPoints;
			// Demander si l'usager veut rejouer et lire sa réponse
			System.out.print("Voulez-vous rejouer? ");
			reponse = cl.next().charAt(0);
		// Tant que l'usager veut rejouer (reponse contient O ou o)
		} while(reponse == 'o' || reponse == 'O');
		// Afficher le nombre maximal de points obtenus par le joueur
		System.out.println("Votre nombre de points maximal obtenu durant une partie est de " + maxPoints + " points.");
	}

	/**
	 * Calcule le trajet de la balle en tenant compte du vent, de la vitesse initiale de la
	 * balle et de l'angle du canon. La fonction retourne la distance de la balle par rapport  
	 * au canon.  La distance est positive lorsque la balle tombe devant le canon, sinon elle
	 * est négative.
	 * 
	 * @param vitesse Vitesse initiale de la balle en m/s
	 * @param angle Angle du canon en degrés. Horizontal: 0, vertical: 90
	 * @param vent Vitesse du vent en m/s.  Positif si vent de dos et négatif si vent de face
	 * @return Distance finale entre balle et canon en m. Négative si balle derrière canon
	 */
	public static float distanceBalle(int vitesse, int angle, int vent) {
		return genereTrajet(null, vitesse, angle, 0, vent);		
	}

	/**
	 * Dessine le trajet de la balle en tenant compte du vent, de la vitesse initiale de la
	 * balle et de l'angle du canon.
	 * 
	 * @param fd Accès à la fenêtre de dessin
	 * @param vit Vitesse initiale de la balle en m/s
	 * @param angle Angle du canon en degrés. Horizontal: 0, vertical: 90
	 * @param dC Distance entre le canon et la cible en m
	 * @param vent Vitesse du vent en m/s. Positif si vent de dos et négatif si vent de face
	 */
	public static void dessineTrajet(FenetreDessin fd, int vit, int angle, int dC, int vent) {
		genereTrajet(fd, vit, angle, dC, vent);
	}

	/**
	 * Calcule le trajet de la balle en tenant compte du vent, de la vitesse initiale de la
	 * balle et de l'angle du canon.  Si une fenêtre de dessin est fournie, le trajet est
	 * dessiné. La fonction retourne la distance de la balle par rapport au canon. La distance
	 * est positive lorsque la balle tombe devant le canon, sinon elle est négative.
	 * 
	 * @param fd Accès à la fenêtre de dessin
	 * @param vit Vitesse initiale de la balle en m/s
	 * @param angle Angle du canon en degrés. Horizontal: 0, vertical: 90
	 * @param dC Distance entre le canon et la cible en m
	 * @param vent Vitesse du vent en m/s.  Positif si vent de dos et négatif si vent de face
	 * @return Distance finale entre balle et canon en m. Négative si balle derrière canon
	 */
	public static float genereTrajet(FenetreDessin fd, int vit, int angle, int dC, int vent) {
		int factX = 8, factY = -10;
		int decalX = 50, decalY = 500;
		int factVent = 10;
		float posXi, posYi, posXf, posYf;
		float vX, vY, aX, aY;
		float delta = 0.1f;

		posXi = 0;
		posYi = 0;
		vX = (float) (vit * Math.cos(angle / 180.0 * Math.PI));
		vY = (float) (vit * Math.sin(angle / 180.0 * Math.PI));
		if (vent > 0 && vent > vX) {
			aX = vent * (vent - vX) / factVent * delta;
		} else if (vent < 0 && vent < vX) {
			aX = -vent * (vent - vX) / factVent * delta;
		} else {
			aX = 0;
		}
		aY = -9.8f;
		if (fd != null) {
			fd.effaceFenetre();
			fd.couleurRemplissage(Color.YELLOW);
			fd.dessineEllipsePlein(dC * factX + decalX, decalY, factX * 20, 25);
			fd.couleurRemplissage(Color.WHITE);
			fd.dessineEllipsePlein(dC * factX + decalX, decalY, factX * 16, 20);
			fd.couleurRemplissage(Color.YELLOW);
			fd.dessineEllipsePlein(dC * factX + decalX, decalY, factX * 12, 15);
			fd.couleurRemplissage(Color.WHITE);
			fd.dessineEllipsePlein(dC * factX + decalX, decalY, factX * 8, 10);
			fd.couleurRemplissage(Color.RED);
			fd.dessineEllipsePlein(dC * factX + decalX, decalY, factX * 4, 5);
			fd.couleurRemplissage(Color.WHITE);
			int vecX1 = (int) (30 * Math.cos(angle / 180.0 * Math.PI));
			int vecY1 = (int) (30 * Math.sin(angle / 180.0 * Math.PI));
			int vecX2 = (int) (10 * Math.cos((angle + 90) / 180.0 * Math.PI));
			int vecY2 = (int) (10 * Math.sin((angle + 90) / 180.0 * Math.PI));
			fd.dessineSegment(-vecX1 / 5 + vecX2 / 2 + decalX, vecY1 / 5 - vecY2 / 2 + decalY,
					4 * vecX1 / 5 + vecX2 / 2 + decalX, -4 * vecY1 / 5 - vecY2 / 2 + decalY);
			fd.dessineSegment(-vecX1 / 5 - vecX2 / 2 + decalX, vecY1 / 5 + vecY2 / 2 + decalY,
					4 * vecX1 / 5 - vecX2 / 2 + decalX, -4 * vecY1 / 5 + vecY2 / 2 + decalY);
			fd.dessineSegment(-vecX1 / 5 + vecX2 / 2 + decalX, vecY1 / 5 - vecY2 / 2 + decalY,
					-vecX1 / 5 - vecX2 / 2 + decalX, vecY1 / 5 + vecY2 / 2 + decalY);
		}
		do {
			delta = (float) (-vY - Math.sqrt(vY * vY - 4 * aY / 2 * posYi)) / (2 * aY / 2);
			if (delta > 0.1) {
				delta = 0.1f;
			}
			posYf = posYi + vY * delta + aY * delta * delta / 2;
			posXf = posXi + vX * delta + aX * delta * delta / 2;
			if (fd != null) {
				fd.dessineSegment((int) (posXi*factX + decalX), (int) (posYi*factY + decalY),
						(int) (posXf*factX + decalX), (int) (posYf*factY + decalY));
				FenetreDessin.attendre(100);
			}
			if (vent > 0 && vent > vX) {
				aX = vent * (vent - vX) / factVent * delta;
			} else if (vent < 0 && vent < vX) {
				aX = -vent * (vent - vX) / factVent * delta;
			} else {
				aX = 0;
			}
			vX = vX + aX * delta;
			vY = vY + aY * delta;
			posXi = posXf;
			posYi = posYf;
		} while (posYf > 0.001);
		return posXf;
	}
}
