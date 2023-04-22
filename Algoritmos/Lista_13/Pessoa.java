
/**
* Describe a person
 */
public class Pessoa
{
    private String nome, endereco;
    private char sexo;
    private int idade, irmaos;
    private double altura;

    /**
     * Constructor for objects of class Pessoa
     */
    public Pessoa(String nome, char sexo, int idade, double altura, int irmaos, String endereco)
    {
        // initialise instance variables
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.idade = idade;
        this.irmaos = irmaos;
        this.altura = altura;
    }
    
        public char getsexo(){
        return sexo;
    }

    public void imprimeInformacoes()
    {
        System.out.println("Nome: "+nome);
        System.out.println("Endereco: "+endereco);
        System.out.println("Sexo: "+sexo);
        System.out.println("Idade: "+idade);
        System.out.println("Irmaos: "+irmaos);
    }
    
    public boolean isFilhoUnico()
    {
        if (irmaos == 0)
            return true;
        else
            return false;
            
    }
}
