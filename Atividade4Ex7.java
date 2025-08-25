package com.mycompany.atividade4ex7;


import java.util.Scanner;
public class Atividade4Ex7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int ano;
        int idade;
        
        System.out.println("Digite o ano em que você nasceu: ");
        ano = ler.nextInt();
        
        idade = 2025 - ano;
        
        System.out.println("Você tem: " + idade + " anos de idade!");
    }
}
