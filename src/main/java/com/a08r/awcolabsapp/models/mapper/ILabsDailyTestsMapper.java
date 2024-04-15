package com.a08r.awcolabsapp.models.mapper;

import com.a08r.awcolabsapp.models.dto.LabsDailyTestDTO;
import com.a08r.awcolabsapp.models.labsdailytestsentity.LabsDailyTestsEntity;

public interface ILabsDailyTestsMapper {
//    TrackingPointEntity trackingPointDtoToTrackingPointEntity(TrackingPointDto addTrackingPoint);
//    TrackingPointDto trackingPointEntityTotrackingPointDto(TrackingPointEntity trackingPointEntity);

    LabsDailyTestsEntity labsDailyTestsDTOToLabsDailyTestsEntity(LabsDailyTestDTO labsDailyTestDTO);
    LabsDailyTestDTO labsDailyTestsEntityToLabsDailyTestsDTO(LabsDailyTestsEntity labsDailyTestsEntity);
    Float labsDTOtoDouble(LabsDailyTestDTO labsDailyTestDTO);
}
