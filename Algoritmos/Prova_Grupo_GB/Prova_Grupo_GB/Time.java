//Nathalia Ferrari
import java.util.Arrays;

public class Time {
    private String name;
    private Figurinha[] figurinhas;

    public Time(String name, Figurinha[] figurinha) {
        this.name = name;
        this.figurinhas = figurinha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Figurinha[] getFigurinha() {
        return figurinhas;
    }

    public void setFigurinha(Figurinha[] figurinha) {
        this.figurinhas = figurinha;
    }

    @Override
    public String toString() {
        return "\nTime{" +
                "name='" + name + '\'' +
                ", figurinha=" + Arrays.toString(figurinhas) +
                '}';
    }

    public void insereFigurinha(Figurinha figurinha){
        boolean figurinhaExiste = false;
        for(int i = 0; i < this.figurinhas.length; i++) {
            if (this.figurinhas[i].getNumeroFigurinha() == figurinha.getNumeroFigurinha()) {
                figurinhas[i].incrementaQuantidade();
                figurinhaExiste = true;
                break;
            }
        }
        if(!figurinhaExiste){
            for(int i = 0; i < this.figurinhas.length; i++) {
                if(this.figurinhas[i] == null) {
                    this.figurinhas[i] = figurinha;
                    break;
                }
            }
        }
    }

    public void removeFigurinha(Figurinha figurinha){
        for(int i = 0; i < this.figurinhas.length; i++) {
            if (this.figurinhas[i].getNumeroFigurinha() == figurinha.getNumeroFigurinha()) {
                if(this.figurinhas[i].getQuantidade() > 1){
                    figurinhas[i].setQuantidade(figurinhas[i].getQuantidade() - 1);
                    break;
                }
            }
        }
    }
}

