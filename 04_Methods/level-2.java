import java.util.InputMismatchException;
import java.util.Scanner;

// Sample Program 1: Create a program to find the sum of all the digits of a number given by a user using an array and display the sum.
// Use Math.random() and get a 4-digit random integer number
// Write a method to count digits in the number
// Write a method to return an array of digits from a given number.
// Write a method to Find the sum of the digits of the number in the array
// Finally, display the sum of the digits of the number
// Create SumOfDigit Class to compute the sum of 4 digits random number

/**
 * The SumOfDigits class calculates the sum of the digits of a 4-digit random number.
 */
class SumOfDigits {

    /**
     * Generates a 4-digit random integer.
     *
     * @return A 4-digit random integer.
     */
    public int generate4DigitRandomNumber() {
        // Generate a random number between 1000 and 9999 (inclusive).
        return (int) (Math.random() * 9000) + 1000;
    }

    /**
     * Counts the number of digits in the given number.
     *
     * @param number The number whose digits are to be counted.
     * @return The number of digits in the input number.
     */
    public int countDigits(int number) {
        int count = 0;
        int temp = number; // Use a temporary variable to avoid modifying the original number.
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    /**
     * Extracts the digits from the given number and stores them in an array.
     *
     * @param number The number from which to extract the digits.
     * @param count  The number of digits in the number.
     * @return An array containing the individual digits of the number.
     */
    public int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        int temp = number; // Use a temporary variable.
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    /**
     * Calculates the sum of the elements in the given integer array.
     *
     * @param array The integer array whose elements are to be summed.
     * @return The sum of the elements in the array.
     */
    public int calculateSumOfArray(int[] array) {
        int sum = 0;
        for (int value : array) { // Use enhanced for loop for better readability
            sum += value;
        }
        return sum;
    }

    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();

        // 1. Generate a 4-digit random number.
        int randomNumber = sumOfDigits.generate4DigitRandomNumber();
        System.out.println("The random number is: " + randomNumber);

        // 2. Count the digits in the number.
        int digitCount = sumOfDigits.countDigits(randomNumber);
        System.out.println("The digit count is: " + digitCount);

        // 3. Extract the digits into an array.
        int[] digitsArray = sumOfDigits.getDigits(randomNumber, digitCount);

        // 4. Calculate the sum of the digits.
        int sumOfDigitsValue = sumOfDigits.calculateSumOfArray(digitsArray);

        // 5. Display the result.
        System.out.println("\nSum of digits: " + sumOfDigitsValue);
    }
}

// Level 2 Practice Programs
// 1. Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors.
//    Also find the sum, sum of the square of factors, and the product of the factors and display the results
//    Hint =>
//    Take the input for a number
//    Write a static Method to find the factors of the number and save them in an array and return the array.
//    To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count.
//    And the second loop save the factors into the array
//    Write a method to find the sum of the factors using factors array
//    Write a method to find the product of the factors using factors array
//    Write a method to find the sum of the square of the factors using Math.pow() method
/**
 * The FactorsCalculator class calculates factors of a number, their sum, sum of squares, and product.
 */
class FactorsCalculator {

    /**
     * Finds the factors of the given number and returns them in an array.
     *
     * @param number The number for which to find the factors.
     * @return An array containing the factors of the number, or an empty array if the number is invalid.
     */
    public static int[] findFactors(int number) {
        if (number <= 0) {
            return new int[0]; // Return an empty array for non-positive numbers.  Added check.
        }

        int count = 0;
        // First, count the number of factors.
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        // Then, store the factors in the array.
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    /**
     * Calculates the sum of the factors in the given array.
     *
     * @param factors The array containing the factors.
     * @return The sum of the factors.
     */
    public static int calculateSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    /**
     * Calculates the product of the factors in the given array.
     *
     * @param factors The array containing the factors.
     * @return The product of the factors.
     */
    public static long calculateProductOfFactors(int[] factors) {
        long product = 1; // Use long to handle potentially large products.
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    /**
     * Calculates the sum of the squares of the factors in the given array.
     *
     * @param factors The array containing the factors.
     * @return The sum of the squares of the factors.
     */
    public static double calculateSumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] factors = findFactors(number);
        if (factors.length == 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            scanner.close();
            return;
        }

        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        int sumOfFactors = calculateSumOfFactors(factors);
        long productOfFactors = calculateProductOfFactors(factors);
        double sumOfSquaresOfFactors = calculateSumOfSquaresOfFactors(factors);

        System.out.println("Sum of factors: " + sumOfFactors);
        System.out.println("Product of factors: " + productOfFactors);
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors);
        scanner.close();
    }
}

