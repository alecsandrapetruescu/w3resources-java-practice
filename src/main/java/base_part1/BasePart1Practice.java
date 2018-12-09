package base_part1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

import static base_part1.OperationType.*;
import static base_part1.ScannerNumberFormatter.getDoubleNumber;
import static base_part1.ScannerNumberFormatter.getIntegerNumber;

public class BasePart1Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        calculateSumOfTwo(scanner);
//        calculateDivideOfTwo(scanner);
//        calculateEcuation(scanner);
//        productOfTwoNumbers(scanner);
//        allOperationsOfTwoNumbers(scanner);
//        multiplicationTable(scanner);
//        printExpression(scanner);
//        areaAndPerimeterOfCircle(scanner);
//        averageOfThree(scanner);
//        areaAndPerimeterOfRectangle(scanner);
//        swapVariables(scanner);
//        addTwoBinaryNumbers(scanner);
//        multiplyTwoBinaryNumbers(scanner);
//        compareTwoNumbers(scanner);
//        sumOfDigits(scanner);
//        areaOfHexagon(scanner);
//        areaOfPolygon(scanner);
//        distanceBetweenPoints(scanner);
//        displayThreeDigitUniqueNumbers();
//        generateExpression(scanner);
//        printFileSize("/home/students/abc.txt");
//        printSystemTime();
//        printCurrentDateTimeFormated();
//        printOddNumbers();
//        printCheckEvenNumber(scanner);
//        printDivisibleNumbers();
//        calculateSumOfTwoAndValidateWithThird(scanner);
//        printCompareThreeNumbers(scanner);
//        printTwoOrMoreHaveSameLastDigit(scanner);
//        printNumbersWithinRangeDivisibleByAnother(scanner);
//        printCountFactors(scanner);
//        printIsGreaterThan20(scanner);
//        printCompared(scanner);
//        printHaveCommonDigit(scanner);
//        printCalculateModules(scanner);
//        calculateSumOfPrimeNumbers();
//        processNumber(scanner);
        printSumOfDigits(scanner);
    }

    /**
     * 2. Write a Java program to print the sum of two numbers.
     * Test Data: 74 + 36
     * Expected Output: * 110
     */
    private static void calculateSumOfTwo(Scanner scanner) {
        System.out.println(String.format("Enter %s number: ", "first"));
        int firstNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Enter %s number: ", "second"));
        int secondNumber = ScannerNumberFormatter.getIntegerNumber(scanner);

        System.out.print("Sum of numbers: ");
        System.out.println(firstNumber + secondNumber);
    }

    /**
     * 3. Write a Java program to divide two numbers and print on the screen.
     * Test Data: 50/3
     * Expected Output: 16
     */
    private static void calculateDivideOfTwo(Scanner scanner) {
        System.out.println(String.format("Enter %s number: ", "first"));
        int firstNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Enter %s number: ", "second"));
        int secondNumber = ScannerNumberFormatter.getIntegerNumber(scanner);

        System.out.print("Divide numbers: ");
        System.out.println(firstNumber / secondNumber);
    }

    /**
     * 4. Write a Java program to print the result of the following operations.
     * Test Data:
     * a. -5 + 8 * 6
     * b. (55+9) % 9
     * c. 20 + -3*5 / 8
     * d. 5 + 15 / 3 * 2 - 8 % 3
     * <p>
     * Expected Output:
     * 43
     * 1
     * 19
     * 13
     */
    private static void calculateEcuation(Scanner scanner) {
        System.out.println("Enter your ecuation");
        System.out.println(scanner.next());
    }

    /**
     * 5. Write a Java program that takes two numbers as input and display the product of two numbers.
     * Test Data:
     * Input first number: 25
     * Input second number: 5
     * <p>
     * Expected Output :
     * 25 x 5 = 125
     */
    private static void productOfTwoNumbers(Scanner scanner) {
        System.out.println(String.format("Enter %s number: ", "first"));
        int firstNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Enter %s number: ", "second"));
        int secondNumber = ScannerNumberFormatter.getIntegerNumber(scanner);

        printCalculator(firstNumber, secondNumber, OperationType.MULTIPLY);
    }

    private static void printCalculator(int firstNumber, int secondNumber, OperationType operation) {
        int result = 0;
        OperationType type = null;
        switch (operation) {
            case SUM:
                type = SUM;
                break;
            case SUBTRACT:
                type = SUBTRACT;
                break;
            case MULTIPLY:
                type = MULTIPLY;
                break;
            case DIVIDE:
                type = DIVIDE;
                break;
        }
        result = calculator(firstNumber, secondNumber, type);
        System.out.println(String.format("Output: %d %s %d = %d", firstNumber, operation.getOperator(), secondNumber,
                result));
    }

    private static int calculator(int firstNumber, int secondNumber, OperationType operation) {
        switch (operation) {
            case SUM:
                return firstNumber + secondNumber;
            case SUBTRACT:
                return firstNumber - secondNumber;
            case MULTIPLY:
                return firstNumber * secondNumber;
            case DIVIDE:
                return firstNumber / secondNumber;

            default:
                return 0;
        }
    }

    /**
     * 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
     * Test Data:
     * Input first number: 125
     * Input second number: 24
     * <p>
     * Expected Output:
     * 125 + 24 = 149
     * 125 - 24 = 101
     * 125 x 24 = 3000
     * 125 / 24 = 5
     * 125 mod 24 = 5
     */
    private static void allOperationsOfTwoNumbers(Scanner scanner) {
        System.out.println(String.format("Enter %s number: ", "first"));
        int firstNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Enter %s number: ", "second"));
        int secondNumber = ScannerNumberFormatter.getIntegerNumber(scanner);

        printCalculator(firstNumber, secondNumber, SUM);
        printCalculator(firstNumber, secondNumber, OperationType.SUBTRACT);
        printCalculator(firstNumber, secondNumber, OperationType.MULTIPLY);
        printCalculator(firstNumber, secondNumber, OperationType.DIVIDE);
        printCalculator(firstNumber, secondNumber, OperationType.MOD);
    }

    /**
     * 7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
     * Test Data:
     * Input a number: 8
     * <p>
     * Expected Output:
     * 8 x 1 = 8
     * 8 x 2 = 16
     * 8 x 3 = 24
     * ...
     * 8 x 10 = 80
     */
    private static void multiplicationTable(Scanner scanner) {
        System.out.println("Enter number: ");
        int firstNumber = ScannerNumberFormatter.getIntegerNumber(scanner);

        for (int i = 1; i <= 10; i++) {
            printCalculator(firstNumber, i, OperationType.MULTIPLY);
        }
    }

    /**
     * 9. Write a Java program to compute the specified expressions and print the output.
     * Test Data:
     * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     * <p>
     * Expected Output:
     * 2.138888888888889
     */
    private static void printExpression(Scanner scanner) {
        System.out.println(ScannerNumberFormatter.getDoubleNumber(scanner));
    }

    /**
     * 10. Write a Java program to compute a specified formula.
     * Specified Formula :
     * 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
     *
     * Expected Output:
     * 2.9760461760461765
     */

    /**
     * 11. Write a Java program to print the area and perimeter of a areaAndPerimeterOfCircle.
     * Test Data:
     * Radius = 7.5
     * <p>
     * Expected Output:
     * Perimeter is = 47.12388980384689
     * Area is = 176.71458676442586
     */
    private static void areaAndPerimeterOfCircle(Scanner scanner) {
        double radius = ScannerNumberFormatter.getDoubleNumber(scanner);
        Shape shape = new Circle(radius);
        System.out.println("Perimeter is = " + shape.getPerimeter());
        System.out.println("Area is = " + shape.getArea());
    }

    /**
     * 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
     */
    private static void averageOfThree(Scanner scanner) {
        System.out.println(String.format("Enter %s number: ", "first"));
        int firstNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Enter %s number: ", "second"));
        int secondNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Enter %s number: ", "third"));
        int thirdNumber = ScannerNumberFormatter.getIntegerNumber(scanner);

        System.out.println((firstNumber + secondNumber + thirdNumber) / 3);
    }

    /**
     * 13. Write a Java program to print the area and perimeter of a areaAndPerimeterOfRectangle.
     * Test Data:
     * Width = 5.5 Height = 8.5
     * <p>
     * Expected Output:
     * Area is 5.6 * 8.5 = 47.60
     * Perimeter is 2 * (5.6 + 8.5) = 28.20
     */
    private static void areaAndPerimeterOfRectangle(Scanner scanner) {
        double width = ScannerNumberFormatter.getDoubleNumber(scanner);
        double height = ScannerNumberFormatter.getDoubleNumber(scanner);
        Shape shape = new Rectangle(width, height);
        System.out.println("Perimeter is = " + shape.getPerimeter());
        System.out.println("Area is = " + shape.getArea());
    }

    /**
     * 15. Write a Java program to swap two variables.
     */
    private static void swapVariables(Scanner scanner) {
        System.out.println("Enter first variable:");
        String first = scanner.next();
        System.out.println("Enter second variable:");
        String second = scanner.next();
        System.out.println("Before swap: first=" + first + " second=" + second);
        String temp = first;
        first = second;
        second = temp;
        System.out.println("After swap: first=" + first + " second=" + second);
    }

    /**
     * 17. Write a Java program to add two binary numbers.
     * Input Data:
     * Input first binary number: 10
     * Input second binary number: 11
     * <p>
     * Expected Output:
     * Sum of two binary numbers: 101
     */
    private static void addTwoBinaryNumbers(Scanner scanner) {
        System.out.println("Input first binary number: ");
        int firstNumber = Integer.parseInt(scanner.next(), 2);
        System.out.println("Input second binary number: ");
        int secondNumber = Integer.parseInt(scanner.next(), 2);
        int result = firstNumber + secondNumber;
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(result));
    }

    /**
     * 18. Write a Java program to multiply two binary numbers.
     * Input Data:
     * Input the first binary number: 10
     * Input the second binary number: 11
     * <p>
     * Expected Output:
     * Product of two binary numbers: 110
     */
    private static void multiplyTwoBinaryNumbers(Scanner scanner) {
        System.out.println("Input first binary number: ");
        int firstNumber = Integer.parseInt(scanner.next(), 2);
        System.out.println("Input second binary number: ");
        int secondNumber = Integer.parseInt(scanner.next(), 2);
        int result = firstNumber * secondNumber;
        System.out.println("Product of two binary numbers: " + Integer.toBinaryString(result));
    }

    /**
     * 32. Write a Java program to compare two numbers.
     * Input Data:
     * Input first integer: 25
     * Input second integer: 39
     * Expected Output:
     * 25 != 39
     * 25 < 39
     * 25 <= 39
     */
    private static void compareTwoNumbers(Scanner scanner) {
        System.out.println(String.format("Enter %s number: ", "first"));
        int firstNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Enter %s number: ", "second"));
        int secondNumber = ScannerNumberFormatter.getIntegerNumber(scanner);

        if (firstNumber != secondNumber) {
            System.out.println(String.format("%d != %d ", firstNumber, secondNumber));
        }

        if (firstNumber < secondNumber) {
            System.out.println(String.format("%d < %d ", firstNumber, secondNumber));
        }

        if (firstNumber <= secondNumber) {
            System.out.println(String.format("%d <= %d ", firstNumber, secondNumber));
        }

        if (firstNumber > secondNumber) {
            System.out.println(String.format("%d > %d ", firstNumber, secondNumber));
        }

        if (firstNumber >= secondNumber) {
            System.out.println(String.format("%d >= %d ", firstNumber, secondNumber));
        }

        if (firstNumber == secondNumber) {
            System.out.println(String.format("%d == %d ", firstNumber, secondNumber));
        }
    }

    /**
     * 33. Write a Java program and compute the sum of the digits of an integer.
     * Input Data:
     * Input an integer: 25
     * Expected Output:
     * The sum of the digits is: 7
     */
    private static void sumOfDigits(Scanner scanner) {
        System.out.println("Enter number: ");
        int number = ScannerNumberFormatter.getIntegerNumber(scanner);
        int sum = sumOfDigits(number);
        System.out.println("The sum of the digits is: " + sum);
    }

    /**
     * 34. Write a Java program to compute the area of a hexagon.
     * Area of a hexagon = (6 * s^2)/(4*tan(π/6))
     * where s is the length of a side
     * Input Data:
     * Input the length of a side of the hexagon: 6
     * <p>
     * Expected Output:
     * The area of the hexagon is: 93.53074360871938
     */
    private static void areaOfHexagon(Scanner scanner) {
        System.out.println("Enter hexagon length of a side");
        Shape shape = new Hexagon(getIntegerNumber(scanner));
        System.out.println(String.format("The area of the hexagon is: %s", shape.getArea()));
    }

    /**
     * 35. Write a Java program to compute the area of a polygon.
     * Area of a polygon = (n*s^2)/(4*tan(π/n))
     * where n is n-sided polygon and s is the length of a side
     * Input Data:
     * Input the number of sides on the polygon: 7
     * Input the length of one of the sides: 6
     * <p>
     * Expected Output:
     * The area is: 130.82084798405722
     */
    private static void areaOfPolygon(Scanner scanner) {
        System.out.println("Enter polygon length of a side:");
        int length = getIntegerNumber(scanner);
        System.out.println("Enter polygon nr of sides:");
        int nrOfSides = getIntegerNumber(scanner);
        Shape shape = new Polygon(length, nrOfSides);
        System.out.println(String.format("The area of a polygon is: %s", shape.getArea()));
    }

    /**
     * 36. Write a Java program to compute the distance between two points on the surface of earth.
     * Distance between the two points [ (x1,y1) & (x2,y2)]
     * d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
     * Radius of the earth r = 6371.01 Kilometers
     * Input Data:
     * Input the latitude of coordinate 1: 25
     * Input the longitude of coordinate 1: 35
     * Input the latitude of coordinate 2: 35.5
     * Input the longitude of coordinate 2: 25.5
     * <p>
     * Expected Output:
     * The distance between those points is: 1480.0848451069087 km
     */
    private static void distanceBetweenPoints(Scanner scanner) {
        System.out.println("Input the latitude of coordinate 1:");
        double latitude1 = getDoubleNumber(scanner);
        System.out.println("Input the longitude of coordinate 1:");
        double longitude1 = getDoubleNumber(scanner);
        System.out.println("Input the latitude of coordinate 2:");
        double latitude2 = getDoubleNumber(scanner);
        System.out.println("Input the longitude of coordinate 2:");
        double longitude2 = getDoubleNumber(scanner);
        System.out.println(String.format("The distance between those points is: %s",
                1 * Math.acos((Math.sin(latitude1) * Math.sin(latitude2) + Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2)))));
    }


    /**
     * 39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many
     * three-digit numbers are there.
     * Expected Output:
     * 123
     * 124
     * ...
     * 431
     * 432
     * Total number of the three-digit-number is 24
     */
    private static void displayThreeDigitUniqueNumbers() {
        int countNumbers = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        countNumbers++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is " + countNumbers);
    }

    /**
     * 44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
     * Sample Output:
     * <p>
     * Input number: 5
     * 5 + 55  + 555
     */
    private static void generateExpression(Scanner scanner) {
        System.out.println("Input number:");
        int number = getIntegerNumber(scanner);
        System.out.println(String.format("%d + %d%d + %d%d%d", number, number, number, number, number, number));
    }

    /**
     * 45. Write a Java program to find the size of a specified file.
     * Sample Output:
     * <p>
     * /home/students/abc.txt  : 0 bytes
     * /home/students/test.txt : 0 bytes
     *
     * @param path file
     */
    private static void printFileSize(String path) {
        File file = new File(path);
        System.out.println(String.format("%s : %d", path, file.length()));
    }

    /**
     * 46. Write a Java program to display the system time.
     * Sample Output:
     * <p>
     * Current Date time: Fri Jun 16 14:17:40 IST 2017
     */
    private static void printSystemTime() {
        System.out.println(String.format("Current Date time: %tc%n \n", System.currentTimeMillis()));
    }

    /**
     * 47. Write a Java program to display the current date time in specific format.
     * Sample Output:
     * <p>
     * Now: 2017/06/16 08:52:03.066
     */
    private static void printCurrentDateTimeFormated() {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        formater.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GTM")));
        System.out.println(String.format("Now: %s%n \n", formater.format(System.currentTimeMillis())));
    }

    /**
     * 48. Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.
     * Sample Output:
     * <p>
     * 1
     * 3
     * 5
     * 7
     * 9
     * 11
     * ....
     * 91
     * 93
     * 95
     * 97
     * 99
     */
    private static void printOddNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * 49. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even
     * or 0 if the number is odd.
     * Sample Output:
     * <p>
     * Input a number: 20
     * 1
     */
    private static void printCheckEvenNumber(Scanner scanner) {
        System.out.println("Input number:");
        int number = getIntegerNumber(scanner);
        if (number % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    /**
     * 50. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
     * Sample Output:
     * <p>
     * Divided by 3:
     * 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
     * , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,
     * <p>
     * Divided by 5:
     * 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
     * 95,
     * <p>
     * Divided by 3 & 5:
     * 15, 30, 45, 60, 75, 90,
     */
    private static void printDivisibleNumbers() {
        System.out.println("Divided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) System.out.print(i + ", ");
        }

        System.out.println("\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) System.out.print(i + ", ");
        }

        System.out.println("\nDivided by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.print(i + ", ");
        }
        System.out.println("\n");
    }

    /**
     * 52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third
     * integer.
     * Sample Output:
     * <p>
     * Input the first number : 5
     * Input the second number: 10
     * Input the third number : 15
     * The result is: true
     *
     * @param scanner
     */
    private static void calculateSumOfTwoAndValidateWithThird(Scanner scanner) {
        System.out.println(String.format("Input the %s number: ", "first"));
        int firstNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Input the %s number: ", "second"));
        int secondNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Input the %s number: ", "third"));
        int thirdNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("The result is: %s ", isSumOfTwoEqualWithThird(firstNumber, secondNumber, thirdNumber)));
    }

    /**
     * Sum of two compared with third
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static boolean isSumOfTwoEqualWithThird(int a, int b, int c) {
        return ((a + b) == c || (a + c) == b || (b + c) == a);
    }

    /**
     * 53. Write a Java program that accepts three integers from the user and return true if the second number is
     * greater than first number and third number is greater than second number. If "abc" is true second number does
     * not need to be greater than first number.
     * Sample Output:
     *
     * Input the first number : 5
     * Input the second number: 10
     * Input the third number : 15
     * The result is: true
     *
     * @param scanner
     */
    private static void printCompareThreeNumbers(Scanner scanner){
        System.out.println(String.format("Input the %s number: ", "first"));
        int firstNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Input the %s number: ", "second"));
        int secondNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Input the %s number: ", "third"));
        int thirdNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("The result is: %s ", compareThreeNumbers(firstNumber, secondNumber, thirdNumber) ));
    }

    private static boolean compareThreeNumbers(int first, int second, int third) {
        return (second > first) && (third > second) ? true : false;
    }

    /**
     * 54. Write a Java program that accepts three integers from the user and return true if two or more of them
     * (integers ) have the same rightmost digit. The integers are non-negative.
     * Sample Output:
     *
     * Input the first number : 5
     * Input the second number: 10
     * Input the third number : 15
     * The result is: true
     *
     * @param scanner
     */
    private static void printTwoOrMoreHaveSameLastDigit(Scanner scanner) {
        System.out.println(String.format("Input the %s number: ", "first"));
        int firstNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Input the %s number: ", "second"));
        int secondNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Input the %s number: ", "third"));
        int thirdNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("The result is: %s ", haveSameLastDigit(firstNumber, secondNumber, thirdNumber) ));
    }

    private static boolean haveSameLastDigit(int first, int second, int third) {
        return (first % 10 == second % 10) || (second % 10 == third % 10) || (first % 10 == third % 10);
    }

    /**
     * 56. Write a Java program to find the number of integers within the range of two specified numbers and that are
     * divisible by another number.
     * For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p
     * i.e. { i :x ≤ i ≤ y, i mod p = 0 }
     * Sample Output:
     *
     * 5
     *
     * @param scanner
     */
    private static void printNumbersWithinRangeDivisibleByAnother(Scanner scanner) {
        System.out.println("Input the starting number: ");
        int startIndex = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println("Input the ending number: ");
        int endIndex = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println("Input divisible by: ");
        int divisibleNumber = ScannerNumberFormatter.getIntegerNumber(scanner);
        int countNumbers = 0;
        for (int index=startIndex; index<=endIndex; index++) {
            if (index % divisibleNumber != 0) continue;
            countNumbers++;
        }
        System.out.println(String.format("The number of integers within the range %d..%d and that are divisible by % is: %d",
                startIndex,
                endIndex,
                divisibleNumber,
                countNumbers));
    }

    /**
     * 57. Write a Java program to accepts an integer and count the factors of the number.
     * Sample Output:
     *
     * Input an integer: 25
     * 3
     */
    private static void printCountFactors(Scanner scanner) {
        System.out.println("Input number: ");
        int number = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Number of factor is : %d", countFactors(number)));
    }

    private static int countFactors(int number) {
        int count = 0;
        int i= 1;
        while (i < number) {
            if(number % i == 0) count++;
            i++;
        }
        return count;
    }

    /**
     * 62. Write a Java program that accepts three integer values and return true if one of them is 20 or more less than
     * one of the others.
     * Sample Output:
     *
     * Input the first number : 15
     * Input the second number: 20
     * Input the third number : 25
     * false
     */
    private static void printIsGreaterThan20(Scanner scanner) {
        System.out.print("Input the first number : ");
        int first = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.print("Input the second number: ");
        int second = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.print("Input the third number : ");
        int third = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println((Math.abs(first - second) >= 20 || Math.abs(second - third) >= 20 || Math.abs(third - first) >= 20));
    }

    /**
     * 63. Write a Java program that accepts two integer values from the user and return the larger values. However if
     * the two values are the same, return 0 and return the smaller value if the two values have the same remainder
     * when divided by 6.
     * Sample Output:
     *
     * Input the first number : 12
     * Input the second number: 13
     * Result: 13
     */
    private static void printCompared(Scanner scanner) {
        System.out.print("Input the first number : ");
        int first = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.print("Input the second number: ");
        int second = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Result : %d", compare(first, second)));
    }

    private static int compare(int first, int second) {
        if (first == second) return 0;
        if (first % 6 == second % 6) return first > second ? second : first;
        return first > second ? first : second;
    }

    /**
     * 64. Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common
     * digit in both numbers.
     * Sample Output:
     *
     * Input the first number : 35
     * Input the second number: 45
     * Result: true
     */
    private static void printHaveCommonDigit(Scanner scanner){
        System.out.print("Input the first number : ");
        int first = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.print("Input the second number: ");
        int second = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.println(String.format("Result : %s", haveCommonDigit(first, second)));
    }

    private static boolean haveCommonDigit(int first, int second) {
        if (first > 25 || second > 75) return false;
        int firstDigit1 = first % 10;
        int firstDigit2 = second % 10;
        int secondDigit1 = first / 10;
        int secondDigit2 = second / 10;
        return (firstDigit1 == firstDigit2 || secondDigit1 == secondDigit2 || firstDigit1 == secondDigit2 || firstDigit2 == secondDigit1);
    }

    /**
     * 65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
     * Sample Output:
     *
     * Input the first number : 19
     * Input the second number: 7
     * 5
     */
    private static void printCalculateModules(Scanner scanner) {
        System.out.print("Input the first number : ");
        int first = ScannerNumberFormatter.getIntegerNumber(scanner);
        System.out.print("Input the second number: ");
        int second = ScannerNumberFormatter.getIntegerNumber(scanner);
        int divided = first / second;
        int result = first - (divided * second);
        System.out.println(result);
    }

    /**
     * 66. Write a Java program to compute the sum of the first 100 prime numbers.
     * Sample Output:
     *
     * Sum of the first 100 prime numbers: 24133
     */
    private static void calculateSumOfPrimeNumbers() {
        int counter = 2;
        int sum = 0;
        while(counter < 100) {
            if (isPrimeNumber(counter)) sum += counter;
            counter++;
        }
        System.out.println(String.format("Result : %s", sum));
    }

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i <= (int) Math.floor(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 86. Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is
     * odd, repeat the process until n = 1.
     */
    private static void processNumber(Scanner scanner) {
        System.out.print("Input the number : ");
        int number = ScannerNumberFormatter.getIntegerNumber(scanner);
        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
               number = number * 3 + 1;
            }
        }
    }

    /**
     * 87. Write a Java program than read an integer and calculate the sum of its digits and write the number of each
     * digit of the sum in English.
     */
    private static void printSumOfDigits(Scanner scanner) {
        System.out.print("Input the number : ");
        int number = ScannerNumberFormatter.getIntegerNumber(scanner);
        int sumOfDigits = sumOfDigits(number);
        System.out.println(String.format("Sum of the digits of the said number: %d . In English: %s",
                number, convertNumberToString(sumOfDigits)));
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    private static String convertNumberToString(int number) {
        String covert = String.valueOf(number);
        StringBuilder builder = new StringBuilder();
        Map<Integer, String> numbers = getNumbers();
        for (Character c : covert.toCharArray()) {
            builder.append(numbers.get(Character.getNumericValue(c)));
            builder.append(" ");
        }
        return builder.toString();
    }
    private static Map<Integer, String> getNumbers() {
        return new HashMap<Integer, String>() {{
            put(0, "zero");
            put(1, "one");
            put(2, "two");
            put(3, "three");
            put(4, "four");
            put(5,"five");
            put(6, "six");
            put(7, "seven");
            put(8,"eight");
            put (9,"nine");
        }};
    }

    /**
     *
     * 88. Write a Java program to get the current system environment and system properties. 
     */

    /**
     * 89. Write a Java program to check whether a security manager has already been established for the current
     * application or not.
     */

    /**
     * 90. Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME. 
     */

    /**
     * 91. Write a Java program to measure how long some code takes to execute in nanoseconds. 
     */

    /**
     * 108. Write a Java program to add all the digits of a given positive integer until the result has a single digit. 
     */

    /**
     * 109. Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins. 
     */

    /**
     * 110. Write a Java program to check whether an given integer is a power of 4 or not. 
     * Given num = 64, return true. Given num = 6, return false.
     */

    /**
     * 111. Write a Java program to add two numbers without using any arithmetic operators. 
     * Given x = 10 and y = 12; result = 22
     */

    /**
     * 112. Write a Java program to compute the number of trailing zeros in a factorial. 
     * 7! = 5040, therefore the output should be 1
     */

    /**
     * 115. Write a Java program to check if a positive number is a palindrome or not. 
     * Input a positive integer: 151
     * Is 151 is a palindrome number?
     * true
     */

    /**
     * 116. Write a Java program which iterates the integers from 1 to 100. For multiples of three print "Fizz" instead
     * of the number and print "Buzz" for the multiples of five. When number is divided by both three and five, print
     * "fizz buzz".
     */

    /**
     * 117. Write a Java program to compute the square root of an given integer. 
     * Input a positive integer: 25
     * Square root of 25 is: 5
     */


    /**
     * 121. Write a Java program to reverse a given linked list. 
     * Example: For linked list 20->40->60->80, the reversed linked list is 80->60->40->20
     */


    /**
     * 125. Write a Java program to get the preorder traversal of its nodes' values of a given a binary tree. 
     * Example:
     *     10
     *    / \
     *   20   30
     *  / \
     * 40   50
     * Expected output: 10 20 40 50 30
     */

    /**
     * 126. Write a Java program to get the inorder traversal of its nodes' values of a given a binary tree. 
     *     10
     *    / \
     *   20   30
     *  / \
     * 40   50
     * Example:{10, 20, 30, 40, 50}
     * Output: 40 20 50 10 30
     */

    /**
     * 127. Write a Java program to get the Postorder traversal of its nodes' values of a given a binary tree. 
     *     10
     *    / \
     *   20   30
     *  / \
     * 40   50
     */

    /**
     * 130. Write a Java program to find the maximum depth of a given a binary tree. 
     * Sample Output: The Maximum depth of the binary tree is: 3
     */

    /**
     * 133. Write a Java program to find a path from top left to bottom in right direction which minimizes the sum of
     * all numbers along its path.
     * Note: Move either down or right at any point in time.
     * Sample Output: Sum of all numbers along its path: 13
     */

    /**
     * 134. Write a Java program to find the distinct ways you can climb to the top (n steps to reach to the top) of
     * stairs. Each time you can either climb 1 or 2 steps.
     * Example: n = 5
     * a) 1+1+1+1+1 = 5 b) 1+1+1+2 = 5 c) 1+2+2 = 5 d) 2+2+1 = 5 e) 2+1+1+1 = 5 f) 2+1+2 = 5 g) 1+2+1+1 = 5 h) 1+1+2+1 = 5
     * Sample Output: Distinct ways can you climb to the top: 8
     */

    /**
     * 135. Write a Java program to remove duplicates from a sorted linked list. 
     * Original List with duplicate elements:
     * 12->12->13->14->15->15->16->17->17
     * After removing duplicates from the said list:
     * 12->13->14->15->16->17
     */

    /**
     * 140. Write a Java program to merge all overlapping Intervals from a given a collection of intervals. 
     * Sample Output: 1 6
     * 8 10
     * 15 20
     */


    /**
     * 143. Write a Java program to merge two given sorted lists. 
     * Sample Output:
     * Merge Two Sorted ListsT:
     * 1 2 3 7 9 13 40
     */

    /**
     * 145. Write a Java program to remove the nth element from the end of a given list. 
     * Sample Output:
     * Original node:
     * 1 2 3 4 5
     * After removing 2nd element from end:
     * 1 2 3 5
     */


    /**
     * 147. Write a Java program to find the number of bits required to flip to convert two given integers. 
     * Sample Output:
     * 2
     */


    /**
     * 150. Write a Java program to test if a binary tree is a subtree of another binary tree. 
     * Sample Output:
     * Original strings: xxyz yxzx
     * true
     */
}
