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
    //4-this way is run good with stored procedure(MUST DEFINE CORRECT RETURN TYPE)
    @Procedure
     List<Float> Lab_Parameters(int labCode, String testDate); // used with any return type


    //1-this way is run good with stored procedure(position args must added in the same arrange)
//    @Query(value = "EXEC Lab_Parameters ?1, ?2", nativeQuery = true) // used with any return type
//    List<Float> Lab_Parameters(@Param("Lab_Code") int labCode, @Param("Test_Date") String testDate);

    //1-this way is run good with stored procedure(named args)
//    @Query(value = "EXEC Lab_Parameters :Lab_Code, :Test_Date", nativeQuery = true) // used with any return type
//    List<Float> Lab_Parameters(@Param("Lab_Code") int labCode, @Param("Test_Date") String testDate);

    //2-this way is run good with stored procedure
//    @Procedure(name = "Lab_Parameters") // used with any return type
//    List<Float> Lab_Parameters(@Param("Lab_Code") int labCode, @Param("Test_Date") String testDate);

    //3-this way is run good with stored procedure
//    @Procedure(name = "Lab_Parameters") // used with any return type
//    List<Float> Lab_Parameters(@Param("Lab_Code") int labCode, @Param("Test_Date") String testDate);

// TODO:// IF NOT DEFINE CORRECT RETURN TYPE YOU GET ERROR LIKE(${COLUMN-NAME} NOT FOUND || NOT HAVE COLUMN WITH ${COLUMN-NAME})
}
