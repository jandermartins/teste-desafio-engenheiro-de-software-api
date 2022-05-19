package br.compass.uol.teste.controllers;

import br.compass.uol.teste.constants.Paths;
import br.compass.uol.teste.dto.ChamadoComTrabalhadorAtribuidoDTO;
import br.compass.uol.teste.dto.ChamadoResponseDTO;
import br.compass.uol.teste.entities.Chamado;
import br.compass.uol.teste.services.ChamadoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<Chamado> addChamado(@RequestBody Chamado chamado){
        log.info("ChamadoController.addChamado - Start - ChamadoResponseDTO: {}", chamado);

        Chamado chamadoResponse = chamadoService.addChamado(chamado);

        log.debug("ChamadoController.addChamado - End - Output");

        return ResponseEntity.status(HttpStatus.OK).body(chamadoResponse);
    }
}
