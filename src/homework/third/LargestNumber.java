package homework.third;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many number would you like to compare?");

        int countOfNumbers = myScanner.nextInt();

        boolean isCountValid = true;
        double largestNumber = 0;
        if (countOfNumbers > 0) {

            double numbersArray[] = new double[countOfNumbers];
            System.out.println("Write the numbers you would like to compare:");

            for (int i = 0; i < countOfNumbers; i++) {
                numbersArray[i] = myScanner.nextDouble();
            }

            for (int i = 0; i < countOfNumbers; i++) {
                if (numbersArray[i] > largestNumber) {
                    largestNumber = numbersArray[i];
                }
            }
        } else {
            isCountValid = false;
            System.out.println("Invalid count! The count of numbers should be more than 1 in order to compare the numbers.");
        }

        if (isCountValid){
            System.out.println("The largest number is: " + largestNumber);
        }
    }
}
