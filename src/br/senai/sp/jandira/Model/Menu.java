package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    Cliente objCliente = new Cliente();
    Funcionario objFuncionario = new Funcionario();
    Venda objVenda = new Venda();
    Veiculo objVeiculo = new Veiculo();

    public void menu(){

        boolean continuar = true;

        while(continuar){


            System.out.println("\n------- MENU -------\n");
            System.out.println("1- Cadastrar Cliente");
            System.out.println("2- Cadastrar Veículo");
            System.out.println("3- Cadastrar Funcionário");
            System.out.println("4- Realizar Venda");
            System.out.println("5- Sair");
            System.out.println("\nOpcão [1 à 5]:");

            int escolhausuario = teclado.nextInt();

            switch (escolhausuario){

                case 1:
                    objCliente.cadastrarCliente();

                    break;
                case 2:
                    objVeiculo.cadastrarVeiculo();
                    break;
                case 3:
                    objFuncionario.cadastrarFuncionario();
                    break;
                case 4:
                    boolean validavenda =objVenda.realizarVenda(objVeiculo, objCliente);

                    if(validavenda){
                        objCliente.dinheirodisponivel -= objVeiculo.preco;
                        System.out.println(" o saldo do cliente é: " + objCliente.dinheirodisponivel);
                        objFuncionario.comissaoFuncionario(objVeiculo);
                    }

                    break;
                case 5:
                    continuar = false;
                    break;

            }
            if (escolhausuario < 1 || escolhausuario > 5){
                System.out.println("Escolha uma opção válida! ( 1 à 5 )");
            }
        }

    }

}
