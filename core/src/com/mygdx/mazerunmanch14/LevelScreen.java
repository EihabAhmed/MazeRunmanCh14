package com.mygdx.mazerunmanch14;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.MapProperties;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class LevelScreen extends BaseScreen {

    @Override
    public void initialize() {
        fitViewport = new FitViewport(800, 600);
        camera.setToOrtho(false, 800, 600);
    }

    @Override
    public void update(float dt) {
    }
}