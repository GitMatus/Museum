package Museum;

import java.util.Scanner;

public class Login {

public static String username;
public static String exit;

    public static String login() {
        Scanner scannerLogin = new Scanner(System.in);
        System.out.println("Please, login with your username.");
        String username = scannerLogin.nextLine();
        System.out.printf("Welcome %s\n", username);
        return username;
    }

    public static boolean admin(String username) {
        if (username.equals("admin")) {
            return true;
        } else return false;

    }

    public static boolean exit(String username) {
        Scanner scannerLogout = new Scanner(System.in);
        System.out.println("Do you want to exit?");
        String logoutAnswer = scannerLogout.nextLine();
        if (logoutAnswer.equals("yes")) {
            System.out.printf("Goodbye %s", username);
            return true;


        } else return false;

    }


}