package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int totalScore;

	private String totalScoreString;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public String score(){
		totalScoreString = frames.toString();
	//	totalScore = totalScore;
		return totalScoreString;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
