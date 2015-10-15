package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.*;

public class TestBowlingScoreCalculator {

	Frame frame1;
	BowlingGame game1;
	
	public void createFrame(){
	frame1 = new Frame(0,9);
	}
	
	public void createGame(){
		game1 = new BowlingGame();
	}
	
	@Test
	public void testScore() {
		// act
		createFrame();
		
		// assert
		assertEquals(9,frame1.score());
	}
	
	public void testDefineGame() {
		// act
		createGame();
		
		// assert
		//assertEquals(9,frame1.score());
	}

}
