package gr.aueb.cf.ch3;
import java.util.Scanner;
/**
 * Λαμβάνει απο το χρηστή δυο ακεραίους έστω
 * base και power και υπολογίζει με επαναληπτικό τρόπο
 * (while-do) τη δύναμη base^power και εκτυπώνει το αποτέλεσμα στο standard output
 * για παράδειγμα αν ο χρηστής δώσει base = 2 και power = 10 τότε το
 * base^power = 1024
 * δηλαδή 2 * 2 * 2 * … * 2, 10 φορές που ισούται με 1024.
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
        System.out.printf("Το %d υψωμένο στο %d είναι : %d", inputBase, inputPower, result);
    }
}
