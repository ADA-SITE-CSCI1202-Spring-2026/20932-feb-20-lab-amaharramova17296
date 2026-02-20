package week03.invoice;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Invoice> inv = new ArrayList<>();

        System.out.print("Number of invoices: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Part Number: ");
            String partNum = scanner.nextLine();

            System.out.print("Description: ");
            String description = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price per Item: ");
            double price = scanner.nextDouble();
           
            Invoice invoice = new Invoice(partNum, description, quantity, price);

            inv.add(invoice);
        }

        double Total = 0;

        for (Invoice invoice : inv) {

            double amount = invoice.getInvoiceAmount();
            Total += amount;

            System.out.println("Part Number: " + invoice.getNum());
            System.out.println("Description: " + invoice.getDescription());
            System.out.println("Quantity: " + invoice.getQuantity());
            System.out.println("Price per Item: " + invoice.getPrice());
            System.out.println("Invoice Amount: " + amount);
            System.out.println();
        }

        System.out.println("Grand Total: " + Total);

    }
}