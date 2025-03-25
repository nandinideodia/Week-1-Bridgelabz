import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

// Sample Program 1: Find all occurrences of a character in a string
class StringAnalyzer {
    // Method to find all the index of a character in a string using charAt()
    // method and return them in an array
    public static int[] findAllIndexes(String text, char ch) {
        // The count is used to find the number of occurrences of the character
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }

        // Create an array to store the indexes of the character
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

// Level 3 Practice Programs

// Program to find BMI and display the height, weight, BMI, and status of each individual
public class BMIcalculator {

    // Method to find BMI and status
    public static String[] calculateBMIAndStatus(double height, double weight) {
        double bmi = weight / (height * height);
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        return new String[]{String.format("%.2f", height), String.format("%.2f", weight), String.format("%.2f", bmi), status};
    }

    // Method to process height and weight array
    public static String[][] processData(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double height = data[i][1] / 100; // Convert cm to meters
            double weight = data[i][0];
            result[i] = calculateBMIAndStatus(height, weight);
        }
        return result;
    }

    // Method to display the 2D string array
    public static void displayResult(String[][] result) {
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Person's Height", "Weight", "BMI", "Status");
        for (String[] row : result) {
            System.out.printf("%-15s %-15s %-15s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }
}

// Program to find unique characters in a string
public class UniqueCharacters {

    // Method to find the length of the text without using the String method length()
    public static int stringLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }

    // Method to Find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = stringLength(text); // Use our length function
        char[] uniqueChars = new char[length]; // Assume all are unique initially.
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        char[] result = new char[uniqueCount]; // Create array with correct size.
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }
}

// Program to find the first non-repeating character in a string
public class FirstNonRepeatingCharacter {
    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] charFrequencies = new int[256]; // To store frequency of each character

        // Calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            charFrequencies[text.charAt(i)]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (charFrequencies[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; // Return null character if no non-repeating character is found
    }
}

// Program to find the frequency of characters in a string
public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequencies(String text) {
        int[] charFrequencies = new int[256]; // To store frequency of each character
        int uniqueCharCount = 0;

        // Calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            charFrequencies[text.charAt(i)]++;
        }

        // Count unique characters
        for (int freq : charFrequencies) {
            if (freq > 0) {
                uniqueCharCount++;
            }
        }

        String[][] result = new String[uniqueCharCount][2];
        int resultIndex = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequencies[i] > 0) {
                result[resultIndex][0] = String.valueOf((char) i);
                result[resultIndex][1] = String.valueOf(charFrequencies[i]);
                resultIndex++;
            }
        }
        return result;
    }
}

// Program to find the frequency of characters in a string using unique characters
public class CharacterFrequencyUnique {

    // Method to Find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to find the frequency of characters
    public static String[][] findCharacterFrequencies(String text) {
        int[] charFrequencies = new int[256];
        for (int i = 0; i < text.length(); i++) {
            charFrequencies[text.charAt(i)]++;
        }

        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(charFrequencies[uniqueChars[i]]);
        }
        return result;
    }
}

// Program to find the frequency of characters in a string using nested loops
public class CharacterFrequencyNestedLoops {

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequencies(String text) {
        int[] charFrequencies = new int[256];
        char[] characters = text.toCharArray();
        int length = characters.length;

        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') { // Skip already counted characters
                int count = 1;
                for (int j = i + 1; j < length; j++) {
                    if (characters[i] == characters[j]) {
                        count++;
                        characters[j] = '0'; // Mark as counted
                    }
                }
                charFrequencies[characters[i]] = count;
            }
        }

        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            if (charFrequencies[i] > 0) {
                resultBuilder.append((char) i).append(":").append(charFrequencies[i]).append(",");
            }
        }
        String resultString = resultBuilder.toString();
        if (resultString.length() > 0) {
            resultString = resultString.substring(0, resultString.length() - 1);
        }
        return resultString.split(",");
    }
}

// Program to check if a text is palindrome
public class PalindromeChecker {

    // Method to compare the characters from the start and end of the string
    public static boolean isPalindrome1(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive method to compare the characters
    public static boolean isPalindrome2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindrome2(text, start + 1, end - 1);
    }

    // Method to compare the characters from the start and end of the text using character arrays
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }

    public static boolean isPalindrome3(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        return Arrays.equals(original, reversed);
    }
}

// Program to check if two texts are anagrams
public class AnagramChecker {
    public static boolean areAnagrams(String text1, String text2) {
        // Null or empty string check
        if (text1 == null || text2 == null || text1.isEmpty() || text2.isEmpty()) {
            return false;
        }

        // Remove non-alphanumeric characters and convert to lowercase
        String cleanText1 = text1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String cleanText2 = text2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if lengths are equal
        if (cleanText1.length() != cleanText2.length()) {
            return false;
        }

        // Create character frequency arrays
        int[] charFrequencies1 = new int[256];
        int[] charFrequencies2 = new int[256];

        // Calculate character frequencies
        for (char c : cleanText1.toCharArray()) {
            charFrequencies1[c]++;
        }
        for (char c : cleanText2.toCharArray()) {
            charFrequencies2[c]++;
        }

        // Compare character frequencies
        return Arrays.equals(charFrequencies1, charFrequencies2);
    }
}

