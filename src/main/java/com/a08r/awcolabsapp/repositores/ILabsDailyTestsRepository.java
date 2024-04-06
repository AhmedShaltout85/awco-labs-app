package com.a08r.awcolabsapp.repositores;

import com.a08r.awcolabsapp.models.labsdailytestsentity.LabsDailyTestsEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILabsDailyTestsRepository extends JpaRepository<LabsDailyTestsEntity, Float> {
//    @Procedure
//     List<LabsDailyTestsEntity> Lab_Parameters(int labCode, String testDate);


//    @Query(value = "EXEC Lab_Parameters :Lab_Code, :Test_Date", nativeQuery = true)

//    @Query(value = "EXEC Lab_Parameters ?1, ?2", nativeQuery = true)
//    List<LabsDailyTestsEntity> Lab_Parameters(@Param("Lab_Code") int labCode, @Param("Test_Date") String testDate);


//    @Procedure(name = "Lab_Parameters")
//    List<LabsDailyTestsEntity> Lab_Parameters(@Param("Lab_Code") int labCode, @Param("Test_Date") String testDate);

    @Procedure(name = "Lab_Parameters")
    List<Double> Lab_Parameters(@Param("Lab_Code") int labCode, @Param("Test_Date") String testDate);


}
