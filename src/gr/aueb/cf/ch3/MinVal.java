package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει τη μικρότερη τιμή μεταξύ δύο ακεραίων.
 */

public class MinVal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int min;

        System.out.println("Παρακαλώ δώστε δυο ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

//        if (num1 < num2) {
//            min = num1;
//        } else {
//            min = num2;
//        }
        min = (num1 < num2) ? num1 : num2;

        System.out.printf("Η μικρότερη τιμή μεταξύ %d και %d ειναι %d", num1, num2, min);
    }

}
