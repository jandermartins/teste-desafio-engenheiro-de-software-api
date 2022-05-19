package br.uol.comass.teste.controllers;

import br.uol.comass.teste.constants.Paths;
import br.uol.comass.teste.dto.ChamadoComTrabalhadorAtribuidoDTO;
import br.uol.comass.teste.services.ChamadoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(Paths.URL_CHAMADOS)
@Validated
public class ChamadoController {

    @Autowired
    private ChamadoService chamadoService;

    @GetMapping
    public List<ChamadoComTrabalhadorAtribuidoDTO> getChamados(){

        log.info("ChamadoController.getChamados - Start");

        List<ChamadoComTrabalhadorAtribuidoDTO> chamadoResponseDTO = chamadoService.getChamados();

        log.debug("ChamadoController.getChamados - End - Output - ChamadoResponseDTO: {}", chamadoResponseDTO);

        return chamadoResponseDTO;
    }
    //teste
}