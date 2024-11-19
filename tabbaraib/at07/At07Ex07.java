package tabbaraib.at07;

import java.util.Scanner;

public class At07Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inscrivez la note en pourcentage : ");
        int pourcentage = scanner.nextInt();
        
        String noteAlpha = convertirNoteEnAlpha(pourcentage);
        
        System.out.println("Résultat de l'étudiant : " + noteAlpha);
        
        scanner.close();
    }
    
    public static String convertirNoteEnAlpha(int pourcentage) {
        if (pourcentage >= 91 && pourcentage <= 100) {
            return "A";
        } else if (pourcentage >= 75 && pourcentage <= 90) {
            return "B";
        } else if (pourcentage >= 61 && pourcentage <= 74) {
            return "C";
        } else if (pourcentage >= 51 && pourcentage <= 60) {
            return "D";
        } else if (pourcentage >= 0 && pourcentage <= 50) {
            return "F";
        } else {
            return "Note invalide";
        }
    }
}
