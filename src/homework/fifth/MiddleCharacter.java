package homework.fifth;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String stringInput = myScanner.nextLine();

        System.out.println(middleCharacter(stringInput));

    }
    static String middleCharacter (String stringInput){
        String middleChar = "";

        if (stringInput.length() % 2 == 0){
            middleChar = String.valueOf(stringInput.charAt(stringInput.length()/2) + String.valueOf(stringInput.charAt(stringInput.length()/2 - 1)));
        } else {
            middleChar = String.valueOf(stringInput.charAt(stringInput.length()/2));
        }
        return middleChar;
    }
}
