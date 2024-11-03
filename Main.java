package org.github.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        boolean continuar = true;


        while (continuar) {

            System.out.println("");
            System.out.println("Selecione a operação na qual você quer utilizar: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Encerrar Calculadora");
            System.out.println("");

            System.out.print("\nDigite o número da operação que deseja (1/2/3/4/5): ");
            int escolha = scanner.nextInt();


            if (escolha >= 1 && escolha <= 4) {
                System.out.println("\nDigite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.println("\nDigite o segundo número: ");
                double num2 = scanner.nextDouble();

                switch (escolha) {
                    case 1:
                        System.out.println("\nResultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("\nResultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("\nResultado: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("\nResultado: " + (num1 / num2));
                        } else {
                            System.out.println("\nERRO! Não tem como dividir por 0");
                        }
                        break;
                }
            } else if (escolha == 5) {
                continuar = false;
                System.out.println("\nCalculadora encerrada, Adeus!");
            } else {
                System.out.println("\nOpção Inválida!");
            }
        }
    }
}