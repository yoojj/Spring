package ex.board.spring.board.dto;

public class BoardGroupInfoDTO {

	private int bno;
	private int groupBno;
	private int groupOrder;
	private int groupDepth;
	
	public int getBno() {
		return bno;
	}
	
	public void setBno(int bno) {
		this.bno = bno;
	}
	
	public int getGroupBno() {
		return groupBno;
	}
	
	public void setGroupBno(int groupBno) {
		this.groupBno = groupBno;
	}
	
	public int getGroupOrder() {
		return groupOrder;
	}
	
	public void setGroupOrder(int groupOrder) {
		this.groupOrder = groupOrder;
	}
	
	public int getGroupDepth() {
		return groupDepth;
	}
	
	public void setGroupDepth(int groupDepth) {
		this.groupDepth = groupDepth;
	}

	public String toSting(){
		
		final StringBuffer sb = new StringBuffer();
		
		sb.append("\n");
		sb.append(this.getClass().getName()).append("\n");
		sb.append("번호           [ " + bno + " ] \n");
		sb.append("그룹 번호      [ " + groupBno + " ] \n");
		sb.append("그룹 순서      [ " + groupOrder + " ] \n");
		sb.append("그룹 계층      [ " + groupDepth + " ] \n");

		return sb.toString();
	}
	
}