
/**
 * @Gabriel Heyde e Nathalia Ferrari
 */
public class Aeroporto
{

    private String nome;
    private double valor;
    private Passagem passagem1;
    /**
     * Construtor para objetos da classe Passageiro
     */
    public Aeroporto(String nome)
    {
        this.nome = nome;
        valor = 0;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getValor()
    {
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public void imprimeInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Valor arrecadado na compra de viagens: "+valor);
    }
    public Passagem compraPassagem(Passageiro passageiro1, Viagem viagem1){
        if (viagem1.getQuantVendida() < viagem1.getQuantMaxima()){
            if (passageiro1.getIdade() < 6){
            passagem1.setValorPassagem(0);
            }else if (passageiro1.getIdade() >= 6 && passageiro1.getIdade() <= 12){
            passagem1.setValorPassagem(viagem1.getValor()/2);
            } else if (passageiro1.getIdade() >= 59){
            passagem1.setValorPassagem(viagem1.getValor()/3);
            } else{
            if (viagem1.getEstado() == "RS" || viagem1.getEstado() == "SC" || viagem1.getEstado() == "PR")
                passagem1.setValorPassagem(viagem1.getValor() * 0.85);
            else{
                passagem1.setValorPassagem(viagem1.getValor());
            }            
            }
            return passagem1;  
        } else{
            return null;
        }
    }
}