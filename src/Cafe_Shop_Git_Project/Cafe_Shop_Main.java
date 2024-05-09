package Cafe_Shop_Git_Project;

import java.util.Scanner;

import Cafe_Shop_Git_Project.DisplayReceipt;
import Cafe_Shop_Git_Project.MenuItem;
import Cafe_Shop_Git_Project.Order;

public class Cafe_Shop_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******MENUITEM********");
        MenuItem[] menuItems = {
                new MenuItem("Coffee", 2.5),
                new MenuItem("Tea", 1.5),
                new MenuItem("Sandwich", 5.0),
                new MenuItem("Salad", 7.0),
                new MenuItem("Dessert", 3.0)
        };
        
     // Print out the menu items
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem.getName() + " - $" + menuItem.getPrice());
        }
        
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        System.out.println("*****ORDER******");
        System.out.print("Enter the number of items to order: ");
        int numItems = scanner.nextInt();

        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter the item name: ");
            String itemName = scanner.next();
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();

            MenuItem item = findMenuItem(menuItems, itemName);
            if (item!= null) {
                order.addItem(item, quantity);
            } else {
                System.out.println("Invalid item name. Please try again.");
                i--;
            }
            
        }

        DisplayReceipt displayReceipt = new DisplayReceipt();
        displayReceipt.displayReceipt(order);
        
     /*   Discount discount = new Discount();
        discount.applyDiscount(numItems);
    */
    }

    private static MenuItem findMenuItem(MenuItem[] menuItems, String name) {
        for (MenuItem item : menuItems) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
	}

}
