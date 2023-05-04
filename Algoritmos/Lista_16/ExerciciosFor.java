
/**
 *
 * @Nathalia Ferrari
 */
public class ExerciciosFor
{
    public void exercicio1(int x){
        for(int y = 0; y < x; y++){
            System.out.println("Digite o nome da pessoa:");
        }
    }
    
    public void exercicio2(int x){
        for(int y = 0; y <= x; y++){
            System.out.println(y);
        }
    }
    
    public void exercicio3(int x){
        if (x >= 0){
        for(int y = 0; y <= x; y++){
            if(y % 2 == 0){
                    System.out.println(y);
            }
        }
        }else
            System.out.println("Erro");
    }
    
    public void exercicio4(int x){
        if (x >= 0){
        for(int y = x; y >= 0; y--){
            System.out.println(y);
        }
        }else
            System.out.print("Erro");
    }

    public void exercicio5(int x){
        int torcedores = 0;
        String time;
        for(int y = 0; y < x; y++){
            System.out.println("Digite o time");
            time = Teclado.leString();
            if ("Gremio".equals(time) || "gremio".equals(time)){
                torcedores++;
            }
        }
        System.out.printf("%d pessoas torcem para o Gremio",torcedores);
    }
    
    public double exercicio6(int x){
        double soma = 0;
        double numero;
        for(int i = 0; i < x; i++){
            numero = Teclado.leDouble();
            soma = soma + numero;
        }
        return soma;
    }

        public void exercicio7(){
        int soma = 0;
        int numero;
        
        System.out.println("Digite 10 valores inteiros");
        
        for(int i = 0; i < 10; i++){
            numero = Teclado.leInt();
            soma = soma + numero;
        }
        System.out.println("A soma é "+soma);
    }
    
    public void exercicio8(){
        System.out.println("Quantos numeros voce vai digitar?");
        int quant = Teclado.leInt();
        for(int i = 0;i < quant; i++){
            int numero = Teclado.leInt();
            if (numero < 0){
                System.out.println("Negativo");
            } else if (numero > 0){
                System.out.println("Positivo");
            }else{
                System.out.println("Zero");    
            }
        }
    }
    public void exercicio9(int val1, int val2){
        int maior = 0 , menor = 0;
        if (val1 > 0 && val2 > 0){
            if (val1 > val2){
                maior = val1;
                menor = val2;
            }else{
                menor = val1;
                maior = val2;
            }
            for (int i = menor; i < maior; i++){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        }
    }
    public void exercicio10(){
        int soma = 0;
        for(int i = 0; i < 199; i++){
            soma = soma + i;
        }
        System.out.println(soma);
    }
    public int exercicio11(int val1, int val2){
        int soma = 0;
        int maior = 0 , menor = 0;
        if (val1 > 0 && val2 > 0){
            if (val1 > val2){
                maior = val1;
                menor = val2;
            }else{
                menor = val1;
                maior = val2;
            }
            for (int i = menor; i < maior; i++){
                if (i % 2 == 1){
                soma = soma + i;
                System.out.println("entrou");
                }
            }
        }
        return soma;
    }
    public double exercicio12(){
        int count = 0;
        double soma = 0;
        double num;
        double media = 0;
        for(int i = 0; i < 100; i++){
            num = Teclado.leDouble();
            if (num < 0){
                media = soma / count;
                break;
            }
        }
        return media;
    }
    public void exercicio13(int x){
        int fatorial = 1;
        for(int i = 2; i <= x; i++){
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
    }
    public boolean exercicio14(int x){
        for(int i = 2; i < (x / 2); i++){
            if(x % i == 0){
                return true;
            }
        }
        return false;
    }
    public void exercicio15(int x){
        int soma = 0;
        for(int i = 0; i <= x; i++){
            boolean primo = true;
            for(int j = 2; j < (x / 2); j++){
                if(i % j == 0){
                primo = false;
                }
            }
            if (primo == true){
                soma +=i;
                System.out.println(i);
            }
        }
        System.out.println("A soma eh"+soma);
    }
}