// 2. Write a program to find the sum of n natural numbers using a recursive method and compare the result with the formula n*(n+1)/2
//    and show the result from both computations is correct.
//    Hint =>
//    Take the user input number and check whether it's a Natural number, if not exit
//    Write a Method to find the sum of n natural numbers using recursion
//    Write a Method to find the sum of n natural numbers using the formula n*(n+1)/2
//    Compare the two results and print the result
/**
 * The NaturalNumberSum class calculates the sum of natural numbers using recursion and a formula.
 */
class NaturalNumberSum {

    /**
     * Recursively calculates the sum of the first n natural numbers.
     *
     * @param n The number of natural numbers to sum.
     * @return The sum of the first n natural numbers.
     */
    public int calculateRecursiveSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + calculateRecursiveSum(n - 1);
        }
    }

    /**
     * Calculates the sum of the first n natural numbers using the formula n*(n+1)/2.
     *
     * @param n The number of natural numbers to sum.
     * @return The sum of the first n natural numbers.
     */
    public int calculateFormulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.close();
            return;
        }

        NaturalNumberSum naturalNumberSum = new NaturalNumberSum();
        int recursiveSum = naturalNumberSum.calculateRecursiveSum(number);
        int formulaSum = naturalNumberSum.calculateFormulaSum(number);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula:   " + formulaSum);

        boolean areEqual = (recursiveSum == formulaSum);
        System.out.println("Results are the same: " + areEqual);
        scanner.close();
    }
}

// 3. Write a program that takes a year as input and outputs the Year is a Leap Year or not
//    Hint =>
//    The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
//    Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
//    Write a method to check for Leap Year using the conditions a and b
/**
 * The LeapYearChecker class checks if a given year is a leap year.
 */
class LeapYearChecker {

    /**
     * Checks if the given year is a leap year.
     *
     * @param year The year to check.
     * @return true if the year is a leap year, false otherwise.
     */
    public boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; // Gregorian calendar starts from 1582
        }
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        boolean isLeap = leapYearChecker.isLeapYear(year);
        System.out.println(year + " is a leap year: " + isLeap);
        scanner.close();
    }
}

// 4. Extend or Create a UnitConverter utility class similar to the one shown in the notes to do the following.
//    Please define static methods for all the UnitConverter class methods. E.g.
//    public static double convertKmToMiles(double km) =>
//    Method To convert kilometers to miles and return the value. Use the following code  double km2miles = 0.621371;
//    Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
//    Method to convert meters to feet and return the value. Use the following code to convert  double meters2feet = 3.28084;
//    Method to convert feet to meters and return the value. Use the following code to convert  double feet2meters = 0.3048;
/**
 * The UnitConverter class provides static methods for various unit conversions.
 */
class UnitConverter {

    // Distance conversions
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;
    private static final double YARDS_TO_FEET = 3;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

    // Temperature conversions
    private static final double FAHRENHEIT_TO_CELSIUS_FACTOR = 5.0 / 9.0;
    private static final int FAHRENHEIT_TO_CELSIUS_OFFSET = 32;
    private static final double CELSIUS_TO_FAHRENHEIT_FACTOR = 9.0 / 5.0;
    private static final int CELSIUS_TO_FAHRENHEIT_OFFSET = 32;

