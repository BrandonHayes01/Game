import java.util.ArrayList;

public class Creatures {

	private ArrayList<Creature> creatures = new ArrayList();
	
	public void addCreature(Creature c){
	  	creatures.add(c);
	  }
	
	public ArrayList<Creature> getCreatures(){
	  	return creatures;
	  }
	
	public Creature creatureReturn(int a) {
		  Creature result = creatures.get(a - 1);
		  return result;
	  }
	
	 public void printCreatures() {
		  System.out.println("These are the creatures:");
		  for (Creature c: creatures) {
			  System.out.println((creatures.indexOf(c) + 1) + ". " + c.getName());
		  }
	 }
}
