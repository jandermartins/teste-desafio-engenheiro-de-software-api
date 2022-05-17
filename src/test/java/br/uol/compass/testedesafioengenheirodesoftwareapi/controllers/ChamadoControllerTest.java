package br.uol.compass.testedesafioengenheirodesoftwareapi.controllers;

import br.uol.compass.testedesafioengenheirodesoftwareapi.constants.Paths;
import br.uol.compass.testedesafioengenheirodesoftwareapi.services.ChamadoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class ChamadoControllerTest {

    @MockBean
    private ChamadoService chamadoService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getChamados() throws Exception {


        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get(Paths.URL_CHAMADOS)
                .accept(MediaType.APPLICATION_JSON);
        mockMvc.perform(requestBuilder).andExpect(status().isOk()).andReturn();
    }


}
