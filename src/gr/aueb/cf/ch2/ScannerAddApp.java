package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 * Διαβαζει το stdin και υπολογιζει το αποτελεσμα
 */
public class ScannerAddApp {

    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση μεταβλητων
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        //Εντολες
        System.out.println("Παρακαλώ εισάγετε δυο ακεραίους: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        //Eκτυπωση αποτελεσματων
        System.out.printf("Το αθροισμα των %d και %d ειναι ισο με %d", num1, num2, sum);
    }
}
