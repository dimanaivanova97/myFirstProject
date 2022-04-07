package homework.third;

import java.util.Scanner;

public class VacationAdvisor {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Would you prefer a vacation to the Beach or to the Mountain?");
        String typeOfVacation = myScanner.nextLine();

        if (typeOfVacation.equals("Beach")) {

            System.out.println("What is the budget of your vacation?");
            double budgetPerDay = myScanner.nextDouble();

            if (budgetPerDay < 0) {
                System.out.println("I get the sense of humour here, but the budget cannot be a negative number.");
            } else if (budgetPerDay == 0) {
                System.out.println("It seems like currently you cannot afford any of our vacations.");
            } else if (budgetPerDay < 50) {
                System.out.println("We can offer you a beach vacation with destination: Bulgaria");
            } else {
                System.out.println("We can offer you a beach vacation with destination: outside Bulgaria");
            }
        } else if (typeOfVacation.equals("Mountain")) {

            System.out.println("What is the budget of your vacation?");
            double budgetPerDay = myScanner.nextDouble();

            if (budgetPerDay < 0) {
                System.out.println("The budget cannot be a negative number.");
            } else if (budgetPerDay == 0) {
                System.out.println("It seems like currently you cannot afford any of our vacations.");
            } else if (budgetPerDay < 30) {
                System.out.println("We can offer you a vacation in the mountain with destination: Bulgaria");
            } else {
                System.out.println("We can offer you a vacation in the mountain with destination: outside Bulgaria");
            }
        } else {
            System.out.println("There is no information about this type of vacation.");
        }
    }
}
