package Cafe_Shop_Git_Project;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;
   // int quantity;
    private List<Integer> quantities;
    
    public Order() {
        this.items = new ArrayList<>();
        //
       this.quantities = new ArrayList<>();
    }

    public void addItem(MenuItem item, int quantity) {
        this.items.add(item);
   //     this.quantity = quantity;
        this.quantities.add(quantity);
    }

    public double calculateTotal() {
        double total = 0;
   //     for (MenuItem item : items) {
   //         total += item.getPrice() * quantity;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice() * quantities.get(i);
        }
   // }
        return total;
    }

    public List<MenuItem> getItems() {
        return items;
    }
    
    public List<Integer> getQuantities() {
        return quantities;
    }
}