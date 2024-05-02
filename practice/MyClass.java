//* TCS NQT 2024 26th April 2024 Slot 2
//! Write a program to accept the details of n items from the user. 
//? The details include name, price and quantity of the items.
/*
 ? Input format:
 * [Orange, 10.0, 10]
 *  [Apple, 8.0, 20]
 *  [Orange, 9.0, 12]
 *  [Banana, 12.0, 20]
 *  [Apple, 12.0, 10]
 ? Output format:
 *Total: 728.00
  *Average: 145.60
  *Item with highest sale: Apple
 */
//? Calculate and display the total sale and average sale of the items. 
//? Also, display the name of the item with highest sale.

package practice;

import java.util.Scanner;

// Item class
class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}

// Main class
public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items: ");
        int n = sc.nextInt();

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, price and quantity of item " + (i + 1) + ": ");
            String name = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            items[i] = new Item(name, price, quantity);
        }

        // total and average sale
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        System.out.printf("Total: %.2f\n", total);

        double average = total / n;
        System.out.printf("Average: %.2f\n", average);

        // highest price item
        String maxName = items[0].getName();
        double maxPrice = items[0].getPrice();
        for (Item item : items) {
            if (item.getPrice() > maxPrice) {
                maxPrice = item.getPrice();
                maxName = item.getName();
            }
        }
        System.out.println("Item with highest price: " + maxName);

        // highest sale item
        String maxSaleName = items[0].getName();
        int maxSale = items[0].getQuantity();
        for (Item item : items) {
            if (item.getQuantity() > maxSale) {
                maxSale = item.getQuantity();
                maxSaleName = item.getName();
            }
        }
        System.out.println("Item with highest sale: " + maxSaleName);

        // display all items
        System.out.println("Items: ");
        for (Item item : items) {
            System.out.println(
                    "Name: " + item.getName() + ", Price: " + item.getPrice() + ", Quantity: " + item.getQuantity());
        }

        // display in array format
        System.out.println("Items in array format: ");
        for (Item item : items) {
            System.out.println("[" + item.getName() + ", " + item.getPrice() + ", " + item.getQuantity() + "]");
        }

        sc.close();
    }
}
