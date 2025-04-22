package gr.aueb.cf.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Θα εκφράσουμε τη λογική του if-then-else
 * με linear τρόπο ελέγχοντας στην αρχή του κωδικά
 * τα failure/error conditions.
 */

public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        final int SECRET_KEY = 12;

        System.out.println("Παρακαλώ εισάγετε ενα ακέραιο ");
        num = scanner.nextInt();

        if (num != SECRET_KEY) {
            System.out.println("Secret not found.");
            System.exit(1);
        }

        System.out.println("Bingo!");
    }
}
