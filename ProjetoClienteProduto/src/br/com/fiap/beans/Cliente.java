package br.com.fiap.beans;

public class Cliente {

    //visibilidade, tipo de dados e atributos
    private int idade;
    private String nome;
    private String email;
    private double renda;

    //setters (entrada) e getters (retornar \ exibir)


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
}
