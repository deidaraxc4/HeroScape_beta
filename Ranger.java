
public class Ranger extends Hero {
	private int rangestrength; //determines strength of the attack
	private int luck; //determines what chance of a hitting twice
	
	public Ranger(int health, int strength, int rangestrength, int luck) {
		super(health,strength);
		this.rangestrength = rangestrength;
		this.luck = luck;
	}
	
	//Getters
	public int getRangeStrength() {
		return rangestrength;
	}
	
	
	//Attacks
	/**
	 * 
	 */
	public void rangeAtt(Hero player) {
		int a = Engine.rngGen(1, luck);
		int x = Engine.rngGen(0, this.getRangeStrength());
		if(a==1) {
			int y = Engine.rngGen(0, this.getRangeStrength());
			super.takeDamage(player, x);
			super.takeDamage(player, y);
			System.out.println("You fire two arrows hitting "+x+" and "+y);
		} else {
			super.takeDamage(player, x);
			System.out.println("You fire an arrow hitting "+x);
		}
	}
}
