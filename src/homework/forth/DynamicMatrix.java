package homework.forth;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicMatrix {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many rows would you like the matrix to be made of?");
        int rowsCount = myScanner.nextInt();

        System.out.println("How many columns would you like the matrix to be made of?");
        int columnsCount = myScanner.nextInt();

        System.out.println("Enter the elements of the matrix:");

        int[][] numbers=new int[rowsCount][columnsCount];

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                numbers[i][j] = myScanner.nextInt();
            }
        }

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
