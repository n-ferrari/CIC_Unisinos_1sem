import java.lang.Math;

public class Festa {
    private Pessoa[] pessoa;

    public Festa(int quantPessoas) {
        this.pessoa = new Pessoa[quantPessoas];
    }

    public Pessoa[] getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa[] pessoa) {
        this.pessoa = pessoa;
    }

    public void imprimePessoasFesta() {
        for (int i = 0; i < pessoa.length; i++) {
            pessoa[i].toString();
        }
    }

    public boolean entraPessoa(Pessoa p) {
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i] == null) {
                pessoa[i] = p;
                return true;
            }
        }
        return false;
    }

    public Pessoa[] procuraMulheres() {
        Pessoa[] mulheres = new Pessoa[pessoa.length];
        int j = 0;
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i] instanceof Mulher) {
                mulheres[j] = pessoa[i];
                j++;
            }
        }
        return mulheres;
    }

    public void imprimeTimeHomens() {
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i] instanceof Homem) {
                System.out.println(pessoa[i].getNome() + " " + ((Homem) pessoa[i]).getTime());
            }
        }
    }

    public void achaParPerfeito() {
        Pessoa[] mulheres = procuraMulheres();
        char genero = 'A';
        char generoM = 'a';
        int k = 0;

        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i] instanceof Homem && pessoa != null) {

                k++;
                for (int j = 0; j < mulheres.length; j++) {
                    if (mulheres[j] != null) {

                        if (((Mulher) mulheres[j]).getCorCabelo().equals(((Homem) pessoa[i]).getCorCabeloPreferencia())) {
                            System.out.print("Mulheres que se encaixam no perfil do Homem " + k + ": ");
                            int anosDiferenca = Math.abs(mulheres[j].getIdade() - pessoa[i].getIdade());
                            if (mulheres[j].getIdade() > pessoa[i].getIdade()) {
                                genero = 'A';
                                generoM = 'a';
                            } else {
                                genero = 'E';
                                generoM = 'o';
                            }

                            System.out.print(mulheres[j].getNome() + ", " + anosDiferenca + " anos de diferença.");
                            if (anosDiferenca != 0) {
                                System.out.print(" (EL" + genero + " é mais velh" + generoM + ")");
                            }
                            System.out.println();


                        }
                    }
                }
            }
        }
    }
}
