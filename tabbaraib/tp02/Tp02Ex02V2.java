package tabbaraib.tp02;

import java.util.Scanner;

public class Tp02Ex02V2 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        float a, b, c;
        System.out.print("Indiquez les coefficients (a b c) : ");
        a = cl.nextFloat();
        b = cl.nextFloat();
        c = cl.nextFloat();
        float delta = b*b - 4*a*c;
        if(a == 0 && b == 0 && c == 0){
            System.out.println("Infinité de solutions");
        }   else if(a == 0 && b == 0 && c != 0){
            System.out.println("Aucune solution");
        }   else if(a == 0 && b != 0){
            System.out.println("x = " + (-(c/b)));
        }   else if(a != 0){
            if(delta > 0){
                System.out.println("x1 = " + ((-b - Math.sqrt(delta)) / (2*a)) + "  ;  x2 = " + ((-b + Math.sqrt(delta)) / (2*a)));
            }   else if(delta == 0){
                System.out.println("x = " + (-b / (2*a)));
            }   else if(delta < 0){
                System.out.println("Aucune solution réelle");
            }
        }
    }
}