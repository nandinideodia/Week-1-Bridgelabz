import java.util.Scanner;

public class StudentMarksProcessor {

    /**
     * Generates marks for a single student in Physics, Chemistry, and Maths.
     *
     * @param scanner The Scanner object to read input from.
     * @param studentNumber The student's number for display purposes.
     * @return An array containing the marks for the three subjects (Physics, Chemistry, Maths).
     */
    public static int[] getStudentMarks(Scanner scanner, int studentNumber) {
        int[] marks = new int[3]; // Array to store marks for the 3 subjects.
        System.out.println("\nEnter marks for Student " + studentNumber + ":");

        // Input and validation for Physics marks
        System.out.print("Physics: ");
        marks[0] = getValidMark(scanner);

        // Input and validation for Chemistry marks
        System.out.print("Chemistry: ");
        marks[1] = getValidMark(scanner);

        // Input and validation for Maths marks
        System.out.print("Maths: ");
        marks[2] = getValidMark(scanner);

        return marks;
    }

    /**
     * Gets a valid mark (between 0 and 100) from the user using the Scanner.
     * @param scanner Scanner object
     * @return A valid mark.
     */
    public static int getValidMark(Scanner scanner) {
        int mark;
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 0 and 100: ");
                scanner.next(); // Consume the invalid input
            }
            mark = scanner.nextInt();
            if (mark >= 0 && mark <= 100) {
                break; // Exit the loop if the mark is valid
            }
            System.out.println("Invalid input. Please enter a number between 0 and 100: ");
        }
        return mark;
    }

    /**
     * Calculates the total marks for a student.
     *
     * @param marks An array containing the marks for the three subjects.
     * @return The total marks.
     */
    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    /**
     * Calculates the average marks for a student.
     *
     * @param total The total marks.
     * @param numberOfSubjects The number of subjects.
     * @return The average marks.
     */
    public static double calculateAverage(int total, int numberOfSubjects) {
        return (double) total / numberOfSubjects;
    }

    /**
     * Calculates the percentage score for a student.
     *
     * @param total    The total marks obtained.
     * @param maxTotal The maximum possible total marks.
     * @return The percentage score.
     */
    public static double calculatePercentage(int total, int maxTotal) {
        return (double) total / maxTotal * 100;
    }

    /**
     * Displays the marks, total, average, and percentage for a student.
     *
     * @param marks      An array containing the marks for the three subjects.
     * @param total      The total marks.
     * @param average    The average marks.
     * @param percentage The percentage score.
     * @param studentNumber The student's number.
     */
    public static void displayResults(int[] marks, int total, double average, double percentage, int studentNumber) {
        System.out.println("\n--- Results for Student " + studentNumber + " ---");
        System.out.println("Physics:   " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths:     " + marks[2]);
        System.out.println("Total:     " + total);
        System.out.printf("Average:   %.2f\n", average); // Use printf for formatted output
        System.out.printf("Percentage: %.2f%%\n", percentage); // Use printf for formatted output
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt(); // Get the number of students from the user.

        final int numberOfSubjects = 3; // Number of subjects (Physics, Chemistry, Maths) - making it a constant.
        final int maxMarksPerSubject = 100; // Maximum marks per subject.
        final int maxTotalMarks = numberOfSubjects * maxMarksPerSubject; // Maximum possible total marks.

        // Process marks for each student
        for (int i = 1; i <= numberOfStudents; i++) {
            int[] studentMarks = getStudentMarks(scanner, i); // Get marks for the current student.
            int totalMarks = calculateTotal(studentMarks); // Calculate the total marks.
            double averageMarks = calculateAverage(totalMarks, numberOfSubjects); // Calculate the average marks.
            double percentageScore = calculatePercentage(totalMarks, maxTotalMarks); // Calculate the percentage.
            displayResults(studentMarks, totalMarks, averageMarks, percentageScore, i); // Display the results.
        }
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
