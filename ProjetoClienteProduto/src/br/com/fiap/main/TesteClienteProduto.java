package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Produto;

public class TesteClienteProduto {

    public static void main(String[] args) {

        // Instanciar objeto
        Cliente objCliente = new Cliente();
        Produto objProduto = new Produto();

        // entradas do cliente (setters)
        objCliente.setIdade(30);
        objCliente.setNome("Gilberto");
        objCliente.setEmail("gbt@gmail.com");
        objCliente.setRenda(8.526);

        // entrada do produto
        objProduto.setCodigo(123);
        objProduto.setMarca("Pepsi");
        objProduto.setTipo("Refrigerante");
        objProduto.setValor(7.55);

        // saidas do cliente (getters) sout atalho
        System.out.println(  "\nINFORMAÇÕES DO CLIENTE" +
                "\nIdade: " + objCliente.getIdade() +
                "\nNome: " + objCliente.getNome() +
                "\nEmail: " + objCliente.getEmail() +
                "\nRenda: " + objCliente.getRenda()
        );

        //saida do produto
        System.out.println(  "\n\nINFORMAÇÕES DO PRODUTO" +
                "\nCodigo: " + objProduto.getCodigo() +
                "\nMarca: " + objProduto.getMarca() +
                "\nTipo: " + objProduto.getTipo() +
                "\nValor: " + objProduto.getValor()
        );



    }

}
