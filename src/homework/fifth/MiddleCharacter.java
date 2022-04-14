package homework.fifth;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String stringInput = myScanner.nextLine();

        System.out.println("The middle character is: " + middleCharacter(stringInput));
        System.out.println("The count of words in the string are: " + wordsCount(stringInput));

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


    static int wordsCount (String stringInput){

        int countOfWords = 0;
        for (int i = 0; i < stringInput.length(); i++) {
            if (( (i > 0) && (stringInput.charAt(i)!=' ') && (stringInput.charAt( i-1 )==' ')) || ((stringInput.charAt(i)!=' ') && ( i==0 )) ){
                countOfWords++;
            }
        }
        return countOfWords;
    }
}
