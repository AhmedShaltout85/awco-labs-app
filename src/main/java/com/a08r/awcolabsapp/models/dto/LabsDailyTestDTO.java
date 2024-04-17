package com.a08r.awcolabsapp.models.dto;

import lombok.*;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabsDailyTestDTO {

    private String testDate;
    private Integer labCode;
    private Float testValueAvg;
}

//public class LabsDailyTestDTO {
//
//private final LabsDailyTestsEntity labsDailyTestsEntity;
//
//    public LabsDailyTestDTO(LabsDailyTestsEntity labsDailyTestsEntity) {
//        this.labsDailyTestsEntity = labsDailyTestsEntity;
//    }
//}

