public class Main {

    public static void main(String[] args) {

        // Task 2a: Sum of numbers 1 to 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);

        // YOUR CODE HERE


        System.out.println(); // Empty line

        // Task 2b: Factorial of 8
        int factorial = 1;

        for (int i = 8; i >= 1; i--) {
            factorial *= i;
        }

        // YOUR CODE HERE
        System.out.println("Factorial of 8: " + factorial);

        System.out.println(); // Empty line

        // Task 2c: Multiplication table for 7
        System.out.println("Multiplication table for 7:");
        for (int i = 1; i <= 10; i++) {
            int product = i * 7;
            System.out.println(i + " * " + " 7 " + " = " + product);


        }
        // YOUR CODE HERE

        System.out.println(); // Empty line

        // Task 2d: Sum of even numbers 2 to 50
        int evenSum = 0;
        for (int i = 1; i <= 7; i++) {
            evenSum += i;
        }

        // YOUR CODE HERE
        System.out.println("Sum of even numbers 2 to 50: " + evenSum);

    }

}
