package br.com.fiap.beans;

public class Usuarios {

    //Visibilidade e atributos
    private String id;
    private String nome;
    private String email;
    private int telefone;
    private int dataCDT;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getDataCDT() {
        return dataCDT;
    }

    public void setDataCDT(int dataCDT) {
        this.dataCDT = dataCDT;
    }
}
