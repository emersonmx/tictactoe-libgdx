package com.gmail.emersonmx.tictactoe.application;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.gmail.emersonmx.tictactoe.view.GameView;
import com.gmail.emersonmx.tictactoe.view.View;

public class TicTacToe extends Application {

    public static final int WINDOW_WIDTH = 480;
    public static final int WINDOW_HEIGHT = 640;
    public static final int PLAYER_1 = 0;
    public static final int PLAYER_2 = 1;
    public static final Color PLAYER_1_COLOR = new Color(0x8080ffff);
    public static final Color PLAYER_2_COLOR = new Color(0xff8080ff);

    private AssetManager manager;
    private TextureAtlas atlas;
    private View view;

    @Override
    public void create() {
        loadResources();
        setup();
    }

    public void loadResources() {
        manager = new AssetManager();
        manager.load("background.png", Texture.class);
        manager.load("game.atlas", TextureAtlas.class);
        manager.finishLoading();

        atlas = manager.get("game.atlas");
    }

    public void setup() {
        view = new GameView(manager, atlas);

        Gdx.gl.glClearColor(0, 0, 0, 1);

        Gdx.graphics.setContinuousRendering(false);
        Gdx.graphics.requestRendering();
    }

    public void events() {
    }

    public void logic() {
    }

    public void draw() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        view.draw();
    }

    @Override
    public void resize(int width, int height) {
        view.resize(width, height);
    }

    @Override
    public void dispose() {
        view.dispose();
        manager.dispose();
    }

}