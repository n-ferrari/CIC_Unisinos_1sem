
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
    public Aluno(String nome,int matricula,double grauA,double grauB)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.grauA = grauA;
        this.grauB = grauB;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void grauC()
    {
        double average = (this.grauA * 0.33 + this.grauB * 0.67);
        if (average < 6)
            System.out.println(this.nome);
            
    }
}
