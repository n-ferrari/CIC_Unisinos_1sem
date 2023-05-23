
/**
 * Nathalia Ferrari
 */
public class InformacoesAtletas
{
    public void imprimeExclusivosAtleta(Atleta a){
        boolean ehnadador = a.getClass().isAssignableFrom(Nadador.class);
        boolean ehcorredor = a.getClass().isAssignableFrom(Corredor.class);
        
        if (ehnadador){
            Nadador nadador = (Nadador) a;
            System.out.print("E um nadador, e a sua categoria e "+nadador.getCategoria());
        }
        if (ehcorredor){
            Corredor corredor = (Corredor) a;
            System.out.print("E um corredor, e o peso deste corredor e "+corredor.getPeso());
        }
    }
    
    public void imprimeInformacoesAtleta(Atleta a){
        a.imprimeInfo();
    }
}
