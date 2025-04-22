package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Υπολογιζει το base^power με επαναληπτικη
 * for. Διαβαζει τα base, power απο το χρηστη και εκτυπωνει τα αποτελεσματα
 */
public class PowerApp {
    public static void main(String[] args) {
        // declare
        int power = 0;
        int base = 0;
        int result = 1;
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.println("Εισαγετε βαση :");
        base = scanner.nextInt();
        System.out.println("Εισαγετε δυναμη :");
        power = scanner.nextInt();
        // for loop
        for (int i = 1; i <= power; i++){
            result *= base;
        }
        //print result
        System.out.printf("%d^%d = %d\n", base, power, result);

    }
}
