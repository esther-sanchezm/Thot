package domain.race;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thot.controller.config.OpenApiConfig;
import com.thot.controller.domain.race.DefaultRaceController;
import com.thot.controller.domain.race.RaceController;
import com.thot.controller.domain.race.mapper.RaceMapper;
import com.thot.controller.domain.race.mapper.RaceMapperImpl;
import com.thot.repository.domain.race.RaceRepository;
import com.thot.repository.domain.race.document.RaceDocument;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@EnableConfigurationProperties(value = { OpenApiConfig.class })
@SpringBootTest(classes = {DefaultRaceController.class,
        RaceMapperImpl.class, RaceRepository.class })
@AutoConfigureMockMvc
class DefaultRaceControllerTest {

    @Autowired
    MockMvc mockMvc;

    private String PATH = "/race";

    @MockBean
    private RaceRepository raceRepository;

    @Spy
    private final RaceMapper raceMapper = new RaceMapperImpl();

    private RaceController raceController = new DefaultRaceController(raceRepository, raceMapper);

    @Test
    void get_OK() throws Exception {
        //Given
        Integer MOCK_ID = 1;
        when(raceRepository.findById(MOCK_ID)).thenReturn(Optional.of(createRaceDocument(MOCK_ID)));

        //When 
        MockHttpServletResponse result = mockMvc.perform(
                MockMvcRequestBuilders
                        .get(PATH + "/" + MOCK_ID)
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        //Then
        assertEquals(createRaceDocument(MOCK_ID), toRaceDocument(result.getContentAsString()));
        assertEquals(HttpStatus.OK.value(), result.getStatus());
    }

    @Test
    void findAll_OK() throws Exception {
        // When
        MockHttpServletResponse result = mockMvc.perform(
                MockMvcRequestBuilders
                        .get(PATH)
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();
        //Then
        assertEquals(HttpStatus.OK, result.getStatus());
    }

    private RaceDocument createRaceDocument(Integer mockId) {
        RaceDocument raceDocument = new RaceDocument();
        raceDocument.setId(mockId);
        return raceDocument;
    }

    private RaceDocument toRaceDocument(String contentAsString) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(contentAsString, RaceDocument.class);
    }

}
