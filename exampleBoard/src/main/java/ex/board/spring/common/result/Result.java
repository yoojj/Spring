package ex.board.spring.common.result;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Result implements Serializable {

	private int code = ResultEnum.ERROR.getCode();
	private String message = ResultEnum.ERROR.getDescription();
	private Object result;
	private ResultMap resultMap;

	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
	
	public ResultMap getResultMap() {
		return resultMap;
	}

	public void setResultMap(ResultMap map) {
		this.resultMap = map;
	}
	
	public String toSting(){
		
		final StringBuffer sb = new StringBuffer();
		
		sb.append("\n");
		sb.append(this.getClass().getName()).append("\n");
		sb.append("결과 코드  [ " + code + " ] \n");
		sb.append("메시지     [ " + message + " ] \n");
		
		return sb.toString();
	}

}