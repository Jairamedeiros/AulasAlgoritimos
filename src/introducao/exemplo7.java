

package introducao;

import java.util.Scanner;

public class exemplo7 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in); 
        System.out.println("Informe a nota 01");
        float n1 = entrada.nextFloat();
        System.out.println("Informe a nota 02");
        float n2 = entrada.nextFloat();
        System.out.println("Informe a nota 03");
        float n3 = entrada.nextFloat();
        System.out.println("Informe a nota 04");
        float n4 = entrada.nextFloat();
        float m = (n1 + n2 + n3 + n4)/4;
        System.out.println("Média final" + m);
         
              
        
    }
                
}
