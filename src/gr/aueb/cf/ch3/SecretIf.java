package gr.aueb.cf.ch3;

import javax.crypto.spec.PSource;
import java.util.Scanner;

/**
 * Ο χρηστής εισάγει ενα ακέραιο και προσπαθεί να μαντέψει ενα secret num.
 * Αν τον μαντέψει τότε κάνει Bingo!
 */

public class SecretIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int SECRET = 10;
        int inputNum;

        System.out.println("Παρακαλώ εισάγετε το μυστικό κλειδί");
        inputNum = scanner.nextInt();

        if (inputNum == SECRET) {
            System.out.println("BINGO!");
        }
    }
}
