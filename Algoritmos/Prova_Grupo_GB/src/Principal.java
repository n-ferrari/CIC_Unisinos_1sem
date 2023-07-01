
//Nathalia Ferrari
public class Principal {
    public static void main(String[] args) {
        int x = Teclado.leInt("Digite a quantidade de times");
        int y = Teclado.leInt("Digite a quantidade de jogadores por time");


        //int x = 2;
        //int y = 5;
        Time[] times =  new Time[x];
        int numeroFigurinha = 0;

        for(int i = 0; i < x; i++){
            Figurinha[] figurinhas = new Figurinha[y];
            System.out.println("Time " + (i + 1));
            String nomeTime = "Inter";
            for(int j = 0; j < y; j++){
                String nomeJogador = "Andre";
                double altura = 1.98;
                int idade = 31;
                Jogador jogador = new Jogador(nomeJogador, altura, idade);
                //System.out.println(numeroFigurinha);
                Figurinha figurinha = new Figurinha(nomeTime, numeroFigurinha, jogador);
                figurinhas[j] = figurinha;
                numeroFigurinha++;
            }
            Time time = new Time(nomeTime, figurinhas);
            times[i] = time;
        }

        Album album = new Album(times);
        //System.out.print(album);
        System.out.println();
        System.out.println("Insere duas figurinhas 7 e duas 8");
        Jogador jogador = new Jogador("Andre", 1.98, 31);
        Figurinha figurinha7 = new Figurinha("Inter" , 7 , jogador);
        Figurinha figurinha8 = new Figurinha("Inter" , 8 , jogador);
        album.insereFigurinha(figurinha7);
        album.insereFigurinha(figurinha7);
        album.insereFigurinha(figurinha8);
        album.insereFigurinha(figurinha8);

        System.out.print(album);

        System.out.println();
        System.out.println();

        System.out.println("Tenta remover duas figurinhas 7");
        album.removeFigurinha(figurinha7);
        album.removeFigurinha(figurinha7);

        System.out.println(album);
        System.out.println();

        System.out.print("Figurinhas repetidas");
        Figurinha[] figurinhasRepetidas = album.figurinhasRepetidas();
        for(int i = 0; i < figurinhasRepetidas.length; i++){
            System.out.print(figurinhasRepetidas[i]);
        }
        System.out.println();
        System.out.println();

        System.out.print("Figurinhas faltando");
        Figurinha[] figurinhasFaltando = album.figurinhasFaltando();
        for(int i = 0; i < figurinhasFaltando.length; i++){
            System.out.print(figurinhasFaltando[i]);
        }
    }
}