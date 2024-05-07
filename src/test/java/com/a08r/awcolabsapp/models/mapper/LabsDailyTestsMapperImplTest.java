package com.a08r.awcolabsapp.models.mapper;

import com.a08r.awcolabsapp.models.dto.LabsDailyTestDTO;
import com.a08r.awcolabsapp.models.labsdailytestsentity.LabsDailyTestsEntity;
import org.junit.jupiter.api.*;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class LabsDailyTestsMapperImplTest {
    private LabsDailyTestsMapperImpl labsDailyTestsMapperImpl;

    @BeforeEach
    void setUp() {
        labsDailyTestsMapperImpl = new LabsDailyTestsMapperImpl();
    }

    @Test
    public void shouldMapLabsDailyTestsDTOToLabsDailyTestsEntity() {
        //Given
        LabsDailyTestDTO labsDailyTestDTO = new LabsDailyTestDTO(
                "2021-01-01",
                1,
                10.0f
        );
        //When
        LabsDailyTestsEntity labsDailyTestsEntity =
                labsDailyTestsMapperImpl.labsDailyTestsDTOToLabsDailyTestsEntity(labsDailyTestDTO);
        //Then
        assertEquals(labsDailyTestDTO.getTestValueAvg(), labsDailyTestsEntity.getTestValueAvg());
        assertEquals(labsDailyTestDTO.getLabCode(), labsDailyTestsEntity.getLabCode());
        assertEquals(labsDailyTestDTO.getTestDate(), labsDailyTestsEntity.getTestDate().toString());

    }


    @Test
    public void shouldMapLabsDailyTestsEntityToLabsDailyTestsDTO() {
        //Given
        LabsDailyTestsEntity labsDailyTestsEntity = new LabsDailyTestsEntity(
                1.0f,
                Date.valueOf("2021-01-01"),
                1,
                10.0f
        );

        //When
        LabsDailyTestDTO labsDailyTestDTO =
                labsDailyTestsMapperImpl.labsDailyTestsEntityToLabsDailyTestsDTO(labsDailyTestsEntity);
        //Then
        assertEquals(labsDailyTestsEntity.getLabCode(), labsDailyTestDTO.getLabCode());
        assertEquals(labsDailyTestsEntity.getTestValueAvg(), labsDailyTestDTO.getTestValueAvg());
        assertEquals(labsDailyTestsEntity.getTestDate().toString(), labsDailyTestDTO.getTestDate());

    }

    @Test
    public void shouldThrowNotNullExceptionWhenLabsDTOisNull() {
        var nullPointerException = assertThrows(NullPointerException.class,
                () -> labsDailyTestsMapperImpl.labsDailyTestsDTOToLabsDailyTestsEntity(null));
        assertEquals("labsDailyTestDTO should not be null", nullPointerException.getMessage());

    }

    @Test
    @Disabled
    void labsDTOtoDouble() {

    }

}