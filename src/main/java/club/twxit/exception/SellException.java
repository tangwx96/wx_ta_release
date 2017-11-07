package club.twxit.exception;

import club.twxit.enums.ResultEnum;

public class SellException extends RuntimeException{
   private Integer code;

public SellException(ResultEnum resultEunm) {
	super(resultEunm.getMessage());
	// TODO Auto-generated constructor stub
	this.code = resultEunm.getCode();
}
   
}
