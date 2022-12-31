package main;

import event.Event01;

public class GameManager {

    public UI ui;
    public ActionHandler actionHandler;
    public Event01 ev1;
    public GameManager(){
        actionHandler = new ActionHandler(this);
        ui = new UI(this);
        ev1 = new Event01(this);

    }
    public static void main(String[] args) {
        new GameManager();
    }
}
