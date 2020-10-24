
/** *************************************************************
 * Edith Forero
 * Rule 03. Numeric Types and Operations (NUM) 
 * Noncompliant Code
 * Example CIS4615 HW2
 ************************************************************** */
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class R03_NUM03_J {

    public static void main(String[] args) throws IOException {

        try {

            InputStream input = new FileInputStream("C:\\Users\\edith\\Documents\\NetBeansProjects\\Assignment_2\\src\\NUM03-J_test_File.txt");
            DataInputStream dataRead = new DataInputStream(input);
            long num = getInteger(dataRead);
            System.out.println(Long.toString(num));
        } catch (Exception e) {
            System.out.println("Error occurred: " + e);
        }
    }

    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt();
    }
}
