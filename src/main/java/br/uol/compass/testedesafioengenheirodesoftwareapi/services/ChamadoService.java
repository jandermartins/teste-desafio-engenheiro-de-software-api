package br.uol.compass.testedesafioengenheirodesoftwareapi.services;

import br.uol.compass.testedesafioengenheirodesoftwareapi.dto.ChamadoComTrabalhadorAtribuidoDTO;

import java.util.List;

public interface ChamadoService {

    public List<ChamadoComTrabalhadorAtribuidoDTO> getChamados();
}
