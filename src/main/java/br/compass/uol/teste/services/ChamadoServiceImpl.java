package br.compass.uol.teste.services;

import br.compass.uol.teste.dto.ChamadoComTrabalhadorAtribuidoDTO;
import br.compass.uol.teste.dto.ChamadoResponseDTO;
import br.compass.uol.teste.dto.TrabalhadorResponseDTO;
import br.compass.uol.teste.entities.Chamado;
import br.compass.uol.teste.repository.ChamadoRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
@Service
public class ChamadoServiceImpl implements ChamadoService{

    @Autowired
    private ChamadoRepository chamadoRepository;

    @Autowired
    private TrabalhadorService trabalhadorService;

    @Override
    public List<ChamadoComTrabalhadorAtribuidoDTO> getChamados() {
        log.info("ChamadoServiceImpl.getChamados - Start");

        LocalDate dataDeHoje = LocalDate.now();

        LocalDate dataDeOntem = dataDeHoje.minusDays(1);

        LocalDate dataFutura = dataDeHoje.plusDays(9);

        List<ChamadoResponseDTO> chamadoResponseDTOS =  chamadoRepository.getByDataDeOntem(dataDeOntem, dataFutura);

        List<TrabalhadorResponseDTO> trabalhadorResponseDTOS = trabalhadorService.getTrabalhadores();

        List<ChamadoComTrabalhadorAtribuidoDTO> chamadoComTrabalhadorAtribuidoDTOS = new ArrayList<>();

        int contador = 0;

        for (int i = 0; i < chamadoResponseDTOS.size(); i++){
            ChamadoComTrabalhadorAtribuidoDTO chamadoComTrabalhadorAtribuidoDTO = new ChamadoComTrabalhadorAtribuidoDTO();
            if(chamadoResponseDTOS.get(i).getDataDeAbertura().getDayOfWeek() == DayOfWeek.SATURDAY || chamadoResponseDTOS.get(i).getDataDeAbertura().getDayOfWeek() == DayOfWeek.MONDAY) {
                i++;
            }else {
                chamadoComTrabalhadorAtribuidoDTO.setId(chamadoResponseDTOS.get(i).getId());
                chamadoComTrabalhadorAtribuidoDTO.setDataDeAbertura(chamadoResponseDTOS.get(i).getDataDeAbertura());
                chamadoComTrabalhadorAtribuidoDTO.setId(chamadoResponseDTOS.get(i).getId());
                chamadoComTrabalhadorAtribuidoDTO.setNome(trabalhadorResponseDTOS.get(contador).getNome());
                chamadoComTrabalhadorAtribuidoDTOS.add(chamadoComTrabalhadorAtribuidoDTO);
            }

            if(contador >= trabalhadorResponseDTOS.size() - 1){
                contador = 0;
            }
            contador++;
        }

        log.debug("ChamadoServiceImpl.getChamados - End -");

        return chamadoComTrabalhadorAtribuidoDTOS;
    }

    @Override
    public Chamado addChamado(Chamado chamado) {
        log.info("ChamadoServiceImpl.addChamado - Start - ChamadoResponseDTO: {}", chamado);

        Chamado chamadoResponse = chamadoRepository.save(chamado);

        log.debug("ChamadoServiceImpl.getChamados - End - Chamado: {}", chamadoResponse);

        return chamadoResponse;
    }
}

