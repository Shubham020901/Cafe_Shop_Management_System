package Cafe_Shop_Git_Project;

public class Discount {
    public double applyDiscount(double total) {
        if (total > 50) {
            return total - (total * 0.1);
        }
        return total;
    }
}
