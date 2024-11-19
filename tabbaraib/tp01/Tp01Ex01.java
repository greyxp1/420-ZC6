package tabbaraib.tp01;

import java.util.Scanner;

import java.util.*;

public class Tp01Ex01 {
    public static final int LONG_PLANCHE = 30, LARG_PLANCHE = 9;
    public static final int PLANCHES_PAR_BOITE = 12;
    public static final float PRIX_BOITE = 27.59f, RABAIS_PCT = 0.20f;

    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        int longPiece, largPiece, plancheLong, plancheLarg;
        int plancheTotal, nbBoites, plancheSurplus;
        float certificat, totalBoite, totPayer, economies;

        System.out.print("Longueur de la pièce (po) : ");
        longPiece = cl.nextInt();
        System.out.print("Largeur de la pièce (po) : ");
        largPiece = cl.nextInt();
        plancheLong = longPiece / LONG_PLANCHE + 1;
        plancheLarg = largPiece / LARG_PLANCHE + 1;
        plancheTotal = plancheLong * plancheLarg;
        nbBoites = plancheTotal / PLANCHES_PAR_BOITE + 1;
        plancheSurplus = PLANCHES_PAR_BOITE - plancheTotal % PLANCHES_PAR_BOITE;
        System.out.println("-------------------------");
        System.out.println("Vous aurez besoin de " + nbBoites + " boîtes de " +
        PLANCHES_PAR_BOITE + " planches.");
        System.out.println("Vous aurez " + plancheSurplus + " planches de surplus.");
        System.out.println("-------------------------");
        System.out.print("Indiquez la valeur du certificat cadeau : ");
        certificat = cl.nextFloat();
        totalBoite = PRIX_BOITE * nbBoites;
        economies = totalBoite * RABAIS_PCT;
        totalBoite = totalBoite - economies;
        totPayer = totalBoite - certificat;
        System.out.println("-------------------------");
        System.out.println("Total à payer : " + totPayer + "$");
        System.out.println("Economies réalisées : " + economies + "$");
    }
}