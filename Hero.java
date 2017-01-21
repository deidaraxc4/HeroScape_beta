
public class Hero {
	private int health;
	private int strength;
	
	public Hero(int health, int strength) {
		this.health = health;
		this.strength = strength;
		
	}
	
	//Getters
	public int getHealth() {
		return health;
	}
	public int getStrength() {
		return strength;
	}
	//Setters
	public void takeDamage(Hero player, int n) {
		player.health = player.health-n;
	}
	public void healDamage(Hero player, int n) {
		player.health = player.health+n;
	}
	
}
