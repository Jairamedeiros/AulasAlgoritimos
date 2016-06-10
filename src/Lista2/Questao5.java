/*
Faça um Programa que pergunte quanto você ganha por hora e o número 
de horas trabalhadas no mês. Calcule e mostre o total do seu salário 
no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.
e. calcule os descontos e o salário líquido, conforme a tabela abaixo: 
+ Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) :
R$ = Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.
 */
package Lista2;

import java.util.Scanner;

public class Questao5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o valor da sua hora trabalhada: ");
        float n1 = sc.nextFloat();
        System.out.print("Quantas horas trabalhadas no mês: ");
        Float n2 = sc.nextFloat();
        
        Float v = n1*n2;
        
        float i = (v/100)*11;
        float n = (v/100)*8;
        float s = (v/100)*5;
        float l = v- (i+n+s);
        
               
       System.out.println("Salário bruto mês = " + v);
       System.out.println("Desconto Imposto de Renda 11% = " + i);
       System.out.println("Desconto INSS 8% = " + n); 
       System.out.println("Desconto Sindicato 5% = " + s); 
       System.out.println("Salário líquido = " + l);
       
       
    
    
    
    
    
    }
    
    
}
