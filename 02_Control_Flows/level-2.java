import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 1; i < a; i++) {
            if (i % 2 == 0) {
                System.out.println("Even" + i);
            } else {
                System.out.println("Odd" + i);
            }
        }
        s.close();
    }
}

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter employee's years of service: ");
        int yearsOfService = scanner.nextInt();
        if (yearsOfService > 5) {
            double bonusAmount = salary * 0.05; // 5% bonus
            System.out.printf("Bonus amount: %.2f%n", bonusAmount);
        } else {
            System.out.println("Employee is not eligible for a bonus.");
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class ControlFlow2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", number, i, number * i);
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class FizzBuzzForLoop {
    public static void fizzBuzzForLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer for FizzBuzz (for loop): ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.close();
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void fizzBuzzWhileLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer for FizzBuzz (while loop): ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.close();
            return;
        }

        int i = 1;
        while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class FriendsAgeHeight {
    public static void findYoungestAndTallest() {
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        System.out.println("Enter age and height for Amar:");
        ages[0] = scanner.nextInt();
        heights[0] = scanner.nextDouble();

        System.out.println("Enter age and height for Akbar:");
        ages[1] = scanner.nextInt();
        heights[1] = scanner.nextDouble();

        System.out.println("Enter age and height for Anthony:");
        ages[2] = scanner.nextInt();
        heights[2] = scanner.nextDouble();

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

        System.out.println("\nYoungest friend: " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("Tallest friend: " + tallestFriend + " (Height: " + tallestHeight + ")");
        scanner.close();
    }
}

import java.util.Scanner;

public class FactorsForLoop {
    public static void findFactorsForLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its factors (for loop): ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.close();
            return;
        }

        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}

import java.util.Scanner;

public class FactorsWhileLoop {
    public static void findFactorsWhileLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its factors (while loop): ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.close();
            return;
        }

        System.out.println("Factors of " + number + " are:");
        int counter = 1;
        while (counter < number) {
            if (number % counter == 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
        System.out.println();
        scanner.close();
    }
}

import java.util.Scanner;

public class GreatestFactorForLoop {
    public static void findGreatestFactorForLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to find its greatest factor (excluding itself, for loop): ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("There is no greatest factor beside itself for numbers less than or equal to 1.");
            scanner.close();
            return;
        }

        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("The greatest factor of " + number + " (beside itself) is: " + greatestFactor);
        scanner.close();
    }
}

import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void findGreatestFactorWhileLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to find its greatest factor (excluding itself, while loop): ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("There is no greatest factor beside itself for numbers less than or equal to 1.");
            scanner.close();
            return;
        }

        int greatestFactor = 1;
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("The greatest factor of " + number + " (beside itself) is: " + greatestFactor);
        scanner.close();
    }
}

import java.util.Scanner;

public class MultiplesBelow100BackwardForLoop {
    public static void findMultiplesBelow100BackwardForLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its multiples below 100 (backward for loop): ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input. Please enter a positive integer less than 100.");
            scanner.close();
            return;
        }

        System.out.println("Multiples of " + number + " below 100:");
        for (int i = 99; i >= number; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class PowerForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        int ans = number;
        for (int i = 1; i < power; i++) {
            ans = ans * number;
        }
        System.out.println(ans);
        scanner.close();
    }
}

import java.util.Scanner;

public class MultiplesAndPower {

    public static void findMultiplesBelow100() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input. Please enter a positive integer less than 100.");
            scanner.close();
            return;
        }

        System.out.println("Multiples of " + number + " below 100:");
        int counter = number;
        while (counter < 100) {
            System.out.println(counter);
            counter += number;
        }
        scanner.close();
    }

    public static void findPower() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        int result = 1;
        int counter = 0;

        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println(number + " raised to the power of " + power + " is: " + result);
        scanner.close();
    }
}
