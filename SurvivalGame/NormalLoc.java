package SurvivalGame;

public abstract class NormalLoc extends Location {

    public NormalLoc(Player player, String name) {
        super(player);
        this.locName = name; 
    }

    @Override
    public boolean getLoc() {
        return true;
    }
}
