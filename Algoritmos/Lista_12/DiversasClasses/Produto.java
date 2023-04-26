
/**
 * Write a description of class Produto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Produto
{
    // instance variables - replace the example below with your own
    private String nome;
    private double valor;
    private String descricao;
    private int estoque;

    /**
     * Constructor for objects of class Produto
     */
    public Produto(String nome, double valor,String descricao,int estoque)
    {
        this.nome = nome;
        this.valor= valor;
        this.descricao = descricao;
        this.estoque = estoque;
    }

}
