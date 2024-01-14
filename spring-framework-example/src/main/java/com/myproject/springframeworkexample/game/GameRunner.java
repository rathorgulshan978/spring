package com.myproject.springframeworkexample.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
  public void run() {
	  System.out.println("Game Running :" + game);
	  game.up();
	  game.down();
	  game.left();
	  game.right();
  }
}
