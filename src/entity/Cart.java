package entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {
private List<Pizza> items;
	
	public Cart() {
    items=new ArrayList<>();
	}
	public void addItem(Pizza pizza) {
		items.add(pizza);
	}
	public List<Pizza> getOrder() {
		return items;
	}
	public double itemCost(Pizza pizza) {
		 double total=0.0; 
		 for(Pizza pizza1: items) {
			 total+=pizza1.getCost()*pizza1.getQuantity();
		 }
		 return total;

}
	public void itemInfo(Pizza pizza) {
		 System.out.println("Here's what you have in your cart!!");
		 System.out.println("-----------------------------------------------------------------------");
		 System.out.println("Item Name\t\t"+"Quatity");
		 for(Pizza p:items) {
		 System.out.println(p.getName() +"\t\t"+p.getQuantity());
		 }
		 System.out.println("-----------------------------------------------------------------------");
	 }
}
