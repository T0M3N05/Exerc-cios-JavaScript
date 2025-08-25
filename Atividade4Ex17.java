package com.mycompany.atividade4ex17;

import java.util.Scanner;
public class Atividade4Ex17 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nomeFuncionario;
        String cargoFuncionario;
        double salarioBase;
        double valorHE;
        double valorDesconto;
        double valorINSS;
        
        double salarioBruto;
        double salarioLiquido;
        
        System.out.println("Insira o nome do funcionário: ");
        nomeFuncionario = ler.nextLine();
        
        System.out.println("Insira o cargo do funcionário: ");
        cargoFuncionario = ler.nextLine();
        
        System.out.println("Insira o salário base do funcionário: ");
        salarioBase = ler.nextDouble();
        
        System.out.println("Insira o valor das horas extras: ");
        valorHE = ler.nextDouble();
        
        System.out.println("Insira o valor do desconto: ");
        valorDesconto = ler.nextDouble();
        
        System.out.println("Insira o valor do INSS: ");
        valorINSS = ler.nextDouble();
        
        salarioBruto = salarioBase + valorHE;
        salarioLiquido = salarioBruto - valorDesconto - valorINSS;
        
        System.out.println("=== HOLERITE ===");
        System.out.println("Nome: " + nomeFuncionario);
        System.out.println("Cargo: " + cargoFuncionario);
        System.out.println("Salário: R$ " + salarioBase);
        System.out.println("Horas Extras: R$ " + valorHE);
        System.out.println("Descontos: R$ " + valorDesconto);
        System.out.println("INSS: R$ " + valorINSS);
        
        System.out.println("------------------");
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }
}
