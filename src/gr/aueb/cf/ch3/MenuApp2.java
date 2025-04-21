package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υλοποιεί ενα μενού με επιλογές και να ελέγχει την επιλογή
 * με if-then-else
 */

public class MenuApp2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while(true) {
            System.out.println("Επιλέξτε ενα απο τα παρακάτω: ");
            System.out.println("Εισαγωγή");
            System.out.println("Ενημέρωση");
            System.out.println("Διαγραφή");
            System.out.println("Αναζήτηση");
            System.out.println("Έξοδος");

            choice = scanner.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Λάθος επιλογή");
                continue;
            }
            if (choice  == 5) {
                System.out.println("Ευχαριστούμε");
                break;
            }
            if (choice == 1) {
                System.out.println("Η εισαγωγή έγινε επιτυχώς.");
            } else if (choice == 2) {
                System.out.println("Η ενημέρωση έγινε επιτυχώς.");
            } else if(choice == 3) {
                System.out.println("Η διαγραφή έγινε επιτυχώς.");
            } else {
                System.out.println("Η αναζήτηση έγινε επιτυχώς.");
            }
        }
    }
}
