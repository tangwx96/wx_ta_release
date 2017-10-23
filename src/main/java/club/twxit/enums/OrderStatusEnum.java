package club.twxit.enums;

public enum OrderStatusEnum {
	 NEW(0, "新订单"),
	 FINISHED(1, "完结"),
	 CANCEL(2, "已取消"),
	    ;
	private Integer code;
	private String message;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	private OrderStatusEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
