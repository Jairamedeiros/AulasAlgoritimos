
package repeticaofor;

/* Encontrando número fatorial*/

import java.util.Scanner;


public class ex7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: "  );
        
        
        int f=1, n = sc.nextInt();
        
        

        for (int i=n;i>1; i--){
            
            f*=i;
            
            
        }

          
        System.out.println(n + "! = " +f);
    
    } 

}

    
    
    
    
