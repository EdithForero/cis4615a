
/** ************************************************************
 * Edith Forero
 * Rule 06. Methods (MET)
 * MET01-J. Never use assertions to validate method arguments
 * Compliant Solution
 * CIS4615 HW2
 ************************************************************** */
public class R06_MET01_J {

    public static void main(String[] args) {
        
        int num1 = 100;
        int num2 = -50;

        System.out.println(getAbsAdd(num1, num2));
        System.out.println(getAbsAdd(Integer.MIN_VALUE, 1));

    }

    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException();
        }
        return absX + absY;
    }
}
