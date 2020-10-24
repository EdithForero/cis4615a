/** ************************************************************
 * Edith Forero
 * Rule 00, IDS 03
 * Compliant Solution (Sanitized User)
 * CIS4615 HW2
 ***************************************************************/

import java.util.Scanner;
import java.util.logging.*;
import java.util.regex.Pattern;

public class R00_IDS03_J {

    static Logger logger = Logger.getLogger(MyLogger.class.getName());

    public static void main(String[] args) {

        String validName = "edith";
        boolean loginSuccessful = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username: ");

        String userName = input.next();

        if (userName.equals(validName)) {
            loginSuccessful = true;
        }

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(userName));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(userName));
        }

        input.close();
    }

   //function to sanatize user input for the username field
    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username)
                ? username : "unauthorized user";
	}
    
    public static class MyLogger {

        static private String logs;
    }

}
