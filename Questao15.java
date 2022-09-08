/*Faça um programa que peça os três lados de um triângulo. O progrma deverá 
infromar se os valores podem ser um triângulo. Indique, caso os lados formem um 
triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
Dica:
3 lados formam um triâgulo quando a soma de quaisquer dois lados for maior que 
o terceiro;
triângulo equilátero: dois lados iguais;
triângulo isósceles: quasquer dois lados iguais;
triângulo escaleno: 3 lados diferentes.*/

import java.util.Scanner;
public class Questao15 {
    public static void main (String [] args){
        Scanner x = new Scanner (System.in);
        
        int a, b, c;
        
        System.out.println("Digite o valor do primeiro lado do triângulo:");
        a = x.nextInt();
        System.out.println("Digite o valor do segundo lado do triângulo:");
        b = x.nextInt();
        System.out.println("Digite o valor do terceiro lado do triângulo:");
        c = x.nextInt();
        
        if (a + b < c || a + c < b || b + c < a){
            System.out.println("Não é um triângulo! ");
        
        }else if (a == b && a == c){
            System.out.println("Equilátero! ");
        
        }else if (a == b || a == c || b == c){
            System.out.println("Isósceles! ");
        
        }else
            System.out.println("Escaleno! ");
    }
    
}
