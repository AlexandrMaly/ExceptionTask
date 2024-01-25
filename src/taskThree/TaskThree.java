package taskThree;

import java.util.Scanner;

public class TaskThree {
    private static double moneyOnTheCard = 1500.50;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the amount the product costs: ");
        try {
            double price = Double.parseDouble(sc.nextLine());
            validatePayment(price);
            moneyOnTheCard = moneyOnTheCard - price;
            System.out.println("The payment is successful. Your account has been withdrawn "
                    + price + " UAH. Balance on the card: " + moneyOnTheCard);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }

    private static void validatePayment(double price) throws IllegalArgumentException {
        if (price > moneyOnTheCard) {
            throw new IllegalArgumentException("insufficient funds on the card");
        }
    }
}

