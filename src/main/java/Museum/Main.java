package src.Museum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        src.Museum.Ordering.howMany();
        src.Museum.Ordering.whatType(src.Museum.Ordering.howMany());

        System.out.println("You bought ticket");
        System.out.println("Do you want to order more?");


    }
}
