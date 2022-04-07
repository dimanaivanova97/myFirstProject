package homework.third;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int dayOfTheWeekNumber = myScanner.nextInt();

        String dayOfWeekEnding = "";
        String dayOfTheWeek = "";

        boolean isItValidDay = true;

        switch (dayOfTheWeekNumber){
            case 1:
                dayOfWeekEnding = "st";
                dayOfTheWeek = "Monday";
                break;
            case 2:
                dayOfWeekEnding = "nd";
                dayOfTheWeek = "Tuesday";
                break;
            case 3:
                dayOfWeekEnding = "rd";
                dayOfTheWeek = "Wednesday";
                break;
            case 4:
                dayOfWeekEnding = "th";
                dayOfTheWeek = "Thursday";
                break;
            case 5:
                dayOfWeekEnding = "th";
                dayOfTheWeek = "Friday";
                break;
            case 6:
                dayOfWeekEnding = "th";
                dayOfTheWeek = "Saturday";
                break;
            case 7:
                dayOfWeekEnding = "th";
                dayOfTheWeek = "Sunday";
                break;
            default:
                isItValidDay = false;
                System.out.println("The number is invalid");
        }
        System.out.println("The " + dayOfTheWeekNumber + "-" + dayOfWeekEnding + " day of the week is " + dayOfTheWeek);
    }
}
