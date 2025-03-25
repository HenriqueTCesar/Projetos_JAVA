package br.com.fiap.main;

import br.com.fiap.beans.Hospede;
import br.com.fiap.beans.Quarto;
import br.com.fiap.beans.Reserva;

public class TesteHotel {

    private static Hospede objHospede;

    public static void main(String[] args) {

        //Instanciar objetos
        Hospede objHospede = new Hospede();
        Quarto objQuarto = new Quarto();
        Reserva objReserva = new Reserva();

        //Entrada de Hóspede
        objHospede.setNome("Henrique");
        objHospede.setCpf("123.456.789-0");
        objHospede.setTelefone(1123456789);

        //Entrada de Quarto
        objQuarto.setNumero(30);
        objQuarto.setTipo("A");
        objQuarto.setPreço(49.99);

        //Entrada da Reserva
        objReserva.setHospede("Henrique");
        objReserva.setQuarto(30);
        objReserva.setDataETR(230325);
        objReserva.setDataSD(250325);
        objReserva.setTotal(149.97);

        //Saídas

        System.out.println("\n\n<--------HÓSPEDE-------->" +
                            "\nNome: " + objHospede.getNome() +
                            "\nCPF: " + objHospede.getCpf() +
                            "\nTelefone: " + objHospede.getTelefone()
        );

        System.out.println("\n<--------QUARTO-------->" +
                            "\nNúmero: " + objQuarto.getNumero() +
                            "\nTipo: " + objQuarto.getTipo() +
                            "\nPreço: " + objQuarto.getPreço()
        );

        System.out.println("\n<--------RESERVA-------->" +
                            "\nHóspede: " + objReserva.getHospede() +
                            "\nQuarto: " + objReserva.getQuarto() +
                            "\nDataETR: " + objReserva.getDataETR() +
                            "\nDataSD: " + objReserva.getDataSD() +
                            "\nTotal: " + objReserva.getTotal()
        );









    }
}
