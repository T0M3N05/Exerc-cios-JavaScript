package com.mycompany.atividade4ex13;

import java.util.Scanner;
public class Atividade4Ex13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double real;
        double dolar;
        double taxaCambio;
        
        System.out.println("Insira a quantia em REAL para ser convertida em DOLAR: ");
        real = ler.nextDouble();
        
        System.out.println("Insira a taxa de cambio: ");
        taxaCambio = ler.nextDouble();
        
        dolar = real / taxaCambio;
        
        System.out.println("A quantia equivale a: " + dolar + " dolares");
    }
}
