package com.a08r.awcolabsapp.repositores;

import com.a08r.awcolabsapp.models.labsdailytestsentity.LabsDailyTestsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILabsDailyTestsRepository extends JpaRepository<LabsDailyTestsEntity, Float> {
//    @Procedure
//     List<LabsDailyTestsEntity> Lab_Parameters(int labCode, String testDate);


    //1-this way is run good with stored procedure
//    @Query(value = "EXEC Lab_Parameters ?1, ?2", nativeQuery = true) // used with any return type
//    List<Float> Lab_Parameters(@Param("Lab_Code") int labCode, @Param("Test_Date") String testDate);

    //2-this way is run good with stored procedure
//    @Procedure(name = "Lab_Parameters") // used with any return type
//    List<Float> Lab_Parameters(@Param("Lab_Code") int labCode, @Param("Test_Date") String testDate);

    //3-this way is run good with stored procedure
    @Procedure(name = "Lab_Parameters") // used with any return type
    List<Float> Lab_Parameters(@Param("Lab_Code") int labCode, @Param("Test_Date") String testDate);


}
