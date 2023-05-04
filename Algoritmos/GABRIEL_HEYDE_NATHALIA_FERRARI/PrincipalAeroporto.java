
/**
 * Gabriel Heyde e Nathalia Ferrari
 */
public class PrincipalAeroporto
{
    public static void main(String[] args){
        String nomeAeroporto;
        double valorArrecadado;
        Viagem viagem1 = new Viagem("Florianópolis","SC", 500.00, 5);
        
        nomeAeroporto = Teclado.leString("Digite o nome do aeroporto: ");
        Aeroporto aeroporto1 = new Aeroporto(nomeAeroporto);
        
        Passageiro passageiro1 = new Passageiro(Teclado.leString("Digite o nome do passageiro: "),Teclado.leInt("Digite a idade do passageiro: "));
        
        Passageiro passageiro2 = new Passageiro(Teclado.leString("Digite o nome do passageiro: "),Teclado.leInt("Digite a idade do passageiro: "));
        
        Passageiro passageiro3 = new Passageiro(Teclado.leString("Digite o nome do passageiro: "),Teclado.leInt("Digite a idade do passageiro: "));
        
        Passageiro passageiro4 = new Passageiro(Teclado.leString("Digite o nome do passageiro: "),Teclado.leInt("Digite a idade do passageiro: "));
        
        Passageiro passageiro5 = new Passageiro(Teclado.leString("Digite o nome do passageiro: "),Teclado.leInt("Digite a idade do passageiro: "));
        
        Passageiro passageiro6 = new Passageiro(Teclado.leString("Digite o nome do passageiro: "),Teclado.leInt("Digite a idade do passageiro: "));
        Passageiro passageiro7 = new Passageiro(Teclado.leString("Digite o nome do passageiro: "),Teclado.leInt("Digite a idade do passageiro: "));
    

    }
}
