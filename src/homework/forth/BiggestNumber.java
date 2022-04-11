package homework.forth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
        int numberInput = myScanner.nextInt();
        numbersList.add(numberInput);
        }

        Collections.sort(numbersList);
        Collections.reverse(numbersList);

        System.out.println(numbersList.get(0));
    }
}
