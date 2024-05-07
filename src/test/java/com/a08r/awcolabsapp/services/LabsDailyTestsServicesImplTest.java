package com.a08r.awcolabsapp.services;

import com.a08r.awcolabsapp.models.mapper.LabsDailyTestsMapperImpl;
import com.a08r.awcolabsapp.repositores.ILabsDailyTestsRepository;
import org.aspectj.weaver.AnnotationAnnotationValue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.lang.model.element.AnnotationValue;

import static org.junit.jupiter.api.Assertions.*;

class LabsDailyTestsServicesImplTest {
    @InjectMocks
    private LabsDailyTestsServicesImpl labsDailyTestsServices ;
    @Mock
    private ILabsDailyTestsRepository iLabsDailyTestsRepository;
    @Mock
    private LabsDailyTestsMapperImpl labsDailyTestsMapperImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @Disabled
    public void shouldFindTestValueAVG() {
    }

    @Test
    @Disabled
   public void shouldFindAll() {


    }

    @Test
    @Disabled
   public void shouldFindBySerial() {
    }
}