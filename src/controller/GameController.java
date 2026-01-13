package controller;

import model.Hand;
import model.Result;

public class GameController {
    public Result play(Hand player1, Hand player2) {
        if (player1.getGesto().getGanha().contains(player2.getGesto())){
            return Result.GANHA;
        }
        if(player1.getGesto().getPerde().contains(player2.getGesto())){
            return Result.PERDE;
        }

        return Result.EMPATE;
    }
}
