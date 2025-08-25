package com.mycompany.aividade4ex1;

import java.util.Scanner;
public class Aividade4Ex1 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        
       int num1;
       int num2;
       
        System.out.println("Digite o primeiro numero inteiro: ");
        num1 = ler.nextInt();
        
        System.out.println("Digite o segundo numero inteiro: ");
        num2 = ler.nextInt();
        
        System.out.println("A soma dos dois numeros inteiros é: ");
        System.out.println(num1 + num2);
    }
}
