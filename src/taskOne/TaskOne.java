package taskOne;

import java.util.Scanner;

public class TaskOne {

    private static Scanner sc = new Scanner(System.in);
    private static int num;

    public static void main(String[] args) {
        System.out.println("Enter a number");
        try {
            num = Integer.parseInt(sc.nextLine());
            System.out.println("You entered " + num);
        } catch (NumberFormatException e) {
            System.out.println("Not a number! " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

