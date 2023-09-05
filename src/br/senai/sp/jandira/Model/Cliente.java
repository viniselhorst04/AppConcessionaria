package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Cliente {

    /** Declarar as Variaveis*/
    String name, email, endereco;
    long telefone, cpf, rg;

    /** Instanciar Scanner */
    Scanner teclado = new Scanner(System.in);

    public void CadastrarCliente(){

        System.out.println("--------- ---------- --------- ----------");
        System.out.println("------------ Cadastro Cliente -----------");
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
        System.out.println("------------ Cadastro Finalizado -----------");
        System.out.println("---------- ----------- ---------- ----------");

        teclado.close();



    }

}
