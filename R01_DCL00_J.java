
/** ************************************************************
 * Edith Forero
 * Rule 01. Declarations and Initialization (DCL)
 * DCL00-J. Prevent class initialization cycles
 * Noncompliant Code Example (Intraclass Cycle)
 * CIS4615 HW2
 * *************************************************************
 */
public class R01_DCL00_J {

    static public class Cycle {

        private final int balance;
        private static final Cycle c = new Cycle();
        private static final int deposit = (int) (Math.random() * 100); // Random deposit

        public Cycle() {
            balance = deposit - 10; // Subtract processing fee
        }

        public static void main(String[] args) {
            System.out.println("The account balance is: " + c.balance);
        }
    }
}
