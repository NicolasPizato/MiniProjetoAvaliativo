package com.consultorio;

import com.consultorio.model.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // ======== Criação de Objetos ========
        Funcionario funcionario = new Funcionario("Carlos Silva", 35, 2500.0);
        Nutricionista nutricionista = new Nutricionista("Ana Souza", 29, 4000.0, 15);

        Consulta consulta1 = new Consulta(nutricionista, "João Pereira", LocalDateTime.of(2025, 10, 24, 9, 0));
        Consulta consulta2 = new Consulta(nutricionista, "Maria Silva", LocalDateTime.of(2025, 10, 25, 14, 0));
        Consulta consulta3 = new Consulta(nutricionista, "Pedro Santos", LocalDateTime.of(2025, 10, 26, 16, 30));

        // ======== Gerenciamento de Dados ========
        // Adicionando funcionários ao Quadro
        QuadroFuncionarios.listaFuncionarios.add(funcionario);
        QuadroFuncionarios.listaFuncionarios.add(nutricionista);

        // Adicionando consultas à lista estática
        ConsultasImpl.adicionaConsulta(consulta1);
        ConsultasImpl.adicionaConsulta(consulta2);
        ConsultasImpl.adicionaConsulta(consulta3);

        // ======== Relatórios e Impressão ========
        System.out.println("===== RELATÓRIO DE CONSULTAS =====");
        for (Consulta c : ConsultasImpl.retornaConsultas()) {
            System.out.println(c); // usando toString()
        }

        System.out.println("\n===== RELATÓRIO DE FUNCIONÁRIOS =====");
        for (Funcionario f : QuadroFuncionarios.listaFuncionarios) {
            System.out.println(f); // usando toString()
            if (f instanceof Nutricionista) {
                System.out.println("Função: Nutricionista, Consultas: " + ((Nutricionista) f).getNumeroConsultas());
            } else {
                System.out.println("Função: Funcionário");
            }
            System.out.println("-----------------------------");
        }
    }
}
