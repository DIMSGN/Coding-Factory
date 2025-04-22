package gr.aueb.cf.ch3;

import gr.aueb.cf.ch2.DigitsCount;

import java.util.Scanner;

/**
 * Ο χρηστής δίνει ενα ακέραιο. Το πρόγραμμα υπολογίζει
 * το πλήθος των ψηφίων του ακέραιον και το άθροισμα
 * των ψηφίων.για παράδειγμα αν χρηστής
 * εισάγει τον ακέραιο 12345 τότε το πλήθος των ψηφίων είναι 5 και τοο άθροισμα είναι
 * 1 + 2 + 3 + 4 + 5 = 15.
 */

public class DigitCountAndSum {
    public static void main(String[] args) {
        int num = 0;
        int digitCount = 0;
        int digitSum = 0;
        int tempNum;
        int rightDigit;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Παρακαλώ εισάγετε έναν ακέραιο ");
        num = scanner.nextInt();
        tempNum = num;
        do {
            rightDigit = tempNum % 10;
            digitCount++;
            digitSum += rightDigit;
            tempNum /= 10;

        } while (tempNum != 0);
        System.out.printf("Digit Count: %d , Digit-Sum: %d, ", digitCount, digitSum);
    }
}
