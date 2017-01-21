
public class Mage extends Hero {
	private int mana;
	private int magestrength;
	
	public Mage(int health, int strength, int mana, int magestrength) {
		super(health,strength);
		this.mana = mana;
		this.magestrength = magestrength;
	}
	
	//Getters
	public int getMana() {
		return mana;
	}
	public int getMageStrength() {
		return magestrength;
	}
	//Setters
	public void takeMana(int n) {
		mana = mana-n;
	}
	
	//Attack options
	/**
	 * Deals 0-max strength randomly
	 */
	public void club(Hero player) {
		int x = Engine.rngGen(0, this.getStrength());
		super.takeDamage(player, x);
		System.out.println("You club your opponent dealing " +x+ " damage");
	}
	/**
	 * Heals hero 10-20hp randomly, costs 10mana
	 */
	public void lesserHeal() {
		if(mana>=10) {
			mana = mana-10;
			int x = Engine.rngGen(10, 20);
			super.healDamage(this, x);
			System.out.println("You have healed yourself "+x+ " points.");
		}
	}
	/**
	 *  Deals 0-maxManaStrength amount of damage, costs 15mana
	 */
	public void manaBurst(Hero player) {
		if(mana>=15) {
			mana = mana-15;
			int x = Engine.rngGen(0, this.magestrength);
			super.takeDamage(player, x);
			System.out.println("You strike your opponent with a burst of energy"
					+ "dealing "+x+ " damage");
			
		}
	}
	/**
	 *  Deals 10-maxManaStrength*2 amount of damage, costs 30mana
	 */
	public void manaSurge(Hero player) {
		if(mana>=30) {
			mana = mana-30;
			int x = Engine.rngGen(10, this.magestrength)*2;
			super.takeDamage(player, x);
			System.out.println("You strike your opponent with a fearsome blast"
					+ "dealing "+x+ " damage");
			
		}
		
	}
	
	
}
