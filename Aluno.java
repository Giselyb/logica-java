/* @author Gisely*/
import java.util.Scanner;
public class Aluno extends Cadastro {
    
    Scanner x = new Scanner (System.in);
    
    private String matricula;
    
    public Aluno(){
        
        super ();
        System.out.println("Informe a sua matricula: ");
        matricula = x.nextLine();
    }
    
    public void exibir(){
        super.exibir();
        System.out.println("Matricula: "+matricula);   
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
