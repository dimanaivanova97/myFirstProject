package homework.third;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DevisibleNumbers {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many numbers would you like to input?");

        int numberCount = myScanner.nextInt();

        List<Integer> numbersList = new ArrayList<>();

        boolean isValidNumber = true;

        if (numberCount > 0){
            System.out.println("Write the numbers:");
        } else {
            isValidNumber = false;
            System.out.println("Count of numbers cannot be a negative value.");
        }

        while (numberCount > 0 && isValidNumber) {
            int number = myScanner.nextInt();
            if (number > 150) {
                isValidNumber = false;
                break;
            } else if (number % 5 == 0) {
                numbersList.add(number);
            }
            numberCount--;
        }

        if (numbersList.size() > 0) {
            System.out.println("The numbers that are divisible by 5 are:");
            for (int i = 0; i < numbersList.size(); i++) {
                System.out.println(numbersList.get(i));

            }
        } else if (isValidNumber){
            System.out.println("There are no numbers that are divisible by 5.");
        }
    }
}
