import java.lang.Math;

public class Principal {
    public static void main(String[] args) {
        Festa festa = new Festa(10);

        for (int i = 0; i < 13; i++) {
            String nome;
            int idade;
            char sexo;
            Pessoa pessoa;
            String corCabelo;
            String corCabeloPreferencia;
            String time;

            if (Math.random() < 0.5) {
                sexo = 'F';
                if (Math.random() < 0.5){
                    nome = "Mara";
                    corCabelo = "castanho";
                    idade = 22;
                }else{
                    nome = "Patricia";
                    corCabelo = "loiro";
                    idade = 19;
                }

                pessoa = new Mulher(nome, idade, corCabelo);

            } else {
                sexo = 'M';
                if (Math.random() < 0.5){
                    nome = "Joao";
                    corCabeloPreferencia = "castanho";
                    time = "Inter";
                    idade = 27;
                }else{
                    nome = "Marcos";
                    corCabeloPreferencia = "loiro";
                    time = "Gremio";
                    idade = 18;
                }

                pessoa = new Homem(nome, idade, time, corCabeloPreferencia);
            }
            if (festa.entraPessoa(pessoa)) {
                System.out.println("Pessoa " + pessoa.getNome() + " entrou na festa");
            } else {
                System.out.println("Pessoa " + pessoa.getNome() + " não entrou na festa");
            }


        }
        Pessoa[] mulheres = festa.procuraMulheres();
        for (int i = 0; i < mulheres.length; i++) {
            if (mulheres[i] != null) {
                System.out.println(mulheres[i].toString());
            }
        }
        festa.imprimeTimeHomens();
        festa.achaParPerfeito();
    }
}
