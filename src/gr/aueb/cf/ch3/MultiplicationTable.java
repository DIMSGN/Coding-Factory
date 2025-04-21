package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρηστής δίνει ενα ακέραιο απο 1-10
 * και ως output υπολογίζεται ο πολλαπλασιασμός
 * του ακεραίου με όλους τους ακέραιους απο το 1-10.
 * Για παράδειγμα, αν ο χρηστής δώσει το 5 τότε ως
 * output αναμένουμε να πάρουμε:
 * 5 * 1 = 5
 * 5 * 2 = 10
 * 5 * 3 = 15
 * 5 * 4 = 20
 * …
 * …
 * 5 * 10 = 50
 *
 *
 */

public class MultiplicationTable {
    public static void main(String[] args) {

        int userInput = 0;
        int i = 1;
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Παρακαλώ εισάγετε έναν ακέραιο :");
        userInput = scanner.nextInt();

        while (i <= 10) {
            result = userInput * i;
            System.out.printf("%d * %d = %d \n", userInput, i, result);
            //System.out.println(userInput + " * " +  i + " = " + result);
            i++;
        }
    }
}
