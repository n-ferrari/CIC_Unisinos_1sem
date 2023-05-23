
/**
 * Write a description of class Baralho here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Baralho
{
    Carta arrayCarta[] = new Carta[56];
    int num = 1;
    public Baralho(){
        for (int i = 0; i < 13; i++){
            arrayCarta[i] = new Carta("Ouro",Integer.toString(num));
            num++;
        }
        num = 1;
        for (int i = 13; i < 26; i++){
            arrayCarta[i] = new Carta("Espada",Integer.toString(num));
            num++;
        }
        num = 1;
        for (int i = 26; i < 39; i++){
            arrayCarta[i] = new Carta("Copas",Integer.toString(num));
            num++;
        }
        num = 1;
        for (int i = 39; i < 52; i++){
            arrayCarta[i] = new Carta("Paus",Integer.toString(num));            num++;
        }
        num = 1;
        for (int i = 52; i < 56; i++){
            arrayCarta[i] = new Carta("Coringa","Coringa"); 
            num++;
        }
    }
    public void imprimeBaralho(){
        for (int i = 0; i < 56; i++){
            System.out.println(arrayCarta[i].getNome()+" "+arrayCarta[i].getNaipe());
        }
    }
    public void embaralha(){
        Carta cartaAuxiliar;
        for (int i = 0 ; i < 56; i++){
            int pos1 = (int) (Math.random() * 56);
            int pos2 = (int) (Math.random() * 56);
            
            cartaAuxiliar = arrayCarta[pos1];
            arrayCarta[pos1] = arrayCarta[pos2];
            arrayCarta[pos2] = cartaAuxiliar;
        }
    }
    public Carta daCarta(){
        Carta carta = null;
        int i = 0;
        while(carta == null){
            carta = arrayCarta[i];
            if(carta != null){
                return carta;
            }
            i++;
        }
        return null;
    }
    public boolean temCarta(Carta carta){
        for(int i = 0; i < 56; i++){
            if (carta.getNome().equals(arrayCarta[i].getNome()) && carta.getNaipe().equals(arrayCarta[i].getNaipe())){
                return true;
            }
        }
        return false;
    }
}
