package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    static Pizza pizza; //This makes the variable class available for the entire class

    public ShoppingCart cart = new ShoppingCart();


    public UserInterface(){
        scanner = new Scanner(System.in);
    }


    public void display(){


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

        //Pizza newPizza = new Pizza();

        //getPizzaSize(scanner, newPizza);

        getPizzaCrust(scanner);

    }

    public static void getPizzaSize(Scanner scanner, Pizza pizza){
        System.out.println("Pizza Size:" +
                "\n\t1) ---> Personal: 8 inches" +
                "\n\t2) ---> Medium: 12 inches" +
                "\n\t3) ---> Large: 16 inches");

        System.out.print("\nSelect your pizza size: ");

        int size = scanner.nextInt();

        System.out.println();

        //validate the user's pizza size option
        while (size < 1 || size > 3) {
            System.out.println("Pizza Size:" +
                    "\n\t1) ---> Personal: 8 inches" +
                    "\n\t2) ---> Medium: 12 inches" +
                    "\n\t3) ---> Large: 16 inches");

            System.out.print("\nSelect your pizza size: ");

            size = scanner.nextInt();


            System.out.println();

        }
    }

    public static void getPizzaCrust(Scanner scanner){
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

            System.out.println("\nPizza Crust:" +
                    "\n\t- 1) Thin" +
                    "\n\t- 2) Regular" +
                    "\n\t- 3) Thick" +
                    "\n\t- 4) Cauliflower");

            System.out.print("\nSelect your pizza crust: ");

            crust = scanner.nextInt();


//            if(crust == 1){
//                return "Thin";
//            }
//            else if(crust == 2){
//                return "Regular";
//            }
//            else if(crust == 3){
//                pizza.setCrustType("Thick");
//            }
//            else{
//                pizza.setCrustType("Cauliflower");
//            }
//
//            System.out.println();
//        }
    }

//    public static List<Toppings> getTopping(Scanner scanner){
//
//        System.out.println("Toppings Categories: " +
//                "\n1. Meats" +
//                "\n2. Cheese" +
//                "\n3. Regular Toppings" +
//                "\n4. Sauces");
//
//        System.out.print("Enter your choice of meat:");
//
//        int topping = scanner.nextInt();

        //while(!meat.equals("Pepperoni") || !meat.equals("Sausage") || !meat.equals("Ham") ||)


    }

}