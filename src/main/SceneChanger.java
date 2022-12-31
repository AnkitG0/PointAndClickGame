package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SceneChanger {
    GameManager gameManager;

    public SceneChanger(GameManager gameManager) {
        this.gameManager = gameManager;
    }

    public void showScene1() {
        gameManager.ui.bgPanel[1].setVisible(true);
        gameManager.ui.bgPanel[2].setVisible(false);
        gameManager.ui.messageText.setText("Let's defeat the Demon Lord and save the world!");
    }
    public void showScene2() {
        gameManager.ui.bgPanel[1].setVisible(false);
        gameManager.ui.bgPanel[2].setVisible(true);
        gameManager.ui.messageText.setText("Entrance to the cave");

    }

}
