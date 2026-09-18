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
        int continuarAcao = 0;
        int quantidadeCompras = 0;

        System.out.println("Bem vindo ao sistema de Registro de pedidos!");
        System.out.println("Deseja começar a registrar os pedidos dos clientes? 1 - sim 2- não");
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

                do {
                    System.out.println("Deseja cadastrar outro pedido?\n1 - Sim\n2 - Não\n");
                    continuarAcao = input.nextInt();
                    if (continuarAcao != 1 && continuarAcao != 2) {
                        System.out.println("Opção inválida. Tente novamente");
                    }
                } while (continuarAcao != 1 && continuarAcao != 2);
            } while (continuarAcao == 1);


            System.out.println("RELATÓRIO DE COMPRAS");
            System.out.println("\nQuantidade de pedidos: " + quantidadeCompras);
            System.out.println("Valor total vendido: R$" + totalRelatorio);
            System.out.println("Maior compra: R$" + maiorValor);
            System.out.println("Menor compra: R$" + menorValor);

        }
    }
}