package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.*;

public class TestBowlingScoreCalculator {

	Frame frame1;
	
	public void createFrame(){
	frame1 = new Frame(2,4);
	}
	
	@Test
	public void testScore() {
		assertEquals(8,frame1.score());
	}

}
