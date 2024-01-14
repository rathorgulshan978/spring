package com.myproject.springframeworkexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myproject.springframeworkexample.game.GameRunner;
import com.myproject.springframeworkexample.game.GamingConsole;
import com.myproject.springframeworkexample.game.MarioGame;
import com.myproject.springframeworkexample.game.PacmanGame;
import com.myproject.springframeworkexample.game.SuperContraGame;

public class AppGamingSpringBean {

	public static void main(String[] args) {
		
		
	try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
		
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
	}	
	
	
	}
	
}
