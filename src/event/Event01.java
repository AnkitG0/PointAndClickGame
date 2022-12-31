package event;

import main.GameManager;

public class Event01 {
    GameManager gameManager;
    public Event01(GameManager gameManager) {
        this.gameManager = gameManager;
    }
    public void lookHut() {
        gameManager.ui.messageText.setText("This is your house.");
    }
    public void talkHut() {
        gameManager.ui.messageText.setText("Who are you talking to?");

    }
    public void restHut() {
        gameManager.ui.messageText.setText("You rest at the house.\n(Your life has recovered)");

    }
}
