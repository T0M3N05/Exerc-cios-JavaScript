package com.mycompany.atividade4ex5;

import java.util.Scanner;
public class Atividade4Ex5 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
    
    int num1;
    int num2;
    int num3;
    
        System.out.println("Insira o primeiro número: ");
        num1 = ler.nextInt();
        
        System.out.println("Insira o segundo número: ");
        num2 = ler.nextInt();
        
        System.out.println("Insira o terceiro número: ");
        num3 = ler.nextInt();
        
        System.out.println("O resultado da expressão (a+b)*c é: ");
        System.out.println((num1 + num2) * num3);
    }
}
