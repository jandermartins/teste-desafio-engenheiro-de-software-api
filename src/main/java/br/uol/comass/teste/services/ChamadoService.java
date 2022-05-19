package br.uol.comass.teste.services;

import br.uol.comass.teste.dto.ChamadoComTrabalhadorAtribuidoDTO;

import java.util.List;

public interface ChamadoService {

    public List<ChamadoComTrabalhadorAtribuidoDTO> getChamados();
}
