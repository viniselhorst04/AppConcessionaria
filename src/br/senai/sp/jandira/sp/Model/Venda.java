package br.senai.sp.jandira.sp.Model;

import java.util.Scanner;

public class Venda {

    Scanner teclado = new Scanner(System.in);

    public boolean realizarVenda(Veiculo objVeiculo, Cliente objCliente) {

        if (objCliente.dinheirodisponivel >= objVeiculo.preco) {

            System.out.println("-------------------- Parabéns -----------------------");
            System.out.println("Olá " + objCliente.name);
            System.out.println("Você acaba de adquirir um " + objVeiculo.modelo);
            System.out.println("No valor de " + objVeiculo.preco);
            System.out.println("-----------------------------------------------------");
            return true;

        } else {

            System.out.println("Vamos Financiar!");
            financiarVeiculo(objVeiculo, objCliente);
            return false;

        }

    }

    public boolean avaliaFormaPagamento() {

        System.out.println("Informe a forma de pagamento:");
        System.out.println("1 - A vista");
        System.out.println("2 - Financiamento");

        int formaPagamento = teclado.nextInt();
        teclado.nextLine();
        if (formaPagamento == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean financiarVeiculo(Veiculo veiculo, Cliente cliente) {


        System.out.println("\n---- Financiamento ----\n");
        System.out.println("O valor de entrada : ");
        double valorEntrada = teclado.nextDouble();
        System.out.println("Quer parcelar em quantas vezes? [até 12x sem juros]");
        int numeroParcelas = teclado.nextInt();
        teclado.nextLine();
        if (valorEntrada <= cliente.dinheirodisponivel && valorEntrada > 0) {
            System.out.println("Beleza Vamos parcelar em " + numeroParcelas + " vezes");
            double valorFinanciamento = veiculo.preco - valorEntrada;
            double valorParcelas = valorFinanciamento / numeroParcelas;
            System.out.println("O valor das parcelas ficou R$" + valorParcelas + "\n");
            double newSaldoCliente = cliente.dinheirodisponivel - valorEntrada;
            System.out.println("O saldo restante do cliente é: R$" + newSaldoCliente);
            return true;
        } else {
            return false;
        }



    }

}