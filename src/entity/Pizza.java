package entity;

public class Pizza {
	private String name;
	private double cost;
	private int quantity;

	public Pizza(String name, double cost,int quantity) {
	this.name = name;
	this.cost = cost;
	this.quantity=quantity;
	}

	public String getName() {
	return name;
	}

	public double getCost() {
	return cost;
	}

	public int getQuantity(){
	return quantity;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
