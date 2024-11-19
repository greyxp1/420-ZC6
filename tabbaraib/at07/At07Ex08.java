package tabbaraib.at07;

import java.util.Scanner;

public class At07Ex08 {
    private static final double TPS = 0.05;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Indiquez le poids du colis en kg : ");
        double poids = scanner.nextDouble();
        
        double tarifAvantTaxes = calculTarif(poids);
        double coutTotal = tarifAvantTaxes * (1 + TPS);
        
        System.out.printf("Le coût d'envoi est de : %.2f$%n", coutTotal);
        
        scanner.close();
    }
    
    /**
     * Calcule le tarif d'envoi d'un colis à Toronto selon son poids.
     * 
     * @param poids Le poids du colis en kg (nombre décimal)
     * @return Le tarif avant taxes en dollars (nombre décimal)
     */
    public static double calculTarif(double poids) {
        double tarif;
        int poidsArrondi = (int) Math.ceil(poids);
        
        if (poidsArrondi <= 1) {
            tarif = 13.65;
        } else if (poidsArrondi <= 5) {
            tarif = 18.22;
        } else if (poidsArrondi <= 10) {
            tarif = 23.25;
        } else if (poidsArrondi <= 20) {
            tarif = 34.38;
        } else {
            tarif = 34.38 + 0.64 * (poidsArrondi - 20);
        }
        
        return tarif;
    }
}
