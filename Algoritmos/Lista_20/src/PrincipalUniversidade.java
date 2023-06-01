

public class PrincipalUniversidade {
    public static void main(String[] args) {

        int quantUniversidades = Teclado.leInt("Digite a quantidade de universidades ");
        Universidade[] universidade = new Universidade[quantUniversidades];

        for (int i = 0; i < quantUniversidades; i++) {
            int tipoUni = 0;
            while (tipoUni != 1 && tipoUni != 2) {
                tipoUni = Teclado.leInt("Digite 1 para universidade publica ou 2 para particular");
            }
            if (tipoUni == 1) {
                Publica publica = new Publica(Teclado.leString("Nome: "), Teclado.leInt("Quantidade de alunos"), Teclado.leInt("Quantidade de professores"), Teclado.leString("Estado: "), Teclado.leString("Cidade: "));
                universidade[i] = publica;
            }
            if (tipoUni == 2) {
                Particular particular = new Particular(Teclado.leString("Nome: "), Teclado.leInt("Quantidade de alunos"), Teclado.leInt("Quantidade de professores"), Teclado.leDouble("Mensalidade"));
                universidade[i] = particular;
            }
        }
        MEC mec = new MEC();
        mec.imprimeUniversidades(universidade);
        mec.maisCara(universidade);
        mec.universidadesDoSul(universidade);



    }
}
