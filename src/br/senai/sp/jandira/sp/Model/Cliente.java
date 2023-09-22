package br.senai.sp.jandira.sp.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    /** Declarar as Variaveis*/
    String name, email, endereco;
    long telefone, cpf, rg;
    double dinheirodisponivel;

    /** Instanciar Scanner */
    Scanner teclado = new Scanner(System.in);

    List<Cliente> clienteList = new ArrayList<>();

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
        teclado.nextLine();


        System.out.println("\n------------ Cadastro Finalizado -----------");
        System.out.println("---------- ----------- ---------- ----------");

    }

    public void addCliente(Cliente cliente){

        clienteList.add(cliente);

    }

    public void listarCliente(){
        for (Cliente cliente : clienteList) {

            System.out.println("Client's Name: " + cliente.name);
            System.out.println("Client's CPF: " + cliente.cpf);

        }

    }

    public Cliente pesquisarComprador(String name){
        for (Cliente cliente: clienteList){
            if (cliente.name.equalsIgnoreCase(name)){
                return cliente;
            }
        }
        return null;
    }

}
