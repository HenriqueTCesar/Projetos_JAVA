package br.com.fiap.beans;

public class Reserva {

    //Visibilidade e atributos
    private String hospede;
    private int quarto;
    private int dataETR;
    private int dataSD;
    private double Total;

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public int getDataSD() {
        return dataSD;
    }

    public void setDataSD(int dataSD) {
        this.dataSD = dataSD;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public int getDataETR() {
        return dataETR;
    }

    public void setDataETR(int dataETR) {
        this.dataETR = dataETR;
    }
}
