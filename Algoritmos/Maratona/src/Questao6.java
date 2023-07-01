//Nathalia Ferrari

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questao6 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N = 0;
        while(N <= 1 || N >= 1000){
            N = Teclado.leInt();
        }

        String[] array = in.readLine().split(" ");
        int[] X = new int[N];
        int menor = Integer.parseInt(array[0]);
        int posicao = 0;

        for(int i = 0; i < N; i++){
            X[i] = Integer.parseInt(array[i]);
            if(X[i] < menor){
                menor = X[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);


    }
}
