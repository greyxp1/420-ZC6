package tabbaraib.at03;
import commun.FenetreDessin;
import java.awt.Color;

public class Pong {
    public static void main(String[] args) {
        FenetreDessin fd = new FenetreDessin("Pong", 800, 600);
        //background
        fd.couleurRemplissage(Color.black);
        fd.dessineRectanglePlein(0, 0, 800, 600);
        //walls
        fd.couleurCrayon(Color.white);
        fd.couleurRemplissage(Color.white);
        fd.dessineRectanglePlein(0, 0, 800, 5);
        fd.dessineRectanglePlein(0, 600, 800, 595);
        fd.dessineRectanglePlein(0, 0, 5, 600);
        fd.dessineRectanglePlein(800, 0, 795, 600);
        //manettes
        fd.dessineRectanglePlein(50, 150, 60, 225);
        fd.dessineRectanglePlein(750, 450, 740, 375);
        //dotted ligns
        for (int i = 20; i <= 570; i += 20) {
            fd.dessineRectanglePlein(399, i, 401, i + 10);
        }
        //ball
        fd.dessineRectanglePlein(550, 350, 555, 355);
        //number 0 player 1
        fd.dessineRectanglePlein(172, 30, 174, 70);
        fd.dessineRectanglePlein(192, 30, 190, 70);
        fd.dessineRectanglePlein(172, 30, 190, 32);
        fd.dessineRectanglePlein(172, 70, 190, 68);
        //number 8 player 1
        fd.dessineRectanglePlein(207, 30, 209, 50);
        fd.dessineRectanglePlein(225, 30, 227, 50);
        fd.dessineRectanglePlein(207, 30, 227, 32);
        fd.dessineRectanglePlein(207, 50, 227, 48);
        fd.dessineRectanglePlein(207, 50, 209, 70);
        fd.dessineRectanglePlein(225, 50, 227, 70);
        fd.dessineRectanglePlein(207, 70, 227, 68);
        //number 0 player 2
        fd.dessineRectanglePlein(581, 30, 583, 70);
        fd.dessineRectanglePlein(601, 30, 599, 70);
        fd.dessineRectanglePlein(581, 30, 599, 32);
        fd.dessineRectanglePlein(581, 70, 599, 68);
        //number 1 player 2
        fd.dessineRectanglePlein(616, 30, 618, 70);
    }
}