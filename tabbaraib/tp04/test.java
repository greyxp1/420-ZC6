package tabbaraib.tp04;

public class test {


    public static void main(String[] args) {
        int[] tuiles = new int[40];        
        tuiles = new int[40];
        for (int i = 0; i < 40; i++) {
            if (i <= 30) {
                tuiles[i] = i;
            } else {
                tuiles[i] = i - 20;
            }
            System.out.println(tuiles[i]);
        }
    }
}

