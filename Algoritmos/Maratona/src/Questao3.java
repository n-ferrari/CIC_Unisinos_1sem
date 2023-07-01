// Nathalia Ferrari

import java.util.Random;

public class Questao3 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] x = new double[100];

        for (int i = 0; i < 100; i++) {
            x[i] = rand.nextInt() % 100;
            //System.out.print(x[i]+" ");
            if(x[i] <= 10){
                System.out.printf("A[%d] = %.2f \n",i, x[i]);
            }
        }
    }
}
