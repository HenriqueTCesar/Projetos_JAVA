package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

public class TesteCliente {

    public static void main(String[] args) {

        //Instanciar objeto
        Cliente objCliente = new Cliente();


        //Entradas
        objCliente.setIdade(51);
        objCliente.setNome("Braufagelio");
        objCliente.setEmail("brf@fiap.com.br");
        objCliente.setRenda(8.555);


        // Saídas
        System.out.println("Idade: " + objCliente.getIdade());
        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Email: " + objCliente.getEmail());
        System.out.println("Renda: " + objCliente.getRenda());

    }

}
