public class Melancia extends Fruta{
    private double precoAdicional;
    private boolean epoca;
    
    public Melancia(String nome, double preco, double precoAdicional, boolean epoca){
        super(nome, preco);
        this.precoAdicional = precoAdicional;
        this.epoca = epoca;
        
    }
    public double calculaPrecoFinal(){
        if (this.epoca == true){
            return super.getPreco();
        }else{
            return
                super.getPreco() + this.precoAdicional;
        }
    }
}

