
import java.util.*;
public class Spellbook {
	
  private ArrayList<Spell> spells = new ArrayList();
  
  public void addSpell(Spell s){
  	spells.add(s);
  }
  
  public ArrayList<Spell> getSpells(){
  	return spells;
  }
  
  public Spell spellReturn(int a) {
	  Spell result = spells.get(a - 1);
	  return result;
  }
  
  public void printSpellbook() {
	  System.out.println("These are your spells:");
	  for (Spell s: spells) {
		  System.out.println((spells.indexOf(s) + 1) + ". " + s.getName());
	  }
  }
}