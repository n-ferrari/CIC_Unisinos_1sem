
/**
 * Write a description of class Computador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Computador
{
    // instance variables - replace the example below with your own
    private String marca;
    private double velocidade;
    private int ano_fab;
    private boolean novo;
    
    /**
     * Constructor for objects of class Computador
     */
    public Computador(String marca,double velocidade,int ano_fab,boolean novo)
    {
        this.marca = marca;
        this.velocidade = velocidade;
        this.ano_fab = ano_fab;
        this.novo = novo;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public double getVelocidade(){
        return velocidade;
    }
    
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
    
    public int getAnoFab(){
        return ano_fab;
    }
    
    public void setAnoFab(int ano_fab){
        this.ano_fab = ano_fab;
    }
    
    public boolean getNovo(){
        return novo;
    }
    
    public void setNovo(boolean novo){
        this.novo = novo;
    }

}
