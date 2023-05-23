
/**
 * Write a description of class PrincipalBaralho here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrincipalBaralho
{
    public static void main(String[] args){
        Baralho baralho = new Baralho();
        Carta carta;
        Carta espada2 = new Carta("Espada",Integer.toString(13));
        
        baralho.embaralha();
        
        baralho.imprimeBaralho();
        
        carta = baralho.daCarta();
        
        System.out.println();
        System.out.println(carta.getNome());
        System.out.println(carta.getNaipe());
        
        System.out.println(baralho.temCarta(espada2));
      
    }
}
