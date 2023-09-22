package br.senai.sp.jandira.sp.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veiculo {
    String modelo, marca, cor, placa, gasolina;
    double preco;
    int ano;
    Scanner scanner = new Scanner(System.in);

    public void cadastrarVeiculo() {
        System.out.println("------- ------- ------- ------- ------- -------");
        System.out.println("-------------- Register Vehicles -------------\\n");

        System.out.print("\nVehicle model: ");
        modelo = scanner.nextLine();

        System.out.print("\nVehicle brand: ");
        marca = scanner.nextLine();

        System.out.print("\nVehicle color: ");
        cor = scanner.nextLine();

        System.out.print("\nVehicle plate: ");
        placa = scanner.nextLine();

        System.out.print("\nFuel type: ");
        gasolina = scanner.nextLine();

        System.out.print("\nVehicle price: ");
        preco = scanner.nextDouble();

        System.out.print("\nVehicle year: ");
        ano = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\n------------ Registration Completed -----------");
        System.out.println("---------- ----------- ---------- ----------");
    }

    List<Veiculo> veiculoList = new ArrayList<>();

    public void addVeiculo(Veiculo veiculo) {
        veiculoList.add(veiculo);
    }

    public void listarVeiculos() {
        for (Veiculo veiculo : veiculoList) {
            System.out.println("Vehicle model: " + veiculo.modelo);
            System.out.println("Vehicle brand: " + veiculo.marca);
            System.out.println("Vehicle color: " + veiculo.cor);
            System.out.println("Vehicle plate: " + veiculo.placa);
            System.out.println("Fuel type: " + veiculo.gasolina);
            System.out.println("Vehicle price: " + veiculo.preco);
            System.out.println("Vehicle year: " + veiculo.ano+ "\n");
        }
    }

    public boolean searchVehicle(String searchVehicle){
        for (Veiculo veiculo : veiculoList) {
            if (veiculo.modelo.equalsIgnoreCase(searchVehicle)){
                return true;

            }
        }

        return false;
    }

    public Veiculo localizarVeiculoCompra(String modeloVeiculo){
        for (Veiculo veiculo : veiculoList){
            if (veiculo.modelo.equalsIgnoreCase(modeloVeiculo)){
                return veiculo;
            }
        }
        return null;
    }

}
