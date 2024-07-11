package src.Museum;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ordering {


    public static int howMany() {
        Scanner scannerQuantity = new Scanner(System.in);
        int ticketsNeeded = 0;
        do {
            System.out.println("How many tickets do you want to buy? (1 to 3) ");
            ticketsNeeded = scannerQuantity.nextInt();
        } while (ticketsNeeded != 1 && ticketsNeeded != 2 && ticketsNeeded != 3);
        return ticketsNeeded;
    }


    public static Ticket whatType(int ticketsNeeded) {
        Scanner scannerType = new Scanner(System.in);
        String type = "needs_input";
        for (int i = 0; i < ticketsNeeded; i++) {
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.printf("What type of ticket will be your ticket #%d? (regular, child, disabled)\n", i + 1);
                type = scanner.nextLine();
            } while (!type.equals("regular") && !type.equals("child") && !type.equals("disabled"));

            System.out.println("For what date? (yyyy-mm-dd)");
            scanToLocalDate();

        }
        return new Ticket(type, Ticket.mapPrice(type), scanToLocalDate());
    }

    public static LocalDate scanToLocalDate() {
        try (Scanner scanner = new Scanner(System.in)) {
            String dateString = scanner.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            return LocalDate.parse(dateString, formatter);
        }
    }


}
