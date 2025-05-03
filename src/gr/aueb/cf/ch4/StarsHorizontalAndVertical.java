package gr.aueb.cf.ch4;

/**
 * Print 10 stars horizontal.
 */

public class StarsHorizontalAndVertical {
    public static void main(String[] args) {
        char star = '*';

        for (int i = 1; i <= 10; i++) {
            System.out.print(star);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(star);
        }
    }
}
