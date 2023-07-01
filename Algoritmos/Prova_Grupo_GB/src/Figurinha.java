//Nathalia Ferrari
public class Figurinha {
    private String nomeTime;
    private int numeroFigurinha;
    private Jogador jogador;
    private int quantidade = 0;

    public Figurinha(String nomeTime, int numero, Jogador jogador) {
        this.nomeTime = nomeTime;
        this.numeroFigurinha = numero;
        this.jogador = jogador;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public int getNumeroFigurinha() {
        return numeroFigurinha;
    }

    public void setNumeroFigurinha(int numeroFigurinha) {
        this.numeroFigurinha = numeroFigurinha;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nFigurinha{" +
                "nomeTime='" + nomeTime + '\'' +
                ", numero=" + numeroFigurinha +
                ", jogador=" + jogador +
                ", quantidade=" + quantidade +
                '}';
    }
    public void incrementaQuantidade(){
        this.setQuantidade(this.getQuantidade() + 1);
    }

}
