
public class Warrior extends Hero {
	private int armor;
	
	public Warrior(int health, int strength, int armor) {
		super(health,strength);
		this.armor = armor;
	}
	
	//Getters
	public int getArmor() {
		return armor;
	}
	
	//Attacks
	/**
	 * Deals 0-max strength randomly
	 */
	public void stab(Hero player) {
		int x = Engine.rngGen(0, this.getStrength());
		super.takeDamage(player, x);
		System.out.println("You stab your opponent dealing " +x+ " damage");
	}
	
	
	
}
