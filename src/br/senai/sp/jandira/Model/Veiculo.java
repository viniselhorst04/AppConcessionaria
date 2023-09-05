package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Veiculo {

    String modelo, marca, cor, placa, combustivel;
    double preco;
    int ano;


    /** Instanciar Scanner */
    Scanner teclado = new Scanner(System.in);
    public void CadastrarVeiculo(){

        System.out.println("------- ------- ------- ------- ------- -------");
        System.out.println("-------------- Cadastrar Veiculos -------------");
        System.out.print("\nModelo do Veiculo: ");
        modelo = teclado.nextLine();
        System.out.print("\nMarca do Veiculo: ");
        marca = teclado.nextLine();
        System.out.print("\nCor do Veiculo: ");
        cor = teclado.nextLine();
        System.out.print("\nPlaca do Veiculo: ");
        placa = teclado.nextLine();
        System.out.print("\nTipo de Combustível: ");
        combustivel = teclado.nextLine();
        System.out.print("\nPreço do Veiculo: ");
        preco = teclado.nextDouble();
        System.out.print("\nAno do Veiculo: ");
        ano = teclado.nextInt();
        teclado.nextLine();
        System.out.println("------------ Cadastro Finalizado -----------");
        System.out.println("---------- ----------- ---------- ----------");

        teclado.close();

    }
}
