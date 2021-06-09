package com.snake;

public class CheckOptionUc3 {
	public static int playerPosition = 0;
	public static final int noPlay = 0;
	public static final int ladder = 1;
	public static final int snake = 2;
	public static void main(String args[]) {
		System.out.println("Welcome to SnakeAndLadder Game");
		
		int rollDice = (int) (Math.floor(Math.random()*(6)+1));
		int option = (int) ((Math.random()*10)%3);
		
		switch(option) {
		case noPlay:
			//Player stays in the same position
			       playerPosition = 0;
			       System.out.println("Player position is: "+playerPosition);
			       break;
			       
		case ladder:
			//Player moves ahead 
			      playerPosition += rollDice;
			      System.out.println("Player position is: "+playerPosition);
			      break;
			      
		case snake:
			//Player moves behind
			 playerPosition -= rollDice;
		      System.out.println("Player position is: "+playerPosition);
		      break;
		      
		      
			
		}
	}

}
