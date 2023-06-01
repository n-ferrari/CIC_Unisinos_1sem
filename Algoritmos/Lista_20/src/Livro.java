
/**
 * Write a description of class Livro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Livro
{
    private String titulo;
    private String autor;
    private int ano;
    
    Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getAno(){
        return this.ano;
    }
}
