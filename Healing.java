
public class Healing extends Spell implements targetCreature {
	
	String target;
	int mana;
	int healAmount;
	
	public Healing(int a, int b, String c) {
		mana = a;
		healAmount = b;
		target = c;
	}

	public void Check(String target) {
		boolean success1 = this.takeMana();
		if (success1 == true) {
			if (target == "Player") {
				// Kill Dragon or damage Dragon
			}
			else {
				System.out.println("You cast your spell but there was no target, the spell was ineffective!");
			}
		}		
	}
	

}
