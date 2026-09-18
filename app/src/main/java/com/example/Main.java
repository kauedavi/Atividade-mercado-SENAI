package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio;
        String nomeCliente;

        float valorCompra = 0f;
        float totalRelatorio = 0f;
        float maiorValor = 0f;
        float menorValor = 0f;

        int quantidadeCompras = 0;

        System.out.println("Começando algoritmo...");
        System.out.println("Iniciar? 1 - sim 2- não");
        inicio = input.nextInt();

        if (inicio == 1) {
            System.out.println("Qual o nome do cliente?");
            input.nextLine();
            nomeCliente = input.nextLine();

            do {

                do {
                    System.out.print("Qual o valor da compra?\nR$");
                    valorCompra = input.nextFloat();
                    if (valorCompra == 0) {
                        System.out.println("Valor invalido. Coloque outro valor.");

                    }
                    if (valorCompra > maiorValor) {
                        maiorValor = valorCompra;
                    }

                    if (menorValor > valorCompra || menorValor == 0) {
                        menorValor = valorCompra;
                    }
                } while (valorCompra == 0);

                totalRelatorio += valorCompra;

                System.out.println("\nNome do cliente: " + nomeCliente);
                System.out.println("Valor da compra: R$" + valorCompra);
                quantidadeCompras++;

                System.out.println("Deseja cadastrar outro pedido?\n1 - Sim\n2 - Não\n");
                inicio = input.nextInt();

            } while (inicio == 1);

            System.out.println("RELATÓRIO DE COMPRAS");
            System.out.println("\nQuantidade de pedidos: " + quantidadeCompras);
            System.out.println("Valor total vendido: R$" + totalRelatorio);
            System.out.println("Maior compra: R$" + maiorValor);
            System.out.println("Menor compra: R$" + menorValor);

        }
    }
}