package Museum;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ordering {

    public static int counter = 0;

    public static int howMany() {
        Scanner scannerQuantity = new Scanner(System.in);
        int ticketsNeeded = 0;
        do {
            System.out.println("How many tickets do you want to buy? (1 to 3) ");
            ticketsNeeded = scannerQuantity.nextInt();
        } while (ticketsNeeded != 1 && ticketsNeeded != 2 && ticketsNeeded != 3);
        return ticketsNeeded;
    }


    public static Ticket[] whatType(int ticketsNeeded) {
        Scanner scannerType = new Scanner(System.in);
        String type = "needs_input";
        double cost = 0;
        Ticket[] ticketArray = new Ticket[Ordering.counter + ticketsNeeded];
        for (int i = 0; i < ticketsNeeded; i++) {
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.printf("What type of ticket will be your ticket #%d? (regular, child, disabled)\n", i + 1);
                type = scanner.nextLine();
                if (type.equals("regular") || type.equals("child") || type.equals("disabled")){
                    counter++;
                    ticketArray[i] = new Ticket(type, Ticket.mapPrice(type), LocalDate.now());
                    cost += Ticket.mapPrice(type);

                }
            } while (!type.equals("regular") && !type.equals("child") && !type.equals("disabled"));


//            System.out.println("For what date? (yyyy-mm-dd)");
//            scanToLocalDate();

        } System.out.printf("Thank you for your order. Your price is %f\n", cost);
        System.out.println("--------------------\n");
        return ticketArray;


    }

    public static void orderconfirmation(double cost){

    }

//    public static LocalDate scanToLocalDate() {
//        try (Scanner scanner = new Scanner(System.in)) {
//            String dateString = scanner.nextLine();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//            return LocalDate.parse(dateString, formatter);
//}
//}


}
