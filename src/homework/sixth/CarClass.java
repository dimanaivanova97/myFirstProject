package homework.sixth;

import java.util.Scanner;

public class CarClass {

    String carName;
    String carColor;
    int releaseYear;
    Boolean isSecondHand;
    int horsePower;


    public CarClass(String carName, int releaseYear, Boolean isSecondHand, int horsePower) {
        this.carName = carName;
        this.releaseYear = releaseYear;
        this.isSecondHand = isSecondHand;
        this.horsePower = horsePower;
    }

    public CarClass(String carName, String carColor, Boolean isSecondHand) {
        this.carName = carName;
        this.carColor = carColor;
        this.isSecondHand = isSecondHand;
    }

    public CarClass(String carName, String carColor, int releaseYear, Boolean isSecondHand) {
        this.carName = carName;
        this.carColor = carColor;
        this.releaseYear = releaseYear;
        this.isSecondHand = isSecondHand;
    }

    public CarClass() {
    }

    public static void main(String[] args) {

        CarClass carOne = new CarClass("Citroen", 2010, true, 194);
        CarClass carTwo = new CarClass("Honda", "Light Blue", true);
        CarClass carThree= new CarClass("Mazda", "Green", 2000, false);
        CarClass carFour = new CarClass();

        System.out.println(carOne.carColor);


    }
}
