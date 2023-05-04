
/**
 *
 * @Nathalia Ferrari
 * @Lista 15
 */
public class Exercicios
{

    public void contador(int x)
    {
        while (x < 301){
            System.out.println(x);
            x++;
        }
    }
    
    public void imprimePares(int x){
        if (x >= 0){
            int y = 0;
            while (y <= x){
                if (y % 2 == 0){
                   System.out.println(y); 
                }
                y++;
            }
        }else
            System.out.println("NUMERO NEGATIVO");
    }
    
    public boolean verificaPrimos(int x){
        int y = x / 2;
        boolean primo = true;
        while (y > 1){
            if (x % y == 0){
                primo = false;
            }
            y--;
        }
        return primo;
    }
}
