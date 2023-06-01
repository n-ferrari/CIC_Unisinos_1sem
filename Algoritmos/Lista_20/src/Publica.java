


public class Publica extends Universidade {
    private String estado;
    private String cidade;

    public Publica(String nome, int quantAlunos, int quantProfessores, String estado, String cidade) {
        super(nome, quantAlunos, quantProfessores);
        this.estado = estado;
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String toString(){
        return "Nome: "+super.getNome()+"\nAlunos: "+super.getQuantAlunos()+"\nProfessores: "+super.getQuantProfessores()+"\nEstado: "+this.estado+"\nCidade: "+this.cidade;
    }
}
