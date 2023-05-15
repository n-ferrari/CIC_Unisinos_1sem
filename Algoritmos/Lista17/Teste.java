
/**
 * Write a description of class Teste here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teste
{
    public static void main(String[] args){
        Banana banana = new Banana("Banana",3.79,"Prata");
        Melancia melancia = new Melancia("Melancia",4,2,true);
        Aluno aluno = new Aluno("Pedro",25,7);
        Programador programador = new Programador("Pedro",25,"Python");
        
        System.out.println("Banana "+banana.getPreco());
        System.out.println("Melancia "+melancia.getPreco());
        System.out.println("Aluno "+aluno.getNome());
        System.out.println("Programador "+programador.getlinguagemPreferida());
        
        Pessoa pessoa;
        int x = Teclado.leInt();
        if (x == 1){
            pessoa = new Programador("Pedro",25,"Java");
            Programador programador1 = (Programador) pessoa;
            System.out.println("Linguagem favorita "+programador1.getlinguagemPreferida());
        }
        if (x == 2){
             pessoa = new Aluno("Pedro",25,7.6);
             Aluno aluno1 = (Aluno) pessoa;
             System.out.println("Aluno "+aluno1.getNota());
        }
    }
}
