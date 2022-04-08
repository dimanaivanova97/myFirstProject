package homework.third;

import java.util.Scanner;

public class EligibleWorkingAge {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = myScanner.nextInt();

        if (age >= 16){
            System.out.println("You are eligible to work.");
        } else {
            System.out.println("You are no eligible to work! You must be at least 16 years old.");
        }
    }
}
