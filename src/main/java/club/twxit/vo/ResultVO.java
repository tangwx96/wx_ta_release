package club.twxit.vo;

public class ResultVO<T> {
	
	/**
	 * 错误码：0 success
	 */
   private Integer code;
   private String message;  //提示信息
   private T data;   //具体内容
public Integer getCode() {
	return code;
}
public void setCode(Integer code) {
	this.code = code;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public T getData() {
	return data;
}
public void setData(T data) {
	this.data = data;
}
   
   
}
