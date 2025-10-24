package com.consultorio;

import com.consultorio.model.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Criando funcionários e nutricionista
        Funcionario funcionario = new Funcionario("Carlos Silva", 35, 2500.0);
        Nutricionista nutricionista = new Nutricionista("Ana Souza", 29, 4000.0, 15);

        // Adicionando ao quadro de funcionários
        QuadroFuncionarios.listaFuncionarios.add(funcionario);
        QuadroFuncionarios.listaFuncionarios.add(nutricionista);

        // Criando consulta
        Consulta consulta = new Consulta(nutricionista, "João Pereira", LocalDateTime.now());
        ConsultasImpl.listaConsultas.add(consulta);

        // Imprimindo funcionários
        System.out.println("Funcionários:");
        for (Funcionario f : QuadroFuncionarios.listaFuncionarios) {
            System.out.println(f.getNome() + ", Idade: " + f.getIdade() + ", Salário: R$" + f.getSalario());
        }

        // Imprimindo consultas
        System.out.println("\nConsultas:");
        for (Consulta c : ConsultasImpl.listaConsultas) {
            System.out.println("Nutricionista: " + c.getNutricionista().getNome() +
                    ", Paciente: " + c.getNomePaciente() +
                    ", Data/Hora: " + c.getDataHora());
        }
    }
}
