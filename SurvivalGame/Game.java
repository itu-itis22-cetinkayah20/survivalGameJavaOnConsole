package SurvivalGame;

import java.util.Scanner;

public class Game {
    private Player player;
    private Location location;

    Scanner scanner = new Scanner(System.in);

    public void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to game !");
        System.out.println("Please enter your name before starting the game: ");
        String playerName = scanner.nextLine();
        
        
        player = new Player(playerName);
        player.selectCharacter();

        
        begin();
        scanner.close();
    }

    public void begin() {
        while (true) {
            System.out.println();
            System.out.println("************");
            System.out.println();
            System.out.println("Please choose a location to take action: ");
            System.out.println("1. Castle --> Your safety place, no enemies !");
            System.out.println("2. Dungeon --> You may encounter a goblin !");
            System.out.println("3. Enchanted Forest --> You may encounter a witch !");
            System.out.println("4. Mystic River --> You may encounter a dragon !");
            System.out.println("5. Marketplace --> You can buy magical items.");

            int selectLoc = scanner.nextInt();
            while (selectLoc < 1 || selectLoc > 5) {
                System.out.println("Please choose a valid location. ");
                selectLoc = scanner.nextInt();
            }
            switch (selectLoc) {
                case 1:
                    location = new Castle(player);
                    break;
                case 2:
                    location = new Dungeon(player);
                    break;
                case 3:
                    location = new EnchantedForest(player);
                    break;
                case 4:
                    location = new MysticRiver(player);
                    break;
                case 5:
                    location = new MarketPlace(player);
                    break;
                default:
                    location = new Castle(player);
            }
            if (location.getLocName().equals("Castle"))
            {
                if(getPlayer().getInv().isGoldenKey() && getPlayer().getInv().isAncientScroll() && getPlayer().getInv().isMagicStone())
                {
                    System.out.println("Congratulations ! You have won the game.");
                    break;
                }
            }
            if(!location.getLoc()){
                System.out.println("Game over !");
                break;
            }
        }
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLoc() {
        return location;
    }

    public void setLoc(Location location) {
        this.location = location;
    }
}
