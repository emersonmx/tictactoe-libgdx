package com.gmail.emersonmx.tictactoe.view.scene;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Array;
import com.gmail.emersonmx.tictactoe.application.TicTacToe;
import com.gmail.emersonmx.tictactoe.view.GameView;

public class ScoreActor extends Actor {

    private Array<Sprite> scoreArray;
    private Sprite[] scoreSprites;
    private int[] scores;

    public ScoreActor(Array<Sprite> scoreArray) {
        this.scoreArray = scoreArray;

        scoreSprites = new Sprite[] { null, null };

        for (Sprite score : scoreArray) {
            score.setOriginCenter();
        }

        scores = new int[] { 0, 0 };

        setName("score");
    }

    public void setScore(int player, int score) {
        this.scores[player] = score;
    }

    public int getScore(int player) {
        return scores[player];
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        scoreSprites[TicTacToe.PLAYER_1] =
            scoreArray.get(scores[TicTacToe.PLAYER_1]);
        scoreSprites[TicTacToe.PLAYER_1].setCenter(118, 87);
        scoreSprites[TicTacToe.PLAYER_1].setColor(GameView.PLAYER_1_COLOR);
        scoreSprites[TicTacToe.PLAYER_1].draw(batch, parentAlpha);

        scoreSprites[TicTacToe.PLAYER_2] =
            scoreArray.get(scores[TicTacToe.PLAYER_2]);
        scoreSprites[TicTacToe.PLAYER_2].setCenter(362, 87);
        scoreSprites[TicTacToe.PLAYER_2].setColor(GameView.PLAYER_2_COLOR);
        scoreSprites[TicTacToe.PLAYER_2].draw(batch, parentAlpha);
    }

}