    // Weight conversions
    private static final double POUNDS_TO_KG = 0.453592;
    private static final double KG_TO_POUNDS = 2.20462;

    // Volume conversions
    private static final double GALLONS_TO_LITERS = 3.78541;
    private static final double LITERS_TO_GALLONS = 0.264172;

    /**
     * Converts kilometers to miles.
     *
     * @param kilometers The distance in kilometers.
     * @return The distance in miles.
     */
    public static double convertKmToMiles(double kilometers) {
        return kilometers * KM_TO_MILES;
    }

    /**
     * Converts miles to kilometers.
     *
     * @param miles The distance in miles.
     * @return The distance in kilometers.
     */
    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    /**
     * Converts meters to feet.
     *
     * @param meters The distance in meters.
     * @return The distance in feet.
     */
    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    /**
     * Converts feet to meters.
     *
     * @param feet The distance in feet.
     * @return The distance in meters.
     */
    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    /**
     * Converts yards to feet.
     *
     * @param yards The distance in yards.
     * @return The distance in feet.
     */
    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    /**
     * Converts feet to yards.
     *
     * @param feet The distance in feet.
     * @return The distance in yards.
     */
    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    /**
     * Converts meters to inches.
     *
     * @param meters The distance in meters.
     * @return The distance in inches.
     */
    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    /**
     * Converts inches to meters.
     *
     * @param inches The distance in inches.
     * @return The distance in meters.
     */
    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    /**
     * Converts inches to centimeters.
     *
     * @param inches The distance in inches.
     * @return The distance in centimeters.
     */
    public static double convertInchesToCm(double inches) {
        return inches * INCHES_TO_CM;
    }

