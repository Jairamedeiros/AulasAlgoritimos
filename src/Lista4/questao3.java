/*
Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-
Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
 */
package Lista4;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe o dia da semana: \n(1)Domingo \n(2)Segunda \n(3)Terça \n(4)Quartae) \n(5)Quinta \n(6)Sexta \n(7)Sábado\n Opção: ");
    char d = sc.next().charAt(0);
    
    char dia = d;

        
    switch (dia){
        case '1':    
        System.out.println("Domingo");   
        break;
        case '2':    
        System.out.println("Segunda");      
        break;
        case '3':    
        System.out.println("Terça");  
        break;
        case '4':    
        System.out.println("Quarta");  
        break;    
        case '5':    
        System.out.println("Quinta");      
        break;    
        case '6':    
        System.out.println("Sexta");     
        break;
        case '7':    
        System.out.println("Sábado");   
        break;    
        default:
        System.out.println("Valor inválido");        
                
                
            

}
    }
}