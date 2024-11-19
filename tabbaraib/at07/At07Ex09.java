package tabbaraib.at07;

import java.util.Scanner;

public class At07Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez le numéro du mois suivi de l'année, séparés par une espace: ");
        int mois = scanner.nextInt();
        int annee = scanner.nextInt();
        
        int nombreJours = calculerNombreJours(mois, annee);
        
        System.out.println("Le mois indiqué contient " + nombreJours + " jours.");
        
        scanner.close();
    }
    
    public static int calculerNombreJours(int mois, int annee) {
        switch (mois) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return estAnneeBissextile(annee) ? 29 : 28;
            default:
                return 31;
        }
    }
    
    public static boolean estAnneeBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }
}
