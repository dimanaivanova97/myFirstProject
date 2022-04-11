package homework.forth;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};

        int numbersSum = 0;

        for (int i = 0; i < arr.length; i++) {
            numbersSum += arr[i];
        }
        System.out.println(numbersSum);
    }
}
