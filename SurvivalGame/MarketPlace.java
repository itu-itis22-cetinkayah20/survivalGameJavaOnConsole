package SurvivalGame;

public class MarketPlace extends NormalLoc {

    public MarketPlace(Player player) {
        super(player, "Store");
    }

    public boolean getLoc() {
        System.out.println("Money: " + getPlayer().getMoney());
        System.out.println("1. Weapons");
        System.out.println("2. Armors");
        System.out.println("3. Exit");
        System.out.print("Your choice: ");
        int selTool = scanner.nextInt();
        int selItemID;
        switch (selTool) {
            case 1:
                selItemID = weaponMenu();
                buyWeapon(selItemID);
                break;
            case 2:
                selItemID = armorMenu();
                buyArmor(selItemID);
                break;
            default:
                break;
        }
        return true;
    }

    public int weaponMenu() {
        System.out.println("1. Magic Wand\t <Price: 250 - Damage: 20>");
        System.out.println("2. Enchanted Sword\t <Price: 350 - Damage: 30>");
        System.out.println("3. Dragon Slayer\t <Price: 450 - Damage: 70>");
        System.out.println("4. Exit");
        System.out.println("Please choose a weapon: ");
        int selWeaponID = scanner.nextInt();
        return selWeaponID;
    }

    public void buyWeapon(int itemID) {
        int damage = 0, price = 0;
        String wName = null;
        switch (itemID) {
            case 1:
                damage = 20;
                wName = "Magic Wand";
                price = 250;
                break;
            case 2:
                damage = 30;
                wName = "Enchanted Sword";
                price = 350;
                break;
            case 3:
                damage = 70;
                wName = "Dragon Slayer";
                price = 450;
                break;
            case 4:
                System.out.println("Checking out !");
                break;
            default:
                System.out.println("Invalid ItemID !");
                break;
        }

        if (price > 0) {
            if (getPlayer().getMoney() >= price) {
                getPlayer().getInv().setDamage(damage);
                getPlayer().getInv().setwName(wName);
                getPlayer().setMoney(getPlayer().getMoney() - price);
                System.out.println("You have bought a " + wName + " , Previous Damage: " + getPlayer().getDamage() + ", New Damage: " + (getPlayer().getDamage() + getPlayer().getInv().getDamage()));
                System.out.println("Left Money: " + getPlayer().getMoney());
            } else {
                System.out.println("Insufficient balance !");
            }
        }
    }

    public int armorMenu() {
        System.out.println("1. Mystic Robe\t <Price: 150 - Inhibited Damage: 10>");
        System.out.println("2. Guardian Armor\t <Price: 250 - Inhibited Damage: 30>");
        System.out.println("3. Dragon Scale Armor\t <Price: 400 - Inhibited Damage: 50>");
        System.out.println("4. Exit");
        System.out.println("Please choose an armor: ");
        int selArmorID = scanner.nextInt();
        return selArmorID;
    }

    public void buyArmor(int itemID) {
        int avoid = 0, price = 0;
        String aName = null;
        switch (itemID) {
            case 1:
                avoid = 10;
                aName = "Mystic Robe";
                price = 150;
                break;
            case 2:
                avoid = 30;
                aName = "Guardian Armor";
                price = 250;
                break;
            case 3:
                avoid = 50;
                aName = "Dragon Scale Armor";
                price = 400;
                break;
            case 4:
                System.out.println("Checking out !");
                break;
            default:
                System.out.println("Invalid ItemID !");
                break;
        }
        if (price > 0) {
            if (getPlayer().getMoney() >= price) {
                getPlayer().getInv().setArmor(avoid);
                getPlayer().getInv().setaName(aName);
                getPlayer().setMoney(getPlayer().getMoney() - price);
                System.out.println("You have bought a " + aName + " , Inhibited Damage: " + getPlayer().getInv().getArmor());
                System.out.println("Left Money: " + getPlayer().getMoney());
            } else {
                System.out.println("Insufficient balance !");
            }
        }
    }
}