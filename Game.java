import java.util.*;
public class Game{
	
	public static void main (String[] args){
  	Fireball fb = new Fireball(50, 1);
    Repair r = new Repair(60);
    Healing h = new Healing(50, 1);
    Player p = new Player(100);
    Orc o = new Orc(50);
    Dragon d = new Dragon(200);
    Axe a = new Axe(1);
    Sword sw = new Sword(1);
    Shield sh = new Shield(1);
    Creatures cl = new Creatures();
    Spellbook sb = new Spellbook();
    Inventory il = new Inventory();
    sb.addSpell(fb);
    sb.addSpell(r);
    sb.addSpell(h);
    cl.addCreature(p);
    cl.addCreature(o);
    cl.addCreature(d);
    il.addItem(a);
    il.addItem(sw);
    il.addItem(sh);

    System.out.println("Which spell would you like to select?");
    System.out.println("");
    sb.printSpellbook();

    Object input = Utilities.userInput();
    int spellId = Integer.valueOf((String) input);
    Spell spell = sb.spellReturn(spellId);
    System.out.println(spell.getName());
    if (spell.getName() == "Fireball") {
    	System.out.println("Select a location");
    }
    else if (spell.getName() == "Repair") {
    	System.out.println("");
    	System.out.println("Select a tool to repair");
    	System.out.println("");
    	il.printItems();
    	Object input1 = Utilities.userInput();
    	int itemId = Integer.valueOf((String) input1);
    	Item item = il.itemReturn(itemId);
    	item.Durability = item.Durability + 1;
    	System.out.println("You cast " + spell + " on " + item + ". The durability is now " + item.Durability + ".");
    }
    else if (spell.getName() == "Healing") {
    	System.out.println("");
    	System.out.println("Select a creature");
    	System.out.println("");
    	cl.printCreatures();
    	
    }
    else {
    	System.out.println("Error!!!!!!!!!!!!!!!!!");
    }
	}    
}