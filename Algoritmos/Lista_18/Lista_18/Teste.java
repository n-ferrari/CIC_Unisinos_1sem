
/**
 * Write a description of class Teste here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teste
{
    public static void main (String[] args){
        int lista10a1[] = new int[10];
        int listapotencia[] = new int[11];
        int lista3[] = new int[10];
        int lista4[] = new int[10];
        int j = 10;
        int k = 10;
        int l = 3;
        int m = 1;
        double exercicio2[] = {1,2,3,4,5};
        int exercicio4[] = {-1,2,4,-10};
        double exercicio3[] = new double[5];
        int exercicio5[] = {-1,2,4,2};
        int exercicio6[] = {-1,2,4,-10};
        boolean exercicio6_2[] = new boolean[5];
        int exercicio7[] = {-1,2,4,-10};
        int exercicio8[] = new int[5];
        int exercicio9[] = {1,2,3,4};
        
        for(int i = 0; i < lista10a1.length; i ++){
            lista10a1[i] = j;
            j --;
        }
        
        for(int i = 0; i < lista10a1.length; i ++){
            System.out.print(lista10a1[i] + " ");
        }
        
        for(int i = 0; i < listapotencia.length; i ++){
            listapotencia[i] = i * i;
        }
        System.out.println();
        for(int i = 0; i < listapotencia.length; i ++){
            System.out.print(listapotencia[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < 5; i ++){
            lista3[i] = i + 1;
        }
        for(int i = 5; i < 10; i++){
            lista3[i] = k;
            k += 10;
        }
        for(int i = 0; i < 10; i ++){
            System.out.print(lista3[i] + " ");
        }
        System.out.println();
        lista4[0] = 3;
        for(int i = 1; i < 10; i++){
            lista4[i] = lista4[i - 1] + m;
            m += 2;
        }
        
        for(int i = 0; i < 10; i++){
            System.out.print(lista4[i] + " ");
        }
        System.out.println("\nExercicio 2");
        for(int i = 0; i < exercicio2.length; i++){
            System.out.print(exercicio2[i]+" ");
        }
        /*
        System.out.println("\nExercicio 3");
        for(int i = 0; i < exercicio3.length; i++){
            exercicio3[i] = Teclado.leDouble();
        }
        for(int i = 0; i < exercicio3.length; i++){
            System.out.print(exercicio3[i]+" ");
        }
        */
        System.out.println("\nExercicio 4");
        int negativos = 0;
        for(int i = 0; i < exercicio4.length; i++){
            if (exercicio4[i] < 0){
                negativos++;
            }
        }
        System.out.println("Quantidade de negativos "+negativos);
        
        System.out.println("\nExercicio 5");
        int quantidade = 0;
        for(int i = 0; i < exercicio5.length; i++){
            if (exercicio5[i] == 2){
                quantidade++;
            }
        }
        System.out.println("Quantidade de numero 2 "+quantidade);
        
        System.out.println("\nExercicio 6");
        for(int i = 0; i < exercicio6.length; i++){
            if (exercicio6[i] <= 0){
                exercicio6_2[i] = false;
            }else
                exercicio6_2[i] = true;
        }
        for(int i = 0; i < exercicio6.length; i++){
            System.out.print(exercicio6_2[i]+" ");
        }
        int ind_maior = 0;
        int maior = exercicio7[0];
        System.out.println("\nExercicio 7");
        for(int i = 1; i < exercicio7.length; i++){
            if (exercicio7[i] > maior)
            ind_maior = i;
        }
        System.out.println("O maior numero esta no indice "+ind_maior);
        System.out.println("\nExercicio 8");
        for(int i = 0; i < exercicio8.length; i++){
            exercicio8[i] = Teclado.leInt();
        }
        for(int i = 0; i < exercicio8.length; i++){
            System.out.print(exercicio8[i]+" ");
        }
        System.out.println("\nExercicio 9");
        for(int i = 0; i < exercicio9.length; i++){
            if (exercicio9[i] % 2 == 0){
                exercicio9[i] = 1;
            }else
                exercicio9[i] = -1;
        }
        for(int i = 0; i < exercicio9.length; i++){
            System.out.print(exercicio9[i]+" ");
        }
    }
    
    
}
