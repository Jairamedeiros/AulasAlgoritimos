/* . As Organizações Tabajara resolveram dar um aumento de salário aos seus
colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.

o Faça um programa que recebe o salário de um colaborador e o reajuste segundo o
seguinte critério, baseado no salário atual:
o Salários até R$ 280,00 (incluindo) : aumento de 20%
o Salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o Salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o Salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado,
informe na tela:
o O salário antes do reajuste;
o O percentual de aumento aplicado;
o O valor do aumento;
o O novo salário, após o aumento.*/

package Lista4;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe seu salário: ");
    float s = sc.nextFloat();
        
    float s1 = s*0.20f;
    float s2 = s*0.15f;
    float s3 = s*0.10f;
    float s4 = s*0.05f;        
                
    if(s>1500){
    System.out.println("Salario antes do reajuste: " +s + 
    "\nAumento salarial de 5%. total do aumento: " + s4 + "\nNovo salário: " + (s4+s));
            
    }else if (s>700){
    System.out.println("Salario antes do reajuste: " +s +
    "\nAumento salarial de 10%. Total do aumento:" + s3 +"\nNovo salário: " + (s3+s));    
           
        
    }else if (s>280){
    System.out.println("Salario antes do reajuste: " +s + 
    "\nAumento salarial de 15%. Total do aumento: " + s2 + "\nNovo salário: " + (s2+s));  
            
    }else
    System.out.println("Salario antes do reajuste: " +s + 
    "\nAumento salarial de 20%. Total do aumento: " + s1 + "\nNovo salário: " + (s1+s));  
    
    
    }
    
    }      
           
             
              
        
              
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
   