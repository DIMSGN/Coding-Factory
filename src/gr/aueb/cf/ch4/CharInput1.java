package gr.aueb.cf.ch4;

import java.io.IOException;

/**
 * Char input as byte (latin).
 */

public class CharInput1 {

    public static void main(String[] args) throws IOException {
        int inputChar = ' ';

        System.out.println("Εισάγετε ενα χαρακτήρα: ");
        inputChar = System.in.read();
        System.out.println("char: " + (char)inputChar);
    }
}
