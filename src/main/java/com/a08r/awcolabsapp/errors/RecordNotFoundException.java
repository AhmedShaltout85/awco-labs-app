package com.a08r.awcolabsapp.errors;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@Hidden
public class RecordNotFoundException extends RuntimeException {

	public RecordNotFoundException(String msg) {
		super(msg);
	}

}
