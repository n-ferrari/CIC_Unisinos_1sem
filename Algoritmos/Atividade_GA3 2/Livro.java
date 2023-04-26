
/**
 * @Nathalia Ferrari
 * @Algoritmos 2023 Unisinos
 */
public class Livro
{
    // instance variables - replace the example below with your own
    private String titulo;
    private String autor;
    private int ano;
    private double preco;
    private int quantidadePaginas;

    /**
     * Construtor de objetos da classe Livro
     */
    public Livro(String titulo, String autor, int ano, double preco, int quantidadePaginas)
    {
        // initialise instance variables
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public int getQuantidadePaginas(){
        return quantidadePaginas;
    }
    
    public void setQuantidadePaginas(int quantidadePaginas){
        this.quantidadePaginas = quantidadePaginas;
    }

    public double calcularPrecoPorPagina(){
        return (preco / quantidadePaginas);
    }
    
    public void imprimeInfo(){
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Ano de publicação: "+ano);
        System.out.println("Preço: "+preco);
        System.out.println("Quantidade de páginas: "+quantidadePaginas);
        
    }
}
