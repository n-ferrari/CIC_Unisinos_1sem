// Nathalia Ferrari
public class Questao2 {
    public static void main(String[] args) {
        int[] x = new int[10];
        int y = -5;

        for (int i = 0; i < 10; i++) {
            x[i] = y;
            System.out.print(x[i] + " ");
            y++;
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if(x[i] <= 0){
                x[i] = 1;
            }
            System.out.print(x[i] + " ");
        }
    }
}
