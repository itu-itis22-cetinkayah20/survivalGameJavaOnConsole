package SurvivalGame;

public class Castle extends NormalLoc {
    public Castle(Player player) {
        super(player, "Castle"); 
    }

    @Override
    public boolean getLoc() {
        player.setHealthy(player.getrHealthy());
        System.out.println("You are healed.");
        System.out.println("You are in castle.");
        return true;
    }
}
