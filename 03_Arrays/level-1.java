import java.util.Scanner;
import java.util.Arrays;

public class ArrayPrograms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Check Voting Eligibility
        checkVotingEligibility(scanner);
        System.out.println("\n------------------------------------\n");

        // 2. Check Number Properties and Compare First and Last
        checkNumberProperties(scanner);
        System.out.println("\n------------------------------------\n");

        // 3. Print Multiplication Table
        printMultiplicationTable(scanner);
        System.out.println("\n------------------------------------\n");

        // 4. Store Numbers Until 0 or Negative, Show Sum
        storeAndSumNumbers(scanner);
        System.out.println("\n------------------------------------\n");

        // 5. Print Multiplication Table from 6 to 9
        printMultiplicationTableRange(scanner);
        System.out.println("\n------------------------------------\n");

        // 6. Find Mean Height of Football Team
        findMeanHeight(scanner);
        System.out.println("\n------------------------------------\n");

        // 7. Store Odd and Even Numbers in Separate Arrays
        storeOddEven(scanner);
        System.out.println("\n------------------------------------\n");

        // 8. Find Factors of a Number
        findFactors(scanner);
        System.out.println("\n------------------------------------\n");

        // 9. Convert 2D Array to 1D Array
        convert2DTo1DArray(scanner);
        System.out.println("\n------------------------------------\n");

        // 10. FizzBuzz
        fizzBuzz(scanner);

        scanner.close();
    }

    // 1. Write a program to take user input for the age of all 10 students in a class and
    // check whether the student can vote depending on his/her age is greater or equal to 18.
    public static void checkVotingEligibility(Scanner scanner) {
        final int NUM_STUDENTS = 10; // Fixed number of students.
        int[] studentAges = new int[NUM_STUDENTS]; // Array to store ages.

        System.out.println("1. Check Voting Eligibility:");
        // Get input for each student's age.
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.printf("Enter age for student %d: ", i + 1);
            while (true) {
                try {
                    studentAges[i] = scanner.nextInt(); // Read age
                    if (studentAges[i] >= 0) {
                        break; // Exit loop if age is valid
                    } else {
                        System.out.println("Invalid age. Please enter a non-negative number.");
                        System.out.printf("Enter age for student %d: ", i + 1); // Prompt again
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); // Consume the invalid input
                    System.out.printf("Enter age for student %d: ", i + 1); // Prompt again
                }
            }
        }

        // Check voting eligibility for each student.
        for (int i = 0; i < NUM_STUDENTS; i++) {
            if (studentAges[i] >= 18) {
                System.out.printf("Student %d with age %d can vote.\n", i + 1, studentAges[i]);
            } else {
                System.out.printf("Student %d with age %d cannot vote.\n", i + 1, studentAges[i]);
            }
        }
    }

    // 2. Write a program to take user input for 5 numbers and check whether a number is
    // positive, negative, or zero.
    // Further for positive numbers check if the number is even or odd.
    // Finally compare the first and last elements of the array and display if they equal,
    // greater or less
    public static void checkNumberProperties(Scanner scanner) {
        final int NUM_NUMBERS = 5; // Fixed number of inputs.
        int[] numbers = new int[NUM_NUMBERS]; // Array to store numbers.

        System.out.println("2. Check Number Properties:");
        // Get input for each number.
        for (int i = 0; i < NUM_NUMBERS; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            try {
                numbers[i] = scanner.nextInt(); // Read number
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the invalid input
                i--;       //repeat the same iteration
                continue;
            }
        }

        // Check properties of each number.
        for (int i = 0; i < NUM_NUMBERS; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.printf("Number %d (%d) is positive and even.\n", i + 1, numbers[i]);
                } else {
                    System.out.printf("Number %d (%d) is positive and odd.\n", i + 1, numbers[i]);
                }
            } else if (numbers[i] < 0) {
                System.out.printf("Number %d (%d) is negative.\n", i + 1, numbers[i]);
            } else {
                System.out.printf("Number %d (%d) is zero.\n", i + 1, numbers[i]);
            }
        }

        // Compare first and last elements.
        if (numbers[0] == numbers[NUM_NUMBERS - 1]) {
            System.out.println("The first and last numbers are equal.");
        } else if (numbers[0] > numbers[NUM_NUMBERS - 1]) {
            System.out.println("The first number is greater than the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }
    }

    // 3. Create a program to print a multiplication table of a number.
    public static void printMultiplicationTable(Scanner scanner) {
        System.out.println("3. Print Multiplication Table:");
        System.out.print("Enter a number: ");
        int number;

        while (true) {
            try {
                number = scanner.nextInt(); // Read the number
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the invalid input
                System.out.print("Enter a number: ");
            }
        }
        final int TABLE_SIZE = 10;
        int[] multiplicationTable = new int[TABLE_SIZE]; // Array to store results.

        // Calculate and store the multiplication table.
        for (int i = 0; i < TABLE_SIZE; i++) {
            multiplicationTable[i] = number * (i + 1);
        }

        // Display the multiplication table.
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.printf("%d * %d = %d\n", number, i + 1, multiplicationTable[i]);
        }
    }

    // 4. Write a program to store multiple values in an array up to a maximum of 10 or
    // until the user enters a 0 or a negative number.
    // Show all the numbers as well as the sum of all numbers
    public static void storeAndSumNumbers(Scanner scanner) {
        final int MAX_NUMBERS = 10; // Maximum number of inputs.
        double[] numbers = new double[MAX_NUMBERS]; // Array to store numbers.
        double sum = 0.0; // Variable to store the sum.
        int count = 0; // Variable to track number of inputs.

        System.out.println("4. Store Numbers and Calculate Sum:");
        System.out.println("Enter numbers (enter 0 or a negative number to stop):");

        // Get input until 0 or negative number, or max limit reached.
        while (count < MAX_NUMBERS) {
            try {
                double input = scanner.nextDouble(); // Read input
                if (input <= 0) {
                    break; // Exit loop if input is 0 or negative
                }
                numbers[count++] = input; // Store the number
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume the invalid input
            }
        }

        // Calculate the sum of the numbers.
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }

        // Display the numbers and the sum.
        System.out.print("Entered numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.printf("Sum: %.2f\n", sum);
    }

    // 5. Create a program to find the multiplication table of a number entered by the
    // user from 6 to 9 and display the result
    public static void printMultiplicationTableRange(Scanner scanner) {
        System.out.println("5. Print Multiplication Table (6 to 9):");
        System.out.print("Enter a number: ");
        int number;
        while (true) {
            try {
                number = scanner.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
                System.out.print("Enter a number: ");
            }
        }

        final int START = 6;
        final int END = 9;
        int[] multiplicationResult = new int[END - START + 1];

        for (int i = START; i <= END; i++) {
            multiplicationResult[i - START] = number * i;
        }

        for (int i = START; i <= END; i++) {
            System.out.printf("%d * %d = %d\n", number, i, multiplicationResult[i-START]);
        }
    }

    // 6. Create a program to find the mean height of players present in a football team.
    public static void findMeanHeight(Scanner scanner) {
        final int TEAM_SIZE = 11; // Fixed team size.
        double[] heights = new double[TEAM_SIZE]; // Array to store heights.
        double sum = 0; // Variable to store sum of heights.

        System.out.println("6. Find Mean Height:");
        System.out.println("Enter the heights of 11 football players in meters:");
        // Get input for each player's height.
        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.printf("Player %d: ", i + 1);
            while (true) {
                try {
                    heights[i] = scanner.nextDouble(); // Read height
                    if (heights[i] > 0)
                        break;
                    else
                        System.out.println("Invalid Input. Enter a positive value");
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Consume the invalid input
                    System.out.printf("Player %d: ", i + 1);
                }
            }
            sum += heights[i]; // Add height to sum
        }

        double meanHeight = sum / TEAM_SIZE; // Calculate mean height
        System.out.printf("The mean height of the football team is: %.2f meters\n", meanHeight);
    }

    // 7. Create a program to save odd and even numbers into odd and even arrays
    // between 1 to the number entered by the user.
    public static void storeOddEven(Scanner scanner) {
        System.out.println("7. Store Odd and Even Numbers:");
        System.out.print("Enter a natural number: ");
        int number;
        while (true) {
            try {
                number = scanner.nextInt();
                if (number > 0)
                    break;
                else
                    System.out.println("Invalid Input. Enter a positive number");
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
                System.out.print("Enter a natural number: ");
            }
        }

        int[] evenNumbers = new int[number / 2 + 1]; // Array for even numbers.
        int[] oddNumbers = new int[number / 2 + 1]; // Array for odd numbers.
        int evenIndex = 0; // Index for even numbers array.
        int oddIndex = 0; // Index for odd numbers array.

        // Store numbers in respective arrays.
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Store even
            } else {
                oddNumbers[oddIndex++] = i; // Store odd
            }
        }

        // Print even numbers.
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Print odd numbers.
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
    }

    // 8. Create a program to find the factors of a number taken as user input,
    // store the factors in an array, and display the factors
    public static void findFactors(Scanner scanner) {
        System.out.println("8. Find Factors of a Number:");
        System.out.print("Enter a number: ");
        int number;
        while (true) {
            try {
                number = scanner.nextInt();
                if (number > 0)
                    break;
                else
                    System.out.println("Invalid Input. Enter a positive number");
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
                System.out.print("Enter a number: ");
            }
        }

        int initialSize = 10;
        int[] factors = new int[initialSize]; // Initial size of factors array
        int factorIndex = 0; // Index to keep track of filled factors

        // Find and store the factors.
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[factorIndex++] = i;
                if (factorIndex == factors.length) {
                    // Increase array size if needed
                    int[] newFactors = new int[factors.length * 2];
                    System.arraycopy(factors, 0, newFactors, 0, factors.length);
                    factors = newFactors;
                }
            }
        }
        factors = Arrays.copyOf(factors, factorIndex); //copy till the factorIndex

        // Display the factors.
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < factorIndex; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }

    // 9. Working with Multi-Dimensional Arrays. Write a Java program to create a 2D
    // Array and Copy the 2D Array into a single dimension array
    public static void convert2DTo1DArray(Scanner scanner) {
        System.out.println("9. Convert 2D Array to 1D Array:");
        System.out.print("Enter the number of rows: ");
        int rows;
        while (true) {
            try {
                rows = scanner.nextInt();
                if (rows > 0)
                    break;
                else
                    System.out.println("Invalid Input. Enter a positive number for row");
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
                System.out.print("Enter the number of rows: ");
            }
        }

        System.out.print("Enter the number of columns: ");
        int columns;
        while (true) {
            try {
                columns = scanner.nextInt();
                if (columns > 0)
                    break;
                else
                    System.out.println("Invalid Input. Enter a positive number for column");
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
                System.out.print("Enter the number of columns: ");
            }
        }

        int[][] matrix = new int[rows][columns]; // 2D array (matrix)
        System.out.println("Enter the elements of the matrix:");
        // Get the elements of the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("matrix[%d][%d]: ", i, j);
                try {
                    matrix[i][j] = scanner.nextInt();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next();
                    j--; // Repeat the current column
                }

            }
        }

        int[] array1D = new int[rows * columns]; // 1D array
        int index = 0; // Index for the 1D array

        // Copy elements from 2D to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array1D[index++] = matrix[i][j];
            }
        }

        // Display the 1D array
        System.out.print("1D Array: ");
        for (int element : array1D) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // 10. Write a program FizzBuzz, take a number as user input and if it is a positive
    // integer loop from 0 to the number and save the number, but for multiples of 3
    // save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for
    // multiples of both save "FizzBuzz".
    // Finally, print the array results for each index position.
    public static void fizzBuzz(Scanner scanner) {
        System.out.println("10. FizzBuzz:");
        System.out.print("Enter a positive integer: ");
        int number;

        while (true) {
            try {
                number = scanner.nextInt();
                if (number > 0)
                    break;
                else
                    System.out.println("Invalid Input. Enter a positive number");
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
                System.out.print("Enter a positive integer: ");
            }
        }

        String[] results = new String[number + 1]; // Array to store results
        // Generate FizzBuzz sequence
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i); // Convert int to String
            }
        }

        // Print the results
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}

