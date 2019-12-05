
public abstract class Spell {
		
	private String name; 
	int manaCost;
	int mana = 100;
	
	public Spell(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean takeMana() {
		if (mana < 0) {
			mana = mana - 25;
			return true;
		}
		else {
			System.out.println("You don't have enough mana to cast that spell!");
			return false;
		}
	}
	
}
	

