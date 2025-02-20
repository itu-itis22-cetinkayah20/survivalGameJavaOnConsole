# Survival Game Java on Console

## Overview

Survival Game Java on Console is a text-based adventure game where players navigate through various locations, encounter enemies, and collect special items to win the game. The game is implemented in Java and runs on the console.

## Features

- **Character Selection**: Choose from different characters with unique stats.
- **Locations**: Explore various locations such as Castle, Dungeon, Enchanted Forest, Mystic River, and Marketplace.
- **Combat System**: Engage in battles with different enemies.
- **Inventory Management**: Collect and manage special items and equipment.
- **Healing**: Heal your character at the Castle.
- **Winning Condition**: Collect all special items to win the game.

---

## Project Structure

```
/survivalGameJavaOnConsole
│── /SurvivalGame/           # Game logic and classes
│   │── Castle.java
│   │── Dragon.java
│   │── Dungeon.java
│   │── EnchantedForest.java
│   │── FightLocation.java
│   │── Game.java
│   │── Goblin.java
│   │── Inventory.java
│   │── Location.java
│   │── Main.java
│   │── MarketPlace.java
│   │── MysticRiver.java
│   │── NormalLoc.java
│   │── Obstacle.java
│   │── Player.java
│   │── Witch.java
│── UML_diagram.png          # UML diagram of the game
│── LICENSE                  # License information
│── README.md                # Documentation
│── .gitattributes           # Git attributes configuration
```

## **Installation and Setup** 

# SurvivalGame

## **Installation & Setup**

### **1. Clone the repository**

```sh
git clone https://github.com/yourusername/survivalGameJavaOnConsole.git
cd survivalGameJavaOnConsole
cd SurvivalGame
```
Note that please make sure that Java is installed on your computer.
### **2. Compile the Java files and Run the Main**

FootballDB requires Python 3 and pip. Install dependencies using:

```sh
javac -d . *.java
java SurvivalGame.Main
```

## **Usage**

- **User Actions**
  - Enter your name to start the game.
  - Select a character (Samurai, Archer, or Knight).
  - Choose a location to explore (Castle, Dungeon, Enchanted Forest, Mystic River, or Marketplace).
  - Fight enemies, collect items, and manage your inventory.
  - Heal at the Castle and buy items at the Marketplace.
- **Winning the Game**
  - Collect the Golden Key, Ancient Scroll, and Magic Stone.
  - Return to the Castle with all items to win the game.
---