package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το άθροισμα των 10 πρώτων ακεραίων
 * απο το 1 εως το 10.
 */

public class SumMul10App {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

        int mul = 1;
        int j = 1;

        while(i <= 10) {
            sum += i;
            i++;
            System.out.println(sum);


        }
        while(j <= 10) {
            mul *= j;
            j++;
            System.out.println(mul);
        }
    }
}
