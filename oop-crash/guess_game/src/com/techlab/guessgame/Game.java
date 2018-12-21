package com.techlab.guessgame;

public class Game {
	private  int randomNo=0;
	private  ResultOptions result;

	public int getRandomNo() {
		return randomNo;
	}
	public ResultOptions result(){
		return result;
		
	}

	public Game() {
		randomNo = (int) (Math.random() * 100);

	}

	public  ResultOptions doGuess(int number) {
		int j = 1;
		for (int i = 0; i < j; i++) {
			if (number < randomNo) {
				return ResultOptions.TOLOW;
			} else if (number > randomNo) {
				return ResultOptions.TOHIGH;
			} else {
				return ResultOptions.EQUAL;
			}

		}
		return result;
		
	}
}
