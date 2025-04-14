package gr.aueb.cf.ch3;

/**
 * Υπολογιζει το αθροισμα των 10 πρωτων ακεραιων
 * , απο το 1 εως το 10 .
 */

public class SumMul10App {
    public static void main(String[] args) {

        int sum= 0;
        int i = 0;

        int mul = 1;
        int j = 1;

        while(i < 10) {
            sum += i;
            i++;

            //System.out.println(i);
        }
        while(j <= 10) {
            sum *= j;
            System.out.println(j);
            j++;


        }

    }
}
