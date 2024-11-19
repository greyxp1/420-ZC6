package tabbaraib.at07;

import java.util.Scanner;

public class At07Ex06 {
    public static final float PI = 3.14159f;

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        System.out.println("Sélectionnez une figure en inscrivant la lettre correspondante :");
        System.out.println("a -> Carré");
        System.out.println("b -> Rectangle");
        System.out.println("c -> Cercle");
        System.out.print("Votre choix > ");
        
        char choix = clavier.next().charAt(0);
        
        switch (choix) {
            case 'a':
                traiteCarre(clavier);
                break;
            case 'b':
                traiteRectangle(clavier);
                break;
            case 'c':
                traiteCercle(clavier);
                break;
            default:
                System.out.println("Choix invalide.");
        }
        
        clavier.close();
    }

    public static void traiteCarre(Scanner cl) {
        System.out.print("Inscrivez la longueur d'un côté : ");
        double cote = cl.nextDouble();
        int perimetre = (int) (4 * cote);
        int aire = (int) (cote * cote);
        System.out.println("Le périmètre est de " + perimetre);
        System.out.println("L'aire est de " + aire);
    }

    public static void traiteRectangle(Scanner cl) {
        System.out.print("Inscrivez la longueur du rectangle : ");
        double longueur = cl.nextDouble();
        System.out.print("Inscrivez la largeur du rectangle : ");
        double largeur = cl.nextDouble();
        int perimetre = (int) (2 * (longueur + largeur));
        int aire = (int) (longueur * largeur);
        System.out.println("Le périmètre est de " + perimetre);
        System.out.println("L'aire est de " + aire);
    }

    public static void traiteCercle(Scanner cl) {
        System.out.print("Inscrivez le rayon du cercle : ");
        double rayon = cl.nextDouble();
        double perimetre = 2 * PI * rayon;
        double aire = PI * rayon * rayon;
        System.out.printf("Le périmètre est de %.5f%n", perimetre);
        System.out.printf("L'aire est de %.6f%n", aire);
    }
}
