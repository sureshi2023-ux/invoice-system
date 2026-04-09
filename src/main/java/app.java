public class app {

    // calculate amount
    public double calculateAmount(double price, int quantity) {
        return price * quantity;
    }

    // apply discount
    public double applyDiscount(double amount, double percent) {
        return amount - (amount * percent / 100);
    }

    // apply tax (GST)
    public double applyTax(double amount, double percent) {
        return amount + (amount * percent / 100);
    }
}