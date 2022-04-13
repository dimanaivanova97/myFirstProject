package homework.fifth;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int firstNum = myScanner.nextInt();
        int secondNum = myScanner.nextInt();
        int thirdNum = myScanner.nextInt();

        System.out.println("The smallest number is: " + smallestNumInput(firstNum, secondNum, thirdNum));
    }

    static int smallestNumInput(int firstNum, int secondNum, int thirdNum){
        int smallestNumber = 0;
        if (firstNum <= secondNum && firstNum <= thirdNum){
            smallestNumber = firstNum;
        } else if (secondNum <= firstNum && secondNum <= thirdNum){
            smallestNumber = secondNum;
        } else {
            smallestNumber = thirdNum;
        }
        return smallestNumber;
    }
}
