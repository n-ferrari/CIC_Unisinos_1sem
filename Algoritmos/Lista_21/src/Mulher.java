public class Mulher extends Pessoa{
    private String corCabelo;

    public Mulher(String nome, int idade, String corCabelo) {
        super(nome, idade);
        this.corCabelo = corCabelo;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "cor do cabelo: " + corCabelo + '.';
    }
}
