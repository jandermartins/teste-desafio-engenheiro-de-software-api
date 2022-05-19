package br.compass.uol.teste.services;

import br.compass.uol.teste.dto.TrabalhadorResponseDTO;
import br.compass.uol.teste.entities.Trabalhador;
import br.compass.uol.teste.repository.TrabalhadorRepository;
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

    @Override
    public Trabalhador addTrabalhadores(Trabalhador trabalhador) {
        log.info("TrabalhadorServiceImpl.addTrabalhadores - Start Trabalhador: {}", trabalhador);

        Trabalhador trabalhadors = trabalhadorRepository.save(trabalhador);

        log.debug("TrabalhadorServiceImpl.addTrabalhadores - End - trabalhadorResponseDTOS: {}", trabalhadors);

        return trabalhadors;

    }
}
