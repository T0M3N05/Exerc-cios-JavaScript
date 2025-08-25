package com.mycompany.atividade4ex12;

import java.util.Scanner;
public class Atividade4Ex12 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       int base;
       int altura;
       int area;
       
        System.out.println("Insira o tamanho da base do triângulo:");
        base = ler.nextInt();
        
        System.out.println("Insira o tamanho da altura do triângulo: ");
        altura = ler.nextInt();
        
        area = (base * altura) / 2;
        
        System.out.println("A area do triângulo é de: " + area + "cm quadrados");
    }
}
