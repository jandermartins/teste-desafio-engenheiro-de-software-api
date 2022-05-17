package br.uol.compass.testedesafioengenheirodesoftwareapi.services;

import br.uol.compass.testedesafioengenheirodesoftwareapi.dto.TrabalhadorResponseDTO;
import br.uol.compass.testedesafioengenheirodesoftwareapi.repository.TrabalhadorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TrabalhadorServiceImpl implements TrabalhadorService{

    @Autowired
    private TrabalhadorRepository trabalhadorRepository;

    @Override
    public List<TrabalhadorResponseDTO> getTrabalhadores() {

        log.info("TrabalhadorServiceImpl.getTrabalhadores - Start");

        List<TrabalhadorResponseDTO> trabalhadorResponseDTOS = trabalhadorRepository.findAllTrabalhadores();

        log.debug("TrabalhadorServiceImpl.getTrabalhadores - End - trabalhadorResponseDTOS: {}", trabalhadorResponseDTOS);

        return trabalhadorResponseDTOS;
    }
}
