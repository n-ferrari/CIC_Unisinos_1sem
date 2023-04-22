
/**
 * Write a description of class Principal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main(String args[])
    {
        Pessoa pessoa1 = new Pessoa("Joaquim",'M', 19, 1.78, 0 , "Rua C, 145");
        Pessoa pessoa2 = new Pessoa("Manuelita", 'F',30, 1.67, 3 , "Rua dos Camelos, 12");
        Pessoa pessoa3 = new Pessoa("Pedro", 'M', 10, 1.91, 1 , "Rua dos Gigantes, 189");
        
        pessoa1.imprimeInformacoes();
        if (pessoa1.getsexo() == 'M')
            if (pessoa1.isFilhoUnico() == true)
                System.out.println("Filho único\n");
            else
                System.out.println("Não é filho único\n");
        else
            if (pessoa1.isFilhoUnico() == true)
                System.out.println("Filha única\n");
            else
                System.out.println("Não é filha única\n");

        pessoa2.imprimeInformacoes();
        if (pessoa2.getsexo() == 'M')
            if (pessoa2.isFilhoUnico() == true)
                System.out.println("Filho único\n");
            else
                System.out.println("Não é filho único\n");
        else
            if (pessoa2.isFilhoUnico() == true)
                System.out.println("Filha única\n");
            else
                System.out.println("Não é filha única\n");
                
        pessoa3.imprimeInformacoes();
                if (pessoa3.getsexo() == 'M')
            if (pessoa3.isFilhoUnico() == true)
                System.out.println("Filho único\n");
            else
                System.out.println("Não é filho único\n");
        else
            if (pessoa3.isFilhoUnico() == true)
                System.out.println("Filha única\n");
            else
                System.out.println("Não é filha única\n");
    }
}
