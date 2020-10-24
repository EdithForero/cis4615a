/** ************************************************************
 * Edith Forero
 * Rule 06. Methods (MET)
 * MET05-J. Ensure that constructors do not call overridable methods
 * Noncompliant Code Example
 * CIS4615 HW2
 * *************************************************************
 */
public class R06_MET08_J {

    static class SuperClass {

        public SuperClass() {
            doLogic();
        }

        public void doLogic() {
            System.out.println("This is superclass!");
        }
    }

    static class SubClass extends SuperClass {

        private String color = null;

        public SubClass() {
            super();
            color = "Red";
        }

        public void doLogic() {
            System.out.println("This is subclass! The color is :" + color);
            // ...
        }
    }

    public static void main(String[] args) {
        SuperClass bc = new SuperClass();
        // Prints "This is superclass!"
        SuperClass sc = new SubClass();
        // Prints "This is subclass! The color is :null"
    }
}
