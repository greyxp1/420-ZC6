package tabbaraib.at06;

import java.util.Scanner;

public class At06Ex06 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        System.out.print("Entrez 4 nombres entiers séparés par des espaces : ");
        int val1 = clavier.nextInt();
        int val2 = clavier.nextInt();
        int val3 = clavier.nextInt();
        int val4 = clavier.nextInt();
        
        int maximum = max4(val1, val2, val3, val4);
        
        System.out.println("La valeur maximale est : " + maximum);
        
        clavier.close();
    }

    /**
     * Identifie et retourne la valeur maximale
     *
     * @param val1 Première valeur entière
     * @param val2 Seconde valeur entière
     * @param val3 Troisième valeur entière
     * @param val4 Quatrième valeur entière
     * @return Valeur maximale parmi les 4 reçues en paramètre
     */
    public static int max4(int val1, int val2, int val3, int val4) {
        int max = val1;
        if (val2 > max) max = val2;
        if (val3 > max) max = val3;
        if (val4 > max) max = val4;
        return max;
    }
}
