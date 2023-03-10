package main;

import event.Event01;

public class GameManager {

    public UI ui;
    public ActionHandler actionHandler;
    public SceneChanger sceneChanger;
    public Event01 ev1;
    public Player player;
    public GameManager(){
        actionHandler = new ActionHandler(this);
        ui = new UI(this);
        ev1 = new Event01(this);
        sceneChanger = new SceneChanger(this);
        sceneChanger.showScene1();
        player = new Player(this);
        player.setPlayerDefaultStatus();

    }
    public static void main(String[] args) {
        new GameManager();
        System.out.println( "Hi!" );
    }
}
