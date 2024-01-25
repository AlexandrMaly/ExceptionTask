package taskTwo;

import java.util.Scanner;

public class TaskTwo {

    private static double[] price = {10, 15, 20, 25, 30};
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the price index: ");
        try {
            int index = Integer.parseInt(sc.nextLine());
            System.out.println("The price according to index " + index + " was: " + price[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value of the index must be from 0 to 4");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

