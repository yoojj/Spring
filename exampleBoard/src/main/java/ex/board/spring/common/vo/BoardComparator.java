package ex.board.spring.common.vo;

import java.util.Comparator;

public class BoardComparator implements Comparator<Board> {

	@Override
	public int compare(Board b1, Board b2) {

		if(b1.getGroupBno() == b2.getGroupBno() && b1.getGroupDepth() != b2.getGroupDepth()) {
			if(b1.getGroupDepth() < b2.getGroupDepth()) {
				return -1;
			}
		} else if(b1.getGroupBno() == b2.getGroupBno() && b1.getGroupDepth() == b2.getGroupDepth()) {
			if(b1.getGroupOrder() < b2.getGroupOrder()) {
				return 1;
			}
		} 
		
		return 0;
	}
	
}