package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει μια θερμοκρασία απο τον χρηστή
 * και εμφανίζει κατάλληλο μήνυμα αν η θερμοκρασία
 * είναι κάτω απο το μηδέν (0).
 */

public class TempApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero = false;

        System.out.print("Παρακαλώ εισάγετε μια θερμοκρασία: ");
        temp = scanner.nextInt();

        isTempBelowZero = temp < 0;

        if (isTempBelowZero) {
            System.out.println("Η θερμοκρασία είναι κάτω απο το μηδέν");
        }else if (temp == 0) {
            System.out.println("Η θερμοκρασία είναι μηδέν");
        }else {
            System.out.println("Η θερμοκρασία είναι πάνω απο το μηδέν");
        }
    }
}
