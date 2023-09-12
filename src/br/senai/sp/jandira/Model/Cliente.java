package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Cliente {

    /** Declarar as Variaveis*/
    String name, email, endereco;
    long telefone, cpf, rg;
    double dinheirodisponivel;

    /** Instanciar Scanner */
    Scanner teclado = new Scanner(System.in);

    public void cadastrarCliente(){

        System.out.println("--------- ---------- --------- ----------");
        System.out.println("------------ Cadastro Cliente -----------\n");
        System.out.print("\nNome do Cliente: ");
        name = teclado.nextLine();
        System.out.print("\nCPF do Cliente: ");
        cpf = teclado.nextLong();
        System.out.print("\nRG do Cliente: ");
        rg = teclado.nextLong();
        System.out.print("\nTelefone do Cliente: ");
        telefone = teclado.nextLong();
        teclado.nextLine();
        System.out.print("\nE-mail do Cliente: ");
        email = teclado.nextLine();
        System.out.print("\nEndereço do Cliente: ");
        endereco = teclado.nextLine();
        System.out.print("Informe quanto você tem [R$]: ");
        dinheirodisponivel = teclado.nextDouble();


        System.out.println("\n------------ Cadastro Finalizado -----------");
        System.out.println("---------- ----------- ---------- ----------");





    }

}
