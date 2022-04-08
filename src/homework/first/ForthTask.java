package homework.first;

import java.util.Scanner;

public class ForthTask {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many lines do you need the pine tree to be made of?");
        int numberOfLines = myScanner.nextInt();

        for (int i = 1; i < numberOfLines; i++) {
            for (int j = i; j < numberOfLines ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
