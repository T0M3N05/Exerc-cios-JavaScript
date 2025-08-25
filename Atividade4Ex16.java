package com.mycompany.atividade4ex16;

import java.util.Scanner;
public class Atividade4Ex16 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int metros;
        int centimetros;
        double milimetros;
        
        System.out.println("Insira o comprimento em metros: ");
        metros = ler.nextInt();
        
        centimetros = metros * 100;
        milimetros = metros * 1000;
        
        System.out.println("*** Conversão ***");
        System.out.println("Centímetros: " + centimetros);
        System.out.println("Milímetros: " + milimetros);
    }
}
