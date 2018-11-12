package base_part1;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerNumberFormatter {
    public static int getIntegerNumber(Scanner scanner) {
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException ime) {
            ime.printStackTrace();
        } catch (NoSuchElementException nsee) {
            nsee.printStackTrace();
        } catch (IllegalStateException ise) {
            ise.printStackTrace();
        }
        return number;
    }

    public static double getDoubleNumber(Scanner scanner) {
        double result = 0d;
        try {
            result = Double.valueOf(scanner.next());
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            result = 0d;
        }
        return result;
    }

}