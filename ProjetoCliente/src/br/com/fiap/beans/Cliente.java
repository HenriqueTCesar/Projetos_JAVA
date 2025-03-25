package br.com.fiap.beans;

public class Cliente {

    // tipo de dado e atributo
    int idade; // 40
    String nome; // "R2D2"
    String email; // "brf@fiap.com.br"
    double renda; // 8.555

    // metodos setters (entrada)
    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setRenda (double renda){
        this.renda = renda;
    }

    // metodos getters (retotnar \ exibir)
    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public double getRenda(){
        return renda;
    }

}
