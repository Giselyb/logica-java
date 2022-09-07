/*Faça um programa para cálculo de uma folha de pagamento, sabendo que os
bruto são do Imposto de Renda, que depende do salário
(conforme tabela abaixo) e 10% para o INSS e que o FGTS corresponde a 11% do
Salário Bruto, mas não é descontado (é a empresa que deposita).
O Salário Líquido corresponde a Salário Bruto menos os concedente ao.
O programa deve pedir ao usuário o valor da sua hora e quantidade de horas
trabalhadas no mês.
Desconto do IR:
    Salário Bruto até 900 (inclusive) - isento
    Salário Bruto até 1500 (inclusive) - desconto de 5%
    Salário Bruto até 2500 (inclusive) - desconto de 10%
    Salário Bruto acima de 2500 - desconto de 20%
Imprima na tela as informações, conforme o exemplo abaixo.
No exemplo o valor da hora é 5 e a quantidade de hora é 220.
        Salário Bruto: (5*220): R$ 1100,00
        (-) IR (5%) : R$ 55,00
        (-) INSS ( 10%) : R$ 110,00
        FGTS (11%) : R$ 121,00
        Total de descontos: R$ 5,00
        Salário Líquido: R$ 935,00*/

import java.util.Scanner;
public class Questao12 {
    public static void main (String [] args){
        Scanner x = new Scanner (System.in);
        
        float horas_trabalhadas, horas, salario_bruto, desconto, total_descontos,
                salario_liquido, IR, INSS, FGTS;
        
        System.out.println("Digite quanto você recebe por hora: ");
        horas_trabalhadas = x.nextFloat();
        System.out.println("Digite a quantidade de horas que você trabalhou durante o mês: ");
        horas = x.nextFloat();
        
        salario_bruto = horas * horas_trabalhadas;
        
        if (salario_bruto <= 900){
            desconto = 0;
        
        }else if (salario_bruto <= 1500){
            desconto = 5;
        
        }else if (salario_bruto <= 2500){
            desconto = 10; 
       
        }else 
            desconto = 20;
        
        IR = (salario_bruto *desconto)/100;
        INSS =(salario_bruto *10)/100;
        FGTS =(salario_bruto *11)/100;
        total_descontos = IR + INSS;
        salario_liquido = salario_bruto - total_descontos;
        
        System.out.println("Salário Bruto     : R$ "+salario_bruto);
        System.out.println("(-) IR (5%)       : R$ "+IR);
        System.out.println("(-) INSS (10%)    : R$ "+INSS);
        System.out.println("FGTS (11%)        : R$ "+FGTS);
        System.out.println("Total de descontos: R$ "+total_descontos);
        System.out.println("Salário Líquido   : R$ "+salario_liquido);
 
    }
    
}
