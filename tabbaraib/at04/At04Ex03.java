package tabbaraib.at04;

import java.util.Scanner;

public class At04Ex03 {
    public static int POUCES_PIED = 12;

    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        int pieds, pouces;
        int totalPouces;

        System.out.print("Indiquez une longueur en pieds et pouces : ");
        pieds = cl.nextInt();
        pouces = cl.nextInt();
        totalPouces = pieds * POUCES_PIED + pouces;
        System.out.print("Indiquez une longueur en pieds et pouces : ");
        pieds = cl.nextInt();
        pouces = cl.nextInt();
        totalPouces = totalPouces + pieds * POUCES_PIED + pouces;
        System.out.print("Indiquez une longueur en pieds et pouces : ");
        pieds = cl.nextInt();
        pouces = cl.nextInt();
        totalPouces = totalPouces + pieds * POUCES_PIED + pouces;
        pieds = totalPouces / POUCES_PIED;
        pouces = totalPouces % POUCES_PIED;
        System.out.print("La longueur totale est de " + totalPouces + " pouces, ");
        System.out.println("soit " + pieds + "' " + pouces + "\"");
    }
}