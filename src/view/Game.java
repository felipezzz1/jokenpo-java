package view;

import controller.GameController;
import model.Action;
import model.Hand;
import model.Result;

public class Game {
    Hand player1;
    Hand player2;

    Action paper;
    Action rock;
    Action scissor;

    GameController gameController = new GameController();

    public void play(){
        rock = new Action("ROCK");
        paper = new Action("PAPER");
        scissor = new Action("SCISSOR");

        rock.addWin(scissor);
        rock.addLose(paper);

        paper.addWin(rock);
        paper.addLose(scissor);

        scissor.addWin(paper);
        scissor.addLose(rock);

        player1 = new Hand(rock);
        player2 = new Hand(paper);

        Result result = gameController.play(player1, player2);
        System.out.println(result);
    }
}
