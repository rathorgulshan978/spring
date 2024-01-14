package com.myproject.springframeworkexample;

import com.myproject.springframeworkexample.game.GameRunner;
import com.myproject.springframeworkexample.game.MarioGame;
import com.myproject.springframeworkexample.game.PacmanGame;
import com.myproject.springframeworkexample.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
	//var game = new MarioGame();
	//var game = new SuperContraGame();
	var game = new PacmanGame(); // 1: Object Creation
	var gameRunner = new GameRunner(game); 
	// 2: Object Creation + Wiring of dependencies
	// Game is dependency of GameRunner
	gameRunner.run();
	}
	
}
