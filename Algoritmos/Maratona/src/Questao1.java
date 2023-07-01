// Nathalia Ferrari
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questao1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double[] items = new double[5];
        items[0] = 4;
        items[1] = 4.5;
        items[2] = 5;
        items[3] = 2;
        items[4] = 1.5;
        int i = 0;

        String[] entrada = in.readLine().split(" ");

        int codigo = Integer.parseInt(entrada[0]);
        int quant = Integer.parseInt(entrada[1]);


        System.out.println("Total: R$ " + (quant * items[codigo - 1]));
    }
    }