import java.util.Arrays;
import java.util.Scanner;

public class ZaraBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Program 1: Employee Bonus Calculation
        calculateEmployeeBonus(scanner);

        System.out.println("\n------------------------------------\n");

        // Program 2: Youngest and Tallest Friends
        findYoungestTallest(scanner);

        System.out.println("\n------------------------------------\n");

        // Program 3 & 4: Largest and Second Largest Digit (with dynamic array resizing)
        findLargestSecondLargestDigit(scanner);

        System.out.println("\n------------------------------------\n");

        // Program 5: Reverse the Number
        reverseNumber(scanner);

        System.out.println("\n------------------------------------\n");

        // Program 6 & 7: Body Mass Index (BMI) Calculation (Single and Multi-dimensional Array)
        calculateBmiSingleArray(scanner);

        System.out.println("\n------------------------------------\n");

        calculateBmiMultiDimensionalArray(scanner);

        System.out.println("\n------------------------------------\n");

        // Program 8 & 9: Student Marks, Percentage, and Grade (Single and Multi-dimensional Array)
        calculateStudentGradesSingleArray(scanner);

        System.out.println("\n------------------------------------\n");

        calculateStudentGradesMultiDimensionalArray(scanner);

        System.out.println("\n------------------------------------\n");

        // Program 10: Frequency of Digits in a Number
        findDigitFrequency(scanner);

        scanner.close();
    }

    // Program 1: Employee Bonus Calculation
    public static void calculateEmployeeBonus(Scanner scanner) {
        int numEmployees = 10;
        double[] salaries = new double[numEmployees];
        int[] yearsOfService = new int[numEmployees];
        double[] newSalaries = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < numEmployees; i++) {
            while (true) {
                try {
                    System.out.printf("Enter salary for employee %d: ", i + 1);
                    salaries[i] = scanner.nextDouble();
                    System.out.printf("Enter years of service for employee %d: ", i + 1);
                    yearsOfService[i] = scanner.nextInt();
                    if (salaries[i] >= 0 && yearsOfService[i] >= 0) {
                        break;
                    } else {
                        System.out.println("Invalid input. Salary and years of service cannot be negative. Please enter again.");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Consume the invalid input
                }
            }
        }

        for (int i = 0; i < numEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = 0.05 * salaries[i];
            } else {
                bonuses[i] = 0.02 * salaries[i];
            }
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nEmployee Bonus Details:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    i + 1, salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.printf("\nTotal Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
    }

    // Program 2: Youngest and Tallest Friends
    public static void findYoungestTallest(Scanner scanner) {
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            while (true) {
                try {
                    System.out.printf("Enter age for %s: ", names[i]);
                    ages[i] = scanner.nextInt();
                    System.out.printf("Enter height (in cm) for %s: ", names[i]);
                    heights[i] = scanner.nextDouble();
                    if (ages[i] >= 0 && heights[i] >= 0) {
                        break;
                    } else {
                        System.out.println("Invalid input. Age and height cannot be negative. Please enter again.");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Consume the invalid input
                }
            }
        }

        int youngestAge = ages[0];
        String youngestFriend = names[0];
        double tallestHeight = heights[0];
        String tallestFriend = names[0];

        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }

        System.out.printf("\nThe youngest friend is %s with age %d.%n", youngestFriend, youngestAge);
        System.out.printf("The tallest friend is %s with height %.2f cm.%n", tallestFriend, tallestHeight);
    }

    // Program 3 & 4: Largest and Second Largest Digit (with dynamic array resizing)
    public static void findLargestSecondLargestDigit(Scanner scanner) {
        String numberStr;
        while (true) {
            System.out.print("Enter a non-negative number: ");
            numberStr = scanner.next();
            try {
                long number = Long.parseLong(numberStr);
                if (number >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a non-negative number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        int[] digits = new int[10];
        int index = 0;
        int maxDigit = 10;

        for (int i = 0; i < numberStr.length(); i++) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] tempDigits = Arrays.copyOf(digits, index);
                digits = new int[maxDigit];
                System.arraycopy(tempDigits, 0, digits, 0, index);
            }
            digits[index++] = Character.getNumericValue(numberStr.charAt(i));
        }

        if (index == 0) {
            System.out.println("The number has no digits.");
            return;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index