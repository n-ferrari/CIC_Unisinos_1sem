/**
 * Nathalia Ferrari
 */
public class Universidade {

    private String nome;
    private int quantAlunos;
    private int quantProfessores;

    public Universidade(String nome, int quantAlunos, int quantProfessores) {
        this.nome = nome;
        this.quantAlunos = quantAlunos;
        this.quantProfessores = quantProfessores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public int getQuantProfessores() {
        return quantProfessores;
    }

    public void setQuantProfessores(int quantProfessores) {
        this.quantProfessores = quantProfessores;
    }
    public String toString(){
        return "Nome: "+this.nome+"\nQuantidade de alunos: "+this.quantAlunos+"\nQuantidade de professores: "+this.quantProfessores;
    }


}
