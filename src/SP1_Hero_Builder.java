void main() {
    //Iteration 1: Variables - CHARACTER 1

    String name = "Ragnar";
    String type = "Warrior";
    int level = 5;
    int healthString = 85;
    int maxHealth = 100;
    int experiencePoints = 2300;
    double gold = 156.50;
    boolean isAlive = true;
    String[] inventory = {"Sword", "Shield", "Potion"};

    System.out.println("=== FIRST CHARACTER SHEET ===");
    System.out.println("Name: "+name);
    System.out.println("Class: "+ type);
    System.out.println("Level: "+ level);
    System.out.println("Health: "+healthString + "/" + maxHealth);
    System.out.println("Experience points: "+ experiencePoints);
    System.out.println("Gold: " + gold);
    System.out.println("Alive: "+ isAlive);
    System.out.println( );
    System.out.println("Inventory: ");
    System.out.println("- " + inventory[0]);
    System.out.println("- " + inventory[1]);
    System.out.println("- " + inventory[2]);

    System.out.println( );

    //CHARACTER 2
    String name1 = "Thor";
    String type1 = "Mage";
    int level1 = 8;
    int healthString1 = 90;
    int maxHealth1 = 100;
    int experiencePoints1 = 5700;
    double gold1 = 200.50;
    boolean isAlive1 = true;
    String[] inventory1 = {"Knives", "Shield", "Armor"};

    System.out.println( );
    System.out.println("=== SECOND CHARACTER SHEET ===");
    System.out.println("Name: "+name1);
    System.out.println("Class: "+ type1);
    System.out.println("Level: "+ level1);
    System.out.println("Health: "+healthString1 + "/" + maxHealth1);
    System.out.println("Experience points: "+ experiencePoints1);
    System.out.println("Gold: " + gold1);
    System.out.println("Alive: "+ isAlive1);
    System.out.println( );
    System.out.println("Inventory: ");
    System.out.println("- " + inventory1[0]);
    System.out.println("- " + inventory1[1]);
    System.out.println("- " + inventory1[2]);

    //Character 3
    String name2 = "Fighter";
    String type2 = "Rogue";
    int level2 = 4;
    int healthString2 = 70;
    int maxHealth2 = 100;
    int experiencePoints2 = 2700;
    double gold2 = 99.50;
    boolean isAlive2 = true;
    String[] inventory2 = {"Bow", "Sword", "gun"};

    System.out.println( );
    System.out.println("=== THIRD CHARACTER SHEET ===");
    System.out.println("Name: "+name2);
    System.out.println("Class: "+ type2);
    System.out.println("Level: "+ level2);
    System.out.println("Health: "+healthString2 + "/" + maxHealth2);
    System.out.println("Experience points: "+ experiencePoints2);
    System.out.println("Gold: " + gold2);
    System.out.println("Alive: "+ isAlive2);
    System.out.println( );
    System.out.println("Inventory: ");
    System.out.println("- " + inventory2[0]);
    System.out.println("- " + inventory2[1]);
    System.out.println("- " + inventory2[2]);
}