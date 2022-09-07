/*As organizaçoes Tabajara resolveram dar um aumento de salario aos seus 
colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes]
*Faça um programa que recebe um salario de um colaborador e o reajuste segundo 
o seguinte critério, baseado no salário atual:
*Salário de até 280 (incluindo) aumento 20%;
*Salário entre 280 e 700: aumento de 15 %;
*Salário entre 700 e 1500: aumento de 10%;
*Salário de 1500 em diante: aumento de 5%;
Após o aumento realizado, informe:
*o salário antes do reajuste;
*o percentual de aumento aplicado;
*o valor do aumento;
*o novo salário, após o aumento.*/

import java.util.Scanner;
public class Questao11 {
    public static void main (String [] args){
        Scanner x = new Scanner (System.in);
        
        float salario, porcentagem, aumento, novo_salario;
        
        System.out.println("Digite o valor do seu salario:");
        salario = x.nextFloat();
        
        if (salario <= 280){
            porcentagem = 20/100;
            novo_salario = salario + (salario*20)/100;
            aumento = novo_salario - salario;
            
            System.out.println("Seu salario antes do reajuste: "+salario);
            System.out.println("O percentual aplicado foi de: "+porcentagem);
            System.out.println("O valor do aumento foi de: "+aumento);
            System.out.println("Seu novo salario, apos o reajuste: "+novo_salario);
        
        }else if (salario >= 280 || salario <= 700){
            porcentagem = 15/100;
            novo_salario = salario + (salario*15)/100;
            aumento = novo_salario - salario;
            
            System.out.println("Seu salario antes do reajuste: "+salario);
            System.out.println("O percentual aplicado foi de: "+porcentagem);
            System.out.println("O valor do aumento foi de: "+aumento);
            System.out.println("Seu novo salario, apos o reajuste: "+novo_salario);
        
        }else if (salario >= 700 || salario <= 1500){
            porcentagem = 10/100;
            novo_salario = salario + (salario*10)/100;
            aumento = novo_salario - salario;
            
            System.out.println("Seu salario antes do reajuste: "+salario);
            System.out.println("O percentual aplicado foi de: "+porcentagem);
            System.out.println("O valor do aumento foi de: "+aumento);
            System.out.println("Seu novo salario, apos o reajuste: "+novo_salario);
        
        }else if (salario >= 1500){
            porcentagem = 5/100;
            novo_salario = salario + (salario*5)/100;
            aumento = novo_salario - salario;
            
            System.out.println("Seu salario antes do reajuste: "+salario);
            System.out.println("O percentual aplicado foi de: "+porcentagem);
            System.out.println("O valor do aumento foi de: "+aumento);
            System.out.println("Seu novo salario, apos o reajuste: "+novo_salario);
        }
    }
    
}
