package app;

import java.util.Scanner;

import entity.Cart;
import entity.Pizza;

public class PizzaApp {

	public static void main(String[] args) {
		orderPizza();
		}

	private static void orderPizza() {
		Pizza pizza1 = new Pizza("Veggie Paradise", 395.99,0);
		Pizza pizza2 = new Pizza("Classic Chicken", 495.99,0);
		Pizza pizza3 = new Pizza("Veg Farmhouse", 595.99,0);
		Pizza pizza4 = new Pizza("Chicken Sausage", 495.99,0);
		Pizza pizza5 = new Pizza("Supreme Chicken", 535.99,0);
		Cart order=new Cart();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to PIZZA");
		System.out.println("May I know your name: ");
		String name = scanner.nextLine();
		System.out.println("Hello "+ name +"!! What would you like to have? ");
		int choice;
		System.out.println();
		do {
		System.out.println("Choose your choice: ");
		System.out.println("-----------------------------------MENU--------------------------------");
		System.out.println("1. Veggie Paradise");
		System.out.println("2. Classic Chicken");
		System.out.println("3. Veg Farmhouse");
		System.out.println("4. Chicken Sausage");
		System.out.println("5. Supreme Chicken");
		System.out.println("0. Checkout");
		choice = scanner.nextInt();
		int qt;
		switch(choice) {
		case 1:
			System.out.println("How many would you like to order?");
			qt =scanner.nextInt();
			pizza1.setQuantity(qt);
			order.addItem(pizza1);
			System.out.println("Added "+ pizza1.getQuantity()+ " "+pizza1.getName() +" to your order.");
			order.itemInfo(pizza1);
			break;
		case 2:
			System.out.println("How many would you like to order?");
			qt =scanner.nextInt();
			pizza2.setQuantity(qt);
			order.addItem(pizza2);
			System.out.println("Added Classic Chicken to your order.");
			order.itemInfo(pizza2);
			break;
		case 3:
			System.out.println("How many would you like to order?");
			qt =scanner.nextInt();
			pizza3.setQuantity(qt);
			order.addItem(pizza3);
			System.out.println("Added Farmhouse to your order.");
			break;
		case 4:
			System.out.println("How many would you like to order?");
			qt =scanner.nextInt();
			pizza4.setQuantity(qt);
			order.addItem(pizza4);
			System.out.println("Added Chicken Sausage to your order.");
		break;
		case 5:System.out.println("How many would you like to order?");
		qt =scanner.nextInt();
		pizza5.setQuantity(qt);
			order.addItem(pizza5);
		System.out.println("Added Pepper Barbecue Chicken to your order.");
		break;
		case 0:
			System.out.println("**********************************************************************");
			System.out.println("Your order has been taken!!\n");
			break;
		default:
			System.out.println("Invalid choice. Please try again.");
			break;
		}
		} while (choice != 0);
		
		System.out.println("Your order summary:\n");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Item Name\t\tPrice\t\tQuantity\tTotalPrice");
		System.out.println("------------------------------------------------------------------------");
		for (Pizza pizza : order.getOrder()) { 
		System.out.println(pizza.getName() + "\t\t" + pizza.getCost()+ "\t\t x "+pizza.getQuantity()+"\t\t"+ pizza.getCost()*pizza.getQuantity());
		}
		System.out.println("------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t   Total price : " + order.itemCost(pizza1));
		System.out.println("------------------------------------------------------------------------");
		System.out.println("\n ********** THANK YOU FOR VISITING PIZZA, HAPPY TO SERVE YOU ***********");
	}

	}


