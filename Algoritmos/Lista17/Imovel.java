
/**
 * Write a description of class Imovel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Imovel
{
    private String tipo;
    private String local;
    private int ano;
    public String imobiliaria;
    private boolean valor;
    
    public int calcularIPTU(int valor){
        return 20;
    }
    public void visualizarInfo(){
        
    }
    public boolean alugado(){
        return true;
    }
    public boolean imobiliado(){
        return true;
    }
    public String pontosReferencia(){
        return "xxx";
    }
    public String acesso(String rua){
        return "rua";
    }
    public boolean escritura(){
        return true;
    }
}
