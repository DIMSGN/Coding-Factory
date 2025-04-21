package gr.aueb.cf.ch4;

/**
 * Υπολογιζει το αθροισμα και το γινομενο των 10 πρωτων ακεραιων.
 */

public class SumMulApp {

    public static void main(String[] args) {

        int sum = 0;
        int mul = 1;

        for(int i = 1; i <= 10; i++){
            sum += i;
            mul *= i;

            System.out.printf("Sum is :%d\n", sum);
            System.out.println("Mul is : " + mul);
        }
    }
}
