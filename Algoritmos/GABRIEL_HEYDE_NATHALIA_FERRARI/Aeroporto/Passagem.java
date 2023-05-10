
/**
 * @Gabriel Heyde e Nathalia Ferrari
 */
public class Passagem
{
    private Viagem viagem;
    private Passageiro passageiro;
    private double valorPassagem;

    public Passagem(Viagem viagem, Passageiro passageiro, double valorPassagem){
        this.viagem = viagem;
        this.passageiro = passageiro;
        this.valorPassagem = valorPassagem;
    }
    public Passagem(Viagem viagem, Passageiro passageiro){
        this.viagem = viagem;
        this.passageiro = passageiro;
        this.valorPassagem = viagem.getValor();
    }    
    public void setViagem(Viagem viagem){
        this.viagem = viagem;
    }
    public void setPassageiro(Passageiro passageiro){
        this.passageiro = passageiro;
    }
    public void setValorPassagem(double valorPassagem){
        this.valorPassagem = valorPassagem;
    }
    public Viagem getViagem(){
        return viagem;
    }
    public Passageiro getPassageiro(){
        return passageiro;
    }
    public double getValorPassagem(){
        return valorPassagem;
    }
    
    public void imprimeInformacoes(){
        viagem.imprimeInformacoes();
        passageiro.imprimeInformacoes();
        System.out.println("O valor da passagem e: "+valorPassagem);
    }
}
