package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInterface {

    static Pizza pizza; //This makes the variable class available for the entire class

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("============== Uncle Mikey's Pizza ==============\n");

        homeScreen(scanner);
    }

    public static void homeScreen(Scanner scanner) {

        System.out.println("1) New Order");
        System.out.println("2) Exit");

        System.out.print("Choose a menu option above: ");

        int menu = scanner.nextInt();

        //validate the user's input
        while (menu < 1 || menu > 2) {
            System.out.println("\nInvalid input. Please try again.");

            System.out.println("\n1) New Order");
            System.out.println("2) Exit");

            System.out.print("Choose a menu option above (1-2): ");

            menu = scanner.nextInt();
        }

        if (menu == 1) {
            orderScreen(scanner);
        } else {
            System.out.println("\nThank you for visiting Uncle Mikey's Pizza!");
            System.exit(0);
        }

    }

    public static void orderScreen(Scanner scanner) {

        System.out.println();

        System.out.println("1) Add pizza"
                + "\n2) Add Drink"
                + "\n3) Add Garlic Knots"
                + "\n4) Checkout"
                + "\n0) Cancel Order");

        System.out.print("\nSelect a menu option (0-4): ");

        int menu = scanner.nextInt();

        //validate the user's order screen menu
        while (menu < 0 || menu > 4) {
            System.out.println("\nInvalid order option. Please try again.\n");

            System.out.println("1) Add pizza"
                    + "\n2) Add Drink"
                    + "\n3) Add Garlic Knots"
                    + "\n4) Checkout"
                    + "\n0) Cancel Order");

            System.out.print("\nSelect a menu option (0-4): ");

            menu = scanner.nextInt();
        }

        switch (menu) {
            case 0:
                System.out.println("\n*** Order has been canceled! ***");

                System.out.println();

                homeScreen(scanner);
                break;
            case 1:
                System.out.println();

                addPizza(scanner);
                break;
            case 2:

                break;
            case 3:

                break;
            default:

                break;
        }


    }

    public static void addPizza(Scanner scanner) {

        getPizzaSize(scanner);


        System.out.println("Pizza Crust:" +
                "\n\t 1) Thin" +
                "\n\t 2) Regular" +
                "\n\t 3) Thick" +
                "\n\t 4) Cauliflower");

        System.out.print("\nSelect your pizza crust: ");

        int crust = scanner.nextInt();

        //validate the user's crust option
        while (crust < 1 || crust > 4) {
            System.out.println("\nInvalid option. Please try again.");

            System.out.println("Pizza Crust:" +
                    "\n\t- 1) Thin" +
                    "\n\t- 2) Regular" +
                    "\n\t- 3) Thick" +
                    "\n\t- 4) Cauliflower");

            System.out.print("\nSelect your pizza crust: ");

            crust = scanner.nextInt();
        }
    }

    public static void getPizzaSize(Scanner scanner){
        System.out.println("Pizza Size:" +
                "\n\t1) ---> 8" +
                "\n\t2) ---> 12" +
                "\n\t3) ---> 16");

        System.out.print("\nSelect your pizza size: ");

        int size = scanner.nextInt();

        //validate the user's crust option
        while (size < 1 || size > 3) {
            System.out.println("Pizza Size:" +
                    "\n\t1) ---> 8" +
                    "\n\t2) ---> 12" +
                    "\n\t3) ---> 16");

            System.out.print("\nSelect your pizza size: ");

            size = scanner.nextInt();
        }
    }

}