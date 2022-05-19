package br.compass.uol.teste.controllers;

import br.compass.uol.teste.constants.Paths;
import br.compass.uol.teste.entities.Trabalhador;
import br.compass.uol.teste.services.TrabalhadorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(Paths.URL_TRABALHADORES)
@Validated
public class TrabalhadorController {

    @Autowired
    private TrabalhadorService trabalhadorService;

    @PostMapping
    public ResponseEntity<Trabalhador> addTrabalhador(@RequestBody Trabalhador trabalhador) {

        log.info("TrabalhadorController.addTrabalhador - Start");

        Trabalhador trabalhadorResponse = trabalhadorService.addTrabalhadores(trabalhador);

        log.debug("TrabalhadorController.addTrabalhador - End - Output Trabalhador: {}", trabalhadorResponse);

        return ResponseEntity.status(HttpStatus.OK).body(trabalhadorResponse);
    }
}
