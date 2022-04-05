package com.company;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("a = ");
        double a = myScanner.nextDouble();
        System.out.print("b = ");
        double b = myScanner.nextDouble();
        System.out.print("c = ");
        double c = myScanner.nextDouble();

        double discriminant = (Math.pow(b, 2) - 4 * a * c);


        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);



    }
}