    /**
     * Converts Fahrenheit to Celsius.
     *
     * @param fahrenheit The temperature in Fahrenheit.
     * @return The temperature in Celsius.
     */
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_TO_CELSIUS_OFFSET) * FAHRENHEIT_TO_CELSIUS_FACTOR;
    }

    /**
     * Converts Celsius to Fahrenheit.
     *
     * @param celsius The temperature in Celsius.
     * @return The temperature in Fahrenheit.
     */
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * CELSIUS_TO_FAHRENHEIT_FACTOR) + CELSIUS_TO_FAHRENHEIT_OFFSET;
    }

    /**
     * Converts pounds to kilograms.
     *
     * @param pounds The weight in pounds.
     * @return The weight in kilograms.
     */
    public static double convertPoundsToKg(double pounds) {
        return pounds * POUNDS_TO_KG;
    }

    /**
     * Converts kilograms to pounds.
     *
     * @param kilograms The weight in kilograms.
     * @return The weight in pounds.
     */
    public static double convertKgToPounds(double kilograms) {
        return kilograms * KG_TO_POUNDS;
    }

    /**
     * Converts gallons to liters.
     *
     * @param gallons The volume in gallons.
     * @return The volume in liters.
     */
    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

    /**
     * Converts liters to gallons.
     *
     * @param liters The volume in liters.
     * @return The volume in gallons.
     */
    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }

    /**
     * Main method for UnitConverter.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1. Distance Conversion");
        System.out.println("2. Temperature Conversion");
        System.out.println("3. Weight Conversion");
        System.out.println("4. Volume Conversion");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        try {
            switch (choice) {
                case 1:
                    System.out.println("\nChoose distance conversion:");
                    System.out.println("a. KM to Miles");
                    System.out.println("b. Miles to KM");
                    System.out.println("c. Meters to Feet");
                    System.out.println("d. Feet to Meters");
                    System.out.println("e. Yards to Feet");
                    System.out.println("f. Feet to Yards");
                    System.out.println("g. Meters to Inches");
                    System.out.println("h. Inches to Meters");
                    System.out.println("i. Inches to Centimeters");
                    System.out.print("Enter your choice (a-i): ");
                    String distanceChoice = scanner.next();

                    System.out.print("Enter the value: ");
                    double distanceValue = scanner.nextDouble();

                    double result = 0;
                    switch (distanceChoice) {
                        case "a":
                            result = UnitConverter.convertKmToMiles(distanceValue);
                            System.out.println(distanceValue + " KM is equal to " + result + " Miles");
                            break;
                        case "b":
                            result = UnitConverter.convertMilesToKm(distanceValue);
                            System.out.println(distanceValue + " Miles is equal to " + result + " KM");
                            break;
                        case "c":
                            result = UnitConverter.convertMetersToFeet(distanceValue);
                            System.out.println(distanceValue + " Meters is equal to " + result + " Feet");
                            break;
                        case "d":
                            result = UnitConverter.convertFeetToMeters(distanceValue);
                            System.out.println(distanceValue + " Feet is equal to " + result + " Meters");
                            break;
                        case "e":
                            result = UnitConverter.convertYardsToFeet(distanceValue);
                            System.out.println(distanceValue + " Yards is equal to " + result + " Feet");
                            break;
                        case "f":
                            result = UnitConverter.convertFeetToYards(distanceValue);
                            System.out.println(distanceValue + " Feet is equal to " + result + " Yards");
                            break;
                        case "g":
                            result = UnitConverter.convertMetersToInches(distanceValue);
                            System.out.println(distanceValue + " Meters is equal to " + result + " Inches");
                            break;
                        case "h":
                            result = UnitConverter.convertInchesToMeters(distanceValue);
                            System.out.println(distanceValue + " Inches is equal to " + result + " Meters");
                            break;
                        case "i":
                            result = UnitConverter.convertInchesToCm(distanceValue);
                            System.out.println(distanceValue + " Inches is equal to " + result + " Centimeters");
                            break;
                        default:
                            System.out.println("Invalid distance conversion choice.");
                    }
                    break;
                case 2:
                    System.out.println("\nChoose temperature conversion:");
                    System.out.println("a. Fahrenheit to Celsius");
                    System.out.println("b. Celsius to Fahrenheit");
                    System.out.print("Enter your choice (a-b): ");
                    String tempChoice = scanner.next();
                    System.out.print("Enter the value: ");
                    double tempValue = scanner.nextDouble();
                    double tempResult = 0;
                    switch (tempChoice) {
                        case "a":
                            tempResult = UnitConverter.convertFahrenheitToCelsius(tempValue);
                            System.out.println(tempValue + " Fahrenheit is equal to " + tempResult + " Celsius");
                            break;
                        case "b":
                            tempResult = UnitConverter.convertCelsiusToFahrenheit(tempValue);
                            System.out.println(tempValue + " Celsius is equal to " + tempResult + " Fahrenheit");
                            break;
                        default:
                            System.out.println("Invalid temperature conversion choice.");
                    }
                    break;
                case 3:
                    System.out.println("\nChoose weight conversion:");
                    System.out.println("a. Pounds to Kilograms");
                    System.out.println("b. Kilograms to Pounds");
                    System.out.print("Enter your choice (a-b): ");
                    String weightChoice = scanner.next();
                    System.out.print("Enter the value: ");
                    double weightValue = scanner.nextDouble();
                    double weightResult = 0;
                    switch (weightChoice) {
                        case "a":
                            weightResult = UnitConverter.convertPoundsToKg(weightValue);
                            System.out.println(weightValue + " Pounds is equal to " + weightResult + " Kilograms");
                            break;
                        case "b":
                            weightResult = UnitConverter.convertKgToPounds(weightValue);
                            System.out.println(weightValue + " Kilograms is equal to " + weightResult + " Pounds");
                            break;
                        default:
                            System.out.println("Invalid weight conversion choice.");
                    }
                    break;
                case 4:
                    System.out.println("\nChoose volume conversion:");
                    System.out.println("a. Gallons to Liters");
                    System.out.println("b. Liters to Gallons");
                    System.out.print("Enter your choice (a-b): ");String volumeChoice = scanner.next();
                    System.out.print("Enter the value: ");
                    double volumeValue = scanner.nextDouble();
                    double volumeResult = 0;
                    switch (volumeChoice) {
                        case "a":
                            volumeResult = UnitConverter.convertGallonsToLiters(volumeValue);
                            System.out.println(volumeValue + " Gallons is equal to " + volumeResult + " Liters");
                            break;
                        case "b":
                            volumeResult = UnitConverter.convertLitersToGallons(volumeValue);
                            System.out.println(volumeValue + " Liters is equal to " + volumeResult + " Gallons");
                            break;
                        default:
                            System.out.println("Invalid volume conversion choice.");
                    }
                    break;
                default:
                    System.out.println("Invalid conversion type choice.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        scanner.close();
    }
}

// 5. Write a program that takes user input for the age of all 10 students in a class and check whether the student can vote depending on
//    his/her age is greater than or equal to 18.
//    Hint =>
//    Create a class public class StudentVoteChecker and define a method public boolean canStudentVote(int age)
//    which takes in age as a parameter and returns true or false
//    Inside the method firstly validate the age for a negative number, if a negative return is false cannot vote.
//    For valid age check for age is 18 or above return true; else return false;
//    In the main function define an array of 10 integer elements, loop through the array by take user input for the student's age,
//    call canStudentVote() and display the result
/**
 * The StudentVoteChecker class checks if a student is eligible to vote based on their age.
 */
