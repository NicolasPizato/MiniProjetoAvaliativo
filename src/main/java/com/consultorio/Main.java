package com.consultorio;

import com.consultorio.model.Funcionario;
import com.consultorio.model.Nutricionista;

public class Main {
    public static void main(String[] args) {
        // Criando um funcionário genérico
        Funcionario funcionario = new Funcionario("Carlos Silva", 35, 2500.0);
        System.out.println("Funcionario: " + funcionario.getNome()
                + ", Idade: " + funcionario.getIdade()
                + ", Salário: R$" + funcionario.getSalario());

        // Criando um nutricionista
        Nutricionista nutricionista = new Nutricionista("Ana Souza", 29, 4000.0, 15);
        System.out.println("Nutricionista: " + nutricionista.getNome()
                + ", Idade: " + nutricionista.getIdade()
                + ", Salário: R$" + nutricionista.getSalario()
                + ", Consultas: " + nutricionista.getNumeroConsultas());
    }
}
