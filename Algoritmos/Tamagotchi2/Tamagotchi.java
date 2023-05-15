/**
 *Trabalho Grau A Unisinos Algoritmos e Programacao I -2023: Tamagotchi
 *
 * @Nathalia Carpenedo Ferrari
 */
public class Tamagotchi
{
    // variáveis de instância
    private String nome;
    private int idade = 0;
    private int peso = 1;
    private boolean vivo = true;
    private int qntAcordado = 0;

    /**
     * Construtor de objetos da classe Tamagotchi
     */
    public Tamagotchi(String nome)
    {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String Nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getPeso(){
        return peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public boolean estaVivo(){
        return vivo;
    }
    /**
     * Método dormir. Este método aumenta 1 dia de vida e verifica se ele atingiu o tempo máximo de vida.
     */
    private void dormir()
    {
        this.idade = idade + 1;
        if (this.idade == 15){
            this.vivo = false;
        }
    }
    /**
     * Método come pouco. Este método diminui 1 kg do peso.
     */
    private void comePouco()
    {
        this.peso = peso + 1;
        conferePeso();
    }
    /**
     * Método come muito. Este método aumenta 5 kg do peso e chama o método dormir.
     */
    private void comeMuito()
    {
        this.peso = peso + 5;
        conferePeso();
        dormir();
    }
    /**
     * Método não come. Este método diminui 2 kg do peso.
     */
    private void naoCome()
    {
        this.peso = peso - 2;
        conferePeso();
    }
    /**
     * Método corre 10 min. Este método diminui 4 kg do peso e o Tamagotchi come muito.
     */
    private void corre()
    {
        this.peso = peso - 4;
        conferePeso();
        comeMuito();
    }
    /**
     * Método caminha. Este método diminui 1kg do peso e o Tamagotchi fica com fome.
     */
    private void caminha()
    {
        this.peso = peso - 1;
        conferePeso();
        if (this.vivo){
            mostraEstado();
            comFome(); 
        }
    }
    /**
     * Método confere peso. Este método confere se o Tamagotchi continua vivo por causa do seu peso.
     */
    private void conferePeso()
    {
        if (this.peso <= 0)
        {
            System.out.println("\nSeu tamagotchi morreu de fome!");
            this.vivo = false;
        }
        if (this.peso > 20)
        {
            System.out.println("\nSeu tamagotchi explodiu!");
            this.vivo = false;
        }
    }
    /**
     * Método com fome. Este método mostra as opções para quando o Tamagotchi estiver com fome;
     */
    public void comFome()
    {
        System.out.println("\nSeu tamagotchi está com fome, escolha 1 opção:");
        System.out.println("         Au");
        System.out.println("        Au");
        System.out.println("       Au");
        System.out.println("(___()'`;");
        System.out.println("/,    /°");
        System.out.println("\\\\\"--\\\\");
        System.out.println("1. Comer muito");
        System.out.println("2. Comer pouco");
        System.out.println("3. Não comer");
        System.out.println("4. Sair");
            
        int opcao = Teclado.leInt();
        if (opcao == 1){
            comeMuito();
        }
        if (opcao == 2){
            comePouco();
        }    
        if (opcao == 3){
            naoCome();    
        }
        if (opcao == 4){
            this.vivo = false;
        }  
    }
    /**
     * Método entediado. Este método mostra as opções para quando o Tamagotchi estiver entediado.
     */
    public void entediado()
    {
        System.out.println("\nSeu tamagotchi está entediado, escolha 1 opção:");
        System.out.println("         Gr");
        System.out.println("        Gr");
        System.out.println("       Gr");
        System.out.println("(___()'`;");
        System.out.println("/,    /°");
        System.out.println("\\\\\"--\\\\");
        System.out.println("1. Correr 10 min");
        System.out.println("2. Caminhar 10 min");
        System.out.println("3. Sair");
        
        int opcao = Teclado.leInt();
        
        if (opcao == 1){
            corre();
        }
        if (opcao == 2){
            caminha();
        }
        if (opcao == 3){
            this.vivo = false;
        }
    }
    /**
     * Método com sono. Este método mostra as opções para quando o Tamagotchi estiver com sono.
     */
    public void comSono()
    {
        System.out.println("\nSeu tamagotchi está com sono, escolha 1 opção:");
        System.out.println("         Z");
        System.out.println("        Z");
        System.out.println("       Z");
        System.out.println("(___()-`;");
        System.out.println("/,    /`");
        System.out.println("\\\\\"--\\\\");
        System.out.println("1: Dormir");
        System.out.println("2: Permanecer acordado");
        System.out.println("3. Sair");
            
        int opcao = Teclado.leInt();
        if (opcao == 1){
            dormir();  
        }
        if (opcao == 2){
            this.qntAcordado = this.qntAcordado + 1;
            if (this.qntAcordado > 5){
                this.qntAcordado = 0;
                dormir();
            }    
        }
        if (opcao == 3){
            this.vivo = false;
        }  
    }
    /**
     * Método estado do Tamagotchi. Mostra o estado atual dele.
     */
    public void mostraEstado()
    {
        String dia;
        if (idade == 1){
            dia = "dia";
        }
        else{
            dia = "dias";
        }
        System.out.printf("\n\n\t Nome: %s \n", nome);
        System.out.printf("\t Idade: %d %s.\n", idade, dia);
        System.out.printf("\t Peso: %d kg.\n\n", peso);
    }
}