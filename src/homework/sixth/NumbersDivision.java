package homework.sixth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersDivision {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        double myInt1 = 0;
        double myInt2 = 0;

        boolean isInputValid = true;

        System.out.println("Enter 2 numbers:");
        try{
            myInt1 = myScanner.nextDouble();
            myInt2 = myScanner.nextDouble();
        } catch (InputMismatchException e){
            isInputValid = false;
            e.printStackTrace();
        }

        if (isInputValid){
            try{
                System.out.println(myInt1 + " / " + myInt2 + " = ");
                System.out.println(myInt1/myInt2);
            } catch (ArithmeticException e){
                e.printStackTrace();
            }
        }
    }
}
