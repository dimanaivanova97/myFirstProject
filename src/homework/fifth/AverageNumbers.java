package homework.fifth;

import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        double firstNum = myScanner.nextInt();
        double secondNum = myScanner.nextInt();
        double thirdNum = myScanner.nextInt();

        System.out.println("The average of the three numbers is: " + averageNumber(firstNum, secondNum, thirdNum));

    }
    static double averageNumber (double firstNum, double secondNum, double thirdNum){
        double average = (firstNum + secondNum + thirdNum) / 3;
        return average;
    }
}
