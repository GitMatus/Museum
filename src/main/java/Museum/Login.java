package Museum;

import java.util.Scanner;

public class Login {

    public static boolean admin() {
        Scanner scannerLogin = new Scanner(System.in);
        System.out.println("Please, login with your user name.");
        String login = scannerLogin.nextLine();
        System.out.printf("Welcome %s", login);
        if (login.equals("admin")) {
            return true;
        } return true;

    }

    public static boolean logout(String login) {
        Scanner scannerLogout = new Scanner(System.in);
        System.out.println("Do you want to log out?");
        String logoutAnswer = scannerLogout.nextLine();
        System.out.printf("Goodbye %s", login);
        if (logoutAnswer.equals("yes")) {
            return true;
        } return true;

    }
}