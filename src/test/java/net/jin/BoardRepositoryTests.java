package net.jin;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.jin.domain.Board;
import net.jin.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTests {
	
	@Autowired
	private BoardRepository boardRepo;
	
	@Test
	public void inspect() {
		
	}
	
	@Test
	public void insert() {
		Board board = new Board();
		board.setTitle("Title");
		board.setContent("Content");
		board.setWriter("Writer");
		
		boardRepo.save(board);
	}
}
