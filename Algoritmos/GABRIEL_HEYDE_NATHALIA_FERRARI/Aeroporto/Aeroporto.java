
/**
 * @Gabriel Heyde e Nathalia Ferrari
 */
public class Aeroporto
{
    private String nome;
    private double valorTotal;

    /**
     * Construtor para objetos da classe Passageiro
     */
    public Aeroporto(String nome)
    {
        this.nome = nome;
        this.valorTotal = 0;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getvalorTotal()
    {
        return valorTotal;
    }
    public void setvalorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }
    public void imprimeInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("valorTotal arrecadado na compra de viagens: "+valorTotal);
    }
    public Passagem compraPassagem(Passageiro passageiro, Viagem viagem){
        int idade = passageiro.getIdade();
        String estado = viagem.getEstado().toUpperCase();
        double valorEfetivo;
        double valorViagem = viagem.getValor();
        
        if (viagem.getQuantVendida() >= viagem.getQuantMaxima()){
            return null;
        }
        if (idade < 6){
            valorEfetivo = 0;
        } else if (idade < 13){
            valorEfetivo = valorViagem / 2;
        } else if (idade > 58){
            valorEfetivo = valorViagem / 3;
        } else if (estado == "RS" || estado == "SC" || estado == "PR"){
            valorEfetivo = valorViagem * 0.85;
        } else{
            valorEfetivo = valorViagem;
        }
        viagem.setQuantVendida(viagem.getQuantVendida() + 1);
        this.valorTotal += valorEfetivo;
        return new Passagem(viagem, passageiro, valorEfetivo);
    }
}
