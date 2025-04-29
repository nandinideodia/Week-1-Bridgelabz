Best Programming Practice
        All values as variables including Fixed, User Inputs, and Results
        Proper naming conventions for all variables
        String name = "Eric";
        double height = input.nextDouble();
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        Proper Program Name and Class Name
        Follow proper indentation
        Give comments for every step or logical block like a variable declaration or conditional and loop blocks
        Sample Program 1 - Create a program to check if 3 values are internal angles of a triangle.
        IMP => Follow Good Programming Practice demonstrated below in all Practice Programs
        Hint =>
        Get integer input for 3 variables named x, y, and z.
        Find the sum of x, y, and z.
        If the sum is equal to 180, print ”The given angles are internal angles of a triangle” else print They are not
// Creating Class with name TriangleChecker indicating the purpose is to
// check if the internal angles add to 180
import java.util.Scanner;

class TriangleChecker {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get 3 input values for angles
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        // Find the sum of all angles
        int sumOfAngles = x + y + z;

        // Check if sum is equal to 180 and print either true or false
        System.out.println("The given angles " +x+ ", " +y+ ", " + z +
                " add to " + sumOfAngles);

        if (sumOfAngles == 180) {
            System.out.println("The given angles are internal angles of a " +
                    "Triangle");
        } else {
            System.out.println("The given angles are not internal angles " +
                    "of a Triangle");
        }

        // Closing the Scanner Stream
        input.close();
    }
}
Sample Program 2 - Create a program to find the sum of all the digits of a number given by a user.
Hint =>
Get an integer input for the number variable.
Create an integer variable sum with an initial value of 0.
Create a while loop to access each digit of the number.
Inside the loop, add each digit of the number to the sum.
        Finally, print the sum outside the loop
// Create SunOfDigit Class to compute the sum of all digits of a number
import java.util.Scanner;

class SumOfDigits {

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get input value for number
        int origNumber = input.nextInt();

        // Define variable number and sum initialized to zero
        int number = origNumber;
        int sum = 0;

        // Run while loop to access each digit of number
        while (number != 0) {
            // Use number % 10 to find each digit of number from last
            int digit = number % 10;

            // add each digit to sum
            sum += digit;

            // Remove last digit from number essentially get the quotient
            number = number / 10;
        }

        // Print the sum and close the Scanner Stream
        System.out.println("The sum of digit of number:" +origNumber+ " = " +
                sum);
        input.close();
    }
}

Level 3 Practice Programs
Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
        Hint =>
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same.
Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical
import java.util.Scanner;


public class LeapYear {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();


        if (year < 1582) {
            System.out.println("Leap year calculation is not valid for years before 1582.");
            return;
        }


        System.out.println("\n--- Using Multiple If-Else Statements ---");
        checkLeapYearMultipleIfElse(year);


        System.out.println("\n--- Using a Single If Statement with Logical Operators ---");
        checkLeapYearSingleIf(year);
    }


    public static void checkLeapYearMultipleIfElse(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            } else {
                System.out.println(year + " is a Leap Year.");
            }
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
    public static void checkLeapYearSingleIf(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines

    Hint =>
    Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
import java.util.Scanner;


    public class GradeCalculator {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            // Input marks for Physics, Chemistry, and Maths
            System.out.print("Enter marks for Physics: ");
            int physicsMarks = scanner.nextInt();


            System.out.print("Enter marks for Chemistry: ");
            int chemistryMarks = scanner.nextInt();


            System.out.print("Enter marks for Maths: ");
            int mathsMarks = scanner.nextInt();


            scanner.close();


            // Calculate total marks
            int totalMarks = physicsMarks + chemistryMarks + mathsMarks;


            // Calculate percentage
            double percentage = (double) totalMarks / 3;


            // Calculate grade
            String grade = calculateGrade(percentage);


            // Output the results
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage);
            System.out.println("Grade: " + grade);
        }


        // Function to calculate grade based on percentage
        public static String calculateGrade(double percentage) {
            if (percentage >= 90) {
                return "A+";
            } else if (percentage >= 80) {
                return "A";
            } else if (percentage >= 70) {
                return "B+";
            } else if (percentage >= 60) {
                return "B";
            } else if (percentage >= 50) {
                return "C";
            } else {
                return "Fail";
            }
        }
    }

    Write a Program to check if the given number is a prime number or not
    Hint =>
    A number that can be divided exactly only by itself and 1 are Prime Numbers,
    Prime Numbers checks are done for numbers greater than 1
    Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number.
    Use the isPrime boolean variable to store the result

    public class PrimeNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to check if it's prime: ");
            int number = scanner.nextInt();
            scanner.close();


            if (number <= 1) {
                System.out.println(number + " is not a prime number.");
                return;
            }


            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }


            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }

    Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code
    Hint =>
    Armstrong Number is a number whose Sum of cubes of each digit results in the original number as in for e.g. 153 = 1^3 + 5^3 + 3^3
    Get an integer input and store it in the number variable and define sum variable, initialize it to zero and originalNumber variable and assign it to input number variable
    Use the while loop till the originalNumber is not equal to zero
    In the while loop find each digit which is the reminder of the modulus operation number % 10. Find the cube of the number and add it to the sum variable
    Again in while loop find the quotient of the number using the division operation number/10 and assign it to the original number. This removes the last digit of the original number.
    Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly
