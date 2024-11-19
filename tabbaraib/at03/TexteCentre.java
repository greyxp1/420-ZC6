package tabbaraib.at03;

import commun.FenetreDessin;
import java.awt.Color;

public class TexteCentre {
    public static void main(String[] args) {
        FenetreDessin fd = new FenetreDessin("EXERCICE 6", 500, 500);
        fd.couleurCrayon(Color.YELLOW);
        fd.dessineSegment(250, 0, 250, 500);
        fd.dessineSegment(0, 250, 500, 250);
        fd.couleurCrayon(Color.RED);
        fd.dessineTexte(191, 260, "Ibrahim Tabbara");
    }
}
