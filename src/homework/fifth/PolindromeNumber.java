package homework.fifth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PolindromeNumber {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int positiveInteger = myScanner.nextInt();

        if (!isItPositive(positiveInteger)){
            System.out.println("A positive number is required.");
        } else {
            if (isPalindrome(positiveInteger) == true){
                System.out.println("The number that you entered is a Palindrome. This means that the number reads the same backward as forward");
            } else {
                System.out.println("The number is not a Palindrome.");
            }
        }


    }
    static boolean isItPositive (int inputNum){

        boolean isItPositive = true;
        if (inputNum < 0){
            isItPositive = false;
        }
        return isItPositive;
    }

    static boolean isPalindrome (int inputNum){

        String inputNumString = String.valueOf(inputNum);

        ArrayList<Character> inputNumsArray = new ArrayList<>();

        ArrayList<Character> inputBackwards = new ArrayList<>();

        boolean isItPalindrome = true;

        for (int i = 0; i < inputNumString.length(); i++) {
            inputNumsArray.add(inputNumString.charAt(i));
            inputBackwards.add(inputNumString.charAt(i));
        }

        Collections.reverse(inputBackwards);

        if (!inputNumsArray.equals(inputBackwards)){
            isItPalindrome = false;
        }
        return isItPalindrome;
        }
    }

