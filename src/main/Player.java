package main;

public class Player {
    GameManager gm;
    // Player stats
    public int playerMaxLife;
    public int playerCurrentLife;
    public boolean hasSword, hasShield, hasLantern;

    public Player(GameManager gm) {
        this.gm = gm;
    }

    public void setPlayerDefaultStatus() {
        // Use this whenever starting a new game
        playerMaxLife = 5;
        playerCurrentLife = 3;
        hasSword = false;
        hasLantern = false;
        hasShield = false;

        updatePlayerStatus();
    }
    public void updatePlayerStatus() {
        // Used to update the player panel gui
        // Remove all life icons first
        for (int i = 1; i < gm.ui.lifeLabel.length; i++) {
            gm.ui.lifeLabel[i].setVisible(false);
        }
        // Display life in panel as per the current player life
        System.out.println("Hi");
        int lifeCount = playerCurrentLife;
        while(lifeCount != 0) {
            gm.ui.lifeLabel[lifeCount].setVisible(true);
            lifeCount--;
        }
        // Make player inventory invisible if the item doesn't exist
        if(hasSword) {
            gm.ui.swordLabel.setVisible(true);
        } else gm.ui.swordLabel.setVisible(false);
        if(hasShield) {
            gm.ui.shieldLabel.setVisible(true);
        } else gm.ui.shieldLabel.setVisible(false);
        if(hasLantern) {
            gm.ui.lanternLabel.setVisible(true);
        } else gm.ui.lanternLabel.setVisible(false);

    }
}
