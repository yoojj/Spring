package ex.board.spring.common.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Comment implements Serializable {
	
	private int cno;
	private int bno;
	private String content;
	private int allStar;
	private int allBlock;
	private String writer;
	private String insertDate;
	private String updateDate;
	private String deleteDate;
	private boolean secret;
	private boolean block;
	private boolean status;
	
	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getAllStar() {
		return allStar;
	}

	public void setAllStar(int allStar) {
		this.allStar = allStar;
	}

	public int getAllBlock() {
		return allBlock;
	}

	public void setAllBlock(int allBlock) {
		this.allBlock = allBlock;
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

	public boolean isSecret() {
		return secret;
	}

	public void setSecret(boolean secret) {
		this.secret = secret;
	}

	public boolean isBlock() {
		return block;
	}

	public void setBlock(boolean block) {
		this.block = block;
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
		sb.append("댓글 번호      [ " + cno + " ] \n");
		sb.append("게시물 번호    [ " + bno + " ] \n");
		sb.append("내용           [ " + content + " ] \n");
		sb.append("스타 개수      [ " + allStar + " ] \n");
		sb.append("블락 개수      [ " + allBlock + " ] \n");
		sb.append("등록자         [ " + writer + " ] \n");
		sb.append("등록일         [ " + insertDate + " ] \n");
		sb.append("수정일         [ " + updateDate + " ] \n");
		sb.append("삭제일         [ " + deleteDate + " ] \n");
		sb.append("비밀 여부      [ " + secret + " ] \n");
		sb.append("블락 여부      [ " + block + " ] \n");
		sb.append("댓글 상태      [ " + status + " ] \n");
		
		return sb.toString();
	}
	
}