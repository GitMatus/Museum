package Museum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Ordering.howMany();
        Ordering.whatType(Ordering.howMany());

        System.out.println("You bought ticket");
        System.out.println("Do you want to order more?");


    }
}
