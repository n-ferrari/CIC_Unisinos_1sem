
/**
 * Write a description of class Biblioteca here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Biblioteca
{
    private Livro[] livro;
    
    public Biblioteca(Livro[] livro){
        this.livro = livro;
    }
    public boolean verificaLivro(String titulo){
        for (int i = 0; i < livro.length; i++){
            if (titulo.equals(livro[i].getTitulo())){
                return true;
            }
        }
        return false;
    }
    public Livro retornaLivro(String titulo){
        for (int i = 0; i < livro.length; i++){
            if (titulo.equals(livro[i].getTitulo())){
                return livro[i];
            }
        }
        return null;
    }
}
