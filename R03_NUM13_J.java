
/**
 * ************************************************************
 * Edith Forero
 * Rule 03. Numeric Types and Operations (NUM)
 * NUM13-J. Avoid loss of precision when converting primitive integers to
 *   floating-point
 * Compliant Code Example
 * Example CIS4615 HW2
 * *************************************************************
 */
public class R03_NUM13_J {

    public static void main(String[] args) {

        int result = subDoubleFromInt(1234567890, 1234567890);
        // Works as expected
        System.out.println(result);

    }

    public static int subDoubleFromInt(int op1, double op2) {
        return op1 - (int) op2;
    }
}
