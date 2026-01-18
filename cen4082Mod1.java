/**
 * The class shows a Fibonacci number example
 * and calculates in the main class using 10.
 */
public class cen4082Mod1 {

    /**
     * Calculation method by entering the nth term using recursion.
     * @param n position in the Fibonacci sequence
     * @return nth Fibonacci number
     */
        public static int fibonacciExample(int n) {

            if (n <= 1) {
                return n;
            }
            return fibonacciExample(n - 1) + fibonacciExample(n - 2);
        }

    /**
     * This is the main method to run and show the output for the Fibonacci sequence.
     * Uses 10 to print out the 10th term.
     * @param args argument for main method
     */
    public static void main(String[] args) {
            int n = 10;
            int result = fibonacciExample(n);

            System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
        }
    }


