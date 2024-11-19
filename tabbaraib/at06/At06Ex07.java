package tabbaraib.at06;

import java.util.Scanner;
import java.util.Random;

public class At06Ex07 {
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        random.setSeed(123456);
        
        System.out.print("Inscrivez la valeur maximale voulue : ");
        int maxValue = scanner.nextInt();
        
        int num1 = nextInt(maxValue) + 1;
        int num2 = nextInt(maxValue) + 1;
        
        int correctResult = num1 * num2;
        
        System.out.print("Combien font " + num1 + " * " + num2 + " ? ");
        int userAnswer = scanner.nextInt();
        
        if (userAnswer == correctResult) {
            System.out.println("BRAVO! Vous avez la bonne réponse.");
        } else {
            System.out.println("Erreur, le résultat de " + num1 + " * " + num2 + " est " + correctResult + ".");
        }
        
        scanner.close();
    }

    private static int nextInt(int max) {
        return random.nextInt(max);
    }
}
