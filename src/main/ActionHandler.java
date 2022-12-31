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
        }

    }
}
