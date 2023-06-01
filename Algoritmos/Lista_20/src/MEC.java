

public class MEC {

    public void imprimeUniversidades(Universidade[] universidade) {
        for (int i = 0; i < universidade.length; i++) {
            if (universidade[i] instanceof Particular) {
                System.out.println("Universidade Particular");
                System.out.println(((Particular) universidade[i]).toString());
                System.out.println();

            }
            if (universidade[i] instanceof Publica) {
                System.out.println("Universidade Publica");
                System.out.println(((Publica) universidade[i]).toString());
                System.out.println();
            }
        }
    }

    public void maisCara(Universidade[] universidade) {
        Universidade maisCara = null;
        double mensalidade = 0;
        for (int i = 0; i < universidade.length; i++) {
            if (universidade[i] instanceof Particular) {
                if (((Particular) universidade[i]).getMensalidade() > mensalidade) ;
                {
                    mensalidade = ((Particular) universidade[i]).getMensalidade();
                    maisCara = universidade[i];
                }
            }
        }
        if (maisCara != null) {
            System.out.println("A universidade mais cara e: \n" + ((Particular) maisCara).toString());
        }
    }

    public void universidadesDoSul(Universidade[] universidade) {
        int temPublica = 0;
        for (int i = 0; i < universidade.length; i++) {
            if (universidade[i] instanceof Publica) {
                if (((Publica) universidade[i]).getEstado().equals("RS") || ((Publica) universidade[i]).getEstado().equals("SC") || ((Publica) universidade[i]).getEstado().equals("PR")) {
                    temPublica++;
                    if(temPublica == 1){
                        System.out.println("\nAs universidades publicas do sul do país são: ");
                    }
                    System.out.println(((Publica) universidade[i]).toString());
                    System.out.println();
                }
            }
        }
    }
}
