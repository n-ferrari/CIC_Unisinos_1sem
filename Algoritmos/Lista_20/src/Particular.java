public class Particular extends Universidade{
    private double mensalidade;

    public Particular(String nome, int quantAlunos, int quantProfessores, double mensalidade) {
        super(nome, quantAlunos, quantProfessores);
        this.mensalidade = mensalidade;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String toString(){
        return "Nome: "+super.getNome()+"\nAlunos: "+super.getQuantAlunos()+"\nProfessores: "+super.getQuantProfessores()+"\nMensalidade "+this.mensalidade;
    }
}
