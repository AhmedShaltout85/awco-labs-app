package com.a08r.awcolabsapp.services;

import com.a08r.awcolabsapp.models.dto.LabsDailyTestDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ILabsDailyTestsServices {
    //    ResponseEntity<List<LabsDailyTestDTO>> findTestValueAVG(int labCode, String testDate);
    ResponseEntity<List<LabsDailyTestDTO>> findAll();
    ResponseEntity<List<Double>> findTestValueAVG(int labCode, String testDate);
    ResponseEntity<LabsDailyTestDTO> findBySerial(float serial);
}
