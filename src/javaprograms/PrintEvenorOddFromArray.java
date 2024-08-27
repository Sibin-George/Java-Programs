package javaprograms;

public class PrintEvenorOddFromArray {
    public static void main(String[] args) {
        // Initialize an array with sample values
        int[] numbers = {10, 15, 22, 37, 40, 53, 64, 79};

        // Print odd and even numbers
        printOddAndEvenNumbers(numbers);
    }

    // Method to print odd and even numbers from the array
    public static void printOddAndEvenNumbers(int[] array) {
        // Print even numbers
        System.out.println("Even numbers:");
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        // Print odd numbers
        System.out.println("Odd numbers:");
        for (int number : array) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}
