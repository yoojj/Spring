package ex.board.spring.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ex.board.spring.board.dto.BoardGroupInfoDTO;
import ex.board.spring.common.vo.Board;

@Mapper
public interface BoardMapper {

	public int insert(Board board);
	
	public int selectTotalPost();
	public BoardGroupInfoDTO selectGroupInfo(int bno);
	public Board select(int bno);
	public List<Board> selectList();
	
	public int updateGroupBno(int bno);
	public int updateGroupOrder(int bno);
	public int updateGroupDepth(int bno);
	public int update(Board board);
	
	public int delete(int bno);
	
}