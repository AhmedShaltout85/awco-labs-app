package com.a08r.awcolabsapp.models.mapper;

import com.a08r.awcolabsapp.models.dto.LabsDailyTestDTO;
import com.a08r.awcolabsapp.models.labsdailytestsentity.LabsDailyTestsEntity;

import java.sql.Date;

public class LabsDailyTestsMapperImpl implements ILabsDailyTestsMapper{
    @Override
    public LabsDailyTestsEntity labsDailyTestsDTOToLabsDailyTestsEntity(LabsDailyTestDTO labsDailyTestDTO) {
        LabsDailyTestsEntity labsDailyTestsEntity = new LabsDailyTestsEntity();
        labsDailyTestsEntity.setLabCode(labsDailyTestDTO.getLabCode());
        labsDailyTestsEntity.setTestDate(Date.valueOf(labsDailyTestDTO.getTestDate()));
        labsDailyTestsEntity.setTestValueAvg(labsDailyTestDTO.getTestValueAvg());
        return labsDailyTestsEntity;
    }

    @Override
    public LabsDailyTestDTO labsDailyTestsEntityToLabsDailyTestsDTO(LabsDailyTestsEntity labsDailyTestsEntity) {
        LabsDailyTestDTO labsDailyTestDTO = new LabsDailyTestDTO();
        labsDailyTestDTO.setLabCode(labsDailyTestsEntity.getLabCode());
        labsDailyTestDTO.setTestDate(String.valueOf(labsDailyTestsEntity.getTestDate()));
        labsDailyTestDTO.setTestValueAvg(labsDailyTestsEntity.getTestValueAvg());
        return labsDailyTestDTO;
    }

    @Override
    public Double labsDTOtoDouble(LabsDailyTestDTO labsDailyTestDTO) {
        return labsDailyTestDTO.getTestValueAvg();
    }
}
