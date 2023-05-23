
/**
 * Write a description of class Carta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Carta
{
    private String nome;
    private String naipe;
    
    public Carta(String naipe, String nome){
        this.nome = nome;
        this.naipe = naipe;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getNaipe(){
        return this.naipe;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNaipe(String naipe){
        this.naipe = naipe;
    }
    
}
