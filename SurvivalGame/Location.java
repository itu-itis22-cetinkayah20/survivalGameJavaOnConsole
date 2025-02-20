package SurvivalGame;

import java.util.Scanner;

public abstract class Location {
    protected String locName; 
    protected Player player; 
    Scanner scanner = new Scanner(System.in);

    public Location(Player player) { 
        this.player = player;
    }
    public abstract boolean getLoc();

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
