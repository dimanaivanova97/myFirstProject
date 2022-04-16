package homework.forth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String inputString = myScanner.nextLine();

        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Character> inputBackwards = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            chars.add(inputString.charAt(i));
            inputBackwards.add(inputString.charAt(i));
        }

        Collections.reverse(inputBackwards);

        if (chars.equals(inputBackwards)){
            System.out.println("The word that you entered is a Palindrome. This means that the word reads the same backward as forward");
        } else {
            System.out.println("The word is not a Palindrome.");
        }
    }
}
