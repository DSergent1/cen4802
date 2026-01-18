public class cen4082Mod1 {

        public static int fibonacciExample(int n) {

            if (n <= 1) {
                return n;
            }
            return fibonacciExample(n - 1) + fibonacciExample(n - 2);
        }

        // Main method
        public static void main(String[] args) {
            int n = 10;
            int result = fibonacciExample(n);

            System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
        }
    }


