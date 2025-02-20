package SurvivalGame;

public class Inventory {
    private boolean magicStone, ancientScroll, goldenKey; 
    private String wName, aName;
    private int damage, armor;

    Inventory(){
        this.magicStone = false;
        this.ancientScroll = false;
        this.goldenKey = false;
        this.armor = 0;
        this.wName = null;
        this.aName = null;
    }

    public boolean isMagicStone() {
        return magicStone;
    }

    public void setMagicStone(boolean magicStone) {
        this.magicStone = magicStone;
    }

    public boolean isAncientScroll() {
        return ancientScroll;
    }

    public void setAncientScroll(boolean ancientScroll) {
        this.ancientScroll = ancientScroll;
    }

    public boolean isGoldenKey() {
        return goldenKey;
    }

    public void setGoldenKey(boolean goldenKey) {
        this.goldenKey = goldenKey;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
