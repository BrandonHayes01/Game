import java.util.*;
public class Game{
	
	public static void main (String[] args){
  	Fireball fb = new Fireball(50, 1);
    Repair r = new Repair(60);
    Healing h = new Healing(50, 1);
    Player p = new Player(100);
    Orc o = new Orc(50);
    Dragon d = new Dragon(200);
    Creatures cl = new Creatures();
    Spellbook sb = new Spellbook();
    sb.addSpell(fb);
    sb.addSpell(r);
    sb.addSpell(h);
    cl.addCreature(p);
    cl.addCreature(o);
    cl.addCreature(d);

    System.out.println("Which spell would you like to select?");
    System.out.println("");
    sb.printSpellbook();

    Object input = Utilities.userInput();
    int spellId = Integer.valueOf((String) input);
    Spell spell = sb.spellReturn(spellId);
    System.out.println(spell.getName());
    try {
    if (spell.getName() == "Fireball") {
    	System.out.println("Select a location");
    }
    else if (spell.getName() == "Repair") {
    	System.out.println("Select a tool to repair");
    }
    else if (spell.getName() == "Healing") {
    	System.out.println("Select a creature");
    }
    else {
    	System.out.println("Error!!!!!!!!!!!!!!!!!");
    }
    }
    catch (Exception e) {
    	System.out.println("Not a valid input");
    }

  }
	
}