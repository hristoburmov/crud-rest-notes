package eu.burmov.crudrestnotes.rest;

import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Order(2)
public class NoteRestExceptionHandler {
	
	@ExceptionHandler(NoteNotFoundException.class)
	public ResponseEntity<NoteErrorResponse> noteNotFoundExceptionHandler(Exception e) {
		NoteErrorResponse response = new NoteErrorResponse(HttpStatus.NOT_FOUND.value(), new String[] { e.getMessage() }, System.currentTimeMillis());
		return new ResponseEntity<NoteErrorResponse>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<NoteErrorResponse> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
		List<ObjectError> errorObjects = e.getBindingResult().getAllErrors();
		String[] errors = new String[errorObjects.size()];
		for(int i = 0; i < errors.length; i++) {
			errors[i] = errorObjects.get(i).getDefaultMessage();
		}
		NoteErrorResponse response = new NoteErrorResponse(HttpStatus.BAD_REQUEST.value(), errors, System.currentTimeMillis());
		return new ResponseEntity<NoteErrorResponse>(response, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<NoteErrorResponse> exceptionHandler(Exception e) {
		NoteErrorResponse response = new NoteErrorResponse(HttpStatus.BAD_REQUEST.value(), new String[] { e.getMessage() }, System.currentTimeMillis());
		return new ResponseEntity<NoteErrorResponse>(response, HttpStatus.BAD_REQUEST);
	}

}
