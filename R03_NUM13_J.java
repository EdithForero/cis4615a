
/**
 * ************************************************************
 * Edith Forero
 * Rule 03. Numeric Types and Operations (NUM)
 * NUM13-J. Avoid loss of precision when converting primitive integers to 
 *   floating-point
 * Noncompliant Code Example
 * Example CIS4615 HW2
 * *************************************************************
 */
public class R03_NUM13_J {

    public static void main(String[] args) {

        int result = subFloatFromInt(1234567890, 1234567890);
        // This prints -46, not 0, as may be expected
        System.out.println(result);

    }

    public static int subFloatFromInt(int op1, float op2) {
        return op1 - (int) op2;
    }
}
