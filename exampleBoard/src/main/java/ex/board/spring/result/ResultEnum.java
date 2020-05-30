package ex.board.spring.result;

public enum ResultEnum {

	ERROR (0, "ERROR"),
	SUCCESS(1, "SUCCESS");
	
	private final int code;
	private final String description;
	
	private ResultEnum(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
}