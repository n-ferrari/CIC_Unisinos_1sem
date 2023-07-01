//Nathalia Ferrari

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questao5 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N = 0;
        int tentativasSaques = 0;
        int tentativasSBloqueios= 0;
        int tentativasAtaques = 0;
        int Saques = 0;
        int Bloqueios= 0;
        int Ataques = 0;

        while(N < 1 || N > 100){
            N = Teclado.leInt();
        }

        for(int i = 0; i < N; i++){
            String x = Teclado.leString();
            String[] arrayTentativas = in.readLine().split(" ");

            tentativasSaques += Integer.parseInt(arrayTentativas[0]);
            tentativasSBloqueios += Integer.parseInt(arrayTentativas[1]);
            tentativasAtaques += Integer.parseInt(arrayTentativas[2]);

            String[] arrayTotais = in.readLine().split(" ");

            Saques += Integer.parseInt(arrayTotais[0]);
            Bloqueios += Integer.parseInt(arrayTotais[1]);
            Ataques += Integer.parseInt(arrayTotais[2]);

        }
        if(Saques != 0){
            System.out.printf("Pontos de Saque: %.2f %% .\n", (double) Saques / tentativasSaques * 100);
        }
        if(Bloqueios!= 0){
            System.out.printf("Pontos de Bloqueio: %.2f %% .\n", (double) Bloqueios / tentativasSBloqueios * 100);
        }
        if(Ataques != 0){
            System.out.printf("Pontos de Ataque: %.2f %% .\n",(double) Ataques / tentativasAtaques * 100);
        }

    }
}
