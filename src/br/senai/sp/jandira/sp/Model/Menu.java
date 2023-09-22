package br.senai.sp.jandira.sp.Model;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    Cliente listCliente = new Cliente();
    Funcionario listFuncionario = new Funcionario();
    Venda objVenda = new Venda();
    Veiculo listVeiculo = new Veiculo();

    public void menu() {
        boolean continuar = true;

        while (continuar) {

            System.out.println("\n------- MAIN MENU -------\n");
            System.out.println("1- Register Client");
            System.out.println("2- Register Vehicle");
            System.out.println("3- Register Employee");
            System.out.println("4- Make a new sale");
            System.out.println("5- List Vehicles");
            System.out.println("6- List Clients");
            System.out.println("7- List Employees");
            System.out.println("8- Search Vehicles");
            System.out.println("9- Log out");
            System.out.println("\nOption [1 a 9]:");

            int escolhaUsuario = teclado.nextInt();
            teclado.nextLine();

            switch (escolhaUsuario) {
                case 1:
                    Cliente objCliente = new Cliente();
                    objCliente.cadastrarCliente();
                    listCliente.addCliente(objCliente);
                    System.out.println(listCliente.clienteList.size());
                    break;

                case 2:
                    Veiculo objVeiculo = new Veiculo();
                    objVeiculo.cadastrarVeiculo();
                    listVeiculo.addVeiculo(objVeiculo);
                    System.out.println(listVeiculo.veiculoList.size());
                    break;

                case 3:
                    Funcionario objFuncionario = new Funcionario();
                    objFuncionario.cadastrarFuncionario();
                    listFuncionario.addFuncionario(objFuncionario);
                    System.out.println(listFuncionario.funcionarioList.size());
                    break;

                case 4:
                    listCliente.listarCliente();
                    System.out.println("Nome do Cliente: ");
                    String nomeComprador = teclado.nextLine();
                    listVeiculo.listarVeiculos();
                    System.out.println("Modelo do Veiculo: ");
                    String modeloVeiculo = teclado.nextLine();
                    listFuncionario.listarFuncionario();
                    System.out.println("Nome do Vendedor: ");
                    String nomeVendedor = teclado.nextLine();

                    Cliente objComprador = listCliente.pesquisarComprador(nomeComprador);

                    Veiculo veiculoVenda = listVeiculo.localizarVeiculoCompra(modeloVeiculo);

                    Funcionario vendedor = listFuncionario.pesquisarVendedor(nomeVendedor);


                    boolean validaFinanciamento = false;
                    boolean validaVenda = false;
                    boolean formaPagamento = objVenda.avaliaFormaPagamento();

                    if (formaPagamento){
                        validaVenda = objVenda.realizarVenda(veiculoVenda,objComprador);
                    } else {
                        validaFinanciamento = objVenda.financiarVeiculo(veiculoVenda,objComprador);
                    }

                    if (validaVenda || validaFinanciamento){

                        System.out.println("\n------ PARABÉNS VENDA REALIZADA ------\n");

                        vendedor.comissaoFuncionario(veiculoVenda);
                        System.out.println("O funcionário recebeu: " + vendedor.comissao);
                    }

                    break;

                case 5:
                    listVeiculo.listarVeiculos();
                    break;

                case 6:
                    listCliente.listarCliente();
                    break;

                case 7:
                    listFuncionario.listarFuncionario();
                    break;

                case 8:
                    System.out.println("Say the vehicle model: ");
                    String veiculoPesquisado = teclado.nextLine();
                    boolean validaVeiculo = false;

                    if (veiculoPesquisado != null && veiculoPesquisado != ""){
                        validaVeiculo = listVeiculo.searchVehicle(veiculoPesquisado);
                    }
                    if (validaVeiculo){
                        System.out.println("O " + veiculoPesquisado + " está disponivel!");
                    }else {
                        System.out.println("O " + veiculoPesquisado + " não está disponivel!");
                    }
                    break;

                case 9:
                    continuar = false;
                    break;
            }

            if (escolhaUsuario < 1 || escolhaUsuario > 9) {
                System.out.println("Choose a valid option! (1 - 8)");
            }
        }
    }

}


