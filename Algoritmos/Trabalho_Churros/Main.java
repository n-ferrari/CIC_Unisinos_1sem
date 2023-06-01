// Nathalia Ferrari
public class Main {
    public static void main(String[] args) {
        Churros[] churros = new Churros[30];

        for(int i = 0; i < 2; i++){
            churros [i] = new Churros("Chocolate", 4);
        }
        for(int i = 2; i < 4; i++){
            churros [i] = new Churros("Doce de leite", 5);
        }
        for(int i = 4; i < 6; i++){
            churros [i] = new Churros("Nutella", 7);
        }
        BancaDeChurros bancaDeChurros = new BancaDeChurros(churros);

    System.out.println("Estoque de churros de chocolate: " + bancaDeChurros.estoqueChurros("Chocolate"));
    System.out.println("Estoque de churros de doce de leite: " + bancaDeChurros.estoqueChurros("Doce de leite"));
    System.out.println("Estoque de churros de nutella: " + bancaDeChurros.estoqueChurros("Nutella"));


    Churros churroUnidade = new Churros("Chocolate", 4);
    if(bancaDeChurros.insereChurro(churroUnidade)){
        System.out.println("\nChurros inserido com sucesso.");
    }else{
        System.out.println("\nNão há mais espaço no estoque.");
    }
       System.out.print("\nValor total dos churros "+ bancaDeChurros.valorTotal()+"\n");


    bancaDeChurros.vendeChurros("Chocolate");


    bancaDeChurros.lePedidos("Maria","Chocolate",3);
    bancaDeChurros.lePedidos("Maria","Doce de leite",2);
    bancaDeChurros.lePedidos("Maria","Nutella",2);

    bancaDeChurros.imprimeChurros();

    }
}