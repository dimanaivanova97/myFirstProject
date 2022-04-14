package homework.fifth;

import java.util.Scanner;

public class isEven {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a number:");

        int inputNum = myScanner.nextInt();

        if (isEven(inputNum)){
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

    }
    static boolean isEven(int input){
        boolean isItEven = true;
        if (input % 2 != 0){
            isItEven = false;
        }
        return isItEven;
    }
}
