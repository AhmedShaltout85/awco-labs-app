package com.a08r.awcolabsapp.services;

import com.a08r.awcolabsapp.models.dto.LabsDailyTestDTO;
import com.a08r.awcolabsapp.models.labsdailytestsentity.LabsDailyTestsEntity;
import com.a08r.awcolabsapp.models.mapper.ILabsDailyTestsMapper;
import com.a08r.awcolabsapp.models.mapper.LabsDailyTestsMapperImpl;
import com.a08r.awcolabsapp.repositores.ILabsDailyTestsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Transactional
@Service
public class LabsDailyTestsServicesImpl implements ILabsDailyTestsServices {
    private final ILabsDailyTestsRepository iLabsDailyTestsRepository;
    private static final ILabsDailyTestsMapper I_LABS_DAILY_TESTS_MAPPER = new LabsDailyTestsMapperImpl();

    @Autowired
    public LabsDailyTestsServicesImpl(ILabsDailyTestsRepository iLabsDailyTestsRepository) {
        this.iLabsDailyTestsRepository = iLabsDailyTestsRepository;
    }


//    @Override
//    public ResponseEntity<List<LabsDailyTestDTO>> findTestValueAVG(int labCode, String testDate) {
//        List<LabsDailyTestsEntity> labsDailyTestsEntityList = iLabsDailyTestsRepository.Lab_Parameters(labCode, testDate);
//        List<LabsDailyTestDTO> labsDailyTestDTOList = labsDailyTestsEntityList
//                .stream()
//                .map(I_LABS_DAILY_TESTS_MAPPER::labsDailyTestsEntityToLabsDailyTestsDTO)
//                .collect(Collectors.toList());
//
//        if (labsDailyTestDTOList.isEmpty()) {
//            throw new com.a08r.restfulapirelations.errors.RecordNotFoundException("Sorry, The TEST-VALUE with lab_code and test_date : " + labCode + " AND " + testDate + " not found!...");
//        }
//        return new ResponseEntity<>(labsDailyTestDTOList, HttpStatus.OK);
//    }

    @Override
    public ResponseEntity<List<Float>> findTestValueAVG(int labCode, String testDate) {
        List<Float> list = iLabsDailyTestsRepository.Lab_Parameters(labCode, testDate);
        if (list.isEmpty() || testDate.isEmpty() || labCode == 0) {
            throw new com.a08r.restfulapirelations.errors.RecordNotFoundException("Sorry, The TEST-VALUES with lab_code and test_date : " + labCode + " AND " + testDate + " NOT Found!...");
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<LabsDailyTestDTO>> findAll() {
        List<LabsDailyTestsEntity> labsDailyTestsEntityList = iLabsDailyTestsRepository.findAll();
        List<LabsDailyTestDTO> labsDailyTestDTOList = labsDailyTestsEntityList
                .stream()
                .map(I_LABS_DAILY_TESTS_MAPPER::labsDailyTestsEntityToLabsDailyTestsDTO)
                .collect(Collectors.toList());
        if (labsDailyTestDTOList.isEmpty()) {
            throw new com.a08r.restfulapirelations.errors.RecordNotFoundException("Sorry, The TEST-VALUE with lab_code and test_date :  No DATA Found!...");
        }
        return new ResponseEntity<>(labsDailyTestDTOList, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<LabsDailyTestDTO> findBySerial(float serial) {
        Optional<LabsDailyTestsEntity> element = iLabsDailyTestsRepository.findById(serial);
        if (element.isEmpty()) {
            throw new com.a08r.restfulapirelations.errors.RecordNotFoundException("The Break with ID: " + serial + " NOT Found!...");
        }
        LabsDailyTestDTO labsDailyTestDTO = I_LABS_DAILY_TESTS_MAPPER.labsDailyTestsEntityToLabsDailyTestsDTO(element.get());
        return new ResponseEntity<>(labsDailyTestDTO, HttpStatus.OK);
    }
}

