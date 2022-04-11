package homework.forth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String inputString = myScanner.nextLine();

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            chars.add(inputString.charAt(i));
        }

        Collections.reverse(chars);

        StringBuilder inputBackwards = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            inputBackwards.append(inputString.charAt(i));
        }


        if (inputString.equals(inputBackwards.toString())){
            System.out.println("The word that you entered is a Palindrome. This means that the word reads the same backward as forward");
        } else {
            System.out.println("The word is not a Palindrome.");
        }



    }
}
