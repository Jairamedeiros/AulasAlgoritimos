/*
 8. Faça um programa que leia 5 números e informe a soma e a média dos números.

 */
package Lista5;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Inorme 5 números: ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    int n4 = sc.nextInt();
    int n5 = sc.nextInt();
    
    
    System.out.println("Soma dos 5 números = " + (n1+n2+n3+n4+n5));   
    
    System.out.println("Média dos 5 números = " + (n1+n2+n3+n4+n5)/5); 
    
    
    
    
}
}