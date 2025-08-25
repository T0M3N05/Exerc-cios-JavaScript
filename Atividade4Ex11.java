package com.mycompany.atividade4ex11;

import java.util.Scanner;
public class Atividade4Ex11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Insira um numero inteiro positivo: ");
        num1 = ler.nextInt();
        
        num2 = num1 * num1;
        
        System.out.println("O quadrado do numero infomado seria: " + num2);
    }
}
