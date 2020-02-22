package ex.bean;

public class CommunityBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		
		System.out.println("community insert");
		
		return 0;
	}

	@Override
	public Board select(int bno) {
		
		System.out.println("community select");
		
		return null;
	}

	@Override
	public int update(Board board) {
		
		System.out.println("community update");
		
		return 0;
	}

}