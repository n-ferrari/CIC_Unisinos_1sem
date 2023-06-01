// Nathalia Ferrari
public class BancaDeChurros {
    private Churros churros[];

    public BancaDeChurros(Churros[] churros) {
        this.churros = churros;
    }

    public int estoqueChurros(String sabor){
        int quant = 0;
        for(int i = 0; i < this.churros.length; i++){
            if(this.churros[i] != null){
                if(this.churros[i].getSabor().equals(sabor)) {
                    quant++;
                }
            }
        }
        return quant;
    }

    public boolean insereChurro(Churros unidadeChurros){
        for(int i = 0; i < this.churros.length; i++) {
            if(this.churros[i] == null){
                this.churros[i] = unidadeChurros;
                return true;
            }
        }
        return false;
    }

    public double valorTotal(){
        double valor = 0;
        for(int i = 0; i < this.churros.length; i++){
            if(this.churros[i] != null){
                valor = valor + this.churros[i].getPreco();
            }
        }
        return valor;
    }

    public boolean vendeChurros(String sabor){
        if (estoqueChurros(sabor) != 0){
            for(int i = 0; i < this.churros.length; i++){
                if(this.churros[i] != null) {
                    if(this.churros[i].getSabor().equals(sabor)){
                        System.out.println("Valor da compra " + this.churros[i].getPreco());
                        this.churros[i] = null;
                        return true;
                    }
                }
            }
        }
            return false;
    }
    public void imprimeChurros(){
        for(int i = 0; i < this.churros.length; i++){
            if(this.churros[i] != null){
                System.out.println("Sabor "+this.churros[i].getSabor()+" - Valor "+this.churros[i].getPreco());
            }
        }
    }
    public void lePedidos(String nome, String sabor, int quant){
        if(estoqueChurros(sabor) >= quant){
            for(int i = 0; i < quant; i++){
                vendeChurros(sabor);
            }
            System.out.println("\nChurros vendidos com sucesso!");
        }else{
            System.out.println("\nNão há churros suficientes.");
        }
    }
}

















