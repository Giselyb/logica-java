/* @author Gisely */
import java.util.Scanner;
public class Professor extends Cadastro {
    
    Scanner x = new Scanner (System.in);
    
    private String disciplina;
    private float salario = 200;
    private int dias;
    
    public Professor(){
        
        super();
        System.out.println("Informe a sua disciplina: ");
        disciplina = x.nextLine();
    }

    public void exibir(){
        
        super.exibir();
        System.out.println("Disciplina: "+disciplina); 
    }
    
    public void calcularSalario(){
        System.out.println("Informe a quantidade de dias que voce trabalha: ");
        dias = x.nextInt();
        
        salario = salario*dias;
        
        System.out.println("Salario: "+salario);
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
}
