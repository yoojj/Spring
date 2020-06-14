package ex.bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		
		try(FileOutputStream f = new FileOutputStream(new File("src/ex/bean/board"));
			ObjectOutputStream o = new ObjectOutputStream(f);) {

			o.writeObject(board);
			
			return 1;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return -1;
	}

	@Override
	public Board select() {
		
		try(FileInputStream f = new FileInputStream(new File("src/ex/bean/board"));
				ObjectInputStream o = new ObjectInputStream(f);) {

			final Board board = (Board) o.readObject();
			
			return board;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;

	}

}