class StudentVoteChecker {

    private static final int VOTING_AGE = 18;

    /**
     * Checks if a student can vote based on their age.
     *
     * @param age The age of the student.
     * @return true if the student can vote, false otherwise.
     */
    public static boolean canStudentVote(int age) {
        return age >= VOTING_AGE;
    }

    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
            if (studentAges[i] < 0)
            {
                System.out.println("Age cannot be negative. Exiting Program");
                scanner.close();
                return;
            }

            boolean canVote = canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + " can vote: " + canVote);
        }
        scanner.close();
    }
}

// 6. Create a program to find the youngest friends among 3 (Amar, Akbar, and Anthony) based on their ages
//    and the tallest among the friends based on their heights and display it.
//    Hint =>
//    Take user input for age and height for the 3 friends and store it in two arrays each to store the
//    values for age and height of the 3 friends
//    Write a Method to find the youngest of the 3 friends
//    Write a Method to find the tallest of the 3 friends
/**
 * The FriendsAnalyzer class finds the youngest and tallest among three friends.
 */
class FriendsAnalyzer {

    private static final String[] FRIEND_NAMES = {"Amar", "Akbar", "Anthony"};
    private static final int NUM_FRIENDS = 3;

    /**
     * Finds the youngest friend among the given friends.
     *
     * @param ages The ages of the friends.
     * @return The name of the youngest friend.
     */
    public static String findYoungest(int[] ages) {
        int youngestAge = ages[0];
        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestIndex = i;
            }
        }
        return FRIEND_NAMES[youngestIndex];
    }

    /**
     * Finds the tallest friend among the given friends.
     *
     * @param heights The heights of the friends.
     * @return The name of the tallest friend.
     */
    public static String findTallest(double[] heights) {
        double tallestHeight = heights[0];
        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }
        return FRIEND_NAMES[tallestIndex];
    }

    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[NUM_FRIENDS];
        double[] heights = new double[NUM_FRIENDS];

        for (int i = 0; i < NUM_FRIENDS; i++) {
            System.out.print("Enter age for " + FRIEND_NAMES[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in cm) for " + FRIEND_NAMES[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        System.out.println("Youngest friend: " + findYoungest(ages));
        System.out.println("Tallest friend:  " + findTallest(heights));
        scanner.close();
    }
}

