package ex.bean;

public class VO {

	private int num;
	private String str;
	private Object obj;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public Object getObj() {
		return obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "VO [num=" + num + ", str=" + str + ", obj=" + obj + "]";
	}

}