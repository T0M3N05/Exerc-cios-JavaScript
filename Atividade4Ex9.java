package com.mycompany.atividade4ex9;

import java.util.Scanner;
public class Atividade4Ex9 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        
       int tempF;
       double tempC;
       
        System.out.println("Insira a temperatura em graus Fahrenheit: ");
        tempF = ler.nextInt();
        
        tempC = (tempF - 32) / 1.8;
        
        System.out.println("A temperatura em graus Celcius seria:" + tempC);
    }
}
