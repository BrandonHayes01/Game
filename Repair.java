
public class Repair extends Spell implements targetItem {

	String target;
	int mana;
	
	public Repair(int a, String b) {
		mana = a;
		target = b;
	}

	public void Check(String target) {
		boolean success1 = this.takeMana();
		if (success1 == true) {
			if (target == "Tool") {
				// Heal or repair tool
			}
			else {
				System.out.println("You cast your spell but there was no target, the spell was ineffective!");
			}
		}		
	}
	
	
}
