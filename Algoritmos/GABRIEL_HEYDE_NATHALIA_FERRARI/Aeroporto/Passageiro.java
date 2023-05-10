
/**
 * @Gabriel Heyde e Nathalia Ferrari
 */
public class Passageiro
{

    private String nome;
    private int idade;

    /**
     * Construtor para objetos da classe Passageiro
     */
    public Passageiro(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade()
    {
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void imprimeInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }
}