import java.util.Scanner;


    public class ArmstrongNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to check if it's an Armstrong number: ");
            int number = scanner.nextInt();
            scanner.close();


            int sum = 0;
            int originalNumber = number;


            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += Math.pow(digit, 3);
                originalNumber /= 10;
            }


            if (sum == number) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
    }


    Create a program to count the number of digits in an integer.
    Hint =>
    Get an integer input for the number variable.
    Create an integer variable count with value 0.
    Use a loop to iterate until number is not equal to 0.
    Remove the last digit from number in each iteration
    Increase count by 1 in each iteration.
    Finally display the count to show the number of digits
import java.util.Scanner;


    public class DigitCount {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer to count its digits: ");
            int number = scanner.nextInt();
            scanner.close();


            int count = 0;
            while (number != 0) {
                number /= 10;
                count++;
            }
            System.out.println("Number of digits in " + number + " is: " + count);
        }
    }

    Create a program to find the BMI of a person
    Hint =>
    Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
    Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
    Use the table to determine the weight status of the person


import java.util.Scanner;


    public class BMICalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter weight in kg: ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height in cm: ");
            double heightCm = scanner.nextDouble();
            scanner.close();


            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);


            System.out.println("BMI: " + bmi);


            if (bmi < 18.5) {
                System.out.println("Weight Status: Underweight");
            } else if (bmi < 25) {
                System.out.println("Weight Status: Normal");
            } else if (bmi < 30) {
                System.out.println("Weight Status: Overweight");
            } else {
                System.out.println("Weight Status: Obese");
            }
        }
    }

    Create a program to check if a number taken from the user is a Harshad Number.
    Hint =>
    A Harshad number is an integer which is divisible by the sum of its digits.
    For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
    Get an integer input for the number variable.
    Create an integer variable sum with initial value 0.
    Create a while loop to access each digit of the number.
    Inside the loop, add each digit of the number to sum.
    Check if the number is perfectly divisible by the sum.
    If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.
import java.util.Scanner;


    public class HarshadNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to check if it's a Harshad number: ");
            int number = scanner.nextInt();
            scanner.close();


            int sum = 0;
            int tempNumber = number;


            while (tempNumber > 0) {
                int digit = tempNumber % 10;
                sum += digit;
                tempNumber /= 10;
            }


            if (number % sum == 0) {
                System.out.println(number + " is a Harshad number.");
            } else {
                System.out.println(number + " is not a Harshad number.");
            }
        }
    }

    Create a program to check if a number is an Abundant Number.
    Hint =>
    An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself. For example,
    Divisor of 12: 1, 2, 3, 4, 6
    Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12
    Get an integer input for the number variable.
    Create an integer variable sum with initial value 0.
    Run a for loop from i = 1 to i < number.
    Inside the loop, check if number is divisible by i.
            If true, add i to sum.
    Outside the loop Check if sum is greater than number.
    If the sum is greater than the number, print Abundant Number. Otherwise, print Not an Abundant Number.
import java.util.Scanner;


    public class AbundantNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to check if it's an Abundant number: ");
            int number = scanner.nextInt();
            scanner.close();


            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum > number) {
                System.out.println(number + " is an Abundant number.");
            } else {
                System.out.println(number + " is not an Abundant number.");
            }
        }
    }

    Write a program to create a calculator using switch...case.
    Hint =>
    Create two double variables named first and second and a String variable named op.
    Get input values for all variables.
    The input for the operator can only be one of the four values: "+", "-", "*" or "/".
    Run a for loop from i = 1 to i < number.
    Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
    If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
    If op is neither of those 4 values, print Invalid Operator.
import java.util.Scanner;


    public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double firstNumber = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double secondNumber = scanner.nextDouble();
            System.out.print("Enter the operator (+, -, *, /): ");
            String operator = scanner.next();
            scanner.close();


            double result;
            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    System.out.println(firstNumber + " + " + secondNumber + " = " + result);
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    System.out.println(firstNumber + " - " + secondNumber + " = " + result);
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    System.out.println(firstNumber + " * " + secondNumber + " = " + result);
                    break;
                case "/":
                    if (secondNumber == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        result = firstNumber / secondNumber;
                        System.out.println(firstNumber + " / " + secondNumber + " = " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
            }
        }
    }


    Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):

            import java.util.Scanner;


    public class DayOfWeek {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter month (1-12): ");
            int m = scanner.nextInt();
            System.out.print("Enter day (1-31): ");
            int d = scanner.nextInt();
            System.out.print("Enter year: ");
            int y = scanner.nextInt();
            scanner.close();


            int y0 = y - (14 - m) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = m + 12 * ((14 - m) / 12) - 2;
            int dayOfWeek = (d + x + 31 * m0 / 12) % 7;


            String dayString;
            switch (dayOfWeek) {
                case 0:
                    dayString = "Sunday";
                    break;
                case 1:
                    dayString = "Monday";
                    break;
                case 2:
                    dayString = "Tuesday";
                    break;
                case 3:
                    dayString = "Wednesday";
                    break;
                case 4:
                    dayString = "Thursday";
                    break;
                case 5:
                    dayString = "Friday";
                    break;
                case 6:
                    dayString = "Saturday";
                    break;
                default:
                    dayString = "Invalid day";
            }
            System.out.println("Day of the week: " + dayString);
        }
    }

