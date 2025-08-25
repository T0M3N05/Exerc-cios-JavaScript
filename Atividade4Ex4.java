package com.mycompany.atividade4ex4;

import java.util.Scanner;
public class Atividade4Ex4 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       int num1;
       int num2;
       int resto;
       
        System.out.println("Insira o primeiro número: ");
        num1 = ler.nextInt();
        
        System.out.println("Insira o primeiro número: ");
        num2 = ler.nextInt();
        
        resto = num1 % num2;
       
        System.out.println("O resto da divisão de " + num1 + "por" + num2 + "é: " + resto);

    }
}
