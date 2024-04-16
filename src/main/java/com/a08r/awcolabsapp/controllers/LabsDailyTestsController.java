package com.a08r.awcolabsapp.controllers;

import com.a08r.awcolabsapp.models.dto.LabsDailyTestDTO;
import com.a08r.awcolabsapp.services.ILabsDailyTestsServices;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Tests-AVG-Values")
@RestController
@RequestMapping(path = "/api/v1/avg")
public class LabsDailyTestsController {
    private final ILabsDailyTestsServices iLabsDailyTestsServices;

    @Autowired
    public LabsDailyTestsController(ILabsDailyTestsServices iLabsDailyTestsServices) {
        this.iLabsDailyTestsServices = iLabsDailyTestsServices;
    }

//    @GetMapping(path ="/filter/lab-code/test-date/{labCode}/{testDate}")
//    public ResponseEntity<List<LabsDailyTestDTO>>
//    findByLabCodeAndTestDate(@PathVariable int labCode, @PathVariable String testDate){
//
//        return this.iLabsDailyTestsServices.findTestValueAVG(labCode,testDate);
//    }
        @GetMapping(path ="/filter/lab-code/test-date/{labCode}/{testDate}")
    public ResponseEntity<List<Float>>
    findByLabCodeAndTestDate(@PathVariable int labCode, @PathVariable String testDate){

        return this.iLabsDailyTestsServices.findTestValueAVG(labCode,testDate);
    }

//    @GetMapping(path = "/total")
//    public ResponseEntity<List<LabsDailyTestDTO>> findAll(){
//
//        return this.iLabsDailyTestsServices.findAll();
//    }
//
//    @GetMapping(path ="/{serial}" )
//    public ResponseEntity<LabsDailyTestDTO> findBySerial(@PathVariable float serial){
//        return this.iLabsDailyTestsServices.findBySerial(serial);
//    }

}
