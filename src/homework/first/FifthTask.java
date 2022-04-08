package homework.first;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the size of side A of the triangle (in cm)?");
        double sideA = myScanner.nextDouble();
        System.out.println("What is the size of side B of the triangle (in cm)?");
        double sideB = myScanner.nextDouble();
        System.out.println("What is the size of side C of the triangle (in cm)?");
        double sideC = myScanner.nextDouble();

        double trianglePerimeter = sideA + sideB + sideC;
        double triangleArea = sideA * sideB / 2;

        System.out.println("Perimeter of the triangle: " + trianglePerimeter);
        System.out.println("Area of the triangle: " + triangleArea);
    }
}
