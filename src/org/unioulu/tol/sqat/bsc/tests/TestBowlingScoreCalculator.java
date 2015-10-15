package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.*;

public class TestBowlingScoreCalculator {

	Frame frame1;
	
	public void createFrame(){
	frame1 = new Frame(2,6);
	}
	
	@Test
	public void testScore() {
		// act
		createFrame();
		
		// assert
		assertEquals(6,frame1.score());
	}

}
