package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγωγικό του n οπού n
 * είναι ένας ακέραιος που δίνει ο χρηστής.
 * Το παραγοντικό του η συμβολίζει ως n! Και
 * ισούται με 1 * 2 * 3 * … * n. Για παράδειγμα,
 * το 3! = 1 * 2 * 3, το 0! - 1 κλπ
 */

public class Factorial {
    public static void main(String[] args) {
        // declare
        int factorialN = 0;
        int i = 1;
        int result = 1;
        Scanner scanner = new Scanner(System.in);

        // user input
        System.out.println("Εισάγετε ακέραιο : ");
        factorialN = scanner.nextInt();

        //while do
        while (i <= factorialN) {
            result *= i;
            i++;
        }

        //Print result
        System.out.printf("Το παραγοντικό του %d είναι %d", factorialN, result);
    }
}
