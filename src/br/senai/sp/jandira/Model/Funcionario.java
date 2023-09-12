package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Funcionario {

    /** Declarar as Variaveis*/
    String name, email, endereco;
    long telefone, cpf, rg;
    double comissao;

    /** Instanciar Scanner */
    Scanner teclado = new Scanner(System.in);

    public void cadastrarFuncionario(){

        System.out.println("--------- ---------- --------- ----------");
        System.out.println("------------ Cadastro Funcionario -----------\n");
        System.out.print("\nNome do Funcionario: ");
        name = teclado.nextLine();
        System.out.print("\nCPF do Funcionario: ");
        cpf = teclado.nextLong();
        System.out.print("\nRG do Funcionario: ");
        rg = teclado.nextLong();
        System.out.print("\nTelefone do Funcionario: ");
        telefone = teclado.nextLong();
        teclado.nextLine();
        System.out.print("\nE-mail do Funcionario: ");
        email = teclado.nextLine();
        System.out.print("\nEndereço do Funcionario: ");
        endereco = teclado.nextLine();


        System.out.println("\n------------ Cadastro Finalizado -----------");
        System.out.println("---------- ----------- ---------- ----------");



    }

    public void comissaoFuncionario(Veiculo objveiculo){

        comissao += objveiculo.preco * 0.1;
        System.out.println(" Comissão do Funcionario " + name + " dessa venda é: " + comissao );


    }

}
