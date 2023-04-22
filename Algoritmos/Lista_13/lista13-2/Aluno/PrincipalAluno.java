
/**
 * Write a description of class PrincipalAluno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrincipalAluno
{
    public static void main(String args[])
    {
        Aluno aluno1 = new Aluno("Petronio", 58487, 1.6, 7.1);
        Aluno aluno2 = new Aluno("Javonilda", 1254870, 9.5, 9.3);
        Aluno aluno3 = new Aluno("Joselpha", 4487521, 7.7, 2.3);
        
        aluno1.grauC();
        aluno2.grauC();
        aluno3.grauC();
    }
}
