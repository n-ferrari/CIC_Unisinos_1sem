import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int caracteres = Integer.parseInt(in.readLine());
        String[] array = in.readLine().split("");

        //String texto = "bbaababaaa";
        //String[] array = texto.split("");
        //System.out.println(caracteres);

        if(array.length == caracteres){
            int countAtotal = 0;
            boolean anteriorA = false;
            boolean primeiroA = true;

            for(int i = 0; i < array.length; i++){
                if(!anteriorA){
                    if(array[i].equals("a")){
                        anteriorA = true;
                        primeiroA = true;
                    }else{
                        anteriorA = false;
                    }
                }else{
                    if(array[i].equals("a")){
                        if(primeiroA){
                            countAtotal += 2;
                            primeiroA = false;
                        }else{
                            countAtotal++;
                        }
                    }else{
                        anteriorA = false;
                    }
                }
            }
            System.out.println(countAtotal);
        }




    }
}