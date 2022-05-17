package br.uol.compass.testedesafioengenheirodesoftwareapi.services;

import br.uol.compass.testedesafioengenheirodesoftwareapi.dto.ChamadoComTrabalhadorAtribuidoDTO;
import br.uol.compass.testedesafioengenheirodesoftwareapi.dto.TrabalhadorResponseDTO;
import br.uol.compass.testedesafioengenheirodesoftwareapi.repository.ChamadoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ChamadoServiceImplTest {

    @InjectMocks
    @Spy
    private ChamadoServiceImpl chamadoService;

    @Mock
    private ChamadoRepository chamadoRepository;

    @Mock
    private TrabalhadorService trabalhadorService;


    @Test
    public void getChamadoWithSucess(){

        when(chamadoService.getChamados()).thenReturn(getChamadoResponseDTOS());
        when(trabalhadorService.getTrabalhadores()).thenReturn(getTrabalhadorResponseDTOS());

        List<ChamadoComTrabalhadorAtribuidoDTO> chamadoResponseDTO = chamadoService.getChamados();

    }

    private List<TrabalhadorResponseDTO> getTrabalhadorResponseDTOS() {
        return Arrays.asList(TrabalhadorResponseDTO.builder().build());
    }

    private List<ChamadoComTrabalhadorAtribuidoDTO> getChamadoResponseDTOS() {
        return Arrays.asList(ChamadoComTrabalhadorAtribuidoDTO.builder().build());
    }
}
