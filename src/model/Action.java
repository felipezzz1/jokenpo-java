package model;

import java.util.ArrayList;
import java.util.List;

public class Action {
    private String action;
    private List<Action> win = new ArrayList<>();
    private List<Action> lose = new ArrayList<>();

    public Action(String action) {
        this.action = action;
    }

    public void addWin(Action action){
        win.add(action);
    }

    public void addLose(Action action){
        lose.add(action);
    }

    public String getAction() {
        return action;
    }

    public List<Action> getWin() {
        return win;
    }

    public List<Action> getLose() {
        return lose;
    }
}
