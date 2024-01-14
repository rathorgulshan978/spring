package com.myproject.springframeworkexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.myproject.springframeworkexample.game.GameRunner;
import com.myproject.springframeworkexample.game.GamingConsole;
import com.myproject.springframeworkexample.game.PacmanGame;

@Configuration
@ComponentScan(basePackages = "com.myproject.springframeworkexample")
public class GamingConfiguration {

//	@Bean
//	public GamingConsole game() {
//		return new PacmanGame();
//	}
//	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		return new GameRunner(game);
//	}
	
// remove above commented lines if you don't want to use @ComponentScan
	

}
