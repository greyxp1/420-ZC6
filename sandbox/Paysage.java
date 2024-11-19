package sandbox;

import java.awt.Color;
import commun.FenetreDessin;

public class Paysage {
	public static void main(String[] args) {
		FenetreDessin fd = new FenetreDessin("EXERCICE 5", 1000, 600);
		
		fd.couleurCrayon(Color.BLACK);
        fd.couleurRemplissage(Color.ORANGE);
		fd.dessineRectanglePlein(300, 200, 700, 500);
        fd.couleurRemplissage(Color.RED);
        fd.dessineTrianglePlein(300, 200, 500, 100, 700, 200);
		fd.couleurRemplissage(Color.GRAY);
        fd.dessineRectanglePlein(100, 300, 200, 500);
        fd.dessineRectanglePlein(800, 300, 900, 500);
        fd.couleurRemplissage(Color.GREEN);
		fd.dessineCerclePlein(150, 200, 100);
        fd.dessineCerclePlein(850, 200, 100);
        fd.couleurRemplissage(Color.WHITE);
        fd.dessineRectanglePlein(350, 250, 450, 350);
        fd.dessineRectanglePlein(550, 300, 650, 500);
	}    
}
