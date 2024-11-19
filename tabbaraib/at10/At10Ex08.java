package tabbaraib.at10;

import java.util.Scanner;

public class At10Ex08 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        
        while (true) {
            System.out.print("> ");
            String input = cl.nextLine();
            
            if (input.equalsIgnoreCase("Quitter")) {
                System.out.println("Bonne journée");
                break;
            }
            
            try {
                String[] parts = input.split(" ");
                int nb1 = Integer.parseInt(parts[0]);
                String op = parts[1];
                int nb2 = Integer.parseInt(parts[2]);
                System.out.println(cal(nb1, op, nb2));
            } catch (Exception e) {
                continue;
            }
        }
    }

    public static int cal(int nb1, String op, int nb2) {
        switch (op) {
            case "+": return nb1 + nb2;
            case "-": return nb1 - nb2;
            case "*": return nb1 * nb2;
            case "/": return nb1 / nb2;
            case "%": return nb1 % nb2;
            case "^": return (int) Math.pow(nb1, nb2);
            default: return 0;
        }
    }
}