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
    public void lookGuard() {
        gameManager.ui.messageText.setText("A guard is standing in front of you");
    }
    public void talkGuard() {
        gameManager.ui.messageText.setText("Guard: Don't go any further without a weapon!\nYou should check the chest over there!");
    }
    public void attackGuard() {
        gameManager.ui.messageText.setText("Guard: Hey, don't be stupid!");
    }
    public void lookChest() {
        gameManager.ui.messageText.setText("A chest is on the ground.");
    }
    public void talkChest() {
        gameManager.ui.messageText.setText("You talk to the chest but it says nothing.");
    }
    public void openChest() {
        gameManager.ui.messageText.setText("You open the chest and find a sword!");
    }
}
