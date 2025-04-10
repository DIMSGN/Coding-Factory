package gr.aueb.cf.ch2;
/**
 * Typecast demo.
 */
public class TypeCastApp {
    public static void main(String[] args) {
        int num1 =10;
        long num2 = 20L; // TYPE SUFFIX

        num1 = (int) num2; // ειναι error prone γιατι αν χρειαζεται ο long τοτε θα κοπει σε int
    }
}
