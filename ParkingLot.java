import java.util.Scanner;

public class ParkingLot {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int vehicle = 0;
    int duration;
    int total = 0;
    do {
        System.out.print("Enter vehicle type (1 for Car, 2 for Motorcycle, 0 for total): " );
        vehicle = sc.nextInt();
        if (vehicle == 1 || vehicle == 2) {
            System.out.println("Enter the parking duration: ");
            duration = sc.nextInt();
            if (vehicle == 1) {
                total += duration * 3000;
            } else {
                total += duration * 2000;
                System.out.println("Total parking fee: " +  total);
            }
        }
    } while (vehicle != 0);
    System.out.println("Total fees: " + total);
    sc.close();
    }
    }
