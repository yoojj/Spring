package ex.board.spring.board.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import ex.board.spring.board.dto.BoardGroupInfoDTO;
import ex.board.spring.board.mapper.BoardMapper;
import ex.board.spring.common.vo.Board;
import ex.board.spring.common.vo.Paging;
import ex.board.spring.common.vo.Search;

@Repository
public class BoardRepository {

	private BoardMapper boardMapper;
	
	public BoardRepository(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}
	
	
	
	/* insert */
	public void inset(Board board) throws Exception {
		this.boardMapper.insert(board);
	}
	
	
	
	/* select */ 
	public int selectBno(int bno) throws Exception {
		
		int result = this.boardMapper.selectBno(bno);

		if(result == 0) {
			throw new Exception("존재하지 않는 게시물입니다.");
		}
		
		return result;
	}
	
	public int selectTotalPost() throws Exception {

		final int result = this.boardMapper.selectTotalPost();

		if(result < 0) {
			throw new Exception("데이터 베이스 오류");
		}

		return result;
	}
	
	public int selectTotalPost(Search search) throws Exception {

		final int result = this.boardMapper.selectSearchTotalPost(search);

		if(result < 0) {
			throw new Exception("데이터 베이스 오류");
		}

		return result;
	}
	
	public BoardGroupInfoDTO selectGroupInfo(int bno) throws Exception {
	
		final BoardGroupInfoDTO info = this.boardMapper.selectGroupInfo(bno);
		
		return info;
	}
	
	public Board select(int bno) throws Exception {
		
		final Board board = this.boardMapper.select(bno);
		
		if(board == null) {
			throw new Exception("데이터 베이스 오류");
		}

		return board;
	}
	
	public List<Board> selectList(Paging paging) throws Exception {
		
		final List<Board> list = this.boardMapper.selectList(paging);

		if(list == null) {
			throw new Exception("데이터 베이스 오류");
		}

		return list;
	}

	public List<Board> selectSearchList(Search search, Paging paging) throws Exception {

		final List<Board> list = this.boardMapper.selectSearchList(search, paging);

		if(list == null) {
			throw new Exception("데이터 베이스 오류");
		}

		return list;
	}
	
	
	
	/* update */ 
	public void updateGroupBno(int bno) throws Exception {
	
		int result = this.boardMapper.updateGroupBno(bno);

		if(result == 0) {
			throw new Exception("데이터 베이스 오류");
		}
		
	}

	public void updateGroupOrder(int bno) throws Exception {

		int result = this.boardMapper.updateGroupOrder(bno);

		if(result == 0) {
			throw new Exception("데이터 베이스 오류");
		}

	}
	
	public void updateGroupDepth(int bno) throws Exception {

		int result = this.boardMapper.updateGroupDepth(bno);

		if(result == 0) {
			throw new Exception("데이터 베이스 오류");
		}

	}
	
	public void updateGroupOrderAndDepth(int bno) throws Exception {

		int result = this.boardMapper.updateGroupOrderAndDepth(bno);

		if(result == 0) {
			throw new Exception("데이터 베이스 오류");
		}

	}
	
	public void updateHit(int bno) throws Exception {
		
		int result = this.boardMapper.updateHit(bno);

		if(result == 0) {
			throw new Exception("데이터 베이스 오류");
		}
		
	}
	
	public void update(Board board) throws Exception {
		
		int result = this.boardMapper.update(board);

		if(result == 0) {
			throw new Exception("데이터 베이스 오류");
		}
		
	}
	
	
	
	/* delete */
	public void delete(int bno) throws Exception {

		int result = this.boardMapper.delete(bno);

		if(result == 0) {
			throw new Exception("데이터 베이스 오류");
		}

	}
	
}