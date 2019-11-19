
import java.util.*;
public class Spellbook{
	private ArrayList<Spell> spells = new ArrayList();
  
  public void addSpell(Spell s){
  	spells.add(s);
  }
  
  public ArrayList<Spell> getSpells(){
  	return spells;
  }
}