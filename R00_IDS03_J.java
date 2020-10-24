/**************************************************************
* Edith Forero
* Rule 00, IDS 03 
* Do not log unsanitized user input
* CIS4615 HW2
***************************************************************/
 
import java.util.Scanner;
import java.util.logging.*;


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
            System.out.println("username: " + userName);
        }
        
        
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + userName);
        } else {
            logger.severe("User login failed for: " + userName);
        }

        input.close();
    }
    
    public static class MyLogger 
	{
		static private String logs;
	}

}