package tabbaraib.at06;

import java.util.Scanner;

public class At06Ex04 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        int segment1, segment2, segment3, difference;

        System.out.print("Entrez trois longueurs en ordre croissant : ");
        segment1 = cl.nextInt();
        segment2 = cl.nextInt();
        segment3 = cl.nextInt();
        if (segment1 + segment2 > segment3) {
            difference = segment3 * segment3 - (segment1 * segment1 + segment2 * segment2);
            System.out.print("C'est un triangle ");
            if (difference < 0)
                System.out.println("acutangle.");
            else if (difference == 0)
                System.out.println("rectangle.");
            else
                System.out.println("obtusangle.");
        } else {
            System.out.println("Ce n'est pas un triangle.");
        }
    }
}