/**
 * Gabriel Heyde e Nathalia Ferrari
 */

public class Pessoa
{
    private String nome;
    private Aquario aquario;
    
    public Pessoa(String nome, Aquario aquario){
        this.nome = nome;
        this.aquario = aquario;
    }
    public String getNome(){
        return this.nome;
    }
    public Aquario getAquario(){
        return aquario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAquario(Aquario aquario){
        this.aquario = aquario;
    }
    public String toString(){
        String frase;
        frase = "Nome da pessoa: " + this.nome + "No seu aquario tem os seguintes peixes ";
        if (this.aquario.getPeixe1() != null){
            frase += this.aquario.getPeixe1().toString();
        }
        if (this.aquario.getPeixe2() != null){
            frase += this.aquario.getPeixe2().toString();
        }
        if (this.aquario.getPeixe3() != null){
            frase += this.aquario.getPeixe3().toString();  
        }
        return frase;
    }
}
