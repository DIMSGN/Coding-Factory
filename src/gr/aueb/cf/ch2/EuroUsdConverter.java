package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 * Διαβαζει απο το χρηστη ενα ποσο
 * σε ευρω και το μετατρεπει σε usd και cents.
 * Η ισοτιμια ειναι 99 usd cents = 1Euro.
 * Eκτυπωνει το αποτελεσμα.
 */
public class EuroUsdConverter {

    public static void main(String[] args) {

        //Δηλωση και αρχικοποιηση μεταβλητων

        int inputEuros = 0;
        int totalUsdCent = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;
        final int USA_CENTS_PER_EURO = 100;
        Scanner in = new Scanner(System.in);

        //Εντολες
        System.out.println("Παρακαλω εισαγετε ενα ποσο σε Euro (ακεραιο):");
        inputEuros = in.nextInt();

        totalUsdCent = inputEuros * PARITY;
        usaDollars = totalUsdCent / USA_CENTS_PER_EURO;
        usaCents = totalUsdCent % USA_CENTS_PER_EURO;

        System.out.printf("%d \u20AC =%d \u0024, %d usa cents", inputEuros, usaDollars, usaCents);
    }
}
