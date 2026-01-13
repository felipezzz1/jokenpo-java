package controller;

import model.Hand;
import model.Result;

public class GameController {
    public Result play(Hand player1, Hand player2) {
        if (player1.getAction().getWin().contains(player2.getAction())){
            return Result.WIN;
        }
        if(player1.getAction().getLose().contains(player2.getAction())){
            return Result.LOSE;
        }

        return Result.DRAW;
    }
}
