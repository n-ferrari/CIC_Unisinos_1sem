/**
 *Trabalho Grau A Unisinos Algoritmos e Programacao I -2023: Tamagotchi
 *
 * @Nathalia Carpenedo Ferrari
 */
import java.util.Random;
public class Principal
{
    public static void main(String args[]){
        String nome;
        Random random = new Random();
        int randomInteger;
        
        System.out.println(" _                                    _       _     _ ");
        System.out.println("| |                                  | |     | |   (_)");
        System.out.println("| |_ __ _ _ __ ___   __ _  __ _  ___ | |_ ___| |__  _ ");
        System.out.println("| __/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\| __/ __| '_ \\| |");
        System.out.println("| || (_| | | | | | | (_| | (_| | (_) | || (__| | | | |");
        System.out.println(" \\__\\__,_|_| |_| |_|\\__,_|\\__, |\\___/ \\__\\___|_| |_|_|");
        System.out.println("                           __/ |                      ");
        System.out.println("                          |___/                       ");
        System.out.println("Digite o nome do seu Tamagotchi: ");
        nome = Teclado.leString();
        Tamagotchi tamagotchi1 = new Tamagotchi(nome);
        
        tamagotchi1.mostraEstado();
        
        while (tamagotchi1.estaVivo()){
            randomInteger = random.nextInt(3);
            if (randomInteger == 0){
                tamagotchi1.comSono();
            }
            if (randomInteger == 1){
                tamagotchi1.comFome();
            }
            if (randomInteger == 2){
                tamagotchi1.entediado();
            }
            if(tamagotchi1.estaVivo() == true){
                tamagotchi1.mostraEstado();
            }
        }
        System.out.println("FIM DE JOGO");
    }

}