// 7. Write a program to take user input for 5 numbers and check whether a number is positive or negative.
//    Further, for positive numbers, check if the number is even or odd.
//    Finally, compare the first and last elements of the array and display if they are equal, greater, or less.
//    Hint =>
//    Write a Method to Check whether the number is positive or negative
//    Write a Method to check whether the number is even or odd
//    Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2
//    In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly
//    If the number is negative, print negative.
//    Finally, compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less
/**
 * The NumberAnalyzer class analyzes numbers to determine their properties (positive/negative, even/odd)
 * and compares the first and last elements of an array.
 */
class NumberAnalyzer {

    /**
     * Checks if a number is positive.
     *
     * @param number The number to check.
     * @return true if the number is positive or zero, false otherwise.
     */
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    /**
     * Checks if a number is even.
     *
     * @param number The number to check.
     * @return true if the number is even, false otherwise.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Compares two numbers.
     *
     * @param number1 The first number.
     * @param number2 The second number.
     * @return 1 if number1 > number2, -1 if number1 < number2, 0 if they are equal.
     */
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is positive and " + (isEven(numbers[i]) ? "even" : "odd"));
            } else {
                System.out.println(numbers[i] + " is negative");
            }
        }

        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("First element is greater than last");
        } else if (comparisonResult == -1) {
            System.out.println("First element is less than last");
        } else {
            System.out.println("First and last elements are equal");
        }
        scanner.close();
    }
}

// 8. An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members.
//    For this, create a program to find the BMI and display the height, weight, BMI, and status of each individual.
//    Hint =>
//    Take user input in double for the weight (in kg) of the person and height (in cm) for the person
//    and store it in the corresponding 2D array of 10 rows and 3 columns.
//    The First Column storing the weight, the second column storing the height in cm, and the third column is the BMI
//    Create a Method to find the BMI of every person and populate the array.  Use the formula BMI = weight / (height * height).
//    Note the unit is kg/m^2.  For this, convert cm to meter
//    Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status.
/**
 * The BMICalculator class calculates the Body Mass Index (BMI) and determines the BMI status for a group of people.
 */
class BMICalculator {

    private static final int NUM_PEOPLE = 10;
    private static final int WEIGHT_INDEX = 0;
    private static final int HEIGHT_INDEX = 1;
    private static final int BMI_INDEX = 2;

    /**
     * Calculates the BMI for each person and stores it in the peopleData array.
     *
     * @param peopleData A 2D array where each row represents a person and stores their weight (kg),
     * height (cm), and BMI.
     */
    public static void calculateBMI(double[][] peopleData) {
        for (int i = 0; i < peopleData.length; i++) {
            double weight = peopleData[i][WEIGHT_INDEX];
            double heightInMeters = peopleData[i][HEIGHT_INDEX] / 100; // Convert cm to meters
            peopleData[i][BMI_INDEX] = weight / (heightInMeters * heightInMeters);
        }
    }

    /**
     * Determines the BMI status for each person based on their BMI value.
     *
     * @param peopleData A 2D array where each row represents a person and stores their weight (kg),
     * height (cm), and BMI.
     * @return An array of strings representing the BMI status for each person.
     */
    public static String[] determineBMIStatus(double[][] peopleData) {
        String[] statuses = new String[peopleData.length];
        for (int i = 0; i < peopleData.length; i++) {
            double bmi = peopleData[i][BMI_INDEX];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi < 25) {
                statuses[i] = "Normal";
            } else if (bmi < 30) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }

    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] peopleData = new double[NUM_PEOPLE][3]; // weight, height, BMI

        for (int i = 0; i < NUM_PEOPLE; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            peopleData[i][WEIGHT_INDEX] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            peopleData[i][HEIGHT_INDEX] = scanner.nextDouble();
        }

        calculateBMI(peopleData);
        String[] statuses = determineBMIStatus(peopleData);

        System.out.println("\nBMI Results:");
        for (int i = 0; i < NUM_PEOPLE; i++) {
            System.out.printf("Person %d - Height: %.1fcm, Weight: %.1fkg, BMI: %.1f, Status: %s%n",
                    i + 1, peopleData[i][HEIGHT_INDEX], peopleData[i][WEIGHT_INDEX], peopleData[i][BMI_INDEX], statuses[i]);
        }
        scanner.close();
    }
}

