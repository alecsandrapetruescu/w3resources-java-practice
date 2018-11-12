package base_part1;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BasePart1PracticeStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        printYourName(scanner);
//        printJavaPattern();
//        checkJavaInstallation();
//        reverseString(scanner);
//        countCharacters(scanner);
//        printAllCharacterSets();
//        printAsciiForChar(scanner);
//        printPassword(scanner);
//        printSong();
//        capitalizeFirstLetter(scanner);
//        convertToLowercase(scanner);
//        penultimateWord(scanner);
//        reverseWord(scanner);
        insertWordInTheMiddle(scanner);
    }

    /**
     * 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
     * Expected Output:
     * Hello
     * Your name
     */
    private static void printYourName(Scanner scanner) {
        System.out.println("Enter your first name");
        String firstName = scanner.next();
        System.out.println("Enter your last name");
        String lastName = scanner.next();
        System.out.println(String.format("Hello %s %s !", firstName, lastName));
        scanner.close();
    }

    /**
     * 8. Write a Java program to display the following pattern.
     * Sample Pattern :
     * <p>
     * J    a   v     v  a
     * J   a a   v   v  a a
     * J  J  aaaaa   V V  aaaaa
     * JJ  a     a   V  a     a
     */
    private static void printJavaPattern() {
        System.out.println("    J   a   v    v   a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    /**
     * 14. Write a Java program to print an American flag on the screen.
     * Expected Output:
     *
     * * * * * * * ==================================
     *  * * * * *  ==================================
     * * * * * * * ==================================
     *  * * * * *  ==================================
     * * * * * * * ==================================
     *  * * * * *  ==================================
     * * * * * * * ==================================
     *  * * * * *  ==================================
     * * * * * * * ==================================
     * ==============================================
     * ==============================================
     * ==============================================
     * ==============================================
     * ==============================================
     * ==============================================
     */

    /**
     * 16. Write a Java program to print a face.
     * Expected Output:
     *
     * +"""""+
     * [| o o |]
     * |  ^  |
     * | '-' |
     * +-----+
     */


    /**
     * 31. Write a Java program to check whether Java is installed on your computer.
     * Expected Output:
     * Java Version: 1.8.0_71
     * Java Runtime Version: 1.8.0_71-b15
     * Java Home: /opt/jdk/jdk1.8.0_71/jre
     * Java Vendor: Oracle Corporation
     * Java Vendor URL: http://Java.oracle.com/
     * Java Class Path: .
     */
    private static void checkJavaInstallation() {
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
    }

    /**
     * 37. Write a Java program to reverse a string.
     * Input Data:
     * Input a string: The quick brown fox
     * <p>
     * Expected Output:
     * Reverse string: xof nworb kciuq ehT
     */
    private static void reverseString(Scanner scanner) {
        System.out.println("Input a string:");
        StringBuffer buffer = new StringBuffer(scanner.nextLine());
        System.out.println(String.format("Reverse string: %s", buffer.reverse().toString()));
    }

    /**
     * 38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.
     * Expected Output:
     * The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
     * letter: 23
     * space: 9
     * number: 10
     * other: 6
     */
    private static void countCharacters(Scanner scanner) {
        System.out.println("Enter string:");
        String input = scanner.next();
        System.out.println(String.format("The string is : %s", input));
        char[] chars = input.toCharArray();
        int nrOfLetters = 0;
        int nrOfSpaces = 0;
        int nrOfNumbers = 0;
        int nrOfOthers = 0;
        for (char c : chars) {
            if (Character.isLetter(c)) nrOfLetters++;
            else if (Character.isSpaceChar(c)) nrOfSpaces++;
            else if (Character.isDigit(c)) nrOfNumbers++;
            else nrOfOthers++;
        }
        System.out.println(String.format("letter: %d \n space: %d \n number: %d \n other : %d",
                nrOfLetters,
                nrOfSpaces,
                nrOfNumbers,
                nrOfOthers));
    }

    /**
     * 40. Write a Java program to list the available character sets in charset objects.
     * Expected Output
     * <p>
     * List of available character sets:
     * Big5
     * Big5-HKSCS
     * CESU-8
     * EUC-JP
     * EUC-KR
     * GB18030
     * GB2312
     * GBK
     * <p>
     * ...
     * <p>
     * x-SJIS_0213
     * x-UTF-16LE-BOM
     * X-UTF-32BE-BOM
     * X-UTF-32LE-BOM
     * x-windows-50220
     * x-windows-50221
     * x-windows-874
     * x-windows-949
     * x-windows-950
     * x-windows-iso2022jp
     */
    private static void printAllCharacterSets() {
        Charset.availableCharsets().keySet().forEach(System.out::println);
    }

    /**
     * 41. Write a Java program to print the ascii value of a given character.
     * Expected Output
     * <p>
     * The ASCII value of Z is :90
     */
    private static void printAsciiForChar(Scanner scanner) {
        System.out.println("Enter a character:");
        String character = scanner.next();
        System.out.println(String.format("The ASCII value of %s is: %d", character, (int) character.toCharArray()[0]));
    }

    /**
     * 42. Write a Java program to input and display your password.
     * Expected Output
     * <p>
     * Input your Password:
     * Your password was: abc@123
     */
    private static void printPassword(Scanner scanner) {
        System.out.println("Input your Password:");
        System.out.println(String.format("Your password was: ", scanner.next()));
    }

    /**
     * 43. Write a Java program to print the following string in a specific format (see the output).
     * Sample Output
     * <p>
     * Twinkle, twinkle, little star,
     * How I wonder what you are!
     * Up above the world so high,
     * Like a diamond in the sky.
     * Twinkle, twinkle, little star,
     * How I wonder what you are
     */
    private static void printSong() {
        System.out.println("\nTwinkle, twinkle, little star, " +
                "\n\tHow I wonder what you are! " +
                "\n\t\tUp above the world so high, " +
                "\n\t\tLike a diamond in the sky. " +
                "\nTwinkle, twinkle, little star, " +
                "\n\tHow I wonder what you are!\n\n");
    }

    /**
     * 58. Write a Java program to capitalize the first letter of each word in a sentence.
     * Sample Output:
     * <p>
     * Input a Sentence: the quick brown fox jumps over the lazy dog.
     * The Quick Brown Fox Jumps Over The Lazy Dog.
     */
    private static void capitalizeFirstLetter(Scanner scanner) {
        System.out.println("Input a Sentence:");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s");
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(String.valueOf(Character.toUpperCase(word.charAt(0))) + word.substring(1));
            builder.append(" ");
        }
        System.out.println(builder.toString());
    }

    /**
     * 59. Write a Java program to convert a given string into lowercase.
     * Sample Output:
     *
     * Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
     * the quick brown fox jumps over the lazy dog.
     */
    private static void convertToLowercase(Scanner scanner) {
        System.out.println("Input a String:");
        System.out.println(scanner.nextLine().toLowerCase());
    }

    /**
     * 60. Write a Java program to find the penultimate (next to last) word of a sentence.
     * Sample Output:
     *
     * Input a String: The quick brown fox jumps over the lazy dog.
     * Penultimate word: lazy
     */
    private static void penultimateWord(Scanner scanner) {
        System.out.println("Input a String:");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s");
        System.out.println(String.format("Penultimate word: %s", words[words.length - 2]));
    }

    /**
     * 61. Write a Java program to reverse a word.
     * Sample Output:
     *
     * Input a word: dsaf
     * Reverse word: fasd
     */
    private static void reverseWord(Scanner scanner) {
        System.out.println("Input a word:");
        System.out.println(String.format("Reverse word: %s", new StringBuffer(scanner.next()).reverse()));
    }

    /**
     * 67. Write a Java program to insert a word in the middle of the another string.
     * Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
     * Sample Output:
     *
     * Python Tutorial 3.0
     */
    private static void insertWordInTheMiddle(Scanner scanner) {
        System.out.println("Enter sentence:");
        String sentence = scanner.nextLine();
        System.out.println("Enter word to insert in the middle:");
        String word = scanner.next();
        List<String> words = new ArrayList<>(Arrays.asList(sentence.split("\\s"))) ;
        words.add(Math.round(words.size()/2), word);
        String newSentence = words.stream().collect(Collectors.joining(" "));
        System.out.println(String.format("New sentence: %s", newSentence));
    }

    /**
     * 68. Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. The
     * length of the original string must be 3 and above.
     * Sample Output:
     *
     * 3.03.03.03.0
     */


    /**
     * 69. Write a Java program to extract the first half of a string of even length.
     * Test Data: Python
     * Sample Output:
     * Pyt
     */

    /**
     * 70. Write a Java program to create a string in the form short_string + long_string + short_string from two
     * strings. The strings must not have the same length.
     * Test Data: Str1 = Python
     * Str2 = Tutorial
     * Sample Output:
     *
     * PythonTutorialPython
     */

    /**
     * 71. Write a Java program to create the concatenation of the two strings except removing the first character of
     * each string. The length of the strings must be 1 and above.
     * Test Data: Str1 = Python
     * Str2 = Tutorial
     * Sample Output:
     *
     * ythonutorial
     */

    /**
     * 72. Write a Java program to create a new string taking first three characters from a given string. If the length
     * of the given string is less than 3 use "#" as substitute characters.
     * Test Data: Str1 = " "
     * Sample Output:
     *
     * ###
     */

    /**
     * 73. Write a Java program to create a new string taking first and last characters from two given strings. If the
     * length of either string is 0 use "#" for missing character.
     * Test Data: str1 = "Python"
     * str2 = " "
     * Sample Output:
     *
     * P#
     */

    /**
     * 84. Write a Java program to take the last three characters from a given string and add the three characters at
     * both the front and back of the string. String length must be greater than three and more.
     * Test data: "Python" will be "honPythonhon"
     * Sample Output:
     *
     * honPythonhon
     */

    /**
     * 85. Write a Java program to check if a string starts with a specified word.
     * Sample Data: string1 = "Hello how are you?"
     * Sample Output:
     *
     * true
     */

    /**
     * 114. Write a Java program to given a string and an offset, rotate string by offset (rotate from left to right).
     */

    /**
     * 118. Write a Java program to get the first occurrence (Position starts from 0.) of a string within a given string.
     */

    /**
     * 138. Write a Java program to find all of the longest word in a given dictionary.
     * Example-1:
     * {
     * "cat",
     * "flag",
     * "green",
     * "country",
     * "w3resource"
     * }
     * Result: "w3resource"
     * Example-2:
     * {
     * "cat",
     * "dog",
     * "red",
     * "is",
     * "am"
     * }
     * Result: "cat", "dog", "red"
     */

    /**
     * 141. Write a Java program to check if a given string has all unique characters.
     * Sample Output: Original String : xyyz
     * String has all unique characters: false
     */

    /**
     * 142. Write a Java program to check if two given strings are anagrams or not.
     * According to Wikipedia "An anagram is a word or phrase formed by rearranging the letters of a different word or
     * phrase, typically using all the original letters exactly once. For example, the word anagram can be rearranged
     * into nag a ram, or the word binary into brainy."
     * Sample Output: String-1 : wxyz
     * String-2 : zyxw
     * Check if two given strings are anagrams or not?: true
     */

    /**
     *
     * 148. Write a Java program to find the index of the first unique character in a given string, assume that there is
     * at least one unique character in the string.
     * Sample Output:
     * Original String: wresource
     * First unique character of the above: 0
     */

    /**
     * 149. Write a Java program to check if a given string is a permutation of another given string.
     * Sample Output:
     * Original strings: xxyz yxzx
     * true
     */
}
