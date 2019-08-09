package Udemy;

public class Player {
    public String name;
    public int health = 100;
    public String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 200) {
            this.health = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Udemy.Player knocked out.");
            // Reduce number of lives remaining for the player
        }
    }
    public int getHealth() {
        return health;
    }
}
