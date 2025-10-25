package com.consultorio;

import com.consultorio.model.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Criando um funcionário genérico
        Funcionario funcionario = new Funcionario("Carlos Silva", 35, 2500.0);
        System.out.println("Funcionário: " + funcionario.getNome()
                + ", Idade: " + funcionario.getIdade()
                + ", Salário: R$" + funcionario.getSalario());

        // Criando um nutricionista
        Nutricionista nutricionista = new Nutricionista("Ana Souza", 29, 4000.0, 15);
        System.out.println("Nutricionista: " + nutricionista.getNome()
                + ", Idade: " + nutricionista.getIdade()
                + ", Salário: R$" + nutricionista.getSalario()
                + ", Consultas: " + nutricionista.getNumeroConsultas());

        // Adicionando funcionários ao quadro
        QuadroFuncionarios.listaFuncionarios.add(funcionario);
        QuadroFuncionarios.listaFuncionarios.add(nutricionista);

        // Criando consultas
        Consulta consulta1 = new Consulta(nutricionista, "João Pereira", LocalDateTime.now());
        Consulta consulta2 = new Consulta(nutricionista, "Maria Silva", LocalDateTime.now().plusDays(1));

        // Adicionando consultas usando métodos estáticos
        ConsultasImpl.adicionaConsulta(consulta1);
        ConsultasImpl.adicionaConsulta(consulta2);

        // Exibindo todas as consultas
        System.out.println("\nConsultas cadastradas:");
        for (Consulta c : ConsultasImpl.retornaConsultas()) {
            System.out.println(c.getNomePaciente() + " - Nutricionista: " + c.getNutricionista().getNome()
                    + " - Data/Hora: " + c.getDataHora());
        }

        // Deletando a primeira consulta
        ConsultasImpl.deletaConsulta(0);

        System.out.println("\nApós deletar a primeira consulta:");
        for (Consulta c : ConsultasImpl.retornaConsultas()) {
            System.out.println(c.getNomePaciente() + " - Nutricionista: " + c.getNutricionista().getNome()
                    + " - Data/Hora: " + c.getDataHora());
        }
    }
}
