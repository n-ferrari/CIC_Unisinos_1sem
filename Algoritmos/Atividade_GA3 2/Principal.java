
/**
 * @Nathalia Ferrari
 * @Algoritmos 2023 Unisinos
 */
public class Principal
{
    // instance variables - replace the example below with your own
    public static void main(String args[]){
    
        Cliente cliente1 = new Cliente(Teclado.leString("Digite o nome do cliente 1: "),
        Teclado.leInt("Digite a idade do cliente 1: "),
        Teclado.leString("Digite o sexo do cliente 1 (Feminino/Masculino): "),
        Teclado.leString("Digite o email do cliente 1"),
        Teclado.leString("Digite a senha do cliente 1"));
        
        Livro livro1 = new Livro(Teclado.leString("\n\nDigite o título do livro 1: "),
        Teclado.leString("Digite o autor do livro 1: "),
        Teclado.leInt("Digite o ano de publicação do livro 1: "),
        Teclado.leDouble("Digite o preço do livro 1: "),
        Teclado.leInt("Digite a quantidade de páginas do livro 1: "));
    
        Cliente cliente2 = new Cliente(Teclado.leString("\n\nDigite o nome do cliente 2: "),
        Teclado.leInt("Digite a idade do cliente 2: "),
        Teclado.leString("Digite o sexo do cliente 2 (Feminino/Masculino): "),
        Teclado.leString("Digite o email do cliente 2"),
        Teclado.leString("Digite a senha do cliente 2"));
        
        Livro livro2 = new Livro(Teclado.leString("\n\nDigite o título do livro 2: "),
        Teclado.leString("Digite o autor do livro 2: "),
        Teclado.leInt("Digite o ano de publicação do livro 2: "),
        Teclado.leDouble("Digite o preço do livro 2: "),
        Teclado.leInt("Digite a quantidade de páginas do livro 2: "));
        
        
        Cliente cliente3 = new Cliente(Teclado.leString("\n\nDigite o nome do cliente 3: "),
        Teclado.leInt("Digite a idade do cliente 3: "),
        Teclado.leString("Digite o sexo do cliente 3 (Feminino/Masculino): "),
        Teclado.leString("Digite o email do cliente 3"),
        Teclado.leString("Digite a senha do cliente 3"));
        
        Livro livro3 = new Livro(Teclado.leString("\n\nDigite o título do livro 3: "),
        Teclado.leString("Digite o autor do livro 3: "),
        Teclado.leInt("Digite o ano de publicação do livro 3: "),
        Teclado.leDouble("Digite o preço do livro 3: "),
        Teclado.leInt("Digite a quantidade de páginas do livro 3: "));
        
        
        System.out.println("\n\nLivro 1");
        livro1.imprimeInfo();
        System.out.println("\nO preço por página do livro 1 é: "+livro1.calcularPrecoPorPagina());
        System.out.println("Cliente 1");
        cliente1.imprimeInformacoes();
        
        System.out.println("\n\nLivro 2");
        livro2.imprimeInfo();
        System.out.println("\nO preço por página do livro 2 é: "+livro2.calcularPrecoPorPagina());
        System.out.println("Cliente 2");
        cliente2.imprimeInformacoes();
        
        System.out.println("\n\nLivro 3");
        livro3.imprimeInfo();
        System.out.println("\nO preço por página do livro 3 é: "+livro3.calcularPrecoPorPagina());
        System.out.println("Cliente 3");
        cliente3.imprimeInformacoes();
    }
    
}
