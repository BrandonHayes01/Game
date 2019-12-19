import java.util.Scanner;

public class Player extends Creature {

	private Spellbook sb;
	
	public Player (Spellbook sb){
		  this.sb = sb;
	}
	
	int health;
	
	public Player(int a) {
		super("Player", a);
	}
	
}
