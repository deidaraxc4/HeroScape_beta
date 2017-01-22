import java.util.*;
/**
 * Turn based battle simulator between different classes of heroes.
 * 
 * @author Nick Tang
 * @version 1.0
 *
 */
public class Engine {
	static Hero hero1 = null;
	static Hero hero2 = null;
	
	public static void main(String[] args) {
		
		intro();
		//Players select the class
        System.out.println("Player 1 select a class: Warrior, Mage, Ranger ");
		heroSelect1();
        System.out.println("Player 2 select a class: Warrior, Mage, Ranger ");
		heroSelect2();
        //battle simulator();
		
		
        
		
	}
	
	public static void intro() {
        System.out.println("Welcome to HeroScape, a two player turn based fighting game.");
        System.out.println("There are three different hero classes: Warrior, Mage, Ranger");
        System.out.println("Each have their own unique stats and special abilities.");
        System.out.println("For help with commands type in 'help'");
        System.out.println();
    }
	/**
	 * Generates a random number between the min and max, inclusive.
	 * @param min
	 * @param max
	 * @return
	 */
	public static int rngGen(int min, int max) {
		return min + (int)(Math.random() * (max - min + 1));
	}
	/**
	 * Loop to start the battle between heroes.
	 */
	public void battleSimulator() {
		Scanner scanner = new Scanner(System.in);
		while(hero1.isAlive()==true || hero2.isAlive()==true) {
	    	displayOptions(hero1);
	    	String p = scanner.next();
	    	applyMove(p);
	    	displayOptions(hero2);
	    	String q = scanner.next();
	    	applyMove(q);
	    	
	    }
	}
	/**
	 * Displays what options a Hero can do.
	 * @param player
	 */
	public void displayOptions(Hero player) {
		//How to check what subclass the superclass player is?
		if(hero1.getClass()==Mage) {
			
		}
	}
	/**
	 * Takes user input and applies the effects of the move selected.
	 */
	public void applyMove(String i) {
		
	}
	/**
	 * Creates what subclass the superclass hero1 will be
	 */
	public static void heroSelect1() {
		Scanner scanner = new Scanner(System.in);
		String p = scanner.next();
        if(p.equals("Warrior")) {
        	hero1 = new Warrior(120,15,5);
        } else if(p.equals("Mage")) {
        	hero1 = new Mage(100,5,100,20);
        } else if(p.equals("Ranger")) {
        	hero1 = new Ranger(110,0,10,5);
        }
	}
	/**
	 * Creates what subclass the superclass hero2 will be
	 */
	public static void heroSelect2() {
		Scanner scanner = new Scanner(System.in);
		String p = scanner.next();
        if(p.equals("Warrior")) {
        	hero2 = new Warrior(120,15,5);
        } else if(p.equals("Mage")) {
        	hero2 = new Mage(100,5,100,20);
        } else if(p.equals("Ranger")) {
        	hero2 = new Ranger(110,0,10,5);
        }
	}
	
	
}
