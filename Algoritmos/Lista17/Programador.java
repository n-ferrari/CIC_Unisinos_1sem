
/**
 * Write a description of class Programador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Programador extends Pessoa{
    String linguagemPreferida;
    
    public Programador(String nome, int idade, String linguagemPreferida)
    {
        super(nome, idade);
        this.linguagemPreferida = linguagemPreferida;
    }
    public Programador()
    {
    }
    public String getlinguagemPreferida(){
        return linguagemPreferida;
    }
    public void setLinguagemPreferida(String linguagemPreferida){
        this.linguagemPreferida = linguagemPreferida;
    }
}
