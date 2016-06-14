/*
. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela
abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas
não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e
a quantidade de horas trabalhadas no mês.
o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações,
dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a
quantidade de hora é 220.
o Salário Bruto: (5 * 220) : R$ 1100,00
o (-) IR (5%) : R$ 55,00
o (-) INSS ( 10%) : R$ 110,00
o FGTS (11%) : R$ 121,00

o Total de descontos : R$ 165,00
 Salário Liquido : R$ 935,00

 */
package Lista4;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o valor da sua hora trabalhada: ");
        float ht = sc.nextFloat();
        System.out.print("Quantas horas trabalhadas no mês: ");
        Float qh = sc.nextFloat();
        
        Float s = ht*qh;
        
        float a = (s/100)*10; // "a" = desconto INSS
        float b = (s/100)*20; // "b" = desconto 20% IR
        float c = (s/100)*10; // "c" = desconto 10% IR
        float d = (s/100)*10; // "d" = desconto 5% IR
    
    
        
        if (s>2500){
            
        System.out.println("\nDesconto IR: " + b + "\nDesconto INSS: " + a + "\nSalário líquido: " + (s-a-b));
            
                        
        }else if (s<2500){
        System.out.println("\nDesconto IR: " + c + "\nDesconto INSS: " + a + "\nSalário líquido: " + (s-a-c));
            
            
        }else if (s<=1500){
        System.out.println("\nDesconto IR: " + d + "\nDesconto INSS: " + a + "\nSalário líquido: " + (s-a-d));    
              
        }else{
        System.out.println("\nIsento IR, desconto INSS: " + a + "\nSalário líquido: " + (s-a)); 
    
        
}
    }      
}
