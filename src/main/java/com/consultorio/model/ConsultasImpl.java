package com.consultorio.model;

import java.util.ArrayList;
import java.util.List;

public class ConsultasImpl {

    // Lista estática de consultas
    public static List<Consulta> listaConsultas = new ArrayList<>();

    // Construtor privado para impedir instâncias
    private ConsultasImpl() {}

    // Adiciona uma consulta à lista
    public static void adicionaConsulta(Consulta consulta) {
        if (consulta != null) {
            listaConsultas.add(consulta);
        } else {
            System.out.println("Não é possível adicionar uma consulta nula.");
        }
    }

    // Retorna todas as consultas
    public static List<Consulta> retornaConsultas() {
        return listaConsultas;
    }

    // Deleta uma consulta com base no índice
    public static void deletaConsulta(int posicao) {
        try {
            listaConsultas.remove(posicao);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: índice inválido para deletar consulta.");
        }
    }
}
