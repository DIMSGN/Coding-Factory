package gr.aueb.cf.ch4;

public class StarsDesc10 {

    public static void main(String[] args) {

        char star = '*';

        for (int i = 1; i <= 10; i++){
            for (int j = i; j <= 10; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
