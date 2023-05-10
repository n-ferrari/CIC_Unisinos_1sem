
/**
 * Gabriel Heyde e Nathalia Ferrari
 */
public class PrincipalAeroporto
{
    public static void main(String[] args){
        Aeroporto aeroporto = new Aeroporto(Teclado.leString("Digite o nome do aeroporto: "));
            
        Viagem viagem = new Viagem("Florianópolis","SC", 500.00, 5);
    
        
        Passageiro passageiro1 = new Passageiro(Teclado.leString("\nDigite o nome do passageiro: "),Teclado.leInt("Digite a idade do passageiro: "));
        Passagem passagem1 = aeroporto.compraPassagem(passageiro1,viagem);
        if(passagem1 != null){
            System.out.println("A passagem no valor de "+passagem1.getValorPassagem()+" foi comprada com sucesso. Restam "+ (viagem.getQuantMaxima() - viagem.getQuantVendida())+ " lugares no avião");
        }else{
            System.out.println("Passagens esgotadas");
        }
        
        Passageiro passageiro2 = new Passageiro(Teclado.leString("\nDigite o nome do passageiro: "),Teclado.leInt("Digite a idade do passageiro: "));
        Passagem passagem2 = aeroporto.compraPassagem(passageiro2,viagem);
        if(passagem2 != null){
            System.out.println("A passagem no valor de "+passagem2.getValorPassagem()+" foi comprada com sucesso. Restam "+ (viagem.getQuantMaxima() - viagem.getQuantVendida())+ " lugares no avião");
        }else{
            System.out.println("Passagens esgotadas");
        }
        
        Passageiro passageiro3 = new Passageiro(Teclado.leString("\nDigite o nome do passageiro: "),Teclado.leInt("Digite a idade do passageiro: "));
        Passagem passagem3 = aeroporto.compraPassagem(passageiro3,viagem);
        if(passagem3 != null){
            System.out.println("A passagem no valor de "+passagem3.getValorPassagem()+" foi comprada com sucesso. Restam "+ (viagem.getQuantMaxima() - viagem.getQuantVendida())+ " lugares no avião");
        }else{
            System.out.println("Passagens esgotadas");
        }
        
        Passageiro passageiro4 = new Passageiro(Teclado.leString("\nDigite o nome do passageiro: "),Teclado.leInt("Digite a idade do passageiro: "));
        Passagem passagem4 = aeroporto.compraPassagem(passageiro4,viagem);
        if(passagem4 != null){
            System.out.println("A passagem no valor de "+passagem4.getValorPassagem()+" foi comprada com sucesso. Restam "+ (viagem.getQuantMaxima() - viagem.getQuantVendida())+ " lugares no avião");
        }else{
            System.out.println("Passagens esgotadas");
        }
        
        Passageiro passageiro5 = new Passageiro(Teclado.leString("\nDigite o nome do passageiro: "),Teclado.leInt("Digite a idade do passageiro: "));
        Passagem passagem5 = aeroporto.compraPassagem(passageiro5,viagem);
        if(passagem5 != null){
            System.out.println("A passagem no valor de "+passagem5.getValorPassagem()+" foi comprada com sucesso. Restam "+ (viagem.getQuantMaxima() - viagem.getQuantVendida())+ " lugares no avião");
        }else{
            System.out.println("Passagens esgotadas");
        }
        
        Passageiro passageiro6 = new Passageiro(Teclado.leString("\nDigite o nome do passageiro: "),Teclado.leInt("Digite a idade do passageiro: "));
        Passagem passagem6 = aeroporto.compraPassagem(passageiro6,viagem);
        if(passagem6 != null){
           System.out.println("A passagem no valor de "+passagem6.getValorPassagem()+" foi comprada com sucesso. Restam "+ (viagem.getQuantMaxima() - viagem.getQuantVendida())+ " lugares no avião");
        }else{
            System.out.println("Passagens esgotadas");
        }
        
        Passageiro passageiro7 = new Passageiro(Teclado.leString("\nDigite o nome do passageiro: "),Teclado.leInt("Digite a idade do passageiro: "));
        Passagem passagem7 = aeroporto.compraPassagem(passageiro7,viagem);
        if(passagem7 != null){
            System.out.println("A passagem no valor de "+passagem7.getValorPassagem()+" foi comprada com sucesso. Restam "+ (viagem.getQuantMaxima() - viagem.getQuantVendida())+ " lugares no avião");
        }else{
            System.out.println("Passagens esgotadas");
        }
        
        System.out.println("\nO valor total arrecadado pelo aeroporto foi de "+aeroporto.getvalorTotal()+".");      
 
    }
}
