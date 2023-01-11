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
        if (gameManager.player.playerCurrentLife != gameManager.player.playerMaxLife) {
            gameManager.ui.messageText.setText("You rest at the house.\n(Your life has recovered)");
            gameManager.player.playerCurrentLife = gameManager.player.playerMaxLife;
            gameManager.player.updatePlayerStatus();
        } else {
            gameManager.ui.messageText.setText(("Your life is full."));
        }

    }
    public void lookGuard() {
        gameManager.ui.messageText.setText("A guard is standing in front of you");
    }
    public void talkGuard() {
        gameManager.ui.messageText.setText("Guard: Don't go any further without a weapon!\nYou should check the chest over there!");
    }
    public void attackGuard() {
        if (!gameManager.player.hasShield) {
            if (!gameManager.player.hasSword) {
                if (gameManager.player.playerCurrentLife != 1) {
                    gameManager.ui.messageText.setText("Guard: Hey, don't be stupid!\n(The guard hits you back and your life decreases)");
                    gameManager.player.playerCurrentLife--;
                } else {
                    gameManager.ui.messageText.setText("Guard: What a fool!\n(You are dead)");
                    gameManager.player.playerCurrentLife--;
                }
            } else {
                gameManager.ui.messageText.setText("Guard: Oh Lord have mercy!\n(You have defeated the guard and gotten his shield!)");
                gameManager.player.hasShield = true;
            }
            gameManager.player.updatePlayerStatus();
        } else {
            gameManager.ui.messageText.setText("Guard: Just leave me alone.");
        }

    }
    public void lookChest() {
        gameManager.ui.messageText.setText("A chest is on the ground.");
    }
    public void talkChest() {
        gameManager.ui.messageText.setText("You talk to the chest but it says nothing.");
    }
    public void openChest() {
        if (!gameManager.player.hasSword) {
            gameManager.ui.messageText.setText("You open the chest and find a sword!");
            gameManager.player.hasSword = true;
            gameManager.player.updatePlayerStatus();
        } else {
            gameManager.ui.messageText.setText(("You already have a sword."));
        }
    }
}
