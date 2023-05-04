
/**
 * @Nathalia Ferrari
 */
public class Principal
{
    public static void main(String args[]){
        Exercicios exercicio1 = new Exercicios();
        int i = 1;
        int x;
        boolean primo;
        
        while (i == 1 || i == 2 || i == 3){
            System.out.println("1. conta até 300 \n"+
                            "2. imprime pares \n"+
                            "3. verifica primo");
            i = Teclado.leInt();
            
            if(i == 1){
                System.out.println("Escreva o numero: ");
                x = Teclado.leInt();
                exercicio1.contador(x);
            }
            if(i == 2){
                System.out.println("Escreva o numero: ");
                x = Teclado.leInt();
                exercicio1.imprimePares(x);
            }
            if(i == 3){
                System.out.println("Escreva o numero: ");
                x = Teclado.leInt();
                primo = exercicio1.verificaPrimos(x);
                if (primo == true){
                    System.out.println("O numero é primo");
                }else{
                    System.out.println("O numero não é primo");
                }
            }
        }
    }
}
