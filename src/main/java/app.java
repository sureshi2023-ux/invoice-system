public class app {

    // subtotal = price × quantity
    public double subtotal(double price, int quantity) {
        return price * quantity;
    }

    // apply discount
    public double discount(double amount, double percent) {
        return amount - (amount * percent / 100);
    }

    // apply tax
    public double tax(double amount, double percent) {
        return amount + (amount * percent / 100);
    }

    // final invoice
    public double total(double price, int quantity, double discount, double tax) {
        double sub = subtotal(price, quantity);
        double afterDiscount = discount(sub, discount);
        return tax(afterDiscount, tax);
    }

    public static void main(String[] args) {
        app a = new app();
        double result = a.total(100, 2, 10, 5);
        System.out.println("Final Invoice Amount: " + result);
    }
}