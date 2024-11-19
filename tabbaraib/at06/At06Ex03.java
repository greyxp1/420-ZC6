package tabbaraib.at06;

import java.util.Scanner;

public class At06Ex03 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        int nombre;
        
        System.out.print("Entrez un premier nombre : ");
        nombre = cl.nextInt();
        System.out.print("Le nombre inscrit est : ");
        afficheNombre(nombre);
        System.out.print("Entrez un deuxième nombre : ");
        nombre = cl.nextInt();
        System.out.print("Le nombre inscrit est : ");
        afficheNombre(nombre);
        System.out.print("Entrez un dernier nombre : ");
        nombre = cl.nextInt();
        System.out.print("Le nombre inscrit est : ");
        afficheNombre(nombre);
    }
    
    /**
    * Affiche un nombre selon le format suivant:
    * XXX si le nombre est plus petit que 1000
    * XXX_XXX si le nombre est entre 1000 et 999999
    * Des zéros sont ajoutés à gauche si nécessaire
    * @param nb Nombre à afficher
    */
    
    public static void afficheNombre(int nb) {
        if (nb >= 1000) {
            if (nb / 1000 < 100) System.out.print("0");
            if (nb / 1000 < 10) System.out.print("0");
            System.out.print(nb / 1000);
            System.out.print("_");
            nb = nb % 1000;
        }
        if (nb < 100) System.out.print("0");
        if (nb < 10) System.out.print("0");
        System.out.println(nb);
    }
}
