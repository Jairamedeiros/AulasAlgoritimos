/*
 10. Faça um Programa que pergunte em que turno você estuda. Peça para 
digitar Mmatutino ou V-Vespertino ou N- Noturno. Imprima a mensagem 
"Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. 
 */
package lista3;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o turno que vc estuda: \n(M) Matutino \n(V) Vespertino \n(N) Noturno\nOpção: ");
        String turno = sc.next();
        
if (turno.equalsIgnoreCase ("m")){
        System.out.println("Bom dia!");   
                
}else if (turno.equalsIgnoreCase ("t")){
        System.out.println("Boa tarde!");
           
}else if  (turno.equalsIgnoreCase ("n")){
        System.out.println("Boa noite!"); 
        
}else
        System.out.println("Valor inválido!");
           
}   
    
}
