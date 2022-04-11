package homework.forth;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ReversedNumbersList {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        LinkedList<Integer> linkedNumberList = new LinkedList<>();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < 5; i++) {
            int inputNumber = myScanner.nextInt();
            linkedNumberList.add(inputNumber);
        }

        ArrayList<Integer> reversedArray = new ArrayList<>();
        for (int i = linkedNumberList.size()-1; i >= 0; i--) {
            reversedArray.add(linkedNumberList.get(i));
        }

        System.out.println(reversedArray);
    }
}
