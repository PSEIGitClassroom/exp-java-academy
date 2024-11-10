package expeditors.week01.hello_world;

/**
 * @author Allen R. Sanders
 *
 * Application to demonstrate introductory Java concepts.
 */
public class Howdy {
    /**
     * Main entry point for "Hello, World" application.
     *
     * @param args  Optional command-line arguments for app
     */
    public static void main(String[] args) {
        String message = "Hello, World! Let's get to coding!!!";
        System.out.println(message);
        for (var counter = 0; counter < message.length(); counter++) {
            System.out.print("=");
        }
        System.out.println();

        String firstName = "Allen";
        String lastName = "Sanders";
        int age = 55;
        double decimalValue = 19.993459;

        System.out.printf("My name is %s %s", firstName, lastName);
        System.out.println();
        System.out.printf("Or, more formally - %s, %s\n", lastName, firstName);
        System.out.printf("My age is %d\n", age);
        System.out.printf("Formatted decimal value - %.4f\n", decimalValue);
        System.out.printf("Formatted differently - %.1f\n", decimalValue);
//        System.out.printf("This one won't work!! - %.1f\n", age);
        System.out.printf("Padding whole number with spaces - %10d", age);
        System.out.println();
        System.out.printf("Padding whole number with 0's - %010d", age);
        System.out.println();
    }
}
