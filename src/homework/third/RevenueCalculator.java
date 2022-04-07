package homework.third;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RevenueCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the unit price of the product?");
        double unitPrice = myScanner.nextDouble();

        System.out.println("What is the quantity of sold products?");
        int quantitySoldProducts = myScanner.nextInt();

        double totalMoney = unitPrice * quantitySoldProducts;
        double discoutAmount = 0;
        boolean isInputValid = true;
        boolean zeroPercentDiscount = true;
        String percentDiscout = "";

        if (totalMoney < 0){
            System.out.println("Invalid input!");
            isInputValid = false;
        } else if (quantitySoldProducts == 0) {
            System.out.println("No products were sold. There is no revenue.");
        } else if (quantitySoldProducts < 100) {
            discoutAmount = totalMoney;
            zeroPercentDiscount = false;
        } else if (quantitySoldProducts <= 120){
            percentDiscout = "(15.0%)";
            discoutAmount = totalMoney * 15 / 100;
        } else {
            percentDiscout = "(20.0%)";
            discoutAmount = totalMoney * 20 / 100;
        }

        if (isInputValid && quantitySoldProducts > 0 && zeroPercentDiscount){
            System.out.println("The revenue from sale: " + (totalMoney - discoutAmount) + "$");
            System.out.println("Discount: " + discoutAmount + percentDiscout);
        } else {
            System.out.println("The revenue from sale: " + totalMoney + "$");
            System.out.println("Discount: 0(0.0%)");
        }
    }
}
