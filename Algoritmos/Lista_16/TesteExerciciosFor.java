
/**
 *
 * @Nathalia Ferrari
 */
public class TesteExerciciosFor
{
    public static void main(String args[]){
        ExerciciosFor exerciciosfor = new ExerciciosFor();
        int x;
        int y;
        boolean z;
        
        x = Teclado.leInt("Exercicio 1: Solicita X vezes o numero de pessoas");
        exerciciosfor.exercicio1(x);
        
        x = Teclado.leInt("Exercicio 2: imprime de 0 a x");
        
        exerciciosfor.exercicio2(x);
        
        x = Teclado.leInt("Exercicio 3: pares de 0 a x");
        exerciciosfor.exercicio3(x);
        
        x = Teclado.leInt("Exercicio 4: imprime decrescente");
        exerciciosfor.exercicio4(x);
        
        x = Teclado.leInt("Exercicio 5: torcedores do gremio. Digite a quantidade de torcedores.");
        exerciciosfor.exercicio5(x);
        
        x = Teclado.leInt("\nExercicio 6: soma de todos os numeros. Quantos num quer digitar?");
        System.out.println("A soma e"+exerciciosfor.exercicio6(x));
        
        System.out.println("Exercicio 7: imprime a soma de 10 numeros");
        exerciciosfor.exercicio7();
        
        System.out.println("Exercicio 8: +,- ou 0?");
        exerciciosfor.exercicio8();
        
        x = Teclado.leInt("Exercicio 9: pares entre menor e maior");
        y = Teclado.leInt();
        exerciciosfor.exercicio9(x, y);
        
        System.out.println("Ex10. Soma 0 a 198");
        exerciciosfor.exercicio10();
        
        x = Teclado.leInt("Exercicio 11: soma impares entre os dois numeros");
        y = Teclado.leInt();
        System.out.println("A soma eh"+exerciciosfor.exercicio11(x, y));
        
        System.out.println("Ex12: media de positivos. Digite negativo para sair");
        System.out.println("A media eh" +exerciciosfor.exercicio12());
        
        x = Teclado.leInt("Ex13: Fatorial de x");
        exerciciosfor.exercicio13(x);
        
        x = Teclado.leInt("Ex14: True se primo");
        z = exerciciosfor.exercicio14(x);
        System.out.println(z);
        
        x = Teclado.leInt("Ex15: primos entre 0 e x");
        exerciciosfor.exercicio15(x);
    
    }
}
