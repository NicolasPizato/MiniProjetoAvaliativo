package com.consultorio.model;

import java.util.List;

public interface IConsultaManager {

    // Adiciona uma nova consulta à lista
    void adicionaConsulta(Consulta consulta);

    // Retorna a lista completa de consultas
    List<Consulta> retornaConsultas();

    // Remove uma consulta da lista com base no índice
    void deletaConsulta(int posicao);
}
