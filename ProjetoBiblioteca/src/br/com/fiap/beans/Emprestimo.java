package br.com.fiap.beans;

public class Emprestimo {

    //Visibilidade e atributos
    private String id;
    private String idusuario;
    private String idlivro;
    private int dataEPTM;
    private int dataDVLP;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getIdlivro() {
        return idlivro;
    }

    public void setIdlivro(String idlivro) {
        this.idlivro = idlivro;
    }

    public int getDataEPTM() {
        return dataEPTM;
    }

    public void setDataEPTM(int dataEPTM) {
        this.dataEPTM = dataEPTM;
    }

    public int getDataDVLP() {
        return dataDVLP;
    }

    public void setDataDVLP(int dataDVLP) {
        this.dataDVLP = dataDVLP;
    }
}
