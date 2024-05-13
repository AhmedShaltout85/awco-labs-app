package com.a08r.awcolabsapp.errors;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;


@AllArgsConstructor
@Data
@Hidden //to hide it from swagger docs
public class ErrorResponse {
    private static final String MY_TIME_ZONE="Africa/Cairo";
    private String code;
    private String message;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss",timezone = MY_TIME_ZONE)
    private Date timestamp;
}

//public record ErrorResponse(String code,
//                            String message,
//                            @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss",timezone = "Africa/Cairo")
//                            Date timestamp){}