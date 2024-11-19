package tabbaraib.at12;

public class At12Ex02 {
    public static void main(String[] args) {
        String[] nomVille = {"Gaspé", "Gatineau", "Mont-Tremblant", "Québec", "Rimouski", "Rouyn-Noranda", "Saguenay", "Sept-Iles", "Tadoussac"};
        int[] distance = {930, 207, 135, 253, 540, 638, 465, 900, 475};
        System.out.println(String.format("%15s %4s", "Ville", "Dist"));
        System.out.println("--------------------");
        for (int i = 0; i < nomVille.length; i++) {
            System.out.println(String.format("%15s %4d", nomVille[i], distance[i]));
        }
    }
}