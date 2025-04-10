package gr.aueb.cf.ch2;

import java.util.Scanner;

/** Ο χρηστης εισαγει μια τιμη και το προγραμμα
 * υπολογιζει την τιμη με το ΦΠΑ . πχ αν ο ΦΠΑ ειναι 24%.
 * και ο χρηστης δωσει τιμη 100
 * το αποτελεσμα θα ειναι 124.
 */

public class PriceWithVat {

    public static void main(String[] args) {

        //Δηλωση και αρχικοποιηση μεταβλητων.
        double inputPrice = 0.0;
        double priceWithVat = 0.0;
        double computedVat = 0.0;
        final double VAT_RATE = 0.24;
        Scanner scanner = new Scanner(System.in);

        //Εντολες
        System.out.println("Παρακαλω εισαγετε τιμη: ");

        inputPrice = scanner.nextDouble();
        computedVat = inputPrice * VAT_RATE;
        priceWithVat = inputPrice + computedVat;
        System.out.printf("Η τιμη με ΦΠΑ ειναι: %.2f", priceWithVat);
    }
}
