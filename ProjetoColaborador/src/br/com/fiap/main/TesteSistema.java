package br.com.fiap.main;

import br.com.fiap.beans.Colaborador;

import javax.swing.*;
import java.awt.event.ComponentAdapter;

public class TesteSistema {

    public static void main(String[] args) {

     //Intanciar objetos
        Colaborador objColaborador = new Colaborador();

        //Entradas
        objColaborador.setNome(JOptionPane.showInputDialog("Nome do colaborador: "));
        objColaborador.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do colaborador: ")));
        objColaborador.setCargo(JOptionPane.showInputDialog("Digite o cargo"));
        objColaborador.setQuantidadeHora(Double.parseDouble(JOptionPane.showInputDialog("Quantiddade de horas: ")));
        objColaborador.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Valor por hora: ")));

        //Saídas
        System.out.println(
                    objColaborador
        );

        System.out.println(
                    "\n\nSALÁRIO: " + objColaborador.calcularSalario()
        );
    }
}
