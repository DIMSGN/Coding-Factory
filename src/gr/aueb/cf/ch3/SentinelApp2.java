package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Σύντομος κώδικας για την εισαγωγή απο
 * τον χρηστή ακεραίων μέχρι να βρεθεί το -1
 */

public class SentinelApp2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0 ;
        int iterations = 0;

        System.out.print("Παρακαλώ εισάγετε ακεραίους (-1 για έξοδο) : ");
//        num = scanner.nextInt();

        while ((num = scanner.nextInt()) != -1) {
            iterations++;
            System.out.print("Παρακαλώ δώστε τον επόμενο ακέραιο (-1 για έξοδο ): ");
//            num = scanner.nextInt();
        }
        System.out.printf("%d επαναλήψεις", iterations);
    }
}
