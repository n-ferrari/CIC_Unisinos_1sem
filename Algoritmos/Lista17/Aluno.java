
/**
 * Write a description of class Alun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aluno extends Pessoa
{
    private double nota;
    
    public Aluno(String nome, int idade, double nota){
        super(nome, idade);
        this.nota = nota;
    }
    
    public double getNota(){
        return nota;
    }
    public void setNota(double nota){
        this.nota = nota;
    }
    
    public void imprimeDados(){
        System.out.println("Nome do aluno: "+super.getNome());
        System.out.println("Idade do aluno: "+super.getIdade());
        System.out.println("Nota do aluno: "+this.nota);
    }
}
