import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();
        if (number2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            int quotient = number1 / number2;
            int remainder = number1 % number2;
            System.out.printf("The Quotient is %d and Reminder is %d of two numbers %d and %d%n", quotient, remainder, number1, number2);
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class IntOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();
        System.out.println("a + b * c = " + (a + b * c));
        System.out.println("a * b + c = " + (a * b + c));
        if (b != 0) {
            System.out.println("c + a / b = " + (c + a / b));
            System.out.println("a % b + c = " + (a % b + c));
        } else {
            System.out.println("Cannot perform division/modulus with b = 0");
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int temp = s.nextInt();
        s.close();
        System.out.println((temp * 9 / 5) + 32);
    }
}

import java.util.Scanner;

public class TemperatureConversionFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusResult = (fahrenheit - 32.0) * 5.0 / 9.0;
        System.out.printf("The %.2f fahrenheit is %.2f celsius%n", fahrenheit, celsiusResult);
        scanner.close();
    }
}

import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary (INR): ");
        double salary = scanner.nextDouble();
        System.out.print("Enter bonus (INR): ");
        double bonus = scanner.nextDouble();
        double totalIncome = salary + bonus;
        System.out.printf("The salary is INR %.2f and bonus is INR %.2f. Hence Total Income is INR %.2f%n", bonus, totalIncome);
        scanner.close();
    }
}

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}

import java.util.Scanner;

public class TriangularParkRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side1 (meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2 (meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3 (meters): ");
        double side3 = scanner.nextDouble();
        double perimeter = side1 + side2 + side3;
        double totalDistanceKm = 5.0;
        double totalDistanceMeters = totalDistanceKm * 1000.0;
        double rounds = totalDistanceMeters / perimeter;
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km%n", rounds);
        scanner.close();
    }
}

import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
        if (numberOfChildren == 0) {
            System.out.println("Cannot divide chocolates among zero children.");
        } else {
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;
            System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates are %d%n",
                    chocolatesPerChild, remainingChocolates);
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Principal value: ");
        int p = s.nextInt();
        System.out.println("Enter the rate value: ");
        int r = s.nextInt();
        System.out.println("Enter the time: ");
        int t = s.nextInt();
        s.close();
        float si = (p * r * t) / 100; // Corrected simple interest formula
        System.out.println("Simple Intrest value: " + si);
    }
}

import java.util.Scanner;

public class KgToPounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        double kilograms = scanner.nextDouble();
        double pounds = kilograms * 2.20462;
        System.out.printf("%.2f kilograms is equal to %.2f pounds%n", kilograms, pounds);
        scanner.close();
    }
}
