package SurvivalGame;

import java.io.PrintStream;

public abstract class FightLocation extends Location {
   protected Obstacle obstacle;
   protected String award;

   public FightLocation(Player var1, String var2, Obstacle var3, String var4) {
      super(var1);
      this.locName = var2;
      this.obstacle = var3;
      this.award = var4;
   }

   public boolean getLoc() {
      int var1 = this.obstacle.obstacleCount();
      System.out.println("You are in the " + this.getLocName() + " now.");
      System.out.println("Be careful ! There are " + var1 + " " + this.obstacle.getName());
      System.out.println("<F>ight or <R>un");

      for(String var2 = this.scanner.nextLine(); !var2.equalsIgnoreCase("F"); var2 = this.scanner.nextLine()) {
         if (var2.equalsIgnoreCase("R")) {
            return true;
         }

         System.out.println("Please enter a valid command !");
      }

      if (!this.fight(var1)) {
         if (this.getPlayer().getHealthy() <= 0) {
            System.out.println("You have died.");
            return false;
         } else {
            return true;
         }
      } else {
         System.out.println("You have killed all enemies at " + this.getLocName() + ".");
         if (this.award.equals("ancientScroll") && !this.getPlayer().getInv().isAncientScroll()) {
            System.out.println("You have taken " + this.award + ".");
            this.getPlayer().getInv().setAncientScroll(true);
         } else if (this.award.equals("magicStone") && !this.getPlayer().getInv().isMagicStone()) {
            System.out.println("You have taken " + this.award + ".");
            this.getPlayer().getInv().setMagicStone(true);
         } else if (this.award.equals("GoldenKey") && !this.getPlayer().getInv().isGoldenKey()) {
            System.out.println("You have taken " + this.award + ".");
            this.getPlayer().getInv().setGoldenKey(true);
         }

         return true;
      }
   }

   public boolean fight(int var1) {
      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.obstacle.getHealth();
         this.playerStats();
         this.enemyStats();

         while(this.getPlayer().getHealthy() > 0 && this.obstacle.getHealth() > 0) {
            System.out.println("<H>it or <R>un: ");
            String var4 = this.scanner.nextLine();
            if (var4.equalsIgnoreCase("H")) {
               System.out.println("You have hit !");
               this.obstacle.setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
               this.afterHit();
               if (this.obstacle.getHealth() > 0) {
                  System.out.println();
                  System.out.println(this.obstacle.getName() + " has hit you !");
                  if (this.obstacle.getDamage() - this.getPlayer().getInv().getArmor() > 0) {
                     this.getPlayer().setHealthy(this.getPlayer().getHealthy() - (this.obstacle.getDamage() - this.getPlayer().getInv().getArmor()));
                  } else {
                     this.getPlayer().setHealthy(this.getPlayer().getHealthy());
                  }

                  this.afterHit();
               }
            } else {
               if (var4.equalsIgnoreCase("R")) {
                  return false;
               }

               System.out.println("Please enter a valid command !");
            }
         }

         if (this.obstacle.getHealth() > 0 || this.getPlayer().getHealthy() <= 0) {
            return false;
         }

         System.out.println("You have beaten the enemie !");
         this.getPlayer().setMoney(this.getPlayer().getMoney() + this.obstacle.getAward());
         System.out.println("Your actual money: " + this.getPlayer().getMoney());
         this.obstacle.setHealth(var3);
         System.out.println("--------------------------");
      }

      return true;
   }

   public void playerStats() {
      System.out.println("Player Stats\n--------");
      System.out.println("Health: " + this.getPlayer().getHealthy());
      System.out.println("Damage: " + this.getPlayer().getTotalDamage());
      System.out.println("Money: " + this.getPlayer().getMoney());
      if (this.getPlayer().getInv().getDamage() > 0) {
         System.out.println("Weapon: " + this.getPlayer().getInv().getwName());
      }

      if (this.getPlayer().getInv().getArmor() > 0) {
         System.out.println("Armor: " + this.getPlayer().getInv().getaName());
      }

   }

   public void enemyStats() {
      System.out.println("\n" + this.obstacle.getName() + " Stats\n---------------");
      System.out.println("Health: " + this.obstacle.getHealth());
      System.out.println("Damage: " + this.obstacle.getDamage());
      System.out.println("Award: " + this.obstacle.getAward());
   }

   public void afterHit() {
      System.out.println("Player health: " + this.getPlayer().getHealthy());
      if (this.obstacle.getHealth() <= 0) {
         System.out.println(this.obstacle.getName() + " health: 0");
      } else {
         PrintStream var10000 = System.out;
         String var10001 = this.obstacle.getName();
         var10000.println(var10001 + " health: " + this.obstacle.getHealth());
      }

      System.out.println();
   }
}
