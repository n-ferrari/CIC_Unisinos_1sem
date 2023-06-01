
/**
 * Nathalia Ferrari
 */
public class Principal
{
    public static void main(String[] args){
        Biblioteca biblioteca;
        
        int quant = Teclado.leInt("Quantos livros voce quer digitar?");
        Livro[] livro = new Livro[quant];
        
        for(int i = 0; i < quant; i++){
            livro[i] = new Livro(Teclado.leString("Digite o nome do livro"),Teclado.leString("Digite o nome do autor"),Teclado.leInt("Digite o ano do livro"));
        }
        
        biblioteca = new Biblioteca(livro);
        
        String nome = Teclado.leString("Qual titulo voce quer pesquisar?");
        if (biblioteca.verificaLivro(nome) == true){
            System.out.println("Foi encontrado um livro com este título");
            System.out.println("Titulo: "+biblioteca.retornaLivro(nome).getTitulo());
            System.out.println("Autor: "+biblioteca.retornaLivro(nome).getAutor());
            System.out.println("Ano: "+biblioteca.retornaLivro(nome).getAno());
            nome.toString();
        }
    }
}
