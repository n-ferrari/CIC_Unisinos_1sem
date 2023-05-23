
/**
 * Nathalia Ferrari
 */
public class Corredor extends Atleta
{
    private double peso;
    private Competicao competicao;
    
    public Corredor(String nome, int idade, double peso, Competicao competicao){
        super(nome, idade);
        this.peso = peso;
        this.competicao = competicao;
    }
    public Competicao getCompeticao(){
        return this.competicao;
    }
    public void SetCompeticao(){
        this.competicao = competicao;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void imprimeCompeticao(){
        System.out.println("Competicao: "+this.competicao);
    }
    public void imprimeInfo(){
        System.out.println("Nome: "+ super.getNome());
        System.out.println("Idade: "+ super.getIdade());
        System.out.println("Peso: "+ this.peso);
        System.out.println("Nome da competicao: "+this.competicao.getNome());
        System.out.println("Data da competicao: ");
        this.competicao.imprimeData();
    }
    }
