import java.util.Scanner;
import java.lang.Math;

// Sample Program 1: Sum of Digits
class SumOfDigits {
    // Get a 4 digit random number
    public int get4DigitRandomNumber() {
        return (int) (Math.random() * 9000) + 1000;
    }

    // Find the count of digits in the number
    public int countDigits(int number) {
        int count = 0, temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Store the digits of the number in an array
    public int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    // Find the sum of the elements in an array
    public int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // Get 4 digit random integer number
        SumOfDigits sumOfDigits = new SumOfDigits();
        int number = sumOfDigits.get4DigitRandomNumber();
        System.out.println("The Random Number is: " + number);

        // Get the count of digits
        int count = sumOfDigits.countDigits(number);
        System.out.println("The count of digit is: " + count);

        // Get the array of digits from the number
        int[] digits = sumOfDigits.getDigits(number, count);

        // Find the sum of the digits of the number
        int sum = sumOfDigits.sumArray(digits);

        // Display the sum of the digits of the number
        System.out.println("\nSum of Digits: " + sum);

        //Level 1 Programs

        //Program to input the Principal, Rate, and Time values and calculate Simple Interest.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Principal:");
        int p = s.nextInt();
        System.out.println("Enter Rate:");
        int r = s.nextInt();
        System.out.println("Enter Time:");
        int t = s.nextInt();
        double simpleInterest = calculateSimpleInterest(p,r,t);
        System.out.println("Simple Interest is: " + simpleInterest);

        //Program to find the maximum number of handshakes among N number of students.
        System.out.println("Enter the number of students:");
        int n = s.nextInt();
        double handshakes = calculateHandshakes(n);
        System.out.println("Maximum number of handshakes: " + handshakes);

        //An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
        System.out.println("Enter the side a of triangle:");
        int a = s.nextInt();
        System.out.println("Enter the side b of triangle:");
        int b1 = s.nextInt();
        System.out.println("Enter the side c of triangle:");
        int c = s.nextInt();
        int rounds = calculateRounds(a,b1,c);
        System.out.println("Number of rounds: " + rounds);

        //Write a program to check whether a number is positive, negative, or zero.
        System.out.println("Enter the number to check:");
        int num = s.nextInt();
        int check = checkPositiveNegativeZero(num);
        if(check == 1)
            System.out.println("Number is positive");
        else if(check == -1)
            System.out.println("Number is negative");
        else
            System.out.println("Number is zero");

        //Write a program to find the sum of n natural numbers using loop
        System.out.println("Enter the value of n:");
        int nNatural = s.nextInt();
        int sumNatural = sumOfNNaturalNumbers(nNatural);
        System.out.println("Sum of first "+nNatural+" natural numbers is: " + sumNatural);

        //Write a program to find the smallest and the largest of the 3 numbers.
        System.out.println("Enter first number:");
        int num1 = s.nextInt();
        System.out.println("Enter second number:");
        int num2 = s.nextInt();
        System.out.println("Enter third number:");
        int num3 = s.nextInt();
        int[] minMax = findSmallestAndLargest(num1,num2,num3);
        System.out.println("Smallest: " + minMax[0] + ", Largest: " + minMax[1]);

        //Write a program to take 2 numbers and print their quotient and reminder
        System.out.println("Enter the dividend:");
        int dividend = s.nextInt();
        System.out.println("Enter the divisor:");
        int divisor = s.nextInt();
        int[] quotientRemainder = findQuotientAndRemainder(dividend,divisor);
        System.out.println("Quotient: " + quotientRemainder[0] + ", Remainder: " + quotientRemainder[1]);

        //Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
        System.out.println("Enter the number of chocolates:");
        int chocolates = s.nextInt();
        System.out.println("Enter the number of children:");
        int children = s.nextInt();
        int[] distribution = distributeChocolates(chocolates,children);
        System.out.println("Chocolates per child: " + distribution[0] + ", Remaining chocolates: " + distribution[1]);

        //Write a program calculate the wind chill temperature given the temperature and wind speed
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = s.nextDouble();
        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = s.nextDouble();
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill Temperature: " + windChill + "°F");

        //Write a program to calculate various trigonometric functions using Math class given an angle in degrees
        System.out.print("Enter the angle (in degrees): ");
        double angle = s.nextDouble();
        double[] trigValues = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);

        s.close();
    }

    //Level 1 Programs

    //Method for calculating Simple Interest
    public static double calculateSimpleInterest(int principal, int rate, int time){
        return (double) (principal * rate * time) /100;
    }

    //Method for calculating Handshakes
    public static double calculateHandshakes(int n){
        return (n*(n-1))/2;
    }

    //Method to calculate rounds
    public static int calculateRounds(int a, int b, int c){
        int perimeter = a+b+c;
        int total = 5000/perimeter;
        return total;
    }

    //Method to check if number is positive, negative or zero
    public static int checkPositiveNegativeZero(int n){
        if(n>0){
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    //Method to calculate sum of n natural numbers
    public static int sumOfNNaturalNumbers(int n){
        return (n*(n+1))/2;
    }

    //Method to find smallest and largest of 3 numbers
    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int min = num1;
        int max = num1;

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        int[] result = {min, max};
        return result;
    }

    //Method to find quotient and remainder
    public static int[] findQuotientAndRemainder(int number, int divisor) {
        int quotient = number/divisor;
        int remainder = number%divisor;

        int[] result = {quotient, remainder};
        return result;
    }

    //Method to distribute chocolates
    public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates/numberOfChildren;
        int remainingChocolates = numberOfChocolates%numberOfChildren;

        int[] result = {chocolatesPerChild, remainingChocolates};
        return result;
    }

    //Method to calculate wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        if (temperature > 50 || windSpeed < 3) {
            return temperature;
        }
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    //Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
}

