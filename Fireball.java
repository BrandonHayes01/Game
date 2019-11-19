
public class Fireball extends Spell implements targetLocation{
	
	String target;
	int mana;
	int damage;
	
	public Fireball(int a, int b, String c) {
		mana = a;
		damage = b;
		target = c;
	}

	public void Check(String target) {
		boolean success1 = this.takeMana();
		if (success1) {
			if (target == "Dragon") {
				// Kill Dragon or damage Dragon
			}
			else {
				System.out.println("You cast your spell but there was no target, the spell was ineffective!");
			}
		}		
	}	
}
