
package repeticaofor;

import java.util.Scanner;


public class ex4 {
    
    
    
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero=0,soma=0;
       
    for (int i = 0; i<=5; i++ ){
    
        System.out.print("Digite o número: " + i + ": " );
        
        
        numero = sc.nextInt();
        
        
        soma  += numero;
        
        
        System.out.print("Soma total = " + soma);
                
        
    
    
    
    }
    
       }
    
}
