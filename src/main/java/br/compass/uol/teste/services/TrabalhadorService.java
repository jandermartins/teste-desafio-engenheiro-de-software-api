package br.compass.uol.teste.services;

import br.compass.uol.teste.dto.TrabalhadorResponseDTO;
import br.compass.uol.teste.entities.Trabalhador;

import java.util.List;

public interface TrabalhadorService {

    public List<TrabalhadorResponseDTO> getTrabalhadores();

    Trabalhador addTrabalhadores(Trabalhador trabalhador);
}
