import java.util.*;
/**
 * Turn based battle simulator between different classes of heroes.
 * 
 * @author Nick Tang
 * @version 1.0
 *
 */
public class Engine {
	Hero hero1 = null;
	Hero hero2 = null;
	
	public static void main(String[] args) {
		
		intro();
		//Players select the class
		heroSelect1();
		heroSelect2();
        //battle simulator
	        
		
		
        
		
	}
	
	public static void intro() {
        System.out.println("Welcome to HeroScape, a two player turn based fighting game.");
        System.out.println("There are three different hero classes: Warrior, Mage, Ranger");
        System.out.println("Each have their own unique stats and special abilities.");
        System.out.println("For help with commands type in 'help'");
        System.out.println();
    }
	
	public static int rngGen(int min, int max) {
		return min + (int)(Math.random() * (max - min + 1));
	}
	
	public void displayOptions(Hero player) {
		//How to check what subclass the superclass player is?
		if(hero1.getClass()==Mage) {//this doesn't work
			//display mage options
		}
	}
	
	public void heroSelect1() {
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
	
	public void heroSelect2() {
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
