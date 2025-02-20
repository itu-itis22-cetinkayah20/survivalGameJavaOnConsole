package SurvivalGame;



import java.util.Scanner;

public class Player {
    private int damage, healthy, money, rHealthy;
    private String name, cName;

    private Inventory inv;
    Scanner scanner = new Scanner(System.in);
    public Player(String name) {
        this.name = name;
        this.inv = new Inventory();
    }

    public void selectCharacter(){
        switch (characterMenu()) {
           // Samurai was chosen
            case 1:
                initPlayer("Samurai", 50,210,150);
                break;
            case 2:
                initPlayer("Archer", 70, 180, 200);
                break;
            case 3:
                initPlayer("Knight", 80,240,50);
                break;
            default:
                initPlayer("Samurai", 50,210,150);
                break;
        }
        System.out.println("Your character has been created. ");
        System.out.println("Character: "+ getcName() + "\t Damage: " + getDamage() + "\t Health: " + getHealthy() + "\t Money: " + getMoney());

    }

    public int characterMenu(){
        System.out.println("Please choose a character : ");
        System.out.println("1- Samurai, \t Damage: 50, \t Health: 210, \t Money: 150");
        System.out.println("2- Archer, \t Damage: 70, \t Health: 180, \t Money: 200");
        System.out.println("3- Knight, \t Damage: 80, \t Health: 240, \t Money: 50");
        System.out.print("Your choice: ");
        int chaID = scanner.nextInt();
        while (chaID < 1 || chaID > 3) {
            System.out.print("Please choose a valid character: ");
            chaID = scanner.nextInt();
        }
        return chaID;
    }

    

    public void initPlayer(String cName, int damage, int healthy, int money){
        setcName(cName);
        setDamage(damage);
        setHealthy(healthy);
        setMoney(money);
        setrHealthy(healthy);
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getDamage() {
        return damage;
    }
    public int getTotalDamage(){
        return this.getDamage()+ this.getInv().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getrHealthy() {
        return rHealthy;
    }

    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }
}
