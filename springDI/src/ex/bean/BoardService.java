package ex.bean;

public interface BoardService {

	public int insert (final Board board);
	public Board select (final int bno);
	public int update (final Board board);
	
}