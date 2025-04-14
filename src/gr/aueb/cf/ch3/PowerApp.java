package gr.aueb.cf.ch3;
import java.util.Scanner;
/**
 * Λαμβανει απο το χρηστη δυο ακεραιους εστω
 * base και power και υπολογιζει με επαναληπτικο τροπο
 * (while-do) τη δυναμη base^power και εκτυπωνει το αποτελεσμα στο standar output
 * για παραδειγμα αν ο χρηστης δωσει base = 2 και power = 10 τοτε το
 * base^power = 1024
 * δηλαδη
 *
 */
public class PowerApp {
    public static void main(String[] args) {
        //declare
        int inputPower = 0;
        int inputBase = 0;
        int i = 1;
        int result = 1;
        Scanner scanner = new Scanner(System.in);

        //user input
        System.out.print("Εισάγετε τιμή base: ");
        inputBase = scanner.nextInt();
        System.out.print("Εισάγετε τιμή power: ");
        inputPower = scanner.nextInt();

        //while do
        while (i <= inputPower) {
            result *= inputBase;
            i++;
        }
        //Print the result
        System.out.printf("Το %d υψωμένο στο %d ειναι : %d", inputBase, inputPower, result);
    }
}
