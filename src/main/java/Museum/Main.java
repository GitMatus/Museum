package Museum;

import java.util.Objects;
import java.util.Scanner;

import static Museum.Ordering.counter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            if (Login.admin(Login.login())) {
                Admin.remainingCapacity(counter);

            } else Ordering.whatType(Ordering.howMany());
            Login.exit(Login.username);
        } while (!Login.exit.equals("yes"));

        System.out.println("Thank you for using Matus's museum ticket booking system.");
//
//        Ordering.whatType(Ordering.howMany());
//
//        System.out.println(counter);


    }
}
