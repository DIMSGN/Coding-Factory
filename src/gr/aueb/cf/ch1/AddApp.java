package gr.aueb.cf.ch1;

/**
 * Προσθέτει δύο ακεραιέους
 * και εμφανίζει το αποτέλεσμα στην κονσόλα.
 */
public class AddApp {
    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίησηση μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση του αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το αποτέλεσμα απο την πρόσθεση " + num1 + " + " + num2 + " είναι: " + result );
        System.out.printf("Το αποτέλεσμα των: %d και %d  είναι ισο με : %d \n" , num1, num2, result);
    }
}
