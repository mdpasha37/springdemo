package com.pasha.gamerunner;

import com.pasha.gamerunner.game.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    private final GamingConsole game;
    
    public GameRunner(GamingConsole game) {
        this.game=game;
    }

    public void runGame() {
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
