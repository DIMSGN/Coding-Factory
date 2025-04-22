package gr.aueb.cf.ch3;

import java.util.Scanner;

/**Ελεγχει ολες τις περιπτωσεις με if-else
 *
 */

public class SecretIf2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int SECRET = 10;
        int inputNum;

        System.out.println("Παρακαλώ εισάγετε το μυστικό κλειδί");
        inputNum = scanner.nextInt();

        if (inputNum == SECRET) {
            System.out.println("BINGO!");
        } else {
            System.out.println("Fail. Try again.");
        }
    }
}
