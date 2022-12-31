package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {
    private GameManager gameManager;

    public ActionHandler(GameManager gameManager) {
        this.gameManager = gameManager;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String yourChoice = e.getActionCommand();

        switch (yourChoice) {
            case "lookHut" -> gameManager.ev1.lookHut();
            case "talkHut" -> gameManager.ev1.talkHut();
            case "restHut" -> gameManager.ev1.restHut();
            case "lookGuard" -> gameManager.ev1.lookGuard();
            case "talkGuard" -> gameManager.ev1.talkGuard();
            case "attackGuard" -> gameManager.ev1.attackGuard();
            case "lookChest" -> gameManager.ev1.lookChest();
            case "talkChest" -> gameManager.ev1.talkChest();
            case "openChest" -> gameManager.ev1.openChest();
            // changing scenes
            case "goScene1" -> gameManager.sceneChanger.showScene1();
            case "goScene2" -> gameManager.sceneChanger.showScene2();
        }

    }
}
