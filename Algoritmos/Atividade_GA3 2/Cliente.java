
/**
 * @Nathalia Ferrari
 * @Algoritmos 2023 Unisinos
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private String nome;
    private int idade;
    private String sexo;
    private String email;
    private String senha;

    /**
     * Construtor de objetos da classe Cliente
     */
    public Cliente(String nome, int idade, String sexo, String email, String senha)
    {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void imprimeInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        System.out.println("Email: "+email);
        System.out.println("Senha: "+senha);
        
    }
}
