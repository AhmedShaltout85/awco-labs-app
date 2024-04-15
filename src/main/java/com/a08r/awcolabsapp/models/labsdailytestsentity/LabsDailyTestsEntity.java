package com.a08r.awcolabsapp.models.labsdailytestsentity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "labs_daily_tests")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@NamedStoredProcedureQuery(
        name = "Lab_Parameters",
        procedureName = "Lab_Parameters",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "Lab_Code"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "Test_Date"),

        }
)
public class LabsDailyTestsEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @Column(name = "general_serial")
    private float generalSerial;

    @Column(name = "test_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm")
    @Temporal(TemporalType.DATE)
    private Date testDate;

    @Column(name = "lab_code")
    private int labCode;

    @Column(name = "test_value", length = 53)
    private float testValueAvg;
//
//    @Temporal(TemporalType.DATE)
//    @Column(name = "approving_date")
//    private Date approving_date;
//
//    @Column(name = "batche_name", length = 150)
//    private String batche_name;
//
//    @Column(name = "chemist_user_name", length = 150)
//    private String chemist_user_name;
//
//    @Column(name = "Lab_Manger_user_name", length = 150)
//    private String Lab_Manger_user_name;
//
//    @Column(name = "lab_name", length = 150)
//    private String lab_name;
//
//    @Column(name = "out_of_range_text", length = 50)
//    private String out_of_range_text;
//
//    @Column(name = "sample_code", length = 10)
//    private int sample_code;
//
//    @Column(name = "sample_descraption", length = 250)
//    private String sample_descraption;
//
//    @Column(name = "sample_kind", length = 200)
//    private String sample_kind;
//
//    @Column(name = "sample_lab_code", length = 10)
//    private int sample_lab_code;
//
//    @Column(name = "sample_lab_name", length = 150)
//    private String sample_lab_name;
//
//    @Column(name = "sample_name", length = 150)
//    private String sample_name;
//
//    @Column(name = "sample_x", length = 53)
//    private double sample_x;
//
//    @Column(name = "sample_y", length = 53)
//    private String sample_y;
//
//    @Column(name = "sector_name", length = 150)
//    private String sector_name;
//
//    @Column(name = "test_code", length = 10)
//    private int test_code;
//
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm")
//    @Temporal(TemporalType.DATE)
//    @Column(name = "test_entering_date", length = 23)
//    private String test_entering_date;
//
//    @Column(name = "test_group_name", length = 200)
//    private String test_group_name;
//
//    @Column(name = "test_hour", length = 200)
//    private String test_hour;
//
//    @Column(name = "test_hour_code", length = 10)
//    private int test_hour_code;
//
//    @Column(name = "test_is_approved", length = 10)
//    private int test_is_approved;
//
//    @Column(name = "test_max_value", length = 53)
//    private double test_max_value;
//
//    @Column(name = "test_min_value", length = 53)
//    private double test_min_value;
//
//    @Column(name = "test_name_arabic", length = 200)
//    private String test_name_arabic;
//
//    @Column(name = "test_name_english", length = 200)
//    private String test_name_english;
//
//    @Column(name = "test_period", length = 200)
//    private String test_period;
//
//    @Column(name = "test_pointers_kind", length = 200)
//    private String test_pointers_kind;
//
//    @Column(name = "test_result_time", length = 50)
//    private String test_result_time;
//
//    @Column(name = "test_spesifc_code", length = 100)
//    private String test_spesifc_code;
//
//    @Column(name = "test_unit", length = 100)
//    private String test_unit;
//
//    @Column(name = "test_value_one_year_ago", length = 53)
//    private double test_value_one_year_ago;
//
//    @Column(name = "test_value_out_of_range", length = 10)
//    private int test_value_out_of_range;

}









