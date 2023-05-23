
/**
 * Nathalia Ferrari
 */
public class Atleta
{
    private String nome;
    private int idade;
    
    public Atleta(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void imprimeInfo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
    }
}
