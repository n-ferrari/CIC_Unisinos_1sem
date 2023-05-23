
/**
 * Nathalia Ferrari
 */
public class Nadador extends Atleta
{
    private String categoria;
    
    public Nadador(String nome, int idade, String categoria){
        super(nome, idade);
        this.categoria = categoria;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void imprimeInfo(){
        System.out.println("Nome: "+ super.getNome());
        System.out.println("Idade: "+ super.getIdade());
        System.out.println("Categoria: "+ this.categoria);
    }
}
