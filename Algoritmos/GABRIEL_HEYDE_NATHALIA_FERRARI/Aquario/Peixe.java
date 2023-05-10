
/**
 * Gabriel Heyde e Nathalia Ferrari
 */
public class Peixe
{
    private String nome, raca;
    private Cor cor;
    
    public Peixe(String nome, Cor cor, String raca){
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
    }
    
    public String getNome(){
        return this.nome;
    }
    public Cor getCor(){
        return this.cor;
    }
    public String getRaca(){
        return this.raca;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCor(Cor cor){
        this.cor = cor;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public String toString(){
        return "Nome: "+this.nome+" Cor: "+this.cor.toString()+" Raca: "+this.raca;
    }
    
}
