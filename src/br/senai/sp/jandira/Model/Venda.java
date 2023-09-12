package br.senai.sp.jandira.Model;

public class Venda {

    public boolean realizarVenda(Veiculo objVeiculo, Cliente objCliente){

        if(objCliente.dinheirodisponivel >= objVeiculo.preco){

            System.out.println("-------------------- Parabéns -----------------------");
            System.out.println("Olá "+ objCliente.name);
            System.out.println("Você acaba de adquirir um " + objVeiculo.modelo);
            System.out.println("No valor de " + objVeiculo.preco);
            System.out.println("-----------------------------------------------------");
            return true;

        }else {

            System.out.println("Escolha um veículo mais compativel com sua realidade!");
            return false;

        }


    }
}
