import java.util.Scanner;

public class testapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        app hotel = new app();

        System.out.println("=========== HOTEL INVOICE SYSTEM ===========");

        // Customer Details
        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Table Number: ");
        int tableNo = sc.nextInt();

        System.out.print("Enter number of items ordered: ");
        int n = sc.nextInt();

        double grandTotal = 0;

        System.out.println("\n----------- ORDER DETAILS -----------");

        for (int i = 1; i <= n; i++) {

            sc.nextLine(); // clear buffer

            System.out.println("\nItem " + i);

            System.out.print("Enter item name: ");
            String itemName = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double amount = hotel.calculateAmount(price, quantity);
            grandTotal += amount;

            System.out.println("Item: " + itemName + 
                               " | Qty: " + quantity + 
                               " | Amount: " + amount);
        }

        // Discount & GST
        System.out.print("\nEnter Discount (%): ");
        double discount = sc.nextDouble();

        System.out.print("Enter GST (%): ");
        double tax = sc.nextDouble();

        double afterDiscount = hotel.applyDiscount(grandTotal, discount);
        double finalAmount = hotel.applyTax(afterDiscount, tax);

        // Final Invoice
        System.out.println("\n=========== HOTEL BILL ===========");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Table Number  : " + tableNo);
        System.out.println("---------------------------------");
        System.out.println("Total Amount      : " + grandTotal);
        System.out.println("After Discount    : " + afterDiscount);
        System.out.println("Final Amount (GST): " + finalAmount);
        System.out.println("=================================");
        System.out.println("       THANK YOU! VISIT AGAIN 😊");
        
        sc.close();
    }
}