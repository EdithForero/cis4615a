
/** ************************************************************
 * Edith Forero
 * Rule 02. Expressions (EXP)
 * Compliant Solution
 * CIS4615 HW2
 ************************************************************** */
import java.io.File;


public class R02_XP00_J {

    public static void main(String[] args) {

        System.out.println("This compliant solution checks the Boolean value "
                + "returned by the delete() method and handles any resulting "
                + "errors\n\n");

        deleteFile();
    }

    static public void deleteFile() {

        
            File someFile = new File("someFileName.txt");
            // Do something with someFile
            if (!someFile.delete()) {
                // Handle failure to delete the file
                System.out.println(someFile + " NOT Deleted");
            } else {
                System.out.println(someFile + "Deleted");
            }
    }

}
