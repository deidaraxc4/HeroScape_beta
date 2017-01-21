import java.util.*;
/**
 * Turn based battle simulator between different classes of heroes.
 * 
 * @author Nick Tang
 * @version 1.0
 *
 */
public class Engine {
	
	public static void main(String[] args) {
		Hero hero1 = null;
		Hero hero2 = null;
		intro();
		//Players select the class
		Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 select a class: Warrior, Mage, Ranger ");
			String p = scanner.next();
	        if(p.equals("Warrior")) {
	        	hero1 = new Warrior(120,15,5);
	        } else if(p.equals("Mage")) {
	        	hero1 = new Mage(100,5,100,20);
	        } else if(p.equals("Ranger")) {
	        	hero1 = new Ranger(110,0,10,5);
	        }
        System.out.println("Player 2 select a class: Warrior, Mage, Ranger ");
	        String p1 = scanner.next();
	        if(p1.equals("Warrior")) {
	        	hero2 = new Warrior(120,15,5);
	        } else if(p1.equals("Mage")) {
	        	hero2 = new Mage(100,5,100,20);
	        } else if(p1.equals("Ranger")) {
	        	hero2 = new Ranger(110,0,10,5);
	        }
        //battle simulator
	        
		
		
        
		
	}
	
	public static void intro() {
        System.out.println("Welcome to HeroScape, a two player turn based fighting game.");
        System.out.println("There are three different hero classes: Warrior, Mage, Ranger");
        System.out.println("Each have their own unique stats and special abilities.");
        System.out.println("For help with commands type in 'help'");
    }
	
	public static int rngGen(int min, int max) {
		return min + (int)(Math.random() * (max - min + 1));
	}
	
	public void displayOptions(Hero player) {
		//How to check what subclass the superclass player is?
	}
	
//	public static void heroSelect1() {
//		Scanner scanner = new Scanner(System.in);
//		String p = scanner.next();
//        if(p.equals("Warrior")) {
//        	hero1 = new Warrior(120,15,5);
//        } else if(p.equals("Mage")) {
//        	hero1 = new Mage(100,5,100,20);
//        } else if(p.equals("Ranger")) {
//        	hero1 = new Ranger(110,0,10,5);
//        }
//	}
	
	
}
