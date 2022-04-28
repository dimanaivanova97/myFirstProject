package homework.seventh.taskTwo;

import java.util.Scanner;

public class Employee {

    final int ID = 1;
    final String firstName = "Dimana";
    final String lastName = "Ivanova";

    private double salary = 2000;

    String getName(){
        return this.firstName + " " + this.lastName;
    }

    Double getAnnualSalary(){
        return this.salary * 12;
    }

    Double raiseSalary (double percentIncrease){
        double increase = this.salary * percentIncrease / 100;
        this.salary += increase;
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double percentIncrease = myScanner.nextDouble();

        Employee employee = new Employee();

        System.out.println(employee.getName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(percentIncrease));
        System.out.println(employee.toString());

    }
}