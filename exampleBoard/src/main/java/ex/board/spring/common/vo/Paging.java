package ex.board.spring.common.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Paging implements Serializable {

	/** 전체 글 개수 */
	private int allPost;
	
	/** 한 페이지에 보여질 글 수 */
	private int postList;

	/** 페이지네이션에 보여질 페이지 수 */
	private int pageList;
	
	/** 요청 페이지 */
	private int page;
	
	/** 글 시작점  */
	private int postMark;
	
	/** 페이지 시작 */
	private int pageStart;
	
	/** 페이지 끝 */
	private int pageEnd;
	
	public Paging() {
		
		// 설정이 없을 경우 기본 값
		this.postList = 3;
		this.pageList = 3;
		this.pageStart = 1;
		
	}
	
	public Paging(int postList, int pageList) {
		
		this.postList = postList;
		this.pageList = pageList;
		this.pageStart = 1;
		
	}

	public void setPaging(int allPost) {

		this.setPaging(allPost, 1);
		
	}
	
	public void setPaging(int allPost, int page) {

		this.allPost = allPost;
		this.page = page;
		this.pageEnd = (this.allPost - 1) / this.postList + 1;
		
		this.init();
		
	}

	private void init() {

		if(this.page > this.pageEnd) this.page = this.pageEnd;
		
		this.postMark = (this.page - 1) * postList;
	
	}
	
	public int getAllPost() {
		return allPost;
	}

	public int getPostList() {
		return postList;
	}

	public int getPageList() {
		return pageList;
	}

	public int getPage() {
		return page;
	}

	public int getPostMark() {
		return postMark;
	}

	public int getPageStart() {
		return pageStart;
	}

	public int getPageEnd() {
		return pageEnd;
	}
	
	public String toSting(){
		
		final StringBuilder sb = new StringBuilder();
		
		sb.append("\n");
		sb.append(this.getClass().getName()).append("\n");
		sb.append("전체 게시물 개수 [ " + allPost + " ] \n");
		sb.append("보여질 글 개수   [ " + postList + " ] \n");
		sb.append("보여질 페이지 수 [ " + pageList + " ] \n");
		sb.append("요청 페이지      [ " + page + " ] \n");
		sb.append("글 시작점        [ " + postMark + " ] \n");
		sb.append("페이지 시작      [ " + pageStart + " ] \n");
		sb.append("페이지 끝        [ " + pageEnd + " ] \n");

		return sb.toString();
		
	}
	
}