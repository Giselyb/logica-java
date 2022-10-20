/* @author Gisely*/
import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    
    Scanner x = new Scanner (System.in);
    Scanner y = new Scanner (System.in);
    
    private ArrayList<Aluno>aluno = new ArrayList();
    private ArrayList<Professor>professor = new ArrayList();
    private ArrayList<Tec>tec = new ArrayList();
    
    public Menu(){
        
        int op = 0;
        
        do{
            System.out.println("--------------MENU--------------");
            System.out.println("[1] Cadastrar pessoas ");
            System.out.println("[2] Exibir todas as pessoas cadastradas ");
            System.out.println("[3] Exibir somente os alunos cadastrados ");
            System.out.println("[4] Exibir salário de um determinado funcionário ");
            System.out.println("[5] Remover pessoas ");
            System.out.println("[6] Sair ");
            op = y.nextInt();
            
            if(op == 1){
                
                System.out.println("O que deseja cadastras? ");
                System.out.println("[1] Professor ");
                System.out.println("[2] Aluno ");
                System.out.println("[3] Tec. Administrativo ");
                int resp = y.nextInt();
                
                if (resp == 1){
                    professor.add(new Professor());
                    System.out.println("Um novo professor foi cadastrado! ");
                }
                
                if (resp == 2){
                    aluno.add(new Aluno());
                    System.out.println("Um novo aluno foi cadastrado! ");
                }
                
                if (resp == 3){
                    tec.add(new Tec());
                    System.out.println("Um novo tec. administrativo foi cadastrado! ");
                    
                }
            }
            
            if (op == 2){
                
                System.out.println("-----------PESSOAS-----------");
                for(int i = 0; i<professor.size(); i++){
                    professor.get(i).exibir();
                }
                for(int y = 0; y<aluno.size(); y++){
                    aluno.get(y).exibir();
                }
                for(int x = 0; x<tec.size(); x++){
                    tec.get(x).exibir();
                }  
            }
            
            if (op == 3){
                System.out.println("----------ALUNOS------------");
                for(int y = 0; y<aluno.size(); y++){
                    aluno.get(y).exibir();
                }    
            }
            
            if (op == 4){
                System.out.println("De quem deseja olhar o salario? ");
                System.out.println("[1] Professor ");
                System.out.println("[2] Tec. Administartivo ");
                int resp1 = y.nextInt();
                
                if (resp1 == 1){
                    System.out.println("Informe o nome da pessoa: ");
                    String nome1 = x.nextLine();
                    
                    for (int i = 0; i<professor.size(); i++){
                        if (nome1.equalsIgnoreCase(professor.get(i).getNome())){
                            professor.get(i).calcularSalario();
                        }else
                            System.out.println("Pessoa nao encontrada!");
                    }
                }
                
                if (resp1 == 2){
                    System.out.println("Informe o nome da pessoa: ");
                    String nome2 = x.nextLine();
                    
                    for (int x = 0; x<tec.size(); x++){
                        if (nome2.equalsIgnoreCase(tec.get(x).getNome())){
                            tec.get(x).calcularSalario();
                        }else
                            System.out.println("Pessoa nao encontrada: ");
                    } 
                }
            }
            
            if (op == 5){
                System.out.println("Quem deseja remover? ");
                System.out.println("[1] Professor ");
                System.out.println("[2] Aluno ");
                System.out.println("[3] Tec Administartivo ");
                int resp2 = y.nextInt();
                
                if (resp2 == 1){
                    System.out.println("Informe o nome da pessoa: ");
                    String nome3 = x.nextLine();
                    
                    for(int i = 0; i<professor.size(); i++){
                        if (nome3.equalsIgnoreCase(professor.get(i).getNome())){
                            professor.remove(i);
                            System.out.println("Pessoa removida! ");
                        }else
                            System.out.println("Pessoa nao encontrada! ");
                    }
                }
                
                if (resp2 == 2){
                    System.out.println("Informe o nome da pessoa: ");
                    String nome4 = x.nextLine();
                    
                    for(int i = 0; i<aluno.size(); i++){
                        if (nome4.equalsIgnoreCase(aluno.get(i).getNome())){
                            aluno.remove(i);
                            System.out.println("Pessoa removida! ");
                        }else
                            System.out.println("Pessoa nao encontrada! ");
                    }
                }
                
                if (resp2 == 3){
                    System.out.println("Informe o nome da pessoa: ");
                    String nome5 = x.nextLine();
                    
                    for(int i = 0; i<tec.size(); i++){
                        if (nome5.equalsIgnoreCase(tec.get(i).getNome())){
                            tec.remove(i);
                            System.out.println("Pessoa removida! ");
                        }else
                            System.out.println("Pessoa nao encontrada! ");
                    }
                }
            }
            
            if (op == 6){
                break;
            }
        }
        while (op != 0);
    }
}
