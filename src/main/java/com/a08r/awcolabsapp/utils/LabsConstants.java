package com.a08r.awcolabsapp.utils;

public class LabsConstants {
    public static final String QUERY= "SELECT ROUND((test_value), 3) AVG_Test_Value " +
            "FROM labs_daily_tests " +
            "WHERE lab_code = :labCode " +
            "AND test_date = :testDate " +
            "AND test_is_approved = 1 " +
            "AND test_code = 44 " +
            "AND test_value IS NOT NULL;";
}
