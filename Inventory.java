import java.util.ArrayList;

public class Inventory {

	private ArrayList<Item> items = new ArrayList();
	  
	  public void addItem(Item s){
	  	items.add(s);
	  }
	  
	  public ArrayList<Item> getItems(){
	  	return items;
	  }
	  
	  public Item itemReturn(int a) {
		  Item result = items.get(a - 1);
		  return result;
	  }
	  
	  public void printItems() {
		  System.out.println("These are your items:");
		  for (Item i: items) {
			  System.out.println((items.indexOf(i) + 1) + ". " + i.getName());
		  }
	  }
	
}
