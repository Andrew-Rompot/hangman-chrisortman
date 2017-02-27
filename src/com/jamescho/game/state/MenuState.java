package com.jamescho.game.state;

import com.jamescho.game.main.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 * Created by cortman on 2/19/17.
 */
public class MenuState extends State {
    @Override
    public void init() {
        System.out.println("Entered MenuState");
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        Resources.explosion.loop();
        g.drawImage(Resources.welcome,0,0,null );
    }

    @Override
    public void onClick(MouseEvent e) {
        if(e.getClickCount() == 2) {
            setCurrentState(new GameState());
        }
    }

    @Override
    public void onKeyPress(KeyEvent e) {
        System.out.println("Pressed the " + e.getKeyChar() + " key");
    }

    @Override
    public void onKeyRelease(KeyEvent e) {

    }
}
