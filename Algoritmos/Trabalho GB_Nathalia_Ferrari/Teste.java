
/**
 * Nathalia Ferrari
 */
public class Teste
{
    public static void main(String[] args){
        Competicao competicao = new Competicao("Correr cansa",new Data(25,05,2023));
        
        System.out.println("Nome da competicao: "+competicao.getNome()+"\n Data: ");
        competicao.imprimeData();
        System.out.println();
        
        Nadador nadador = new Nadador("Cielo",23,"Borboleta");
        nadador.imprimeInfo();
        System.out.println();
        
        Corredor corredor = new Corredor("Pedro",91,68,competicao);
        competicao.setData(new Data(25,02,2023));
        competicao.imprimeData();
        System.out.println();
        
        Corredor corredor2 = new Corredor("Augosto",100,70,new Competicao("Sao Silvestre", new Data(1,1,2024)));
        corredor2.imprimeInfo();
        System.out.println();
        
        
        Atleta a;
        System.out.println("Digite 1 para criar um nadador ou 2 para criar um corredor");
        int opcao = 0;
        while (opcao != 1 && opcao != 2){
            opcao = Teclado.leInt();
        }
        if (opcao == 1){
            System.out.println("Nadador");
            a = new Nadador(Teclado.leString("Nome: "),Teclado.leInt("Idade: "),Teclado.leString("Categoria: "));
        }else{
            System.out.println("Corredor");
            String nome = Teclado.leString("Nome: ");
            int idade = Teclado.leInt("Idade: ");
            double peso = Teclado.leDouble("Peso: ");
            String nomeCompeticao = Teclado.leString("Nome da competicao: ");
            int dia = Teclado.leInt("Dia da competicao ");
            int mes = Teclado.leInt("Mes da competicao");
            int ano = Teclado.leInt("Ano da competicao");
            a = new Corredor(nome,idade,peso,new Competicao(nomeCompeticao,new Data(dia, mes, ano)));
        }
        
        InformacoesAtletas informacoesAtletas = new InformacoesAtletas();
        informacoesAtletas.imprimeExclusivosAtleta(a);
        System.out.println();
        informacoesAtletas.imprimeInformacoesAtleta(a);
        
        boolean ehnadador = a.getClass().isAssignableFrom(Nadador.class);
        boolean ehcorredor = a.getClass().isAssignableFrom(Corredor.class);
        
        if (ehnadador){
            Nadador nadador2 = (Nadador) a;
            nadador2.setCategoria("Livre");
            a = (Atleta) nadador2;
        }
        if (ehcorredor){
            Corredor corredor3 = (Corredor) a;
            corredor3.setPeso(89);
            a = (Atleta) corredor3;
        }
        
        informacoesAtletas.imprimeExclusivosAtleta(a);
    }
}
