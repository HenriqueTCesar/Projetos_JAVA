package br.com.fiap.beans;

public class Produto {

    // visibilidade, tipo de dados e atributos
    private int codigo;
    private String tipo;
    private String marca;
    private double valor;

    //metodo setters (entrada) e getters (retornar \ exibiur)


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
