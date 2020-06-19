package ex.board.spring.common.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Board implements Serializable {

	private int bno;
	private int groupBno;
	private int groupOrder;
	private int groupDepth;
	private String title;
	private String content;
	private int hit;
	private String writer;
	private String insertDate;
	private String updateDate;
	private String deleteDate;
	private boolean status;
	
	public int getBno() {
		return bno;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(String deleteDate) {
		this.deleteDate = deleteDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String toSting(){
		
		final StringBuilder sb = new StringBuilder();
		
		sb.append("\n");
		sb.append(this.getClass().getName()).append("\n");
		sb.append("번호           [ " + bno + " ] \n");
		sb.append("그룹 번호      [ " + groupBno + " ] \n");
		sb.append("그룹 순서      [ " + groupOrder + " ] \n");
		sb.append("그룹 계층      [ " + groupDepth + " ] \n");
		sb.append("제목           [ " + title + " ] \n");
		sb.append("내용           [ " + content + " ] \n");
		sb.append("조회수         [ " + hit + " ] \n");
		sb.append("등록자         [ " + writer + " ] \n");
		sb.append("등록일         [ " + insertDate + " ] \n");
		sb.append("수정일         [ " + updateDate + " ] \n");
		sb.append("삭제일         [ " + deleteDate + " ] \n");
		sb.append("글 상태        [ " + status + " ] \n");
		
		return sb.toString();
	}
	
}