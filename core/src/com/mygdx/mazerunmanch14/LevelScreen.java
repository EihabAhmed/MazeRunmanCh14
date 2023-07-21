package com.mygdx.mazerunmanch14;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class LevelScreen extends BaseScreen {
    Maze maze;

    @Override
    public void initialize() {
        fitViewport = new FitViewport(768, 700);
        camera.setToOrtho(false, 768, 700);

        BaseActor background = new BaseActor(0, 0, mainStage);
        background.loadTexture("white.png");
        background.setColor(Color.GRAY);
        background.setSize(768, 700);

        maze = new Maze(mainStage);
    }

    @Override
    public void update(float dt) {
    }

    @Override
    public boolean keyDown(int keyCode) {
        if (keyCode == Keys.R)
            BaseGame.setActiveScreen(new LevelScreen());

        return false;
    }
}