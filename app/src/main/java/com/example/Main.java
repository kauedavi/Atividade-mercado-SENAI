package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio;

        String nomeCliente= "";
        String clienteMaior= "";
        String clienteMenor = "";

        float valorCompra = 0f;
        float totalRelatorio = 0f;
        float maiorValor = 0f;
        float menorValor = 0f;

        int quantidadeMedia = 0;
        float mediaTotal = 0f;
        float media = 0f;

        int quantidadeCompras = 0;
        int quantidadeCinquenta = 0;

        System.out.println("Começando algoritmo...");
        System.out.println("Iniciar? 1 - sim 2- não");
        inicio = input.nextInt();

        if (inicio == 1) {

            do {

                System.out.println("Qual o nome do cliente?");
                input.nextLine();
                nomeCliente = input.nextLine();

                do {
                    System.out.print("Qual o valor da compra?\nR$");
                    valorCompra = input.nextFloat();
                    if (valorCompra == 0) {
                        System.out.println("Valor invalido. Coloque outro valor.");

                    }
                    if (valorCompra > maiorValor) {
                        clienteMaior = nomeCliente;
                        maiorValor = valorCompra;
                    }

                    if (valorCompra > 50) {
                        quantidadeCinquenta++;
                    }

                    if (menorValor > valorCompra || menorValor == 0) {
                        clienteMenor = nomeCliente;
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
            System.out.println("Cliente com a maior compra:\n" + " Nome:" + clienteMaior + " \nR$: " + maiorValor);
            System.out.println("Cliente com a maior compra:\n" + " Nome: " + clienteMenor + " \nR$: " + menorValor);
            System.out.println("Média: R$" + media);
            System.out.println("=========== DADOS ADICIONAIS ===========");
            System.out.println("\nQuantidade de pedidos acima de cinquenta: " + quantidadeCinquenta);

        }
    }
}