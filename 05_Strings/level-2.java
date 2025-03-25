import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // Sample Program 1: Find all occurrences of a character in a string
    static class StringAnalyzer {
        /**
         * Finds all indices of a character in a given text.
         *
         * @param text The input string.
         * @param ch   The character to find.
         * @return An array of integers representing the indices of the character,
         * or an empty array if the character is not found.
         * @throws NullPointerException if the input text is null.
         */
        public static int[] findAllIndexes(String text, char ch) {
            if (text == null) {
                throw new NullPointerException("Text cannot be null.");
            }
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ch) {
                    count++;
                }
            }
            int[] indexes = new int[count];
            int j = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ch) {
                    indexes[j] = i;
                    j++;
                }
            }
            return indexes;
        }
    }

    // Level 1 Practice Programs

    // 1. Program to compare two strings using charAt() and equals()
    static class StringComparator {
        /**
         * Compares two strings using charAt().
         *
         * @param s1 The first string.
         * @param s2 The second string.
         * @return true if the strings are equal, false otherwise.
         * @throws NullPointerException if either string is null.
         */
        public static boolean compareStrings(String s1, String s2) {
            if (s1 == null || s2 == null) {
                throw new NullPointerException("Strings cannot be null.");
            }
            if (s1.length() != s2.length()) {
                return false;
            }
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    // 2. Program to create a substring using charAt() and substring()
    static class SubstringCreator {
        /**
         * Creates a substring from a string using charAt().
         *
         * @param text  The input string.
         * @param start The start index of the substring.
         * @param end   The end index of the substring.
         * @return The substring.
         * @throws NullPointerException if the input text is null.
         * @throws StringIndexOutOfBoundsException if start or end is out of bounds.
         * @throws IllegalArgumentException if start is greater than end.
         */
        public static String createSubstring(String text, int start, int end) {
            if (text == null) {
                throw new NullPointerException("Text cannot be null.");
            }
            if (start < 0 || end > text.length() || start > end) {
                if (start < 0 || end > text.length())
                    throw new StringIndexOutOfBoundsException("Start or end index is out of bounds.");
                else
                    throw new IllegalArgumentException("Start index cannot be greater than end index.");
            }
            StringBuilder sub = new StringBuilder();
            for (int i = start; i < end; i++) {
                sub.append(text.charAt(i));
            }
            return sub.toString();
        }
    }

    // 3. Program to return all characters in a string
    static class CharacterExtractor {
        /**
         * Returns all characters in a string as a character array.
         *
         * @param text The input string.
         * @return A character array representing the characters in the string.
         * @throws NullPointerException if the input text is null.
         */
        public static char[] getCharacters(String text) {
            if (text == null) {
                throw new NullPointerException("Text cannot be null.");
            }
            char[] result = new char[text.length()];
            for (int i = 0; i < text.length(); i++) {
                result[i] = text.charAt(i);
            }
            return result;
        }

        /**
         * Compares two character arrays for equality.
         *
         * @param arr1 The first character array.
         * @param arr2 The second character array.
         * @return true if the arrays are equal, false otherwise.
         * @throws NullPointerException if either array is null.
         */
        public static boolean compareCharacterArrays(char[] arr1, char[] arr2) {
            if (arr1 == null || arr2 == null) {
                throw new NullPointerException("Arrays cannot be null.");
            }
            if (arr1.length != arr2.length) {
                return false;
            }
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    // 4. Program to demonstrate NullPointerException
    static class NullPointerExceptionDemo {
        /**
         * Demonstrates NullPointerException.
         * This method generates and handles a NullPointerException.
         */
        public static void demonstrateNullPointerException() {
            String text = null;
            try {
                int length = text.length(); // This will cause a NullPointerException
                System.out.println("Length of text: " + length);
            } catch (NullPointerException e) {
                System.out.println("NullPointerException handled: " + e);
            }
        }
    }

    // 5. Program to demonstrate StringIndexOutOfBoundsException
    static class StringIndexOutOfBoundsExceptionDemo {
        /**
         * Demonstrates StringIndexOutOfBoundsException.
         * This method generates and handles a StringIndexOutOfBoundsException.
         */
        public static void demonstrateStringIndexOutOfBoundsException() {
            String str = "hello";
            try {
                char ch = str.charAt(10); // Index 10 is out of bounds
                System.out.println("Character at index 10: " + ch);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("StringIndexOutOfBoundsException handled: " + e);
            }
        }
    }

    // 6. Program to demonstrate IllegalArgumentException
    static class IllegalArgumentExceptionDemo {
        /**
         * Demonstrates IllegalArgumentException.
         * This method generates and handles an IllegalArgumentException.
         */
        public static void demonstrateIllegalArgumentException() {
            String str = "hello";
            try {
                String sub = str.substring(3, 1); // start > end
                System.out.println("Substring: " + sub);
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException handled: " + e);
            }
        }
    }

    // 7. Program to demonstrate NumberFormatException
    static class NumberFormatExceptionDemo {
        /**
         * Demonstrates NumberFormatException.
         * This method generates and handles a NumberFormatException.
         */
        public static void demonstrateNumberFormatException() {
            String text = "abc";
            try {
                int num = Integer.parseInt(text); // "abc" is not a number
                System.out.println("Number: " + num);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException handled: " + e);
            }
        }
    }

    // 8. Program to demonstrate ArrayIndexOutOfBoundsException
    static class ArrayIndexOutOfBoundsExceptionDemo {
        /**
         * Demonstrates ArrayIndexOutOfBoundsException.
         * This method generates and handles an ArrayIndexOutOfBoundsException.
         */
        public static void demonstrateArrayIndexOutOfBoundsException() {
            int[] arr = {1, 2, 3};
            try {
                int val = arr[5]; // Index 5 is out of bounds
                System.out.println("Value at index 5: " + val);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException handled: " + e);
            }
        }
    }

    // 9. Program to convert text to uppercase and compare
    static class UppercaseConverter {
        /**
         * Converts a string to uppercase using charAt().
         *
         * @param text The input string.
         * @return The uppercase version of the string.
         * @throws NullPointerException if the input text is null.
         */
        public static String convertToUppercase(String text) {
            if (text == null) {
                throw new NullPointerException("Text cannot be null.");
            }
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    result.append((char) (ch - 32)); // Convert to uppercase
                } else {
                    result.append(ch);
                }
            }
            return result.toString();
        }

        /**
         * Compares two strings for equality using charAt().
         *
         * @param str1 The first string.
         * @param str2 The second string.
         * @return true if the strings are equal, false otherwise.
         * @throws NullPointerException if either string is null.
         */
        public static boolean compareStrings(String str1, String str2) {
            if (str1 == null || str2 == null) {
                throw new NullPointerException("Strings cannot be null.");
            }
            if (str1.length() != str2.length()) {
                return false;
            }
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    // 10. Program to convert text to lowercase and compare
    static class LowercaseConverter {
        /**
         * Converts a string to lowercase using charAt().
         *
         * @param text The input string.
         * @return The lowercase version of the string.
         * @throws NullPointerException if the input text is null.
         */
        public static String convertToLowercase(String text) {
            if (text == null) {
                throw new NullPointerException("Text cannot be null.");
            }
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    result.append((char) (ch + 32)); // Convert to lowercase
                } else {
                    result.append(ch);
                }
            }
            return result.toString();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample Program 1: String Analyzer
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        System.out.print("Enter a character to find the occurrences: ");
        char ch = scanner.next().charAt(0);
        scanner.nextLine(); // Consume the newline character
        try {
            int[] indexes = StringAnalyzer.findAllIndexes(text, ch);
            System.out.println("Indexes of the character '" + ch + "': " + Arrays.toString(indexes));
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // Level 1 Programs

        // 1. String Comparison
        System.out.println("\n--- String Comparison ---");
        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();
        try {
            boolean areEqualUsingCharAt = StringComparator.compareStrings(s1, s2);
            boolean areEqualUsingEquals = s1.equals(s2);
            System.out.println("Strings are equal using charAt(): " + areEqualUsingCharAt);
            System.out.println("Strings are equal using equals(): " + areEqualUsingEquals);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // 2. Substring Creation
        System.out.println("\n--- Substring Creation ---");
        System.out.print("Enter a string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        try {
            String substringUsingCharAt = SubstringCreator.createSubstring(mainString, start, end);
            String substringUsingSubstring = mainString.substring(start, end);
            System.out.println("Substring using charAt(): " + substringUsingCharAt);
            System.out.println("Substring using substring(): " + substringUsingSubstring);
            boolean areEqual = substringUsingCharAt.equals(substringUsingSubstring);
            System.out.println("Substrings are equal: " + areEqual);
        } catch (NullPointerException | StringIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // 3. String to Character Array
        System.out.println("\n--- String to Character Array ---");
        System.out.print("Enter a string: ");
        String charString = scanner.nextLine();
        try {
            char[] charArrayUsingGetChars = CharacterExtractor.getCharacters(charString);
            char[] charArrayUsingToCharArray = charString.toCharArray();
            System.out.println("Characters using user-defined method: " + Arrays.toString(charArrayUsingGetChars));
            System.out.println("Characters using toCharArray(): " + Arrays.toString(charArrayUsingToCharArray));
            boolean arraysAreEqual = CharacterExtractor.compareCharacterArrays(charArrayUsingGetChars, charArrayUsingToCharArray);
            System.out.println("Arrays are equal: " + arraysAreEqual);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // 4. NullPointerException Demo
        System.out.println("\n--- NullPointerException Demo ---");
        NullPointerExceptionDemo.demonstrateNullPointerException();


        // 5. StringIndexOutOfBoundsException Demo
        System.out.println("\n--- StringIndexOutOfBoundsException Demo ---");
        StringIndexOutOfBoundsExceptionDemo.demonstrateStringIndexOutOfBoundsException();


        // 6. IllegalArgumentException Demo
        System.out.println("\n--- IllegalArgumentException Demo ---");
        IllegalArgumentExceptionDemo.demonstrateIllegalArgumentException();


        // 7. NumberFormatException Demo
        System.out.println("\n--- NumberFormatException Demo ---");
        NumberFormatExceptionDemo.demonstrateNumberFormatException();


        // 8. ArrayIndexOutOfBoundsException Demo
        System.out.println("\n--- ArrayIndexOutOfBoundsException Demo ---");
        ArrayIndexOutOfBoundsExceptionDemo.demonstrateArrayIndexOutOfBoundsException();


        // 9. String to Uppercase
        System.out.println("\n--- String to Uppercase ---");
        System.out.print("Enter a string: ");
        String uppercaseText = scanner.nextLine();
        try {
            String uppercaseUsingConvert = UppercaseConverter.convertToUppercase(uppercaseText);
            String uppercaseUsingToUpperCase = uppercaseText.toUpperCase();
            System.out.println("Uppercase using user-defined method: " + uppercaseUsingConvert);
            System.out.println("Uppercase using toUpperCase(): " + uppercaseUsingToUpperCase);
            boolean areEqual = UppercaseConverter.compareStrings(uppercaseUsingConvert, uppercaseUsingToUpperCase);
            System.out.println("Strings are equal: " + areEqual);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // 10. String to Lowercase
        System.out.println("\n--- String to Lowercase ---");
        System.out.print("Enter a string: ");
        String lowercaseText = scanner.nextLine();
        try {
            String lowercaseUsingConvert = LowercaseConverter.convertToLowercase(lowercaseText);
            String lowercaseUsingToLowerCase = lowercaseText.toLowerCase();
            System.out.println("Lowercase using user-defined method: " + lowercaseUsingConvert);
            System.out.println("Lowercase using toLowerCase(): " + lowercaseUsingToLowerCase);
            boolean areEqual = lowercaseUsingConvert.equals(lowercaseUsingToLowerCase);
            System.out.println("Strings are equal: " + areEqual);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

