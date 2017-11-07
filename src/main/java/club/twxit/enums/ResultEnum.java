package club.twxit.enums;

public enum ResultEnum {
	PRODUCT_NOT_EXIST(10,"商品不存在"),;
	private Integer code;
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
	private  String message;
	private ResultEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	
}
