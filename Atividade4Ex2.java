package com.mycompany.atividade4ex2;

import java.util.Scanner;
public class Atividade4Ex2 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       int num1;
       int num2;
       int num3;
       
        System.out.println("Insira o primeiro numero inteiro: ");
        num1 = ler.nextInt();
        
        System.out.println("Insira o primeiro numero inteiro: ");
        num2 = ler.nextInt();
        
        System.out.println("Insira o primeiro numero inteiro: ");
        num3 = ler.nextInt();
       
        System.out.println("O produto dos três números inteiros é: ");
        System.out.println((num1 * num2 * num3));
    }
}
