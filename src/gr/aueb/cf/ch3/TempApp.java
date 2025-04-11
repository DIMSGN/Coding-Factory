package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβανει μια θερμοκρασια απο τον χρηστη
 * και εμφανιζει καταλληλο μηνυμα αν η θερμοκρασια
 * ειναι κατω απο το μηδεν (0).
 */

public class TempApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean isTempBellowZero = false;

        System.out.print("Παρακαλώ εισάγεται μια θερμοκρασία: ");
        temp = scanner.nextInt();

        isTempBellowZero = temp < 0;

        System.out.println("Η θερμοκρασια ειναι κατω απο το μηδεν: " + isTempBellowZero);
    }
}
