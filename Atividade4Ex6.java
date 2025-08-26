package com.mycompany.atividade4ex6;

import java.util.Scanner;
public class Atividade4Ex6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nomeAluno;
        int idade;
        int nota1;
        int nota2;
        int nota3;
        int nota4;

        System.out.println("Insira o nome do aluno: ");
        nomeAluno = ler.nextLine();

        System.out.println("Insira a idade do aluno: ");
        idade = ler.nextInt();
        
        System.out.println("Insira a primeira nota: ");
        nota1 = ler.nextInt();
        
        System.out.println("Insira a segunda nota: ");
        nota2 = ler.nextInt();
        
        System.out.println("Insira a terceira nota: ");
        nota3 = ler.nextInt();
        
        System.out.println("Insira a quarta nota: ");
        nota4 = ler.nextInt();

        System.out.println(nomeAluno);
        System.out.printIn(idade);
        
        System.out.println("A média das notas é: ");
        System.out.println((nota1 + nota2 + nota3 + nota4) / 4);
    }
}
