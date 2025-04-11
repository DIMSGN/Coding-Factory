package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * O χρηστης εισαγει 1) αν βρεχει και 2) τη θερμοκρασια
 * και το προγραμμα αποφασιζει  αν χιονιζει με βαση τη λογικη συνθηκη
 * πως χιονιζει αν και βρεχει και η θερμοκρασια ειναι κατω απο το 0.
 */

public class SnowingApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isRaining =false;
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Παρακαλω εισαγετε αν βρεχει (true/false)");

        isRaining = scanner.nextBoolean();

        System.out.println("Παρακαλω εισαγετε την θερμοκρασια");
        temp = scanner.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is Snowing " + isSnowing);
    }
}
