package br.uol.compass.testedesafioengenheirodesoftwareapi.services;


import br.uol.compass.testedesafioengenheirodesoftwareapi.dto.TrabalhadorResponseDTO;

import java.util.List;

public interface TrabalhadorService {


    public List<TrabalhadorResponseDTO> getTrabalhadores();
}
