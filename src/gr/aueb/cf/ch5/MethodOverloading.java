package gr.aueb.cf.ch5;

public class MethodOverloading {
    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * An overloaded version of adding.
     * Method name + format params = method signature.
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static  int add(int a, int b, int c) {
        return a + b +c;

    }

    public static int add(long a, long b) {
        return (int)(a + b);

    }

}
