import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Computing roots using newton iteration.
 *
 * @author Elijah Paulman
 *
 */
public final class Newton4 {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private Newton4() {
    }

    /**
     * Calculates the square root of a double x.
     */
    /**
     * @param x
     *            double for user number
     * @param e
     *            error
     * @return square root of double x
     */
    private static double sqrt(double x, double e) {
        //initializes double for square root value
        double r = x;
        //checks if x is zero to avoid undefined calculation
        if (x == 0) {
            r = 0;
        } else {
            //if x is not zero, calculates root within error
            while (!((Math.pow(r, 2) - x) / x < e)) {
                r = (r + (x / r)) / 2;
            }
        }
        //returns calculated root
        return r;
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        /*
         * Put your main program code here; it may call myMethod as shown
         */
        //prompts user for positive value
        out.print("Enter a positive value to calculate its roots: ");
        double x = in.nextDouble();
        //prompts user for error value
        out.print("Enter a value for error: ");
        double e = in.nextDouble();
        //calculates and prints root using sqrt method
        out.println(sqrt(x, e));
        //prompts user for another value or negative to quit
        out.print("Enter another positive value or negative value to quit: ");
        x = in.nextDouble();

        //if user enters a positive value, runs program again
        while (x >= 0) {
            //enter value for error
            out.print("Enter a value for error: ");
            e = in.nextDouble();
            //calculates and prints root using sqrt method
            out.println(sqrt(x, e));
            //prompts user for another value or quit
            out.print(
                    "Enter another positive value or negative value to quit: ");
            x = in.nextDouble();
        }
        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
