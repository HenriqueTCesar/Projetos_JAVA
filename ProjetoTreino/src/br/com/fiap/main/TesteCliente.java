package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteCliente {

    public static void main(String[] args) {

        //Instanciar objetos
        Produto objProduto = new Produto();
        Cliente objCliete = new Cliente();
        Endereco objEndereco = new Endereco();

        //Entradas do Produto
        objProduto.setTipo("Refrigerante");
        objProduto.setCodigo(123);
        objProduto.setMarca("Didio");
        objProduto.setValor(4.55);

        //Entrada do Cliente
        objCliete.setIdade(45);
        objCliete.setEmail("clo@gmail.com");
        objCliete.setRenda(8.455);
        objCliete.setNome("Clotilde");

        objEndereco.setLogradouro("Rua Apito do Vapor");
        objEndereco.setNumero(1111);
        objEndereco.setComplemento("Casa");
        objEndereco.setBairro("Cid Tiradentes");
        objEndereco.setUf("SP");
        objEndereco.setCidade("São Paulo");
        objEndereco.setCep("083557");

        objCliete.setEndereco(objEndereco);

        //Saídas

        System.out.println("\n\nCodigo: " + objProduto.getCodigo() +
                            "\nTipo: " + objProduto.getTipo() +
                            "\nMarca: " + objProduto.getMarca() +
                            "\nValor: " + objProduto.getValor()
                );

        System.out.println("\nIdade: " + objCliete.getIdade() +
                            "\nNome: " + objCliete.getNome() +
                            "\nEmail: " + objCliete.getEmail() +
                            "\nRenda: " + objCliete.getRenda() +
                "\n\nINFORMAÇÕES DE ENDEREÇO DO CLIENTE" +
                            "\n\nLogradouro: " + objCliete.getEndereco().getLogradouro() +
                            "\nNumero: " + objCliete.getEndereco().getNumero() +
                            "\nComplemento: " + objCliete.getEndereco().getComplemento()

                );

    }
}
