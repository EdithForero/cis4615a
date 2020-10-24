
/** ************************************************************
 * Edith Forero
 * Rule 02. Expressions (EXP)
 * Noncompliant Code Example (File Deletion)
 * CIS4615 HW2
 ************************************************************** */

import java.io.File;

public class R02_XP00_J {

    public static void main(String[] args) {
        
        System.out.println("This noncompliant code example attempts to "
                + "delete a file but fails to check whether the operation "
                + "has succeeded");
        
        deleteFile();
    }

    static public void deleteFile() {

        File someFile = new File("someFileName.txt");
        // Do something with someFile
        someFile.delete();

    }
}
