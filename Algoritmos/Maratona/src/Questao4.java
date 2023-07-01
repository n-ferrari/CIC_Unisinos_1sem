//Nathalia Ferrari
public class Questao4 {
    public static void main(String[] args) {
        int x = Teclado.leInt();
        int[] N = new int[1000];
        int count  = 0;
        for(int i = 0; i < 1000; i++){
            N[i] = count;
            count++;
            if(count == x){
                count = 0;
            }
            System.out.printf("N[%d] = %d\n",i,N[i]);
        }
    }
}
