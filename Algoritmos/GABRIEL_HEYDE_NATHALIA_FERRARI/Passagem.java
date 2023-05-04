
/**
 * @Gabriel Heyde e Nathalia Ferrari
 */
public class Passagem
{
    Viagem viagem1;
    Passageiro passageiro1;
    double valorPassagem = 0;
    
    //public Passagem(double valorPassagem){
        //this.viagem1 = viagem1;
        //this.passageiro1 = passageiro1;
        //this.valorPassagem = valorPassagem;
    //}
    public void setViagem(Viagem viagem1){
        this.viagem1 = viagem1;
    }
    public void setPassageiro(Passageiro passageiro1){
        this.passageiro1 = passageiro1;
    }
    public void setValorPassagem(double valorPassagem){
        this.valorPassagem = valorPassagem;
    }
    public Viagem getViagem(){
        return viagem1;
    }
    public Passageiro getPassageiro(){
        return passageiro1;
    }
    public double getValorPassagem(){
        return valorPassagem;
    }
    
    public void imprimeInformacoes(){
        viagem1.imprimeInformacoes();
        passageiro1.imprimeInformacoes();
        System.out.println("O valor da passagem e: "+valorPassagem);
    }
}
