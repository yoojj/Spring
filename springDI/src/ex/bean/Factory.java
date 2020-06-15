package ex.bean;

public class Factory {
	
	private String str;
	
	public Factory() {
		this.str = "constructor";
	}
	
	public Factory(String str) {
		this.str = str;
	}

	public static Factory instance() {
		return new Factory("static");
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Factory [str=" + str + "]";
	}

}