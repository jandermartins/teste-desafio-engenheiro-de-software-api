package br.compass.uol.teste.services;

import br.compass.uol.teste.dto.ChamadoComTrabalhadorAtribuidoDTO;
import br.compass.uol.teste.dto.ChamadoResponseDTO;
import br.compass.uol.teste.entities.Chamado;

import java.util.List;

public interface ChamadoService {

    public List<ChamadoComTrabalhadorAtribuidoDTO> getChamados();

    Chamado addChamado(Chamado chamado);
}