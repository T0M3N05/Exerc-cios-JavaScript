package com.mycompany.atividade4ex14;

import java.util.Scanner;
public class Atividade4Ex14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int distancia;
        int tempo;
        double velocidadeMedia;
        
        System.out.println("Insira a distancia percorrida: ");
        distancia = ler.nextInt();
        
        System.out.println("Insira o tempo gasto: ");
        tempo = ler.nextInt();
        
        velocidadeMedia = distancia / tempo;
        
        System.out.println("A velocidade média foi de: " + velocidadeMedia + "Km/h");
    }
}
