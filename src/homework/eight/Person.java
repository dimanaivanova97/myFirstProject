package homework.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    final String name;
    final String sex;
    final String languageSpoken;
    String job;
    final String nationality;
    final String religion;
    final String EGN;
    final String dateOfBirth;
    final String age;
    String country;
    String mainWords;

    String fullEGN;

    public Person() {
        this.name = addName();
        this.sex = addSex();
        this.country = addCountry();
        this.religion = addReligion();
        this.languageSpoken = addLanguageNationality();
        this.job = addJob();
        this.nationality = addLanguageNationality();
        this.EGN = addEGN();
        this.dateOfBirth = addDateOfBirth();
        this.age = addAge();
    }

    public String addName(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        return myScanner.nextLine();
    }

    public String addJob(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("On which of the following positions are you in the company: Senior QA, Senior Developer, Project Manager, QA Intern, QA Intern, HR Intern: ");
        return myScanner.nextLine();
    }

    public String addEGN(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter 10 digit EGN: ");
        String EGN = myScanner.nextLine();

        if (EGN.chars().count() != 10){
            throw new InputMismatchException("EGN should be 10 digits long! You have entered " + EGN.chars().count() + " digits.");
        }
        fullEGN = EGN;
        return EGN;
    }

    public String canTakeLoan(){
        String canTakeLoan = "N/A";

        if (job.equals("Senior QA") || job.equals("Senior Developer") || job.equals("Project Manager")){
            canTakeLoan = name + " can take a loan.";
        } else if (job.equals("QA Intern") || job.equals("Developer Intern") || job.equals("HR Intern")){
            canTakeLoan = name + " cannot take a loan.";
        }
        return canTakeLoan;
    }

    public String addCountry(){
        System.out.println("Enter your country: ");
        Scanner myScanner = new Scanner(System.in);
        String countryInput = myScanner.nextLine();
        String country;

        if (!countryInput.equals("Bulgaria") && !countryInput.equals("Italy") && !countryInput.equals("USA")){
            country = "N/A";
        } else {
            country = countryInput;
        }
        return country;
    }

    public String addDateOfBirth(){
        String yearOfBirth = fullEGN.substring(0,2);
        String monthOfBirth = fullEGN.substring(2,4);
        String dateOfBirth = fullEGN.substring(4,6);
        return dateOfBirth + "." + monthOfBirth + "." + yearOfBirth;
    }

    public String addAge(){
        int yearOfBirth = Integer.parseInt(19 + fullEGN.substring(0,2));
        int currentYear = 2022;
        int age = currentYear - yearOfBirth;

        return String.valueOf(age);
    }

    public String addSex(){
        System.out.println("Enter your sex: ");
        Scanner myScanner = new Scanner(System.in);
        String sex = myScanner.nextLine();

        if (!sex.equals("Male") && !sex.equals("Female")){
            throw new InputMismatchException("Wrong input! Gender can be either 'Male' or 'Female'!");
        }
        return sex;
    }

    public String addReligion(){
        System.out.println("Enter your religion: ");
        Scanner myScanner = new Scanner(System.in);
        String religionInput = myScanner.nextLine();
        String religion;

        if (!religionInput.equals("Orthodox") && !religionInput.equals("Catholic") && !religionInput.equals("Islam")){
            religion = "N/A";
        } else {
            religion = religionInput;
        }
        return religion;
    }

    public String addLanguageNationality(){
        String language;

        if (this.country.equals("Bulgaria")){
            language = "Bulgarian";
        } else if (this.country.equals("Italy")){
            language = "Italian";
        } else {
            language = "English";
        }
        return language;
    }

    public String celebrateEaster(){
        boolean celebrateEaster = true;
        String celebrateEasterMessage;

        if (this.religion.equals("Islam")){
            celebrateEaster = false;
        }

        if (celebrateEaster){
            celebrateEasterMessage = name + " is celebrating Easter.";
        } else {
            celebrateEasterMessage = name + " is not celebrating Easter.";
        }
        return celebrateEasterMessage;
    }

    public String isAdult(){
        boolean isAdult = true;
        String isAdultMessage;

        if (Integer.parseInt(this.age) < 18 && addCountry().equals("Bulgaria")){
            isAdult = false;
        } else if (Integer.parseInt(this.age) < 18 && addCountry().equals("Italy")){
            isAdult = false;
        } else if (Integer.parseInt(this.age) < 21 && addCountry().equals("USA")){
            isAdult = false;
        }

        if (isAdult){
            isAdultMessage = name + " is an adult.";
        } else {
            isAdultMessage = "N/A";
        }
        return isAdultMessage;
    }

    public String sayHello(){
        String hello;

        if (this.languageSpoken.equals("Bulgarian")){
            hello = "Здравей, " + name + "!";
        } else if (this.languageSpoken.equals("Italian")){
            hello = "Ciao, " + name + "!";
        } else if (this.languageSpoken.equals("USA")){
            hello = "Hello, " + name + "!";
        } else {
            hello = "N/A";
        }
        return hello;
    }
}
