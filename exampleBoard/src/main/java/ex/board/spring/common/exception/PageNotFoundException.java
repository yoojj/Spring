package ex.board.spring.common.exception;

public class PageNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public PageNotFoundException() {
		super();
	}
	
	public PageNotFoundException(String msg) {
		super(msg);
	}

}