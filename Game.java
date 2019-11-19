
public class Game{
	
	public static void main (String[] args){
  	Fireball fb = new Fireball();
    Repair r = new Repair();
    Healing h = new Healing();
    Spellbook sb = new Spellbook();
    sb.addSpell(fb);
    sb.addSpell(r);
    sb.addSpell(h);
  }
	
}