package com.mycompany.atividade4ex8;

import java.util.Scanner;
public class Atividade4Ex8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int raio;
        int raio2;
        double pi = 3.14;
        
        System.out.println("Insira o raio do circulo: ");
        raio = ler.nextInt();
        
        raio2 = raio * raio; 
        
        System.out.println("A area do circulo é: " + pi * raio2 + " cm quadrados");
        
    }
}
