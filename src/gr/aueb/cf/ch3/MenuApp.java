package gr.aueb.cf.ch3;

import java.util.Scanner;

/**Εμφανίζει εξακολουθητικά ενα μενού επιλογέων
 * μέχρι ο χρήστης να δώσει 'έξοδο'.
 */

public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 3;


        do {
            System.out.println("Επιλέξτε ενα απο τα παρακάτω: ");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Ενημέρωση");
            System.out.println("3. Διαγραφή");
            System.out.println("4. Αναζήτηση");
            System.out.println("Έξοδος");
            choice = scanner.nextInt();
        } while (choice != EXIT);

        System.out.println("Ευχαριστούμε");
    }
}
