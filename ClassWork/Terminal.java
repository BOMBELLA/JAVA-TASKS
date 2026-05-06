

import java.util.Scanner;

public class Terminal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any color (green, yellow, red): ");
        String colour = input.nextLine();

        if (colour.equalsIgnoreCase("green")) {
            System.out.println("Go");
        } else if (colour.equalsIgnoreCase("yellow")) {
            System.out.println("Get Ready");
        } else if (colour.equalsIgnoreCase("red")) {
            System.out.println("Stop");
        } else {
            System.out.println("Invalid color");
        }

      ;
    }
}
