/**
 * Gabriel Heyde e Nathalia Ferrari
 */

public class PrincipalAquario
{
    public static void main(String[] args){
        Aquario aquario =  new Aquario();
        Pessoa pessoa = new Pessoa(Teclado.leString("Escreva seu nome "), aquario);
              
        aquario.setPeixe1(new Peixe("Flick", new Cor(135, 206, 250), "beta"));
        aquario.setPeixe2(new Peixe("Losh", new Cor(0, 255, 127), "bagre"));
        
        if (aquario.tamanhoSuficiente()){
            System.out.println("O aquario possui tamanho suficiente");
        } else{
            System.out.println("O aquario não possui tamanho suficiente");
        }
        
        System.out.println("Escreva a nova raça do peixe 2 ");
        aquario.getPeixe2().setRaca(Teclado.leString());
        
        aquario.imprimeCores();
        
    }
}
