package com.mycompany.atividade4ex3;

import java.util.Scanner;
public class Atividade4Ex3 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        
       int num1;
       int num2;
       
        System.out.println("Insira o primeiro numero inteiro: ");
        num1 = ler.nextInt();
        
        System.out.println("Insira o segundo numero inteiro: ");
        num2 = ler.nextInt();
        
        System.out.println("O resultado da divisão é: ");
        System.out.println(num1 / num2);
    }
}
