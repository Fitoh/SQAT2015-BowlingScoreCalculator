package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.*;

public class TestBowlingScoreCalculator {

	Frame frame1;
	Frame frame2;
	Frame frame3;
	Frame frame4;
	Frame frame5;
	Frame frame6;
	Frame frame7;
	Frame frame8;
	Frame frame9;
	Frame frame10;
	BowlingGame game1;
	
	public void createFrames(){
		frame1 = new Frame(1,5);
		frame2 = new Frame(3,6);
		frame3 = new Frame(7,2);
		frame4 = new Frame(3,6);
		frame5 = new Frame(4,4);
		frame6 = new Frame(5,3);
		frame7 = new Frame(3,3);
		frame8 = new Frame(4,5);
		frame9 = new Frame(8,1);
		frame10 = new Frame(2,6);
	}
	
	public void createFramesWithStrike(){
		frame1 = new Frame(10,0);
		frame2 = new Frame(3,6);
		frame3 = new Frame(7,2);
		frame4 = new Frame(3,6);
		frame5 = new Frame(4,4);
		frame6 = new Frame(5,3);
		frame7 = new Frame(3,3);
		frame8 = new Frame(4,5);
		frame9 = new Frame(8,1);
		frame10 = new Frame(2,6);
	}
	
	public void createFramesWithSpare(){
		frame1 = new Frame(1,9);
		frame2 = new Frame(3,6);
		frame3 = new Frame(7,2);
		frame4 = new Frame(3,6);
		frame5 = new Frame(4,4);
		frame6 = new Frame(5,3);
		frame7 = new Frame(3,3);
		frame8 = new Frame(4,5);
		frame9 = new Frame(8,1);
		frame10 = new Frame(2,6);
	}
	
	public void createFramesWithStrikeAndSpare(){
		frame1 = new Frame(10,0);
		frame2 = new Frame(4,6);
		frame3 = new Frame(7,2);
		frame4 = new Frame(3,6);
		frame5 = new Frame(4,4);
		frame6 = new Frame(5,3);
		frame7 = new Frame(3,3);
		frame8 = new Frame(4,5);
		frame9 = new Frame(8,1);
		frame10 = new Frame(2,6);
	}
	
	public void createFramesWithMultipleStrikes(){
		frame1 = new Frame(10,0);
		frame2 = new Frame(10,0);
		frame3 = new Frame(7,2);
		frame4 = new Frame(3,6);
		frame5 = new Frame(4,4);
		frame6 = new Frame(5,3);
		frame7 = new Frame(3,3);
		frame8 = new Frame(4,5);
		frame9 = new Frame(8,1);
		frame10 = new Frame(2,6);
	}
	
	public void createGame(){
		game1 = new BowlingGame();
		game1.addFrame(frame1);
		game1.addFrame(frame2);
		game1.addFrame(frame3);
		game1.addFrame(frame4);
		game1.addFrame(frame5);
		game1.addFrame(frame6);
		game1.addFrame(frame7);
		game1.addFrame(frame8);
		game1.addFrame(frame9);
		game1.addFrame(frame10);
	}
	
	@Test
	public void testScoreOfSingleFrame() {
		// act
		createFrames();
		
		// assert
		assertEquals(6,frame1.score());
	}
	
	@Test
	public void testScoreOfSingleGame() {
		// act
		createFrames();
		createGame();
		
		// assert should be 81
		assertEquals(80,game1.score());
	}
	
	@Test
	public void testScoreOfSingleGameWithStrike() {
		// act
		createFramesWithStrike();
		createGame();
		
		// assert should be 94
		assertEquals(95,game1.score());
	}
	
	@Test
	public void testScoreOfSingleGameWithSpare() {
		// act
		createFramesWithSpare();
		createGame();
		
		// assert should be 88
		assertEquals(89,game1.score());
	}
	
	@Test
	public void testScoreOfSingleGameWithStrikeAndSpare() {
		// act
		createFramesWithStrikeAndSpare();
		createGame();
		
		// assert should be 103
		assertEquals(102,game1.score());
	}
	
	@Test
	public void testScoreOfSingleGameWithMultipleStrikes() {
		// act
		createFramesWithMultipleStrikes();
		createGame();
		
		// assert should be 112
		assertEquals(113,game1.score());
	}

}
