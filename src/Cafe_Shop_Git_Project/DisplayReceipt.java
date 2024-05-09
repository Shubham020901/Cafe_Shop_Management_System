package Cafe_Shop_Git_Project;

public class DisplayReceipt {
    public void displayReceipt(Order order) {
    	System.out.println("\n");
        System.out.println(" Receipt:");
 /*
        for (MenuItem item : order.getItems()) {
            System.out.println(item.getName() + " x " + order.quantity + " = $" + item.getPrice() * order.quantity);
        }
   */     
        for (int i = 0; i < order.getItems().size(); i++) {
            System.out.println(order.getItems().get(i).getName() + " x " + order.getQuantities().get(i) + " = $" + order.getItems().get(i).getPrice() * order.getQuantities().get(i));
        }
        System.out.println("Total: $" + order.calculateTotal());
        if (order.calculateTotal() > 50) {
            System.out.println("Discount (10%): -$" + (order.calculateTotal() * 0.1));
            System.out.println("Total with Discount: $" + (order.calculateTotal() - (order.calculateTotal() * 0.1)));
        }
    }
}
