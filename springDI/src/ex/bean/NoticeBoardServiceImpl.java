package ex.bean;

public class NoticeBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		
		System.out.println("notice insert");
		
		return 0;
	}

	@Override
	public Board select(int bno) {
		
		System.out.println("notice select");
		
		return null;
	}

	@Override
	public int update(Board board) {
		
		System.out.println("notice update");
		
		return 0;
	}

}