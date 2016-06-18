
package repeticaofor;


// Achar o némero fatorado

import java.util.Scanner;

public class ex8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: "  );
        
        
        int f=1, n = sc.nextInt();
        
        String p = "";
        

        for (int i=n;i>0; i--){
            
            if (i ==1){
                p +=i;
                
            }else {
                p += i +"x";
                
                             
            }
            
                        
            f*=i;
            
            
        }

          
        System.out.println( n + "! = "  +p+ "= " + f);
    
    } 

}

    
    
    
    
    
    
    
    
    
    
    
    
