import java.util.Scanner;

public class CafeDoWhile16 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int coffee;
int tea;
int bread;
String customerName;
int totalPrice;
int coffeePrice = 12000;
int teaPrice = 7000;
int breadPrice = 20000;
do {
    System.out.print("Enter customer name (type 'cancel' to exit): ");
    customerName = sc.nextLine();
    if (customerName.equalsIgnoreCase("cancel")) {
        System.out.println("Transaction canceled.");
        break;
    }
    System.out.println("Coffee quantity: ");
    coffee = sc.nextInt();
    System.out.println("Tea quantity: ");
    tea = sc.nextInt();
    System.out.println("Bread quantity: ");
    bread = sc.nextInt();
    totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);
    System.out.println("Total amount to pay: Rp " + totalPrice);
    sc.nextLine();
} while (true);
System.out.println("All transactions completed.");
sc.close();
}  
}
