package com.consultorio.model;

public class Nutricionista extends Funcionario {

    private int numeroConsultas;

    // Construtor vazio
    public Nutricionista() {
        super();
    }

    // Construtor com todos os campos
    public Nutricionista(String nome, int idade, double salario, int numeroConsultas) {
        super(nome, idade, salario);
        this.numeroConsultas = numeroConsultas;
    }

    // Getter e Setter
    public int getNumeroConsultas() {
        return numeroConsultas;
    }

    public void setNumeroConsultas(int numeroConsultas) {
        this.numeroConsultas = numeroConsultas;
    }

    // Sobrescrevendo toString
    @Override
    public String toString() {
        return "Nutricionista{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", salario=" + getSalario() +
                ", numeroConsultas=" + numeroConsultas +
                '}';
    }
}
