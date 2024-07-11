package Museum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        Ticket[] aasdasdf = Ordering.whatType(Ordering.howMany());

        for (Ticket asd : aasdasdf) {
            System.out.println(asd);
        }

    }
}
