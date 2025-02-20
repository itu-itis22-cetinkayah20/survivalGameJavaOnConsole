package SurvivalGame;

public class Dungeon extends FightLocation{
    public Dungeon(Player player) {
        super(player,"Dungeon", new Goblin(), "ancientScroll");
    }
}
