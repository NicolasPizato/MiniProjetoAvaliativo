package com.consultorio;

import com.consultorio.model.Funcionario;
import com.consultorio.model.Nutricionista;
import com.consultorio.model.Consulta;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        // === TESTE FUNCIONÁRIO ===
        Funcionario funcionario = new Funcionario("Carlos Silva", 35, 2500.0);
        System.out.println("Funcionário: " + funcionario.getNome()
                + ", Idade: " + funcionario.getIdade()
                + ", Salário: R$" + funcionario.getSalario());

        // === TESTE NUTRICIONISTA ===
        Nutricionista nutricionista = new Nutricionista("Ana Souza", 29, 4000.0, 15);
        System.out.println("Nutricionista: " + nutricionista.getNome()
                + ", Idade: " + nutricionista.getIdade()
                + ", Salário: R$" + nutricionista.getSalario()
                + ", Consultas: " + nutricionista.getNumeroConsultas());

        // === TESTE CONSULTA ===
        Consulta consulta = new Consulta(nutricionista, "João Pereira", LocalDateTime.now());
        System.out.println("Consulta criada:");
        System.out.println("  Nutricionista: " + consulta.getNutricionista().getNome());
        System.out.println("  Paciente: " + consulta.getNomePaciente());
        System.out.println("  Data/Hora: " + consulta.getDataHora());
    }
}
