
package repeticaofor;

import java.util.Scanner;
/* Tabuada de qualquer número*/

public class ex6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: "  );

        int n = sc.nextInt();

        for (int i=0; i<10; i++){

            System.out.println(n  + "x" + i + "=" + (n*i));

        }
    
    } 

}
