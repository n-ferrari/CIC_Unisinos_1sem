
/**
 * Nathalia Ferrari
 */
public class Competicao
{
    private String nome;
    Data data;
    
    public Competicao(String nome, Data data){
        this.nome = nome;
        this.data = data;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setData(Data data){
        this.data = data;
    }
    public Data getData(){
        return this.data;
    }
    public void imprimeData(){
        this.data.imprimeData();
    }
}
