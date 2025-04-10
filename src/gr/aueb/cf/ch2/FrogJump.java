package gr.aueb.cf.ch2;

/**
 * Calculates the minimum number of jumps a frog needs
 * to reach or pass a target position.
 */
public class FrogJump {

    public static void main(String[] args) {
        // declare and set frog starting position
        int start = 10;

        // declare and set target position (must reach or pass this)
        int target = 85;

        // Distance per jump
        int hop = 30;

        // Declare jumps (calculate later)
        int jumps = 0;

        // Calculate and print the number of jumps needed
        jumps = (int) Math.ceil ((target - start) / (double) hop);
        System.out.println("Jumps needed: " + jumps);
    }
}