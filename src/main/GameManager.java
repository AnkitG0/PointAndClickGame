package main;

public class GameManager {

    UI ui;
    public GameManager(){
        ui = new UI(this);

    }
    public static void main(String[] args) {
        new GameManager();
    }
}
