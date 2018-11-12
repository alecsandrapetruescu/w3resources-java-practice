package base_part1;

import java.util.Scanner;

import static base_part1.ScannerNumberFormatter.getIntegerNumber;

public class BasePart1PracticeConverters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        convertDecimalToBinary(scanner);
        convertDecimalToHexadecimal(scanner);
        convertDecimalToOctal(scanner);
        convertBinaryToDecimal(scanner);
        convertBinaryToHexadecimal(scanner);
        convertBinaryToOctal(scanner);
        convertOctalToDecimal(scanner);
        convertOctalToBinary(scanner);
        convertOctalToHexadecimal(scanner);
        convertHexadecimalToDecimal(scanner);
        convertHexadecimalToBinary(scanner);
        convertHexadecimalToOctal(scanner);
        convertToInteger(scanner);
    }

    /**
     * 19. Write a Java program to convert a decimal number to binary number.
     * Input Data:
     * Input a Decimal Number : 5
     * <p>
     * Expected Output:
     * Binary number is: 101
     */
    private static void convertDecimalToBinary(Scanner scanner) {
        System.out.print("Input a Decimal Number: ");
        int number = getIntegerNumber(scanner);
        System.out.println("Binary number is: " + Integer.toBinaryString(number));
    }

    /**
     * 20. Write a Java program to convert a decimal number to hexadecimal number.
     * Input Data:
     * Input a decimal number: 15
     * <p>
     * Expected Output
     * Hexadecimal number is : F
     */
    private static void convertDecimalToHexadecimal(Scanner scanner) {
        System.out.print("Input a Decimal Number: ");
        int number = getIntegerNumber(scanner);
        System.out.println("Hexadecimal number is: " + Integer.toHexString(number));
    }

    /**
     * 21. Write a Java program to convert a decimal number to octal number.
     * Input Data:
     * Input a Decimal Number: 15
     * <p>
     * Expected Output:
     * Octal number is: 17
     */
    private static void convertDecimalToOctal(Scanner scanner) {
        System.out.print("Input a Decimal Number: ");
        int number = getIntegerNumber(scanner);
        System.out.println("Octal number is: " + Integer.toOctalString(number));
    }

    /**
     * 22. Write a Java program to convert a binary number to decimal number.
     * Input Data:
     * Input a binary number: 100
     * <p>
     * Expected Output:
     * Decimal Number: 4
     */
    private static void convertBinaryToDecimal(Scanner scanner) {
        System.out.print("Input a binary Number: ");
        System.out.println("Decimal number is: " + Integer.valueOf(scanner.next(), 2));
    }

    /**
     * 23. Write a Java program to convert a binary number to hexadecimal number.
     * Input Data:
     * Input a Binary Number: 1101
     * <p>
     * Expected Output:
     * HexaDecimal value: D
     */
    private static void convertBinaryToHexadecimal(Scanner scanner) {
        System.out.print("Input a binary Number: ");
        int number = Integer.valueOf(scanner.next(), 2);
        System.out.println("HexaDecimal number is: " + Integer.toHexString(number));
    }

    /**
     * 24. Write a Java program to convert a binary number to a Octal number.
     * Input Data:
     * Input a Binary Number: 111
     * <p>
     * Expected Output:
     * Octal number: 7
     */
    private static void convertBinaryToOctal(Scanner scanner) {
        System.out.print("Input a binary Number: ");
        int number = Integer.valueOf(scanner.next(), 2);
        System.out.println("HexaDecimal number is: " + Integer.toOctalString(number));
    }

    /**
     * 25. Write a Java program to convert a octal number to a decimal number.
     * Input Data:
     * Input any octal number: 10
     * <p>
     * Expected Output:
     * Equivalent decimal number: 8
     */
    private static void convertOctalToDecimal(Scanner scanner) {
        System.out.print("Input a binary Number: ");
        int number = Integer.valueOf(scanner.next(), 8);
        System.out.println("HexaDecimal number is: " + number);
    }

    /**
     * 26. Write a Java program to convert a octal number to a binary number.
     * Input Data:
     * Input any octal number: 7
     * <p>
     * Expected Output:
     * Equivalent binary number: 111
     */
    private static void convertOctalToBinary(Scanner scanner) {
        System.out.print("Input a octal Number: ");
        int number = Integer.valueOf(scanner.next(), 8);
        System.out.println("Binary number is: " + Integer.toBinaryString(number));
    }

    /**
     * 27. Write a Java program to convert a octal number to a hexadecimal number.
     * Input Data:
     * Input a octal number : 100
     * <p>
     * Expected Output:
     * Equivalent hexadecimal number: 40
     */
    private static void convertOctalToHexadecimal(Scanner scanner) {
        System.out.print("Input a octal Number: ");
        int number = Integer.valueOf(scanner.next(), 8);
        System.out.println("Equivalent Hexadecimal number is: " + Integer.toHexString(number));
    }

    /**
     * 28. Write a Java program to convert a hexadecimal to a decimal number.
     * Input Data:
     * Input a hexadecimal number: 25
     * <p>
     * Expected Output:
     * Equivalent decimal number is: 37
     */
    private static void convertHexadecimalToDecimal(Scanner scanner) {
        System.out.print("Input a octal Number: ");
        int number = Integer.valueOf(scanner.next(), 16);
        System.out.println("Equivalent Decimal number is: " + number);
    }

    /**
     * 29. Write a Java program to convert a hexadecimal to a binary number.
     * Input Data:
     * Enter Hexadecimal Number : 37
     * <p>
     * Expected Output:
     * Equivalent Binary Number is: 110111
     */
    private static void convertHexadecimalToBinary(Scanner scanner) {
        System.out.print("Input a octal Number: ");
        int number = Integer.valueOf(scanner.next(), 16);
        System.out.println("Equivalent Binary number is: " + Integer.toBinaryString(number));
    }

    /**
     * 30. Write a Java program to convert a hexadecimal to a octal number.
     * Input Data:
     * Input a hexadecimal number: 40
     * <p>
     * Expected Output:
     * Equivalent of octal number is: 100
     */
    private static void convertHexadecimalToOctal(Scanner scanner) {
        System.out.print("Input a octal Number: ");
        int number = Integer.valueOf(scanner.next(), 16);
        System.out.println("Equivalent Binary number is: " + Integer.toOctalString(number));
    }

    /**
     * 51. Write a Java program to convert a string to an integer in Java.
     * Sample Output:
     *
     * Input a number(string): 25
     * The integer value is: 25
     */
    private static void convertToInteger(Scanner scanner) {
        String numberAsString = scanner.next();
        System.out.println(String.format("Input a number(string): %s", numberAsString));
        System.out.println(String.format("The integer value is: %d", Integer.valueOf(numberAsString)));
    }
}
