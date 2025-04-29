class DisplayResult {
    public static void main(String[] args) {
        String name = "Sam";
        int rollNumber = 1;
        double percentMarks = 99.99;
        char result = 'P';
        System.out.println("Displaying Result:\n" + name + " with Roll Number " +
                rollNumber + " has Scored " + percentMarks +
                "% Marks and Result is " + result);
    }
}

class TravelComputation {
    public static void main(String[] args) {
        String name = "Eric", fromCity = "Chennai", viaCity = "Velore", toCity = "Bangalore";
        double distanceFromToVia = 156.6;
        int timeFromToVia = 4 * 60 + 4;
        double distanceViaToFinalCity = 211.8;
        int timeViaToFinalCity = 4 * 60 + 25;
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and " +
                "the Total Time taken is " + totalTime + " minutes");
    }
}

public class Age {
    public static void main(String[] args) {
        int birth = 2000, current = 2024;
        int age = current - birth;
        System.out.println(age);
    }
}

public class Average {
    public static void main(String[] args) {
        int maths = 94, physics = 96, chemistry = 96;
        int average = (maths + physics + chemistry) / 3;
        System.out.println(average);
    }
}

import java.util.Scanner;

public class Kilometer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double dist = s.nextInt();
        s.close();
        System.out.println(dist * 0.621371);
    }
}

public class Pl {
    public static void main(String[] args) {
        int cp = 129, sp = 191;
        int profit = sp - cp;
        double profitPercentage = profit / cp * 100;

        System.out.println("The cost price in INR" + cp + "and selling price is " + sp);
        System.out.println("The profit is " + profit + " and profit percentage " + profitPercentage);
    }
}

public class Pens {
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int eachStudent = pens / students;
        int left = pens % students;
        System.out.println("The Pen Per Student is " + eachStudent + " and the remaining pen not distributed is " + left);
    }
}

public class Fee {
    public static void main(String[] args) {
        int fee = 125000, discount = 10;
        int discountAmount = fee / discount;
        int total = fee - discountAmount;
        System.out.println("The discount amount is " + discountAmount + " and final fee is " + total);
    }
}

public class Earth {
    public static void main(String[] args) {
        int r = 6378;
        double volume = (4.0 / 3.0) * Math.PI * r * r * r;
        System.out.println(volume);
    }
}

import java.util.Scanner;

public class Kilometer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double dist = s.nextInt();
        s.close();
        System.out.println(dist * 0.621371);
    }
}

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int height = s.nextInt();
        int area = (base * height) / 2;
        System.out.println(area);
    }
}

import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int perimeter = s.nextInt();
        int side = perimeter / 4;
        System.out.println(side);
    }
}

import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int price = s.nextInt();
        int qty = s.nextInt();
        int total = price * qty;
        System.out.println(total);
    }
}

import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int student = s.nextInt();
        int handshakes = (student * (student - 1)) / 2;
        System.out.println(handshakes);
    }
}
