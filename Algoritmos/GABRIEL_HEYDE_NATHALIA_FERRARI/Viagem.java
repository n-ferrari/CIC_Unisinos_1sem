/**
 * @Gabriel Heyde e Nathalia Ferrari
 */
public class Viagem
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String cidade;
    private String estado;
    private double valor;
    private int quantVendida;
    private int quantMaxima;
    

    public Viagem(String cidade,String estado, double valor, int quantMaxima)
    {
        this.cidade = "BG";
        this.estado = "RS";
        this.valor = 50.00;
        quantVendida = 0;
        this.quantMaxima = 120;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public void setQuantVendida(int quantVendida){
        this.quantVendida = quantVendida;
    }
    
    public void setQuantMaxima(int quantMaxina){
        this.quantMaxima = quantMaxima;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public double getValor(){
        return valor;
    }
    
    public int getQuantVendida(){
        return quantVendida;
    }
    
    public int getQuantMaxima(){
        return quantMaxima;
    }
    
    public void imprimeInformacoes()
    {
        System.out.println("A viagem possui destino para " + cidade + "/" + estado + " com um valor de R$" + valor + ". Esta viagem possui " + quantMaxima + " acentos disppníveis, e destes acentos foram vendidos um total de " + quantVendida + ".");
    }
}
