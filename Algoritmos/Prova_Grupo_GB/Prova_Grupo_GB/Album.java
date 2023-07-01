//Nathalia Ferrari
import java.util.Arrays;

public class Album {
    Time[] time;

    public Album(Time[] time) {
        this.time = time;
    }

    public Time[] getTime() {
        return time;
    }

    public void setTime(Time[] time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Album{" +
                "time=" + Arrays.toString(time) +
                "}";
    }

    public void insereFigurinha(Figurinha figurinha){
        for(int i = 0; i < time.length; i++){
            time[i].insereFigurinha(figurinha);
        }
    }

    public void removeFigurinha(Figurinha figurinha){
        for(int i = 0; i < time.length; i++){
            time[i].removeFigurinha(figurinha);
        }
    }
    public Figurinha[] figurinhasRepetidas(){
        int quantFigurinhasRepetidas = 0;


        for(int i = 0; i < time.length; i++){
            Figurinha[] figurinhasTime = time[i].getFigurinha();
            for(int j = 0; j < figurinhasTime.length; j++){
                if(figurinhasTime[j].getQuantidade() > 1){
                    quantFigurinhasRepetidas++;
                }
            }
        }
        Figurinha[] figurinhasRepetidas = new Figurinha[quantFigurinhasRepetidas];
        int k = 0;

        for(int i = 0; i < time.length; i++){
            Figurinha[] figurinhasTime = time[i].getFigurinha();
            for(int j = 0; j < figurinhasTime.length; j++){
                if(figurinhasTime[j].getQuantidade() > 1){
                    figurinhasRepetidas[k] = figurinhasTime[j];
                    k++;
                }
            }
        }
        return figurinhasRepetidas;
    }

    public Figurinha[] figurinhasFaltando(){
        int quantFigurinhasFaltando = 0;

        for(int i = 0; i < time.length; i++){
            Figurinha[] figurinhasTime = time[i].getFigurinha();
            for(int j = 0; j < figurinhasTime.length; j++){
                if(figurinhasTime[j].getQuantidade() == 0){
                    quantFigurinhasFaltando++;
                }
            }
        }

        Figurinha[] figurinhasFaltando = new Figurinha[quantFigurinhasFaltando];
        int k = 0;

        for(int i = 0; i < time.length; i++){
            Figurinha[] figurinhasTime = time[i].getFigurinha();
            for(int j = 0; j < figurinhasTime.length; j++){
                if(figurinhasTime[j].getQuantidade() == 0 ){
                    figurinhasFaltando[k] = figurinhasTime[j];
                    k++;
                }
            }
        }
        return figurinhasFaltando;
    }
}
