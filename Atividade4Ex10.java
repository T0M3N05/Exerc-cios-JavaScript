package com.mycompany.atividade4ex10;

import java.util.Scanner;
public class Atividade4Ex10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int tempC;
        double tempF;
        
        System.out.println("Insira a temperatura em graus Celcius: ");
        tempC = ler.nextInt();
        
        tempF = (tempC * 1.8) + 32;
        
        System.out.println("A temperatura em Fahrenheit seria: " + tempF);
    }
}
