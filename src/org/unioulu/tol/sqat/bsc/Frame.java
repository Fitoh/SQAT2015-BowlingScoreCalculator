package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow = 0;
	private int secondThrow = 0;
	private int score;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		score = firstThrow + secondThrow;
		return score;
	}
	
	//the score of a single frame first throw
	public int firstThrowScore(){
		return firstThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if (firstThrow == 10){
			return true;
		}
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if (firstThrow + secondThrow == 10 && firstThrow != 10){
			return true;
		}
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}
}
