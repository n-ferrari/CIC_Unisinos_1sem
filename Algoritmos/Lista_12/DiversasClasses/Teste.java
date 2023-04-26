
/**
 * Write a description of class Teste here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teste
{
    public static void main(String args[]){
        Computador computador1 = new Computador("Dell",16.6,2023,true);
        
        computador1.setMarca("Lenovo");
        
        System.out.printf("%s, %.2f, %d, %b", computador1.getMarca(), computador1.getVelocidade(), computador1.getAnoFab(), computador1.getNovo());
    }
}
