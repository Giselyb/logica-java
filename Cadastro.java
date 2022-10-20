/* @author Gisely */
import java.util.Scanner;
public abstract class Cadastro {
    
    Scanner x = new Scanner (System.in);
    
    private String nome, cpf, endereco;
    private int dias;
    
    public Cadastro(){
        
        System.out.println("Digite seu nome: ");
        nome = x.nextLine ();
        System.out.println("Digite seu CPF: ");
        cpf = x.nextLine();
        System.out.println("Digite seu endereco:  ");
        endereco = x.nextLine();
    }
    
    public void exibir(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Endereco: "+endereco);
    }
    
    public void atualizarEndereco(){
        System.out.println("Informe o novo endereco: ");
        endereco = x.nextLine();
        System.out.println("Endereco atualizado!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
