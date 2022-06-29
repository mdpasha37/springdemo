package com.pasha.gamerunner;

import com.pasha.gamerunner.game.MarioGame;
import com.pasha.gamerunner.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pasha.gamerunner")
public class GameRunnerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(GameRunnerApplication.class, args);
        //GameRunner, MarioGame
        GameRunner runner = context.getBean(GameRunner.class);

//        MarioGame game = new MarioGame();
//        SuperContraGame game = new SuperContraGame();
//        GameRunner runner = new GameRunner(game);

        runner.runGame();
    }

}
