public class Time {
    private String nome;
    private int ano;
    private int quant_socios;

    public Time(String nome, int ano, int quant_socios) {
        this.nome = nome;
        this.ano = ano;
        this.quant_socios = quant_socios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuant_socios() {
        return quant_socios;
    }

    public void setQuant_socios(int quant_socios) {
        this.quant_socios = quant_socios;
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", quant_socios=" + quant_socios +
                '}';
    }
}
