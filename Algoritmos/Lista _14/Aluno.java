
/**
 * Write a description of class Aluno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aluno
{
    // instance variables - replace the example below with your own
    private String nome;
    private int matricula;
    private double grauA;
    private double grauB;

    /**
     * Constructor for objects of class Aluno
     */
    public Aluno(String nome, int matricula, double grauA, double grauB)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.grauA = grauA;
        this.grauB = grauB;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
        
    public double getGrauA(){
        return grauA;
    }
    
    public void setGrauA(double GrauA){
            this.grauA = grauA;
    }
    
    public double getGrauB(){
        return grauB;
    }
    
    public void setGrauB(double GrauB){
            this.grauB = grauB;
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public double calculaMediaFinal()
    {
        return (this.grauA * 0.33) + (this.grauB * 0.67);
    }
    
    public void imprimeInfo()
    {
        System.out.println("Informações do aluno:");
        System.out.println("\t- Nome: "+nome);
        System.out.println("\t- Matrícula: "+matricula);
        System.out.println("\t- Nota Grau A: "+grauA);
        System.out.println("\t- Nota Grau B: "+grauB);
        System.out.println("\t- Média final: "+calculaMediaFinal());
    }
}
