package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρηστης δινει την ηλικια του σε ετη (ακεραιος)και
 * την επιστεφει σε ημερες οπου θεωρουμαι οτι
 * ενα ετος = 365 ημερες.πχ αν δωθει ηλικια 20 ετων το αποτελεσμα ειναι
 * 7300 ημερες .
 */

public class YearsToDays {

    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση
        int inputAge = 0;
        final int DAYS_OF_YEAR = 365;
        int ageToDays = 0;

        //Εντολες
        Scanner scanner = new Scanner(System.in);
        System.out.println("Εισαγετε την ηλικια σας σε ετη:");
        inputAge = scanner.nextInt();
        ageToDays = inputAge * DAYS_OF_YEAR;

        //Εκτυπωση αποτελεσματος
        System.out.printf("Η ηλικια σας (%d έτη) ειναι %d μερες", inputAge, ageToDays);

    }
}
