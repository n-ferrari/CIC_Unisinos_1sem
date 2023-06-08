public class Homem extends Pessoa{
    private String time;
    private String corCabeloPreferencia;

    public Homem(String nome, int idade, String time, String corCabeloPreferencia) {
        super(nome, idade);
        this.time = time;
        this.corCabeloPreferencia = corCabeloPreferencia;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCorCabeloPreferencia() {
        return corCabeloPreferencia;
    }

    public void setCorCabeloPreferencia(String corCabeloPreferencia) {
        this.corCabeloPreferencia = corCabeloPreferencia;
    }

    @Override
    public String toString() {
        return super.toString()+
                "time='" + time + '\'' +
                ", corCabeloPreferencia='" + corCabeloPreferencia + '\'' +
                '}';
    }
}
