package com.consultorio.model;

import java.time.LocalDateTime;

public class Consulta {

    // 🔒 Atributos privados (encapsulamento)
    private Nutricionista nutricionista;
    private String nomePaciente;
    private LocalDateTime dataHora;

    // 🧱 Construtor completo
    public Consulta(Nutricionista nutricionista, String nomePaciente, LocalDateTime dataHora) {
        this.nutricionista = nutricionista;
        this.nomePaciente = nomePaciente;
        this.dataHora = dataHora;
    }

    // 🪄 Getters e Setters
    public Nutricionista getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    // 🖨️ toString para facilitar a exibição
    @Override
    public String toString() {
        return "Consulta {" +
                "nutricionista=" + nutricionista.getNome() +
                ", nomePaciente='" + nomePaciente + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }
}
