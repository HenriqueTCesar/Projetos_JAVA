package br.com.fiap.beans;

public class Colaborador {

    //visibilidade, tipo de dados e atributos
    private String nome;
    private double quantidadeHora;
    private int idade;
    private String cargo;
    private double valorHora;

    //metodos setters (entradas) e getters (retornar \ exibir)


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidadeHora() {
        return quantidadeHora;
    }

    public void setQuantidadeHora(double quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "\n<-----Colaborador----->{" +
                "\n\nNome: " + nome +
                "\nQuantidade de Horas: " + quantidadeHora +
                "\nIdade: " + idade +
                "\nCargo: " + cargo +
                "\nValor por Hora: " + valorHora;
    }

    //Metodo worker
    public double calcularSalario(){
        return valorHora * quantidadeHora;
    }









}
