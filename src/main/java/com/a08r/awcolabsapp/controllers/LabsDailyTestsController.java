package com.a08r.awcolabsapp.controllers;

import com.a08r.awcolabsapp.models.dto.LabsDailyTestDTO;
import com.a08r.awcolabsapp.services.ILabsDailyTestsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping(path = "/total")
    public ResponseEntity<List<LabsDailyTestDTO>> findAll(){

        return this.iLabsDailyTestsServices.findAll();
    }

    @GetMapping(path ="/{serial}" )
    public ResponseEntity<LabsDailyTestDTO> findBySerial(@PathVariable float serial){
        return this.iLabsDailyTestsServices.findBySerial(serial);
    }

}
