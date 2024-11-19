package tabbaraib.at07;

import java.util.Scanner;

public class At07Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("> ");
        
        int operand1 = scanner.nextInt();
        String operator = scanner.next();
        int operand2 = scanner.nextInt();
        
        int result = 0;
        
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            case "%":
                result = operand1 % operand2;
                break;
            case "^":
                result = (int) Math.round(Math.pow(operand1, operand2));
                break;
            default:
                System.out.println("Opérateur non reconnu");
                scanner.close();
                return;
        }
        
        System.out.println(result);
        
        scanner.close();
    }
}
