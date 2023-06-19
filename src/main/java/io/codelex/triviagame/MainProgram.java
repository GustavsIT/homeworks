package io.codelex.triviagame;

import java.io.IOException;

public class MainProgram {
    public static void main(String[] args) throws IOException {
        TriviaGame triviaGame = new TriviaGame();
        triviaGame.gameStart();
    }
}
