package ex.board.spring.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import ex.board.spring.board.dto.BoardGroupInfoDTO;
import ex.board.spring.common.vo.Board;
import ex.board.spring.common.vo.Paging;
import ex.board.spring.common.vo.Search;

@Mapper
public interface BoardMapper {

	public void insert(Board board);
	
	public int selectBno(int bno);
	public int selectTotalPost();
	public int selectSearchTotalPost(Search search);
	public BoardGroupInfoDTO selectGroupInfo(int bno);
	public Board select(int bno);
	public List<Board> selectList(Paging paging);
	public List<Board> selectSearchList(@Param("search") Search search, @Param("paging") Paging paging);
	
	public int updateGroupBno(int bno);
	public int updateGroupOrder(int bno);
	public int updateGroupDepth(int bno);
	public int updateGroupOrderAndDepth(int bno);
	public int updateHit(int bno);
	public int update(Board board);
	
	public int delete(int bno);
	
}