package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετράει το πλήθος των θετικών ακεραίων που δίνει ο χρήστης
 * (και 0).
 */

public class PositivesCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.print("Παρακαλώ δώστε μια ακολουθία συνεχόμενων θετικών ακεραίων : ");
        num = scanner.nextInt();

        while (num >= 0){
            positivesCount++;
            System.out.print("Δώστε τον επόμενο ακέραιο : ");
            num = scanner.nextInt();

        }
        System.out.println("Positives count: " + positivesCount);
    }
}