// 9. Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
//    Hint =>
//    Take a, b, and c as input values to find the roots of x.
//    The roots are computed using the following formulae
//    delta = b2+ 4*a*c
//    If delta is positive the find the two roots using formulae
//    root1 of x = (-b + delta)/(2*a)
//    root1 of x = (-b - delta)/(2*a)
//    If delta is zero then there is only one root of x
//    root of x = -b/(2*a)
//    If delta is negative return empty array or nothing
//    Write a Method to find find the roots of a quadratic equation and return the roots
/**
 * The Quadratic class finds the roots of a quadratic equation.
 */
class Quadratic {

    private static final int A_INDEX = 0;
    private static final int B_INDEX = 1;
    private static final int C_INDEX = 2;

    /**
     * Finds the roots of a quadratic equation given its coefficients.
     *
     * @param coefficients An array containing the coefficients a, b, and c of the quadratic equation.
     * @return An array of doubles representing the roots.  Returns an empty array if there are no real roots.
     * Handles the case where a is zero.
     */
    public static double[] findRoots(double[] coefficients) {
        double a = coefficients[A_INDEX];
        double b = coefficients[B_INDEX];
        double c = coefficients[C_INDEX];

        if (a == 0) {
            if (b == 0)
            {
                return new double[0];
            }
            // Linear equation: bx + c = 0
            return new double[]{-c / b};
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double sqrtDelta = Math.sqrt(delta);
            double root1 = (-b + sqrtDelta) / (2 * a);
            double root2 = (-b - sqrtDelta) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[0]; // No real roots
        }
    }

    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] coefficients = new double[3]; // a, b, c

        System.out.print("Enter coefficient a: ");
        coefficients[A_INDEX] = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        coefficients[B_INDEX] = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        coefficients[C_INDEX] = scanner.nextDouble();

        double[] roots = findRoots(coefficients);

        if (roots.length == 2) {
            System.out.printf("Two real roots: %.2f and %.2f%n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("One real root: %.2f%n", roots[0]);
        } else {
            System.out.println("No real roots");
        }
        scanner.close();
    }
}

// 10. Write a program that generates five 4-digit random values and then finds their average value, and their minimum and maximum value.
//     Use Math.random(), Math.min(), and Math.max().
//     Hint =>
//     Write a method that generates an array of 4-digit random numbers given the size as a parameter as shown in the method signature
//     public int[] generate4DigitRandomArray(int size)
//     Write a method to find the average, min, and max value of an array
/**
 * The RandomNumberAnalyzer class generates random numbers and analyzes them to find the average, minimum, and maximum values.
 */
class RandomNumberAnalyzer {

    /**
     * Generates an array of 4-digit random numbers.
     *
     * @param size The size of the array.
     * @return An array containing 4-digit random numbers.
     */
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000; // 1000-9999
        }
        return numbers;
    }

    /**
     * Finds the average, minimum, and maximum values of the numbers in the array.
     *
     * @param numbers The array of numbers.
     * @return A double array containing the average, minimum, and maximum values.
     * The order is: [average, minimum, maximum]
     */
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    /**
     * Main method to execute the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        final int ARRAY_SIZE = 5; // Use a constant for the array size
        int[] randomNumbers = generate4DigitRandomArray(ARRAY_SIZE);

        System.out.print("Generated numbers: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        double[] results = findAverageMinMax(randomNumbers);
        double average = results[0];
        int minimum = (int) results[1];  // Cast back to int, as min/max of ints are ints.
        int maximum = (int) results[2];

        System.out.println("Average: " + average);
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}

