package br.com.fiap.main;

import br.com.fiap.beans.Consulta;
import br.com.fiap.beans.Medico;
import br.com.fiap.beans.Paciente;

public class TestesHospital {

    public static void main(String[] args) {

        //Instanciar objetos
        Consulta objConsulta = new Consulta();
        Medico objMedico = new Medico();
        Paciente objPaciente = new Paciente();

        //Entrada do Paciente
        objPaciente.setNome("Henrique");
        objPaciente.setCpf("123.435.567-03");
        objPaciente.setHistorico("Gripado");

        //Entrada do Médico
        objMedico.setNome("Lana");
        objMedico.setCrm("SP-1231312");
        objMedico.setEspecialidade("Clínica geral");

        //Entrada da Consulta
        objConsulta.setPaciente("Henrique");
        objConsulta.setMedico("Lana");
        objConsulta.setData(20052025);

        //Saídas
        System.out.println("\n<--------PACIENTE-------->" +
                            "\nNome: " + objPaciente.getNome() +
                            "\nCPF: " + objPaciente.getCpf() +
                            "\nHistórico: " + objPaciente.getHistorico()
        );

        System.out.println("\n<--------MÉDICO-------->" +
                            "\nNome: " + objMedico.getNome() +
                            "\nCRM: " + objMedico.getCrm() +
                            "\nEspecialidade: " + objMedico.getEspecialidade()
        );

        System.out.println("\n<-------CONSULTAS------->" +
                            "\nPaciente: " + objConsulta.getPaciente() +
                            "\nMédicos: " + objConsulta.getMedico() +
                            "\nData: " + objConsulta.getData()
        );


    }
}
