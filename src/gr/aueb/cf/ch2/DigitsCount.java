package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρηστης δινει εναν διψηφιο ακεραιο και
 * το προγραμμα υπολογιζει το αθροισμα των ψηφιων .
*/
public class DigitsCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int sumOfDigits = 0;
        int inputNum = 0;

        System.out.println("Παρακαλω εισαγετε εναν διψηφιο ακεραιο :");

        inputNum = scanner.nextInt();

        leftDigit = inputNum / 10;
        rightDigit = inputNum % 10;
        sumOfDigits = leftDigit + rightDigit;

        System.out.printf("Input number: %d, Left digit: %d, Right digit: %d, Sum of digits: %d",
               inputNum, leftDigit, rightDigit, sumOfDigits );
    }
}
