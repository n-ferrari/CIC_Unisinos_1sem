
/**
 * Gabriel Heyde e Nathalia Ferrari
 */
public class Aquario
{
    private double tamanho;
    private Peixe peixe1, peixe2, peixe3;
    
    public Aquario(){
        this.tamanho = -1;
    }
    public Aquario(double tamanho, Peixe peixe1, Peixe peixe2, Peixe peixe3){
        this.tamanho = tamanho;
        this.peixe1 = peixe1;
        this.peixe2 = peixe2;
        this.peixe3 = peixe3;
    }
    public Aquario(double tamanho, Peixe peixe1){
        this.tamanho = tamanho;
        this.peixe1 = peixe1;
    }
    public Aquario(double tamanho, Peixe peixe1, Peixe peixe2){
        this.tamanho = tamanho;
        this.peixe1 = peixe1;
        this.peixe2 = peixe2;
    }
    public double getTamanho(){
        return this.tamanho;
    }
    public Peixe getPeixe1(){
        return this.peixe1;
    }
    public Peixe getPeixe2(){
        return this.peixe2;
    }
    public Peixe getPeixe3(){
        return this.peixe3;
    }
    public void setPeixe1(Peixe peixe1){
        this.peixe1 = peixe1;
    }
    public void setPeixe2(Peixe peixe2){
        this.peixe2 = peixe2;
    }
    public void setPeixe3(Peixe peixe3){
        this.peixe3 = peixe3;
    }
    public String toString(){
        return "Tamanho do aquario: " + this.tamanho + "\nPeixe 1: " + this.peixe1.toString() + "\nPeixe 2: " + this.peixe2.toString() + "\nPeixe 3: " + this.peixe3.toString();
    }
    public boolean tamanhoSuficiente(){
        int quantPeixe = 0;
        if (this.peixe1 != null){
            quantPeixe +=1;
        }
        if (this.peixe2 != null){
            quantPeixe +=1;
        }
        if (this.peixe3 != null){
            quantPeixe +=1;
        }
        return this.tamanho >= (3 * quantPeixe);
    }
    public void imprimeCores(){
        if (this.peixe1 != null){
            System.out.println("Peixe 1: " + this.peixe1.getCor().toString());
        }
        if (this.peixe2 != null){
            System.out.println("Peixe 2: " + this.peixe2.getCor().toString());
        }
        if (this.peixe3 != null){
            System.out.println("Peixe 3: " + this.peixe3.getCor().toString());
        }
    }
}
    
