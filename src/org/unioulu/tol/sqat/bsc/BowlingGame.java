package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int frameScore = 0;
	private int totalScore = 0;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		for (int i = 0; i < frames.size(); i++) {
			frameScore = frames.get(i).score();
			if (frames.get(i).isStrike() == true){
				frameScore = frameScore + frames.get(i + 1).score();
			}
			if (frames.get(i).isSpare() == true){
				frameScore = frameScore + frames.get(i + 1).firstThrowScore();
			}
			totalScore = totalScore + frameScore;
		}
		return totalScore;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
