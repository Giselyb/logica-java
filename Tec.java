/* @author Gisely*/
import java.util.Scanner;
public class Tec extends Cadastro {
    
    Scanner x = new Scanner (System.in);
    
    private String setor;
    private float salario = 160;
    private int dias;
    
    public Tec(){
        
        super();
        System.out.println("Informe o seu setor: ");
        setor =x.nextLine();
    }
    
    public void exibir(){
        super.exibir();
        System.out.println("Setor: "+setor);
    }
    
    public void calcularSalario(){
        System.out.println("Informe a quantidade de dias que voce trabalha: ");
        dias = x.nextInt();
        
        salario = salario*dias;
        
        System.out.println("Salario: "+salario);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
}
