package gr.aueb.cf.ch2;
/**
 * Προσομειώνει ένα τυχαίο ζάρι. Δηλαδή παράγει
 * ένα τυχαίο ακέραιο μεταξύ 1 - 6.
 */
public class RandomApp {

    public static void main(String[] args) {
        int die = 0;

        die = (int) (Math.random() * 6) +1;

        System.out.println(die);
    }
}
