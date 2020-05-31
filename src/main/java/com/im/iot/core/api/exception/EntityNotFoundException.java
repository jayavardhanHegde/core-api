/**
 * 
 */
package com.im.iot.core.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author jayavardhan
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8911720733940631646L;

	public EntityNotFoundException(String message, Throwable cause) {
		
	}
}
