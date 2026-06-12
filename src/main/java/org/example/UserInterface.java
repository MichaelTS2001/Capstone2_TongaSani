package org.example;

import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public static ShoppingCart cart = new ShoppingCart();


    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public void display() {


        System.out.println("============== Uncle Mikey's Pizza ==============\n");

       while(true) {

           try {
               homeScreen(scanner);
           } catch (InputMismatchException ex) {
               System.out.println("\nInvalid input. Try again.\n");
               scanner.nextLine(); //stops an infinite loop
           }
       }
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
                addDrink(scanner);
                break;
            case 3:
                addKnot(scanner);
                break;
            case 4:
                printReceipt(cart);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    public static void addPizza(Scanner scanner) {

        Pizza pizza = new Pizza(); //Create a pizza object

        getPizzaSize(pizza, scanner);

        getPizzaCrust(pizza, scanner);

        userTopping(pizza, scanner);
    }

    public static void getPizzaSize(Pizza pizza, Scanner scanner) {
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

            pizza.setSize(size); //set the size of the pizza based off the user's input


            System.out.println();

        }
    }

    public static void getPizzaCrust(Pizza pizza, Scanner scanner) {
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
        }

        switch (crust){
            case 1:
                pizza.setCrustType("Thin");
                break;
            case 2:
                pizza.setCrustType("Regular");
                break;
            case 3:
                pizza.setCrustType("Thick");
                break;
            default:
                pizza.setCrustType("Cauliflower");
                break;
        }
    }

    public static void userTopping(Pizza pizza, Scanner scanner) {
        System.out.println("\nToppings Categories:" +
                "\n\t1- Meats" +
                "\n\t2- Cheese" +
                "\n\t3- Regular Toppings" +
                "\n\t4- Sauces" +
                "\n\t5- Sides" +
                "\n\t6- Go Back");

        System.out.print("Select your topping category: ");

        int userTopping = scanner.nextInt();

        //validate the user's topping option
        while (userTopping < 1 || userTopping > 6) {
            System.out.println("\nInvalid option. Please try again.");

            System.out.println("Toppings Categories:" +
                    "\n\t1- Meats" +
                    "\n\t2- Cheese" +
                    "\n\t3- Regular Toppings" +
                    "\n\t4- Sauces" +
                    "\n\t5- Sides" +
                    "\n\t6- Go Back");
            System.out.print("Select your topping category: ");

            userTopping = scanner.nextInt();
        }

        boolean repeat = true;

        while(repeat){
            switch (userTopping) {
                case 1:
                    ToppingsList.getToppings(); //List of available toppings


                    meatTopping(pizza, ToppingsList.getToppings());
                    break;
                case 2:
                    ToppingsList.getToppings();

                    cheeseTopping(pizza, ToppingsList.getToppings(), false);
                    break;
                case 3:
                    ToppingsList.getToppings();

                    regularTopping(pizza, ToppingsList.getToppings());
                    break;
                case 4:
                    ToppingsList.getToppings();

                    sauceTopping(pizza, ToppingsList.getToppings());
                    break;
                case 5:
                    ToppingsList.getToppings();

                    sideTopping(pizza, ToppingsList.getToppings());
                    break;
                default:
                    cart.addToCart(pizza);
                    orderScreen(scanner);
                    break;
            }
        }
    }

    public static void meatTopping(Pizza pizza, List<Toppings> toppingsList){

        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;

        System.out.println("\nSelect your meat toppings:");
        for (Toppings list : toppingsList) {

            if (list.getType().equalsIgnoreCase("Meat")) {
                System.out.println("\t- " + list.getName());
            }
        }

        while(repeat){
            System.out.print("Enter your topping or go back to toppings menu: ");
            String meat = scanner.nextLine();

            for(Toppings meatTopping : toppingsList){
                if(meat.equalsIgnoreCase(meatTopping.getName())){
                    pizza.addTopping(meatTopping);
                    System.out.println("\nTopping " + meat + " has been added to pizza!\n");

                    System.out.println("Enter another topping, enter 'Exit' to go back to topping options, " +
                            "or enter 'Extra' to add extra toppings.\n");
                }
                else if(meat.equalsIgnoreCase("extra")){
                    extraMeatTopping(pizza, ToppingsList.getToppings());
                }
                else if(meat.equalsIgnoreCase("exit")){
                returnToToppingsMenu(pizza, scanner);
                }
            }

            if(meat.equalsIgnoreCase("Go Back")){
                userTopping(pizza, scanner);
            }
        }
    }

    public static void cheeseTopping(Pizza pizza, List<Toppings> toppingsList, boolean hasCheese){
        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;
        //boolean hasCheese = false;

        System.out.println("\nSelect your cheese toppings:");
        for (Toppings list : toppingsList) {

            if (list.getType().equalsIgnoreCase("Cheese")) {
                System.out.println("\t- " + list.getName());
            }
        }

        while(repeat){
            if(hasCheese){
                System.out.println("Enter another topping, enter 'Exit' to go back to topping options, " +
                        "or enter 'Extra' to add extra toppings.\n");
            }
            else{
                System.out.print("Enter your topping or type 'EXIT' to go back to the toppings menu: ");
            }

            String cheese = scanner.nextLine();

            if(cheese.equalsIgnoreCase("exit")){
                returnToToppingsMenu(pizza, scanner);
            }

            for(Toppings cheeseTopping : toppingsList){
                if(cheese.equalsIgnoreCase(cheeseTopping.getName()) &&
                        cheeseTopping.getType().equalsIgnoreCase("Cheese")){
                    pizza.addTopping(cheeseTopping);
                    System.out.println("\n " + cheese + " has been added to pizza!\n");
                    hasCheese = true;
                    //System.out.println("Enter another topping, enter 'Exit' to go back to topping options, " +
                           // "or enter 'Extra' to add extra toppings.\n");
                }
                else if(cheese.equalsIgnoreCase("exit")){
                    returnToToppingsMenu(pizza, scanner);
                }
                else if(cheese.equalsIgnoreCase("extra")){
                    extraCheeseTopping(pizza, ToppingsList.getToppings(), hasCheese);
                }
            }
        }
    }

    public static void regularTopping(Pizza pizza, List<Toppings> toppingsList){
        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;

        System.out.println("\nSelect your other toppings:");
        for (Toppings list : toppingsList) {

            if (list.getType().equalsIgnoreCase("Regular")) {
                System.out.println("\t- " + list.getName());
            }
        }

        while(repeat){
            System.out.print("Enter your topping: ");
            String regular = scanner.nextLine();

            for(Toppings regularTopping : toppingsList){
                if(regular.equalsIgnoreCase(regularTopping.getName())){
                    pizza.addTopping(regularTopping);
                    System.out.println("\nTopping " + regular + " has been added to pizza!\n");
                    System.out.println("Enter another topping, enter 'Exit' to go back to topping options, " +
                            "or enter 'Extra' to add extra toppings.\n");

                }
                else if(regular.equalsIgnoreCase("exit")){
                    returnToToppingsMenu(pizza, scanner);
                }
            }

        }
    }

    public static void sauceTopping(Pizza pizza, List<Toppings> toppingsList){
        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;

        System.out.println("\nSelect your sauce: ");
        for (Toppings list : toppingsList) {

            if (list.getType().equalsIgnoreCase("Sauce")) {
                System.out.println("\t- " + list.getName());
            }
        }

        while(repeat){
            System.out.print("Enter your sauce: ");
            String sauce = scanner.nextLine();

            for(Toppings sauceTopping : toppingsList){
                if(sauce.equalsIgnoreCase(sauceTopping.getName()) &&
                        sauceTopping.getType().equalsIgnoreCase("Sauce")){
                    pizza.addTopping(sauceTopping);
                    System.out.println("\n " + sauce + " has been added to pizza!\n");
                    System.out.println("Enter another sauce, enter 'Exit' to go back to topping options, " +
                            "or enter 'Extra' to add extra toppings.\n");

                }
                else if(sauce.equalsIgnoreCase("exit")){
                    returnToToppingsMenu(pizza, scanner);
                }
            }

        }
    }

    public static void sideTopping(Pizza pizza, List<Toppings> toppingsList){
        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;

        System.out.println("\nSelect your side for your toppings:");
        for (Toppings list : toppingsList) {

            if (list.getType().equalsIgnoreCase("side")) {
                System.out.println("\t- " + list.getName());
            }
        }

        while(repeat){
            System.out.print("Enter your side: ");
            String side = scanner.nextLine();

            for(Toppings sideTopping : toppingsList){
                if(side.equalsIgnoreCase(sideTopping.getName()) &&
                        sideTopping.getType().equalsIgnoreCase("Side")){
                    pizza.addTopping(sideTopping);
                    System.out.println("\n " + side + " has been added to pizza!\n");
                    System.out.println("Enter another topping, enter 'Exit' to go back to topping options, " +
                            "or enter 'Extra' to add extra toppings.\n");

                }
                else if(side.equalsIgnoreCase("exit")){
                    returnToToppingsMenu(pizza, scanner);
                }
            }

        }
    }

    public static void returnToToppingsMenu(Pizza pizza, Scanner scanner){
            System.out.println("\nYour selected pizza toppings:");
            for(Toppings toppings : pizza.getTopping()){
                System.out.println("\t- " + toppings.getName());
            }

            userTopping(pizza, scanner);
    }

    public static void extraMeatTopping(Pizza pizza, List<Toppings> toppingsList){

        Scanner scanner = new Scanner(System.in);
        boolean extra = true;


        while(extra){
                System.out.print("\nEnter 'Extra Meat' to add extra meat to your pizza: ");
                String option2 = scanner.nextLine();

                if(option2.equalsIgnoreCase("Extra Meat")){
                    for (Toppings extraMeat : toppingsList) {
                        if (option2.equalsIgnoreCase(extraMeat.getType())) {
                            pizza.addTopping(extraMeat);
                            System.out.println("\n" + option2 + " has been added to pizza!");
                        }
                    }
                }
                else{
                    System.out.println("\nInvalid input. Please try again.");
                }
            meatTopping(pizza, ToppingsList.getToppings());
        }
    }

    public static void extraCheeseTopping(Pizza pizza, List<Toppings> toppingsList, boolean hasCheese){

        Scanner scanner = new Scanner(System.in);
        boolean extra = true;

        while(extra){

            System.out.print("\nEnter 'Extra Cheese' to add extra cheese to your pizza: ");
            String option2 = scanner.nextLine();

            if(option2.equalsIgnoreCase("Cheese") ||
                    option2.equalsIgnoreCase("Extra Cheese")) {
                for (Toppings extraCheese : toppingsList) {
                    if (option2.equalsIgnoreCase(extraCheese.getType())) {
                        pizza.addTopping(extraCheese);
                        System.out.println("\n" + option2 + " has been added to pizza!\n");
                    }
                }
            }
            else{
                System.out.println("Invalid input. Please try again.");
            }
            cheeseTopping(pizza, ToppingsList.getToppings(), hasCheese);
        }


    }

    public static void addDrink(Scanner scanner){


        System.out.println("\nSelect your size for your drink: " +
                "\n\t1) Small" +
                "\n\t2) Medium" +
                "\n\t3) Large");

        System.out.print("Choose your size: ");
        int size = scanner.nextInt();

        while (size < 1 || size > 3) {
            System.out.println("\nInvalid size option. Please try again.");

            System.out.println("\nSelect your size for your drink: " +
                    "\n\t-1) Small" +
                    "\n\t-2) Medium" +
                    "\n\t-3) Large");

            System.out.print("Choose your size: ");

             size = scanner.nextInt();
        }

        System.out.print("\nHow many drinks would you like? ");

        int drinkNumber = scanner.nextInt();

        while (drinkNumber < 1) {
            System.out.println("\nInvalid number of drinks option. Please try again.");

            System.out.print("\nHow many drinks would you like? ");

            drinkNumber = scanner.nextInt();


            System.out.println();
        }

        if(drinkNumber == 1){
            System.out.println("\n"+ drinkNumber + " drink has been added to your order!");
        }
        else{
            System.out.println("\n"+ drinkNumber + " drinks has been added to your order!");
        }

        Drink drink = new Drink(size);

        int i = 0;
         while(i < drinkNumber){
             cart.addToCart(drink);
             i++;
         }



        orderScreen(scanner);
    }

    public static void addKnot (Scanner scanner){
        System.out.print("\nHow many Garlic Knots would you like to add to your order? ");
        int garlicKnots = scanner.nextInt();

        while (garlicKnots < 1) {
            System.out.println("\nInvalid number of garlic knots option. Please try again.");

            System.out.print("\nHow many Garlic Knots would you like to add to your order? ");

            garlicKnots = scanner.nextInt();

            System.out.println();
        }

        if(garlicKnots == 1){
            System.out.println("\n"+ garlicKnots + " garlic knot has been added to your order!");
        }
        else{
            System.out.println("\n"+ garlicKnots + " garlic knots has been added to your order!");
        }

        GarlicKnots knots = new GarlicKnots();

        int i = 0;
        while(i < garlicKnots){
            cart.addToCart(knots);
            i++;
        }

        orderScreen(scanner);
    }

    public static void printReceipt(ShoppingCart cart){
        StringBuilder sb = new StringBuilder(); //adding multiple lines of data, displays and writes it

        String receipt = "\n=========== Your receipt ===========\n";

        sb.append(receipt);

        System.out.println(sb);

        for(MenuItem item : cart.getCart()){
            if(item.getName().equalsIgnoreCase("Drink")){
                Drink drink = (Drink) item;
                //Create a variable for the drink info so that you can both prints the line and writes it to the txt file
                String drinkInfo = "\n\t- " + drink.getName() + ": $" + drink.getPrice(drink.getSize()) + "\n";
                //Appends adds it to the string builder for the receipt
                sb.append(drinkInfo);
                //prints out the receipt for the user
                System.out.println(sb);

            }
            else if(item.getName().equalsIgnoreCase("Garlic Knots")){

                GarlicKnots knots = (GarlicKnots) item;

                String knotsInfo = "\n\t- " + knots.getName()+ ": $" + knots.getPrice();

                sb.append(knotsInfo);

                System.out.println(sb);

            }
            else{
                Pizza pizza = (Pizza) item;

                String pizzaInfo = "\t- " + pizza.getName() + " $" + pizza.getPrice();

                for(Toppings toppings : pizza.getTopping()){
                    if(!toppings.getName().isEmpty() ){
                        System.out.println("\n\t\t- " + toppings.getName() + ": $" + toppings.getPrice(pizza.getSize()));
                    }
                }
                sb.append(pizzaInfo);

                System.out.println(sb);
            }
        }
        String totalInfo = "\nTotal: $" + cart.getCartTotal();

        sb.append(totalInfo);

        System.out.println(sb);

        //TODO - add the header and the total to the receipt

        //Creates a fileReader to read the String Builder and write on to the receipt file
        FileReader fileReader = new FileReader();
        fileReader.writeCart(sb);

        cart = new ShoppingCart(); //clears the shopping cart for the next order
        sb = new StringBuilder(); //clears the string builder for the next order
    }
}