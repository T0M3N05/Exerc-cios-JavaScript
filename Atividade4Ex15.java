package com.mycompany.atividade4ex15;

import java.util.Scanner;
public class Atividade4Ex15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        int raio;
        double  volume;
        double pi = 3.14;
        int raio3;
        
        System.out.println("Insira o raio da esfera: ");
        raio = ler.nextInt();
        
        raio3 = raio * raio * raio;
        
        volume = (4/3) * pi * raio3;
        
        System.out.println("O volume da esfera é de: " + volume);
    
    }
}
