
package introducao;

import java.util.Scanner;


public class Exemplo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro ");
        
        int inteiro = entrada.nextInt();
        System.out.println("Número inteiro" + inteiro);
        
        
        System.out.println("Digite um número decimal ");
        
        float decimal = entrada.nextFloat();
        System.out.println("Número decimal " + decimal);        
                
        System.out.println("Digite uma letra:");        
        char caractere = entrada.next().charAt(0);
        
        System.out.println("Caractere:" + caractere);
        
        System.out.println("Informe seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.println("Seu nome é " + nome);
                            
                    
                      
    }
    
     
    
}


