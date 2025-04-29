import java.util.Scanner;

class TriangleChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int sumOfAngles = x + y + z;
        System.out.println("The given angles " + x + ", " + y + ", " + z +
                " add to " + sumOfAngles);
        if (sumOfAngles == 180) {
            System.out.println("The given angles are internal angles of a " +
                    "Triangle");
        } else {
            System.out.println("The given angles are not internal angles " +
                    "of a Triangle");
        }
        input.close();
    }
}

import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int origNumber = input.nextInt();
        int number = origNumber;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        System.out.println("The sum of digit of number:" + origNumber + " = " +
                sum);
        input.close();
    }
}

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(a % 5 == 0);
        s.close();
    }
}

import java.util.Scanner;

public class ControlFlow2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        boolean isSmallest = ((a < b) && (a < c));
        System.out.println(isSmallest);
        s.close();
    }
}

import java.util.Scanner;

public class ControlFlow3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sum = 0;
        if (a > 0) {
            sum = (a * (a + 1)) / 2;
        }
        System.out.println(sum);
        s.close();
    }
}

import java.util.Scanner;

public class ControlFlow4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a > 18) {
            System.out.println("Person can vote");
        } else {
            System.out.println("Person cannot vote");
        }
        s.close();
    }
}

import java.util.Scanner;

public class ControlFlow5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a > 0) {
            System.out.println("Positive");
        } else if (a == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
        s.close();
    }
}

import java.util.Scanner;

public class ControlFlow6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        while (a != 0) {
            System.out.println(a);
            a--;
        }
        s.close();
    }
}

import java.util.Scanner;

public class ControlFlow7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = a; i > 0; i--) {
            System.out.println(i);
        }
        s.close();
    }
}

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double userInput;
        System.out.println("Enter numbers to sum (enter 0 to stop):");
        userInput = scanner.nextDouble();
        while (userInput != 0) {
            total += userInput;
            System.out.print("Enter another number: ");
            userInput = scanner.nextDouble();
        }
        System.out.printf("The sum of the numbers is: %.2f%n", total);
        scanner.close();
    }
}

import java.util.Scanner;

public class ControlFlow8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int orignal = a;
        int whileSum = 0;
        int formulaSum = 0;
        while (a != 0) {
            whileSum += a;
            a--;
        }
        formulaSum = (orignal * (orignal + 1)) / 2;
        boolean check = (whileSum == formulaSum);
        System.out.println(whileSum);
        System.out.println(formulaSum);
        System.out.println(check);
        s.close();
    }
}

import java.util.Scanner;

public class ControlFlow9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int fact = 1;
        while (a != 0) {
            fact *= a;
            a--;
        }
        System.out.println(fact);
        s.close();
    }
}

import java.util.Scanner;

public class ControlFlow10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int fact = 1;
        for (int i = a; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        s.close();
    }
}

import java.util.Scanner;

public class ControlFlow11 {
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

public class ControlFlow12 {
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
