
/**
 * Write a description of class PrincipalAluno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrincipalAluno
{
    public static void main(String args[]){
        Aluno aluno1 = new Aluno("Brandamente Brasil", 158528, 5, 9);
        Aluno aluno2 = new Aluno("Radigunda Cercená", 2254879, 8, 2);
        Aluno aluno3 = new Aluno("Vitimado José Araújo", 85994, 7, 1);
        
        aluno1.imprimeInfo();
        aluno2.imprimeInfo();
        aluno3.imprimeInfo();
        
        aluno2.setGrauA(9);
        
        System.out.println("\t- Média final Radigunda: "+aluno2.calculaMediaFinal());
        
        System.out.println("\t- Matricula Vitimado: "+aluno3.getMatricula());
        
        aluno1.setMatricula(1585228);
    }

}