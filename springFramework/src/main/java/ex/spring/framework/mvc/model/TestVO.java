package ex.spring.framework.mvc.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TestVO implements Serializable {

	private Object obj;
	private String str;
	private int num;
	
	public Object getObj() {
		return obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "TestVO [obj=" + obj + ", str=" + str + ", num=" + num + "]";
	}

}