// Program to display a calendar for a given month and year
public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    // Method to get the number of days in the month
    public static int getNumberOfDays(int month, int year) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month];
    }

    // Method to check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month
    public static int getFirstDayOfMonth(int year, int month) {
        int day = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + 31 * m0 / 12) % 7;
        return d0; // 0 for Sunday, 1 for Monday, ..., 6 for Saturday
    }

    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numberOfDays = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(year, month);

        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first week
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

// Program to create, shuffle, and distribute a deck of cards
import java.util.Random;

public class DeckOfCards {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int randomNumber = i + random.nextInt(n - i);
            String temp = deck[i];
            deck[i] = deck[randomNumber];
            deck[randomNumber] = temp;
        }
        return deck;
    }

    // Method to distribute the deck of cards to players
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        int totalCards = numPlayers * cardsPerPlayer;
        if (totalCards > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }

        String[][] players = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersAndCards(String[][] players) {
        if (players == null) {
            return;
        }
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample Program 1: String Analyzer
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        System.out.print("Enter a character to find the occurrences: ");
        char ch = scanner.next().charAt(0);
        scanner.nextLine(); // Consume the newline character
        int[] indexes = StringAnalyzer.findAllIndexes(text, ch);
        System.out.println("Indexes of the character '" + ch + "': " + Arrays.toString(indexes));

        // Level 3 Programs

        // BMI Calculator
        double[][] data = new double[10][2];
        System.out.println("\nEnter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " weight: ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " height: ");
            data[i][1] = scanner.nextDouble();
        }
        String[][] bmiResult = BMIcalculator.processData(data);
        BMIcalculator.displayResult(bmiResult);

        // Unique Characters
        System.out.print("\nEnter a string: ");
        String uniqueText = scanner.nextLine();
        char[] uniqueChars = UniqueCharacters.findUniqueCharacters(uniqueText);
        System.out.print("Unique characters: ");
        for (char uniqueCh : uniqueChars) {
            System.out.print(uniqueCh + " ");
        }
        System.out.println();

        // First Non-Repeating Character
        System.out.print("\nEnter a string: ");
        String nonRepeatingText = scanner.nextLine();
        char firstNonRepeating = FirstNonRepeatingCharacter.findFirstNonRepeatingCharacter(nonRepeatingText);
        if (firstNonRepeating != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }

        // Character Frequency
        System.out.print("\nEnter a string: ");
        String frequencyText = scanner.nextLine();
        String[][] frequencies = CharacterFrequency.findCharacterFrequencies(frequencyText);
        System.out.println("Character Frequencies:");
        for (String[] pair : frequencies) {
            System.out.println("Character: " + pair[0] + ", Frequency: " + pair[1]);
        }

        // Character Frequency with Unique
        System.out.print("\nEnter a string: ");
        String uniqueFrequencyText = scanner.nextLine();
        String[][] uniqueFrequencies = CharacterFrequencyUnique.findCharacterFrequencies(uniqueFrequencyText);
        System.out.println("Character Frequencies (using unique characters):");
        for (String[] pair : uniqueFrequencies) {
            System.out.println("Character: " + pair[0] + ", Frequency: " + pair[1]);
        }

        // Character Frequency with Nested Loops
        System.out.print("\nEnter a string: ");
        String nestedLoopText = scanner.nextLine();
        String[] nestedLoopFrequencies = CharacterFrequencyNestedLoops.findCharacterFrequencies(nestedLoopText);
        System.out.println("Character Frequencies (using nested loops):");
        for (String frequency : nestedLoopFrequencies) {
            System.out.println(frequency);
        }

        // Palindrome Check
        System.out.print("\nEnter a string to check for palindrome: ");
        String palindromeText = scanner.nextLine();
        System.out.println("Palindrome check (Logic 1): " + PalindromeChecker.isPalindrome1(palindromeText));
        System.out.println("Palindrome check (Logic 2): " + PalindromeChecker.isPalindrome2(palindromeText, 0, palindromeText.length() - 1));
        System.out.println("Palindrome check (Logic 3): " + PalindromeChecker.isPalindrome3(palindromeText));

        // Anagram Check
        System.out.print("Enter the first string: ");
        String anagramText1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String anagramText2 = scanner.nextLine();
        if (AnagramChecker.areAnagrams(anagramText1, anagramText2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        // Calendar Display
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        CalendarDisplay.displayCalendar(month, year);

        // Deck of Cards
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();
        scanner.close();

        String[] deck = DeckOfCards.initializeDeck();
        String[] shuffledDeck = DeckOfCards.shuffleDeck(deck);
        String[][] players = DeckOfCards.distributeCards(shuffledDeck, numPlayers, cardsPerPlayer);
        DeckOfCards.printPlayersAndCards(players);
    }
}

