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
    int i = 0;
    
    do {
    Object input1 = Utilities.userInput();
    int spellId = Integer.valueOf((String) input1);
    Spell spell = sb.spellReturn(spellId);
    System.out.println(spell.getName());
    if (spell.getName() == "Fireball") {
    	System.out.println("");
    	System.out.println("Select a location: ");
    	System.out.println("");
    	cl.printCreatures();
    	Object input2 = Utilities.userInput();
    	int creatureId = Integer.valueOf((String) input2);
    	Creature creature = cl.creatureReturn(creatureId);
    	System.out.println("You cast " + spell.getName() + " on " + creature.getName() + ".");
    	i++;
    	if (creature.getName() == "Dragon") {
    		System.out.println("");
    		System.out.println("You have slain the Dragon and won the game!");
    	}
    }
    else if (spell.getName() == "Repair") {
    	System.out.println("");
    	System.out.println("Select a tool to repair: ");
    	System.out.println("");
    	il.printItems();
    	Object input2 = Utilities.userInput();
    	int itemId = Integer.valueOf((String) input2);
    	Item item = il.itemReturn(itemId);
    	item.Durability = item.Durability + 1;
    	System.out.println("You cast " + spell.getName() + " on " + item.getName() + ". The durability is now " + item.Durability + ".");
    	i++;
    }
    else if (spell.getName() == "Healing") {
    	System.out.println("");
    	System.out.println("Select a creature: ");
    	System.out.println("");
    	cl.printCreatures();
    	Object input2 = Utilities.userInput();
    	int creatureId = Integer.valueOf((String) input2);
    	Creature creature = cl.creatureReturn(creatureId);
    	creature.health = creature.health + 25;
    	System.out.println("You cast " + spell.getName() + " on " + creature.getName() + ". The health is now " + creature.health + ".");
    	i++;
    }
    else {
    	System.out.println("Error!!!!!!!!!!!!!!!!!");
    }
	}
    while (i != 3);
	}
}