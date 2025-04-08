package gr.aueb.cf.ch2;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Μετατρέπει μίλια σε χλμ, οπου 1 μιλι = 1,6 χλμ.
 * Αρα, 10 μιλια ειναι 16 χλμ.
 */

public class MilesToKm {

    public static void main(String[] args) {

        //Δηλωση και αρχικοποιηση μεταβλητων.
        Scanner scanner = new Scanner(System.in);
        double inputMiles  = 0.0;
        double kilometers = 0.0;
        final double KM_PER_MILE = 1.6;

        //Εντολες
        System.out.println("Εισάγετε μια τιμή σε μίλια: ");
        inputMiles = scanner.nextDouble();
        kilometers = inputMiles * KM_PER_MILE;

        //Εκτυπωση αποτελεσματος
        System.out.printf("Τα " + inputMiles + " μιλια ειναι " + kilometers + " χιλιομετρα");
    }
}
