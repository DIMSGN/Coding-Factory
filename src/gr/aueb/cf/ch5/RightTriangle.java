package gr.aueb.cf.ch5;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a ;
        double b ;
        double c ;
        final double EPSILON = 0.05;
        boolean isRight = false;

        System.out.println("Παρακαλω εισαγεται τα a, b, c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        isRight = Math.abs(a * a - (b * b + c * c)) < EPSILON;
        System.out.println("Triangle is right: " + isRight);
    }
}
