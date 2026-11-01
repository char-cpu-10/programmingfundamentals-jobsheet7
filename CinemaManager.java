import java.util.Scanner;

public class CinemaManager {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int quantity = 0;
    int tickets = 50000;
    double payment;
    int totaltickets = 0;
    double price;
    double discount = 0;
    double totalrevenue = 0;
    int i = quantity;
    while (true) {
        System.out.println("Tickets bought: ");
        quantity = sc.nextInt();
        
        if (quantity < 0){
            System.out.println("Invalid quantity. Please re-enter the quantity.");
            continue;
        }
        if (quantity == 0){
            break;
        } 
        if (quantity > 4) {
            discount = 0.10;
        }
        if (quantity > 10 ) {
            discount = 0.15;
        }
        price = tickets * quantity;
        payment = (int) price - (price * discount);
        totaltickets += quantity;
        totalrevenue += payment;
        System.out.println("Discount: " + discount * 100 + "%");
        System.out.println("TOTAL PRICE: " + payment);
        
    }
    System.out.println("Total ticket sold today: " + totaltickets);
    System.out.println("Total revenue today: " + totalrevenue);
    i++;
    sc.close();
    }
} 

