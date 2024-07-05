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
public final class Newton1 {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private Newton1() {
    }

    /**
     * Calculates the square root of a double x.
     */
    /**
     * @param x
     *            double for user number
     * @return square root of double x
     */
    private static double sqrt(double x) {
        //initializes double for square root value
        double r = x;
        //initializes e for error
        final double e = 0.0001;
        //calculates root within error
        while (!((Math.pow(r, 2) - x) / x < e)) {
            r = (r + (x / r)) / 2;
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
        //Initializes string to repeat calculations
        String repeat = "y";
        //loop to enter another value
        while (repeat.equals("y")) {
            //prompts user for value
            out.print("Enter a positive value to calculate its roots: ");
            double x = in.nextDouble();
            //calls srt method above
            out.println(sqrt(x));
            //prompts for another value or quit
            out.print("Would you like to calculate another? (y or n): ");
            repeat = in.nextLine();
        }
        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
